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

public class EXBReader extends DefaultHandler2 implements ExmaraldaXML {
	public EXBReader() {
		this.currObjectName = new Stack<String>();
	}

	private BasicTranscription basicTranscription = null;

	public void setBasicTranscription(BasicTranscription basicTranscription) {
		this.basicTranscription = basicTranscription;
	}

	public BasicTranscription getBasicTranscription() {
		return basicTranscription;
	}

	// ======================================== start: current exmaralda file
	/**
	 * current EXMARaLDA file
	 */
	private File exmaraldaFile = null;

	/**
	 * returns current EXMARaLDA file.
	 * 
	 * @return
	 */
	public File getExmaraldaFile() {
		return exmaraldaFile;
	}

	/**
	 * Sets current EXMARaLDA file.
	 * 
	 * @param exmaraldaFile
	 */
	public void setExmaraldaFile(File exmaraldaFile) {
		this.exmaraldaFile = exmaraldaFile;
	}

	// ======================================== end: current exmaralda file

	/**
	 * @see org.xml.sax.helpers.DefaultHandler#characters(char[], int, int)
	 */
	public void characters(char[] ch, int start, int length) throws SAXException {
		StringBuffer text = new StringBuffer();
		for (int i = start; i < start + length; i++)
			text.append(ch[i]);
		// project-name
		if (ELEMENT_PROJECT_NAME.equals(this.currObjectName.peek())) {
			this.getBasicTranscription().getMetaInformation().setProjectName(text.toString());
		}
		// transcription-name
		else if (ELEMENT_TRANSCRIPTION_NAME.equals(this.currObjectName.peek())) {
			this.getBasicTranscription().getMetaInformation().setTranscriptionName(text.toString());
		}

		// comment
		else if (ELEMENT_COMMENT.equals(this.currObjectName.peek())) {
			this.currObjectName.pop();

			if (ELEMENT_META_INFORMATION.equals(this.currObjectName.peek())) {// meta-information/comment
				if (getBasicTranscription().getMetaInformation().getComment() == null)
					getBasicTranscription().getMetaInformation().setComment(text.toString());
				else
					getBasicTranscription().getMetaInformation().setComment(getBasicTranscription().getMetaInformation().getComment() + text);
			}// meta-information/comment
			else if (ELEMENT_SPEAKER.equals(this.currObjectName.peek())) {// speaker/comment
				if (this.currSpeaker.getComment() == null)
					this.currSpeaker.setComment(text.toString());
				else
					this.currSpeaker.setComment(this.currSpeaker.getComment() + text);
			}// speaker/comment
			this.currObjectName.push(ELEMENT_COMMENT);
		}
		// transcription-conversion
		else if (ELEMENT_TRANSCRIPTION_CONVENTION.equals(this.currObjectName.peek())) {
			if (getBasicTranscription().getMetaInformation().getTranscriptionConvention() == null)
				getBasicTranscription().getMetaInformation().setTranscriptionConvention(text.toString());
			else
				getBasicTranscription().getMetaInformation().setTranscriptionConvention(getBasicTranscription().getMetaInformation().getTranscriptionConvention() + text);
		}
		// abbreviation
		else if (ELEMENT_ABBREVIATION.equals(this.currObjectName.peek())) {
			if (this.currSpeaker.getAbbreviation() == null)
				this.currSpeaker.setAbbreviation(text.toString());
			else
				this.currSpeaker.setAbbreviation(this.currSpeaker.getAbbreviation() + text);
		}
		// event
		else if (ELEMENT_EVENT.equals(this.currObjectName.peek())) {
			if (this.currEvent.getValue() == null)
				this.currEvent.setValue(text.toString());
			else
				this.currEvent.setValue(this.currEvent.getValue() + text);
		}
		// ud-information
		else if (ELEMENT_UD_INFO.equals(this.currObjectName.peek())) {
			if (this.currUDInfo.getValue() == null)
				this.currUDInfo.setValue(text.toString());
			else
				this.currUDInfo.setValue(this.currUDInfo.getValue() + text);
		}
	}

	/**
	 * The current tier, which was read last.
	 */
	private Tier currTier = null;
	/**
	 * The current event, which was read last.
	 */
	private Event currEvent = null;
	/**
	 * The current speaker, which was read last.
	 */
	private Speaker currSpeaker = null;
	/**
	 * The current ud information, which was read last.
	 */
	private UDInformation currUDInfo = null;
	/**
	 * The current object, to store a textual value into it.
	 */
	private Stack<String> currObjectName = null;

