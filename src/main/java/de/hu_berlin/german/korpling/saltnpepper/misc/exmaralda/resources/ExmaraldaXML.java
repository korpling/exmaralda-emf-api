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
