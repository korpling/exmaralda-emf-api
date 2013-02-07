/**
 * Copyright 2009 Humboldt University of Berlin, INRIA.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.resources;


import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Stack;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.exceptions.ExmaraldaException;

public class EXBReader extends DefaultHandler2 
{
	public EXBReader()
	{
		this.currObjectName= new Stack<String>();
	}
	
	private BasicTranscription basicTranscription= null;
	public void setBasicTranscription(BasicTranscription basicTranscription) {
		this.basicTranscription = basicTranscription;
	}

	public BasicTranscription getBasicTranscription() {
		return basicTranscription;
	}

//======================================== start: current exmaralda file	
	/**
	 * current EXMARaLDA file
	 */
	private File exmaraldaFile= null;
	
	/**
	 * returns current EXMARaLDA file.
	 * @return
	 */
	public File getExmaraldaFile() {
		return exmaraldaFile;
	}
	/**
	 * Sets current EXMARaLDA file.
	 * @param exmaraldaFile
	 */
	public void setExmaraldaFile(File exmaraldaFile) {
		this.exmaraldaFile = exmaraldaFile;
	}
//======================================== end: current exmaralda file
	
	public void startDocument() throws SAXException
    {
    }
    
    public void comment(char[] ch, int start, int length)
    {
    }
    
    /**
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	public void characters(	char[] ch,
            				int start,
            				int length) throws SAXException
    {
		StringBuffer text= new StringBuffer();
		for (int i= start; i< start+length; i++)
			text.append(ch[i]);
		//project-name
		if (this.currObjectName.peek().equals(ExmaraldaXML.ELEMENT_PROJECT_NAME))
		{
			this.getBasicTranscription().getMetaInformation().setProjectName(text.toString());
		}
		//transcription-name
		else if (this.currObjectName.peek().equals(ExmaraldaXML.ELEMENT_TRANSCRIPTION_NAME))
		{
			this.getBasicTranscription().getMetaInformation().setTranscriptionName(text.toString());
		}
		
		//comment
		else if (this.currObjectName.peek().equalsIgnoreCase("comment"))
		{
			if (getBasicTranscription().getMetaInformation().getComment()== null)
				getBasicTranscription().getMetaInformation().setComment(text.toString());
			else getBasicTranscription().getMetaInformation().setComment(getBasicTranscription().getMetaInformation().getComment() +text);
		}
		//transcription-conversion
		else if (this.currObjectName.peek().equalsIgnoreCase("transcription-conversion"))
		{
			if (getBasicTranscription().getMetaInformation().getTranscriptionConvention()== null)
				getBasicTranscription().getMetaInformation().setTranscriptionConvention(text.toString());
			else getBasicTranscription().getMetaInformation().setTranscriptionConvention(getBasicTranscription().getMetaInformation().getTranscriptionConvention() +text);
		}
		//abbreviation
		else if (this.currObjectName.peek().equalsIgnoreCase("abbreviation"))
		{
			if (this.currSpeaker.getAbbreviation()== null)
				this.currSpeaker.setAbbreviation(text.toString());
			else this.currSpeaker.setAbbreviation(this.currSpeaker.getAbbreviation() +text);
		}
		//comment
		else if (this.currObjectName.peek().equalsIgnoreCase("comment"))
		{
			if (this.currSpeaker.getComment()== null)
				this.currSpeaker.setComment(text.toString());
			else this.currSpeaker.setComment(this.currSpeaker.getComment() +text);
		}
		//event
		else if (this.currObjectName.peek().equalsIgnoreCase("event"))
		{
			if (this.currEvent.getValue()== null)
				this.currEvent.setValue(text.toString());
			else this.currEvent.setValue(this.currEvent.getValue() +text);
		}
		//ud-information
		else if(this.currObjectName.peek().equalsIgnoreCase("ud-information"))
		{
			if (this.currUDInfo.getValue()== null)
				this.currUDInfo.setValue(text.toString());
			else this.currUDInfo.setValue(this.currUDInfo.getValue() +text);
		}
    }
	/**
	 * The current tier, which was read last.
	 */
	private Tier currTier= null;
	/**
	 * The current event, which was read last.
	 */
	private Event currEvent= null;
	/**
	 * The current speaker, which was read last.
	 */
	private Speaker currSpeaker= null;
	/**
	 * The current ud information, which was read last.
	 */
	private UDInformation currUDInfo= null;
	/**
	 * The current object, to store a textual value into it.
	 */
	private Stack<String> currObjectName= null;
	
	
	/**
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(	String uri,
            					String localName,
            					String qName,
            					Attributes attributes) throws SAXException
    {
		//basic-Transcription
		if (qName.equalsIgnoreCase("basic-transcription"));
		//head
		else if (qName.equalsIgnoreCase("head"));
		//meta-information
		else if (qName.equalsIgnoreCase("meta-information"))
		{
			MetaInformation mInfo= ExmaraldaBasicFactory.eINSTANCE.createMetaInformation();
			this.getBasicTranscription().setMetaInformation(mInfo);
		}
		//project-name
		else if (qName.equalsIgnoreCase(ExmaraldaXML.ELEMENT_PROJECT_NAME));
		//transcription-name
		else if (qName.equalsIgnoreCase(ExmaraldaXML.ELEMENT_TRANSCRIPTION_NAME));
		//referenced-file
		else if (qName.equals(ExmaraldaXML.ELEMENT_REFERENCED_FILE))
		{
			String attValue= attributes.getValue(ExmaraldaXML.ATT_URL);
			if (	(attValue!= null)&&
					(!attValue.isEmpty()))
			{
				
				try {
					File refFile= new File(this.getExmaraldaFile().getParentFile()+"/"+attValue);
					this.getBasicTranscription().getMetaInformation().setReferencedFile(refFile.toURI().toURL());
				} catch (MalformedURLException e) {
					throw new SAXException("Error in file, expected was an uri conform String, given is: "+attValue+".", e);
				}
			}
		}
		//comment
		else if (qName.equalsIgnoreCase("comment"));
		//transcription-conversion
		else if (qName.equalsIgnoreCase("transcription-conversion"));
		//speaker
		else if (qName.equalsIgnoreCase("speaker"))
		{
			Speaker speaker= ExmaraldaBasicFactory.eINSTANCE.createSpeaker();
			speaker.setId(attributes.getValue("id"));
			this.currSpeaker= speaker;
			this.getBasicTranscription().getSpeakertable().add(speaker);
		}
		else if (	(ExmaraldaXML.ELEMENT_LANGUAGE.equals(qName)) &&
					(attributes.getValue(ExmaraldaXML.ATT_LANG)!= null))
		{
			if (ExmaraldaXML.ELEMENT_LANGUAGE_USED.equals(this.currObjectName.peek()))
			{
				if (this.currSpeaker!= null)
					this.currSpeaker.getLanguageUsed().add(attributes.getValue(ExmaraldaXML.ATT_LANG));
			}
			else if (ExmaraldaXML.ELEMENT_L1.equals(this.currObjectName.peek()))
			{
				if (this.currSpeaker!= null)
					this.currSpeaker.getL1().add(attributes.getValue(ExmaraldaXML.ATT_LANG));
			}
			else if (ExmaraldaXML.ELEMENT_L2.equals(this.currObjectName.peek()))
			{
				if (this.currSpeaker!= null)
					this.currSpeaker.getL2().add(attributes.getValue(ExmaraldaXML.ATT_LANG));
			}
		}
		//sex
		else if (qName.equalsIgnoreCase("sex"))
		{
			String value= attributes.getValue("value");
			if (value.equalsIgnoreCase("m"))
				this.currSpeaker.setSex(SPEAKER_SEX.M);
			else if (value.equalsIgnoreCase("f"))
				this.currSpeaker.setSex(SPEAKER_SEX.F);
			else if (value.equalsIgnoreCase("u"))
				this.currSpeaker.setSex(SPEAKER_SEX.U);
		}
		
		//basic-body
		else if (qName.equalsIgnoreCase("basic-body"));
		//common-timeline
		else if(qName.equalsIgnoreCase("common-timeline"))
		{
			CommonTimeLine timeLine= ExmaraldaBasicFactory.eINSTANCE.createCommonTimeLine();
			this.getBasicTranscription().setCommonTimeLine(timeLine);
		}
		//tli
		else if(qName.equalsIgnoreCase("tli"))
		{
			TLI tli= ExmaraldaBasicFactory.eINSTANCE.createTLI();
			tli.setId(attributes.getValue("id"));
			tli.setTime(attributes.getValue("time"));
			if (attributes.getValue("type")!= null)
			{	
				if (attributes.getValue("type").equalsIgnoreCase("appl"))
					tli.setType(TIME_TYPE.APPL);
				else if (attributes.getValue("type").equalsIgnoreCase("intp"))
					tli.setType(TIME_TYPE.INTP);
				else if (attributes.getValue("type").equalsIgnoreCase("othr"))
					tli.setType(TIME_TYPE.OTHR);
				else if (attributes.getValue("type").equalsIgnoreCase("unsp"))
					tli.setType(TIME_TYPE.UNSP);
				else if (attributes.getValue("type").equalsIgnoreCase("user"))
					tli.setType(TIME_TYPE.USER);
			}
			this.getBasicTranscription().getCommonTimeLine().getTLIs().add(tli);
		}
		//tier
		else if(qName.equalsIgnoreCase("tier"))
		{
			Tier tier= ExmaraldaBasicFactory.eINSTANCE.createTier();
			this.currTier= tier;
			tier.setId(attributes.getValue("id"));
			for (Speaker speaker: this.getBasicTranscription().getSpeakertable())
			{
				if (speaker.getId().equalsIgnoreCase(attributes.getValue("speaker")))
					tier.setSpeaker(speaker);
			}
			tier.setCategory(attributes.getValue("category"));
			tier.setDisplayName(attributes.getValue("display-name"));
			if (tier.getCategory()== null)
				throw new ExmaraldaException("Cannot read given exmaralda file '"+this.getExmaraldaFile()+"', because there is a <tier> element ('id=\""+tier.getId()+"\"') without a @category attribute.");;
			if (attributes.getValue("type").equalsIgnoreCase("t"))
				tier.setType(TIER_TYPE.T);
			else if (attributes.getValue("type").equalsIgnoreCase("d"))
				tier.setType(TIER_TYPE.D);
			else if (attributes.getValue("type").equalsIgnoreCase("a"))
				tier.setType(TIER_TYPE.A);
			else if (attributes.getValue("type").equalsIgnoreCase("l"))
				tier.setType(TIER_TYPE.L);
			else if (attributes.getValue("type").equalsIgnoreCase("u"))
				tier.setType(TIER_TYPE.U);
			this.getBasicTranscription().getTiers().add(tier);
		}
		//event
		else if(qName.equalsIgnoreCase("event"))
		{
			Event event= ExmaraldaBasicFactory.eINSTANCE.createEvent();
			this.currEvent= event;
			//search for start and end time event
			for (TLI tli: this.getBasicTranscription().getCommonTimeLine().getTLIs())
			{
				if (tli.getId().equalsIgnoreCase(attributes.getValue("start")))
					event.setStart(tli);
				if (tli.getId().equalsIgnoreCase(attributes.getValue("end")))
					event.setEnd(tli);
				//break if both are set
				if ((event.getStart()!= null) && (event.getEnd()!= null))
					break;
			}	
			if (attributes.getValue("medium")!= null)
			{	
				if (attributes.getValue("medium").equalsIgnoreCase("aud"))
					event.setMedium(EVENT_MEDIUM.AUD);
				else if (attributes.getValue("medium").equalsIgnoreCase("vid"))
					event.setMedium(EVENT_MEDIUM.VID);
				else if (attributes.getValue("medium").equalsIgnoreCase("img"))
					event.setMedium(EVENT_MEDIUM.IMG);
				else if (attributes.getValue("medium").equalsIgnoreCase("txt"))
					event.setMedium(EVENT_MEDIUM.TXT);
				else if (attributes.getValue("medium").equalsIgnoreCase("oth"))
					event.setMedium(EVENT_MEDIUM.OTH);
				else event.setMedium(null);
			}
			else
			{//if no medium is given, set it to null	
				event.setMedium(null);
			}
			try {
				if (attributes.getValue("url")!= null)
					event.setUrl(new URL(attributes.getValue("url")));
			} catch (MalformedURLException e) {
				throw new SAXException("Cannot set the url, because it is not a valid url: "+attributes.getValue("url")+".", e);
			}
			
			if (this.currTier== null)
				throw new SAXException("File is not valid, there is an event not in a tier.");
			this.currTier.getEvents().add(event);
		}
		//ud-information
		else if(qName.equalsIgnoreCase("ud-information"))
		{
			UDInformation udInfo= ExmaraldaBasicFactory.eINSTANCE.createUDInformation();
			udInfo.setAttributeName(attributes.getValue("attribute-name"));
			this.currUDInfo= udInfo;
			//father is meta-information
			if (this.currObjectName.peek().equalsIgnoreCase("ud-meta-information"))
				this.getBasicTranscription().getMetaInformation().getUdMetaInformations().add(udInfo);
			//father is speaker
			else if (this.currObjectName.peek().equalsIgnoreCase("ud-speaker-information"))
			{
				this.currSpeaker.getUdSpeakerInformations().add(udInfo);
			}
			//father is tier
			else if (this.currObjectName.peek().equalsIgnoreCase("ud-tier-information"))
				this.currTier.getUdTierInformations().add(udInfo);
			//father is an event
			else if (this.currObjectName.peek().equalsIgnoreCase("event"))
			{	
				this.currEvent.getUdInformations().add(udInfo);
			}
		}	
		this.currObjectName.push(qName);
    }
	
	@Override
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException
	{
		if (!this.currObjectName.peek().equalsIgnoreCase(qName))
			throw new ExmaraldaException("The given file is not wellformed. Expected element is: "+this.currObjectName.peek() + ", but given is: "+qName);
		this.currObjectName.pop();
	}
}
