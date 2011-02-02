package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileComparator 
{
	public boolean compareFiles(File file1, File file2) throws IOException
	{
		boolean retVal= false;
		
		if ((file1== null) || (file2== null))
			throw new NullPointerException("One of the files to compare are null.");
		
		String contentFile1= null;
		String contentFile2= null;
		BufferedReader brFile1= null;
		BufferedReader brFile2= null;
		try 
		{
			brFile1=  new BufferedReader(new FileReader(file1));
			String line= null;
			while (( line = brFile1.readLine()) != null)
			{
		          contentFile1= contentFile1+  line;
		    }
			brFile2=  new BufferedReader(new FileReader(file2));
			line= null;
			while (( line = brFile2.readLine()) != null)
			{
		          contentFile2= contentFile2+  line;
		    }
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally 
		{
			brFile1.close();
			brFile2.close();
		} 
		
		if (contentFile1== null)
		{
			if (contentFile2== null)
				retVal= true;
			else retVal= false;
		}	
		else if (contentFile1.equals(contentFile2))
			retVal= true;
		return(retVal);
	}
}
