package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.resources;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.exceptions.ExmaraldaException;

public class StoringTest extends TestCase 
{
	private void loadSaveCompare(	String inputFileStr, 
									String outputFileStr,
									String expectedFileStr) throws IOException
	{
		File inputFile= new File(inputFileStr);
		if (!inputFile.exists())
			throw new ExmaraldaException("Cannot load file, because it is null ("+inputFileStr+").");
		
		File outputFile= new File(outputFileStr);
		outputFile.getParentFile().mkdirs();
		// create resource set and resource 
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register XML resource factory
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("exmaralda",new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi",new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("exb",new EXBResourceFactory());

		//load resource 
		Resource resource = resourceSet.createResource(URI.createFileURI(inputFileStr));
		
		if (resource== null)
			throw new NullPointerException("The resource is null.");
		resource.load(null);
		
		BasicTranscription basicTranscription= (BasicTranscription) resource.getContents().get(0);
		
		Resource resourceOut = resourceSet.createResource(URI.createFileURI(outputFileStr));
		resourceOut.getContents().add(basicTranscription);
		resourceOut.save(null);
		
		FileComparator comparer= new FileComparator();
		assertTrue("Both files has to be the same ('"+expectedFileStr+"/ '"+outputFile+"'')", comparer.compareFiles(new File(expectedFileStr), outputFile));
	}
	
	public void testLoadSave1() throws IOException
	{
		String inputFile= "./src/test/resources/testCases/case1/expected/document1.exb";
		String expectedFile= "./src/test/resources/testCases/case1/expected/document1.exb";
		String outputFile= "./src/test/resources/_TMP/case1/document1.exb";
		
		this.loadSaveCompare(inputFile, outputFile, expectedFile);
	}
	
	public void testLoadSave2() throws IOException
	{
		String inputFile= "./src/test/resources/testCases/case2/expected/document1.exb";
		String expectedFile= "./src/test/resources/testCases/case2/expected/document1.exb";
		String outputFile= "./src/test/resources/_TMP/case2/document1.exb";
		
		this.loadSaveCompare(inputFile, outputFile, expectedFile);
	}
	
	public void testLoadSave3() throws IOException
	{
		String inputFile= "./src/test/resources/testCases/case3/expected/document1.exb";
		String expectedFile= "./src/test/resources/testCases/case3/expected/document1.exb";
		String outputFile= "./src/test/resources/_TMP/case3/document1.exb";
		
		this.loadSaveCompare(inputFile, outputFile, expectedFile);
	}
	
	public void testLoadSave4() throws IOException
	{
		String inputFile= "./src/test/resources/testCases/case4/expected/document1.exb";
		String expectedFile= "./src/test/resources/testCases/case4/expected/document1.exb";
		String outputFile= "./src/test/resources/_TMP/case4/document1.exb";
		
		this.loadSaveCompare(inputFile, outputFile, expectedFile);
	}
}
