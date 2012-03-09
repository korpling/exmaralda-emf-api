package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.resources;

public interface ExmaraldaXML 
{
	/**
	 * Name of the xml element to store the name of the project.
	 */
	public static final String ELEMENT_PROJECT_NAME="project-name";
	/**
	 * Name of the xml element to store the name of the transcription.
	 */
	public static final String ELEMENT_TRANSCRIPTION_NAME="transcription-name";
	/**
	 * Name of the xml element to store an audio file.
	 */
	public static final String ELEMENT_REFERENCED_FILE="referenced-file";
	/**
	 * Name of the xml attribute to store url for instance refering to an audio file.
	 */
	public static final String ATT_URL="url";
}