	/**
	 * @see org.xml.sax.helpers.DefaultHandler#startElement(java.lang.String,
	 *      java.lang.String, java.lang.String, org.xml.sax.Attributes)
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		// basic-Transcription
		if (ELEMENT_BASIC_TRANS.equals(qName))
			;
		// head
		else if (ELEMENT_HEAD.equals(qName))
			;
		// meta-information
		else if (ELEMENT_META_INFORMATION.equals(qName)) {
			MetaInformation mInfo = ExmaraldaBasicFactory.eINSTANCE.createMetaInformation();
			this.getBasicTranscription().setMetaInformation(mInfo);
		}
		// project-name
		else if (ELEMENT_PROJECT_NAME.equals(qName))
			;
		// transcription-name
		else if (ELEMENT_TRANSCRIPTION_NAME.equals(qName))
			;
		// referenced-file
		else if (ELEMENT_REFERENCED_FILE.equals(qName)) {
			String attValue = attributes.getValue(ATT_URL);
			if ((attValue != null) && (!attValue.isEmpty())) {
				File refFile = new File(this.getExmaraldaFile().getParentFile() + "/" + attValue);
				this.getBasicTranscription().getMetaInformation().setReferencedFile(refFile.toString());
			}
		}
		// comment
		else if (ELEMENT_COMMENT.equals(qName))
			;
		// transcription-conversion
		else if (ELEMENT_TRANSCRIPTION_CONVENTION.equals(qName))
			;
		// speaker
		else if (ELEMENT_SPEAKER.equals(qName)) {
			Speaker speaker = ExmaraldaBasicFactory.eINSTANCE.createSpeaker();
			speaker.setId(attributes.getValue(ATT_ID));
			this.currSpeaker = speaker;
			this.getBasicTranscription().getSpeakertable().add(speaker);
		} else if ((ELEMENT_LANGUAGE.equals(qName)) && (attributes.getValue(ATT_LANG) != null)) {
			if (ELEMENT_LANGUAGE_USED.equals(this.currObjectName.peek())) {
				if (this.currSpeaker != null)
					this.currSpeaker.getLanguageUsed().add(attributes.getValue(ATT_LANG));
			} else if (ELEMENT_L1.equals(this.currObjectName.peek())) {
				if (this.currSpeaker != null)
					this.currSpeaker.getL1().add(attributes.getValue(ATT_LANG));
			} else if (ELEMENT_L2.equals(this.currObjectName.peek())) {
				if (this.currSpeaker != null)
					this.currSpeaker.getL2().add(attributes.getValue(ATT_LANG));
			}
		}
		// sex
		else if (ELEMENT_SEX.equals(qName)) {
			String value = attributes.getValue(ATT_VALUE);
			if (value.equalsIgnoreCase("m"))
				this.currSpeaker.setSex(SPEAKER_SEX.M);
			else if (value.equalsIgnoreCase("f"))
				this.currSpeaker.setSex(SPEAKER_SEX.F);
			else if (value.equalsIgnoreCase("u"))
				this.currSpeaker.setSex(SPEAKER_SEX.U);
		}

		// basic-body
		else if (ELEMENT_BASIC_BODY.equals(qName))
			;
		// common-timeline
		else if (ELEMENT_COMMON_TIMELINE.equals(qName)) {
			CommonTimeLine timeLine = ExmaraldaBasicFactory.eINSTANCE.createCommonTimeLine();
			this.getBasicTranscription().setCommonTimeLine(timeLine);
		}
		// tli
		else if (ELEMENT_TLI.equals(qName)) {
			TLI tli = ExmaraldaBasicFactory.eINSTANCE.createTLI();
			tli.setId(attributes.getValue(ATT_ID));
			tli.setTime(attributes.getValue(ATT_TIME));
			if (attributes.getValue(ATT_TYPE) != null) {
				if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("appl"))
					tli.setType(TIME_TYPE.APPL);
				else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("intp"))
					tli.setType(TIME_TYPE.INTP);
				else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("othr"))
					tli.setType(TIME_TYPE.OTHR);
				else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("unsp"))
					tli.setType(TIME_TYPE.UNSP);
				else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("user"))
					tli.setType(TIME_TYPE.USER);
			}
			this.getBasicTranscription().getCommonTimeLine().getTLIs().add(tli);
		}
		// tier
		else if (ELEMENT_TIER.equals(qName)) {
			Tier tier = ExmaraldaBasicFactory.eINSTANCE.createTier();
			this.currTier = tier;
			tier.setId(attributes.getValue(ATT_ID));
			for (Speaker speaker : this.getBasicTranscription().getSpeakertable()) {
				if (speaker.getId().equalsIgnoreCase(attributes.getValue(ATT_SPEAKER)))
					tier.setSpeaker(speaker);
			}
			tier.setCategory(attributes.getValue(ATT_CATEGORY));
			tier.setDisplayName(attributes.getValue(ATT_DISPLAY_NAME));
			if (tier.getCategory() == null)
				throw new ExmaraldaException("Cannot read given exmaralda file '" + this.getExmaraldaFile() + "', because there is a <tier> element ('id=\"" + tier.getId() + "\"') without a @category attribute.");
			;
			if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("t"))
				tier.setType(TIER_TYPE.T);
			else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("d"))
				tier.setType(TIER_TYPE.D);
			else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("a"))
				tier.setType(TIER_TYPE.A);
			else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("l"))
				tier.setType(TIER_TYPE.L);
			else if (attributes.getValue(ATT_TYPE).equalsIgnoreCase("ud"))
				tier.setType(TIER_TYPE.U);
			this.getBasicTranscription().getTiers().add(tier);
		}
		// event
		else if (ELEMENT_EVENT.equals(qName)) {
			Event event = ExmaraldaBasicFactory.eINSTANCE.createEvent();
			this.currEvent = event;
			// search for start and end time event
			for (TLI tli : this.getBasicTranscription().getCommonTimeLine().getTLIs()) {
				if (tli.getId().equals(attributes.getValue(ATT_START)))
					event.setStart(tli);
				if (tli.getId().equals(attributes.getValue(ATT_END)))
					event.setEnd(tli);
				// break if both are set
				if ((event.getStart() != null) && (event.getEnd() != null))
					break;
			}
			if (attributes.getValue(ATT_MEDIUM) != null) {
				if (attributes.getValue(ATT_MEDIUM).equalsIgnoreCase("aud"))
					event.setMedium(EVENT_MEDIUM.AUD);
				else if (attributes.getValue(ATT_MEDIUM).equalsIgnoreCase("vid"))
					event.setMedium(EVENT_MEDIUM.VID);
				else if (attributes.getValue(ATT_MEDIUM).equalsIgnoreCase("img"))
					event.setMedium(EVENT_MEDIUM.IMG);
				else if (attributes.getValue(ATT_MEDIUM).equalsIgnoreCase("txt"))
					event.setMedium(EVENT_MEDIUM.TXT);
				else if (attributes.getValue(ATT_MEDIUM).equalsIgnoreCase("oth"))
					event.setMedium(EVENT_MEDIUM.OTH);
				else
					event.setMedium(null);
			} else {// if no medium is given, set it to null
				event.setMedium(null);
			}
			String url = attributes.getValue(ATT_URL);
			if ((url != null) && (!url.isEmpty())) {
				try {
					new URL(url);
					event.setUrl(url);
				} catch (MalformedURLException e) {
					throw new SAXException("Cannot set the url, because it is not a valid url: " + attributes.getValue("url") + ".", e);
				}
			}
			if (this.currTier == null)
				throw new SAXException("File is not valid, there is an event not in a tier.");
			this.currTier.getEvents().add(event);
		}
		// ud-information
		else if (ELEMENT_UD_INFO.equals(qName)) {
			UDInformation udInfo = ExmaraldaBasicFactory.eINSTANCE.createUDInformation();
			udInfo.setAttributeName(attributes.getValue(ATT_ATTRIBUTE_NAME));
			this.currUDInfo = udInfo;
			// father is meta-information
			if (ELEMENT_UD_META_INFO.equals(this.currObjectName.peek()))
				this.getBasicTranscription().getMetaInformation().getUdMetaInformations().add(udInfo);
			// father is speaker
			else if (ELEMENT_UD_SPEAKER_INFO.equals(this.currObjectName.peek())) {
				this.currSpeaker.getUdSpeakerInformations().add(udInfo);
			}
			// father is tier
			else if (ELEMENT_UD_TIER_INFO.equals(this.currObjectName.peek()))
				this.currTier.getUdTierInformations().add(udInfo);
			// father is an event
			else if (ELEMENT_EVENT.equals(this.currObjectName.peek())) {
				this.currEvent.getUdInformations().add(udInfo);
			}
		}
		this.currObjectName.push(qName);
	}

	@Override
	public void endElement(String namespaceURI, String localName, String qName) throws SAXException {
		if (!this.currObjectName.peek().equals(qName))
			throw new ExmaraldaException("The given file is not wellformed. Expected element is: " + this.currObjectName.peek() + ", but given is: " + qName);
		this.currObjectName.pop();
	}
}
