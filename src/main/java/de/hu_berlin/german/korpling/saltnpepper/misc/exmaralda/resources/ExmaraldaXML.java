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
	 * Name of root element
	 */
	public static final String ELEMENT_BASIC_TRANS="basic-transcription";
	/**
	 * Name of element including the header
	 */
	public static final String ELEMENT_HEAD="head";
	/**
	 * Name of element including the header meta information.
	 */
	public static final String ELEMENT_META_INFORMATION="meta-information";
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
	 * Name of the xml element for user-defined meta information.
	 */
	public static final String ELEMENT_UD_META_INFO="ud-meta-information";
	/**
	 * Name of the xml element for user-defined information of speaker.
	 */
	public static final String ELEMENT_UD_SPEAKER_INFO="ud-speaker-information";
	/**
	 * Name of the xml element for user-defined information of tier.
	 */
	public static final String ELEMENT_UD_TIER_INFO="ud-tier-information";
	/**
	 * Name of the xml element containing user-defined inormationle.
	 */
	public static final String ELEMENT_UD_INFO="ud-information";
	/**
	 * Name of the xml element to store a comment.
	 */
	public static final String ELEMENT_COMMENT="comment";
	/**
	 * Name of the xml element conmtaining the transcription conventions.
	 */
	public static final String ELEMENT_TRANSCRIPTION_CONVENTION="transcription-convention";
	/**
	 * Name of the xml element containing speaker elements.
	 */
	public static final String ELEMENT_SPEAKERTABLE="speakertable";
	/**
	 * Name of element describing the speaker.
	 */
	public static final String ELEMENT_SPEAKER="speaker";
	/**
	 * Name of element describing the abbreviation of the speaker.
	 */
	public static final String ELEMENT_ABBREVIATION="abbreviation";
	/**
	 * Name of element describing the sex of the speaker.
	 */
	public static final String ELEMENT_SEX="sex";
	/**
	 * Name of element to describe used language of primary text concerning current speaker .
	 * Contains {@value #ELEMENT_LANGUAGE} elements.
	 */
	public static final String ELEMENT_LANGUAGE_USED="languages-used";
	/**
	 * Element declaring mother tongue of speaker 
	 */
	public static final String ELEMENT_L1="l1";
	/**
	 * Element declaring foreign languages of speaker. 
	 */
	public static final String ELEMENT_L2="l2";
	/**
	 * Element declaring used language of speaker 
	 */
	public static final String ELEMENT_LANGUAGE="language";
	/**
	 * Name of the xml basic-body element.  
	 */
	public static final String ELEMENT_BASIC_BODY="basic-body";
	/**
	 * Name of the xml common-timeline element.  
	 */
	public static final String ELEMENT_COMMON_TIMELINE="common-timeline";
	/**
	 * Name of the xml tli element.  
	 */
	public static final String ELEMENT_TLI="tli";
	/**
	 * Name of the xml tier element. 
	 */
	public static final String ELEMENT_TIER="tier";
	/**
	 * Name of the xml event element.
	 */
	public static final String ELEMENT_EVENT="event";
	
	/**
	 * Attribute declaring a language 
	 */
	public static final String ATT_LANG="lang";
	/**
	 * Name of the xml attribute to store url for instance refering to an audio file.
	 */
	public static final String ATT_URL="url";
	/**
	 * Name of the xml attribute to store name of user-defined information
	 */
	public static final String ATT_ATTRIBUTE_NAME="attribute-name";
	/**
	 * Name of the xml attribute to store id.
	 */
	public static final String ATT_ID="id";
	/**
	 * Name of the xml attribute to store time.
	 */
	public static final String ATT_TIME="time";
	/**
	 * Name of the xml attribute to store value.
	 */
	public static final String ATT_VALUE="value";
	/**
	 * Name of the xml attribute to store medium.
	 */
	public static final String ATT_MEDIUM="medium";
	/**
	 * Name of the xml attribute to store id.
	 */
	public static final String ATT_SPEAKER="speaker";
	/**
	 * Name of the xml attribute to store type.
	 */
	public static final String ATT_TYPE="type";
	/**
	 * Name of the xml attribute to store display-name.
	 */
	public static final String ATT_DISPLAY_NAME="display-name";
	/**
	 * Name of the xml attribute to store id.
	 */
	public static final String ATT_START="start";
	/**
	 * Name of the xml attribute to store end.
	 */
	public static final String ATT_END="end";
	/**
	 * Name of the xml attribute to store id.
	 */
	public static final String ATT_CATEGORY="category";
}
