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

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;

public class EXBMain 
{	
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		System.out.println(	"************************************ ExmaraldaMain ************************************");
		System.out.println(	"ExmaraldaMain converts files into different treetagger-formats. Therefore it loads data ");
		System.out.println(	"from input format into the treetagger model and exports them into output format.");
		System.out.println(	"supported formats:");
		System.out.println(	"\t * a tab-separted file with ending .tab");
		System.out.println(	"\t * the xmi file created by ecore with ending .treetagger");
		System.out.println(	"The kind of file will be discovered automatically.");
		System.out.println(	);
		System.out.println(	"Synopsis: ExmaraldaMain -i INPUT_FILE -o OUTPUT_FILE");
		System.out.println(	);
		
		String inputFile= null;
		String outputFile= null;
		for (int i=0; i< args.length; i++)
		{
			if (args[i].equalsIgnoreCase("-i"))
				inputFile= args[i+1];
			
			if (args[i].equalsIgnoreCase("-o"))
				outputFile= args[i+1];
		}	
		
		System.out.println("reading from: "+inputFile+" writing to: "+outputFile);
		
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("exmaralda",new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("exb",new EXBResourceFactory());

		//load resource 
		Resource resource = resourceSet.createResource(URI.createFileURI(inputFile));
		
		if (resource== null)
			throw new NullPointerException("The resource is null.");
		resource.load(null);
		
		BasicTranscription basicTranscription= (BasicTranscription) resource.getContents().get(0);
		
		System.out.println(basicTranscription);
		
		Resource resourceOut = resourceSet.createResource(URI.createFileURI(outputFile));
		resourceOut.getContents().add(basicTranscription);
		resourceOut.save(null);
		System.out.println(	"****************************************************************************************");
	}
}
