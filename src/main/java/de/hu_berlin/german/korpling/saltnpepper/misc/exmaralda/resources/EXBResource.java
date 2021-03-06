/**
 * Copyright 2009 Humboldt-Universität zu Berlin, INRIA.
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
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.exceptions.ExmaraldaException;

public class EXBResource extends ResourceImpl
{	
	/**
	 * Stores a a EXB model.
	 */
	public void save(java.util.Map<?,?> options) throws java.io.IOException
	{
		//write all contents into file
		if (this.getContents().size()>1)
			throw new ExmaraldaException("Cannot write more than one basic transcription object per file.");
		if (!(this.getContents().get(0) instanceof BasicTranscription))
			throw new ExmaraldaException("The object to store is not of type BasicTranscription.");
		BasicTranscription basicTranscription= (BasicTranscription) this.getContents().get(0);
		EXBWriter writer= new EXBWriter();
		writer.write(basicTranscription, this.getURI());
	}
	
	
	/**
	 * Loads a resource into treetagger-model from tab-seperated file.
	 */
	public void load(java.util.Map<?,?> options) throws IOException
	{
		if (this.getURI()== null)
			throw new ExmaraldaException("Cannot load any resource, because no uri is given.");
		
		File exmaraldaFile= new File(this.getURI().toFileString());
		if (!exmaraldaFile.exists()) 
			throw new ExmaraldaException("Cannot load resource, because the file does not exist: " + exmaraldaFile);
		
		if (!exmaraldaFile.canRead())
			throw new ExmaraldaException("Cannot load resource, because the file can not be read: " + exmaraldaFile);
		BasicTranscription basicTranscription= null;
		{//create everything a valid exmaralda needs
			basicTranscription= ExmaraldaBasicFactory.eINSTANCE.createBasicTranscription();
			this.getContents().add(basicTranscription);
		}
		
		SAXParser parser;
        XMLReader xmlReader;
        EXBReader exbReader= new EXBReader();
        exbReader.setExmaraldaFile(exmaraldaFile);
        exbReader.setBasicTranscription(basicTranscription);
        
        SAXParserFactory factory= SAXParserFactory.newInstance();
        
        try
        {
			parser= factory.newSAXParser();
	        xmlReader= parser.getXMLReader();
	        xmlReader.setContentHandler(exbReader);
        } catch (ParserConfigurationException e) {
        	throw new ExmaraldaException("Cannot load exmaralda from resource '"+exmaraldaFile.getAbsolutePath()+"'.", e);
        }catch (Exception e) {
	    	throw new ExmaraldaException("Cannot load exmaralda from resource '"+exmaraldaFile.getAbsolutePath()+"'.", e);
		}
        try {
	        InputStream inputStream= new FileInputStream(exmaraldaFile);
			Reader reader = new InputStreamReader(inputStream, "UTF-8");
			 
			InputSource is = new InputSource(reader);
			is.setEncoding("UTF-8");
			 
			xmlReader.parse(is);
			
	    
        } catch (SAXException e) 
        {
        	
            try
            {
				parser= factory.newSAXParser();
		        xmlReader= parser.getXMLReader();
		        xmlReader.setContentHandler(exbReader);
				xmlReader.parse(exmaraldaFile.getAbsolutePath());
            }catch (Exception e1) {
            	throw new ExmaraldaException("Cannot load exmaralda from resource '"+exmaraldaFile.getAbsolutePath()+"'.", e1);
			}
		}
	}
}
