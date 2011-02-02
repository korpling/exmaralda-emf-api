package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.resources;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;


public class EXBResourceFactory extends ResourceFactoryImpl 
{
	public Resource createResource(URI uri)
	{
		Resource resource=new EXBResource();
		resource.setURI(uri);
		return(resource);
	}
}
