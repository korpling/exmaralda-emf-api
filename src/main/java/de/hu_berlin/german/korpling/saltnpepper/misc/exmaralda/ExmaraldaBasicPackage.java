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
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory
 * @model kind="package"
 * @generated
 */
public interface ExmaraldaBasicPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exmaralda";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "exb";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "exb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExmaraldaBasicPackage eINSTANCE = de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl <em>Basic Transcription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getBasicTranscription()
	 * @generated
	 */
	int BASIC_TRANSCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Common Time Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TRANSCRIPTION__COMMON_TIME_LINE = 0;

	/**
	 * The feature id for the '<em><b>Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TRANSCRIPTION__META_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Speakertable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TRANSCRIPTION__SPEAKERTABLE = 2;

	/**
	 * The feature id for the '<em><b>Tiers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TRANSCRIPTION__TIERS = 3;

	/**
	 * The number of structural features of the '<em>Basic Transcription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_TRANSCRIPTION_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl <em>Meta Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getMetaInformation()
	 * @generated
	 */
	int META_INFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Project Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__PROJECT_NAME = 0;

	/**
	 * The feature id for the '<em><b>Transcription Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__TRANSCRIPTION_NAME = 1;

	/**
	 * The feature id for the '<em><b>Referenced File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__REFERENCED_FILE = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Ud Meta Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__UD_META_INFORMATIONS = 4;

	/**
	 * The feature id for the '<em><b>Transcription Convention</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION__TRANSCRIPTION_CONVENTION = 5;

	/**
	 * The number of structural features of the '<em>Meta Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int META_INFORMATION_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.CommonTimeLineImpl <em>Common Time Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.CommonTimeLineImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getCommonTimeLine()
	 * @generated
	 */
	int COMMON_TIME_LINE = 2;

	/**
	 * The feature id for the '<em><b>TL Is</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_TIME_LINE__TL_IS = 0;

	/**
	 * The number of structural features of the '<em>Common Time Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMON_TIME_LINE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.UDInformationImpl <em>UD Information</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.UDInformationImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getUDInformation()
	 * @generated
	 */
	int UD_INFORMATION = 3;

	/**
	 * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UD_INFORMATION__ATTRIBUTE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UD_INFORMATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>UD Information</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UD_INFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl <em>Speaker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getSpeaker()
	 * @generated
	 */
	int SPEAKER = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__ID = 0;

	/**
	 * The feature id for the '<em><b>Abbreviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__ABBREVIATION = 1;

	/**
	 * The feature id for the '<em><b>Sex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__SEX = 2;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Ud Speaker Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__UD_SPEAKER_INFORMATIONS = 4;

	/**
	 * The feature id for the '<em><b>Language Used</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__LANGUAGE_USED = 5;

	/**
	 * The feature id for the '<em><b>L1</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__L1 = 6;

	/**
	 * The feature id for the '<em><b>L2</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER__L2 = 7;

	/**
	 * The number of structural features of the '<em>Speaker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEAKER_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl <em>Tier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTier()
	 * @generated
	 */
	int TIER = 5;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__CATEGORY = 0;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__DISPLAY_NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__ID = 4;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__SPEAKER = 5;

	/**
	 * The feature id for the '<em><b>Ud Tier Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER__UD_TIER_INFORMATIONS = 6;

	/**
	 * The number of structural features of the '<em>Tier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIER_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 6;

	/**
	 * The feature id for the '<em><b>Ud Informations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__UD_INFORMATIONS = 0;

	/**
	 * The feature id for the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__START = 1;

	/**
	 * The feature id for the '<em><b>End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__END = 2;

	/**
	 * The feature id for the '<em><b>Medium</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__MEDIUM = 3;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__URL = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__VALUE = 5;

	/**
	 * The feature id for the '<em><b>Tier</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__TIER = 6;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl <em>TLI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTLI()
	 * @generated
	 */
	int TLI = 7;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLI__TIME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLI__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLI__ID = 2;

	/**
	 * The feature id for the '<em><b>Starting Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLI__STARTING_EVENTS = 3;

	/**
	 * The feature id for the '<em><b>Ending Events</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLI__ENDING_EVENTS = 4;

	/**
	 * The number of structural features of the '<em>TLI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TLI_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX <em>SPEAKER SEX</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getSPEAKER_SEX()
	 * @generated
	 */
	int SPEAKER_SEX = 8;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE <em>TIER TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTIER_TYPE()
	 * @generated
	 */
	int TIER_TYPE = 9;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE <em>TIME TYPE</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTIME_TYPE()
	 * @generated
	 */
	int TIME_TYPE = 10;

	/**
	 * The meta object id for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM <em>EVENT MEDIUM</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getEVENT_MEDIUM()
	 * @generated
	 */
	int EVENT_MEDIUM = 11;

	/**
	 * The meta object id for the '<em>URL</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.net.URL
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getURL()
	 * @generated
	 */
	int URL = 12;


	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription <em>Basic Transcription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Transcription</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription
	 * @generated
	 */
	EClass getBasicTranscription();

	/**
	 * Returns the meta object for the containment reference '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getCommonTimeLine <em>Common Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Common Time Line</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getCommonTimeLine()
	 * @see #getBasicTranscription()
	 * @generated
	 */
	EReference getBasicTranscription_CommonTimeLine();

	/**
	 * Returns the meta object for the containment reference '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getMetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Meta Information</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getMetaInformation()
	 * @see #getBasicTranscription()
	 * @generated
	 */
	EReference getBasicTranscription_MetaInformation();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getSpeakertable <em>Speakertable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speakertable</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getSpeakertable()
	 * @see #getBasicTranscription()
	 * @generated
	 */
	EReference getBasicTranscription_Speakertable();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getTiers <em>Tiers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tiers</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getTiers()
	 * @see #getBasicTranscription()
	 * @generated
	 */
	EReference getBasicTranscription_Tiers();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Meta Information</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation
	 * @generated
	 */
	EClass getMetaInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getProjectName <em>Project Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project Name</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getProjectName()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_ProjectName();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getTranscriptionName <em>Transcription Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transcription Name</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getTranscriptionName()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_TranscriptionName();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getReferencedFile <em>Referenced File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced File</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getReferencedFile()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_ReferencedFile();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getComment()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getUdMetaInformations <em>Ud Meta Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ud Meta Informations</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getUdMetaInformations()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EReference getMetaInformation_UdMetaInformations();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getTranscriptionConvention <em>Transcription Convention</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transcription Convention</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation#getTranscriptionConvention()
	 * @see #getMetaInformation()
	 * @generated
	 */
	EAttribute getMetaInformation_TranscriptionConvention();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine <em>Common Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Common Time Line</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine
	 * @generated
	 */
	EClass getCommonTimeLine();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine#getTLIs <em>TL Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>TL Is</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine#getTLIs()
	 * @see #getCommonTimeLine()
	 * @generated
	 */
	EReference getCommonTimeLine_TLIs();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation <em>UD Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UD Information</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation
	 * @generated
	 */
	EClass getUDInformation();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation#getAttributeName <em>Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute Name</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation#getAttributeName()
	 * @see #getUDInformation()
	 * @generated
	 */
	EAttribute getUDInformation_AttributeName();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation#getValue()
	 * @see #getUDInformation()
	 * @generated
	 */
	EAttribute getUDInformation_Value();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speaker</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker
	 * @generated
	 */
	EClass getSpeaker();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getId()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Id();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getAbbreviation <em>Abbreviation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbreviation</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getAbbreviation()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Abbreviation();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getSex <em>Sex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sex</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getSex()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Sex();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Comment</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getComment()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getUdSpeakerInformations <em>Ud Speaker Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ud Speaker Informations</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getUdSpeakerInformations()
	 * @see #getSpeaker()
	 * @generated
	 */
	EReference getSpeaker_UdSpeakerInformations();

	/**
	 * Returns the meta object for the attribute list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getLanguageUsed <em>Language Used</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Language Used</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getLanguageUsed()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_LanguageUsed();

	/**
	 * Returns the meta object for the attribute list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getL1 <em>L1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>L1</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getL1()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_L1();

	/**
	 * Returns the meta object for the attribute list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getL2 <em>L2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>L2</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker#getL2()
	 * @see #getSpeaker()
	 * @generated
	 */
	EAttribute getSpeaker_L2();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tier</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier
	 * @generated
	 */
	EClass getTier();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getCategory()
	 * @see #getTier()
	 * @generated
	 */
	EAttribute getTier_Category();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getDisplayName()
	 * @see #getTier()
	 * @generated
	 */
	EAttribute getTier_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getType()
	 * @see #getTier()
	 * @generated
	 */
	EAttribute getTier_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getEvents()
	 * @see #getTier()
	 * @generated
	 */
	EReference getTier_Events();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getId()
	 * @see #getTier()
	 * @generated
	 */
	EAttribute getTier_Id();

	/**
	 * Returns the meta object for the reference '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getSpeaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Speaker</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getSpeaker()
	 * @see #getTier()
	 * @generated
	 */
	EReference getTier_Speaker();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getUdTierInformations <em>Ud Tier Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ud Tier Informations</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getUdTierInformations()
	 * @see #getTier()
	 * @generated
	 */
	EReference getTier_UdTierInformations();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getUdInformations <em>Ud Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ud Informations</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getUdInformations()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_UdInformations();

	/**
	 * Returns the meta object for the reference '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Start</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getStart()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Start();

	/**
	 * Returns the meta object for the reference '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>End</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getEnd()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_End();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getMedium <em>Medium</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Medium</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getMedium()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Medium();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getUrl()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Url();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getValue()
	 * @see #getEvent()
	 * @generated
	 */
	EAttribute getEvent_Value();

	/**
	 * Returns the meta object for the container reference '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getTier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tier</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getTier()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_Tier();

	/**
	 * Returns the meta object for class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI <em>TLI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>TLI</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI
	 * @generated
	 */
	EClass getTLI();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getTime()
	 * @see #getTLI()
	 * @generated
	 */
	EAttribute getTLI_Time();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getType()
	 * @see #getTLI()
	 * @generated
	 */
	EAttribute getTLI_Type();

	/**
	 * Returns the meta object for the attribute '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getId()
	 * @see #getTLI()
	 * @generated
	 */
	EAttribute getTLI_Id();

	/**
	 * Returns the meta object for the reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getStartingEvents <em>Starting Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Starting Events</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getStartingEvents()
	 * @see #getTLI()
	 * @generated
	 */
	EReference getTLI_StartingEvents();

	/**
	 * Returns the meta object for the reference list '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getEndingEvents <em>Ending Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ending Events</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI#getEndingEvents()
	 * @see #getTLI()
	 * @generated
	 */
	EReference getTLI_EndingEvents();

	/**
	 * Returns the meta object for enum '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX <em>SPEAKER SEX</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>SPEAKER SEX</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX
	 * @generated
	 */
	EEnum getSPEAKER_SEX();

	/**
	 * Returns the meta object for enum '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE <em>TIER TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TIER TYPE</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE
	 * @generated
	 */
	EEnum getTIER_TYPE();

	/**
	 * Returns the meta object for enum '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE <em>TIME TYPE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TIME TYPE</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE
	 * @generated
	 */
	EEnum getTIME_TYPE();

	/**
	 * Returns the meta object for enum '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM <em>EVENT MEDIUM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>EVENT MEDIUM</em>'.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM
	 * @generated
	 */
	EEnum getEVENT_MEDIUM();

	/**
	 * Returns the meta object for data type '{@link java.net.URL <em>URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URL</em>'.
	 * @see java.net.URL
	 * @model instanceClass="java.net.URL"
	 * @generated
	 */
	EDataType getURL();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExmaraldaBasicFactory getExmaraldaBasicFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl <em>Basic Transcription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getBasicTranscription()
		 * @generated
		 */
		EClass BASIC_TRANSCRIPTION = eINSTANCE.getBasicTranscription();

		/**
		 * The meta object literal for the '<em><b>Common Time Line</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TRANSCRIPTION__COMMON_TIME_LINE = eINSTANCE.getBasicTranscription_CommonTimeLine();

		/**
		 * The meta object literal for the '<em><b>Meta Information</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TRANSCRIPTION__META_INFORMATION = eINSTANCE.getBasicTranscription_MetaInformation();

		/**
		 * The meta object literal for the '<em><b>Speakertable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TRANSCRIPTION__SPEAKERTABLE = eINSTANCE.getBasicTranscription_Speakertable();

		/**
		 * The meta object literal for the '<em><b>Tiers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASIC_TRANSCRIPTION__TIERS = eINSTANCE.getBasicTranscription_Tiers();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl <em>Meta Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getMetaInformation()
		 * @generated
		 */
		EClass META_INFORMATION = eINSTANCE.getMetaInformation();

		/**
		 * The meta object literal for the '<em><b>Project Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__PROJECT_NAME = eINSTANCE.getMetaInformation_ProjectName();

		/**
		 * The meta object literal for the '<em><b>Transcription Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__TRANSCRIPTION_NAME = eINSTANCE.getMetaInformation_TranscriptionName();

		/**
		 * The meta object literal for the '<em><b>Referenced File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__REFERENCED_FILE = eINSTANCE.getMetaInformation_ReferencedFile();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__COMMENT = eINSTANCE.getMetaInformation_Comment();

		/**
		 * The meta object literal for the '<em><b>Ud Meta Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference META_INFORMATION__UD_META_INFORMATIONS = eINSTANCE.getMetaInformation_UdMetaInformations();

		/**
		 * The meta object literal for the '<em><b>Transcription Convention</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute META_INFORMATION__TRANSCRIPTION_CONVENTION = eINSTANCE.getMetaInformation_TranscriptionConvention();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.CommonTimeLineImpl <em>Common Time Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.CommonTimeLineImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getCommonTimeLine()
		 * @generated
		 */
		EClass COMMON_TIME_LINE = eINSTANCE.getCommonTimeLine();

		/**
		 * The meta object literal for the '<em><b>TL Is</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMON_TIME_LINE__TL_IS = eINSTANCE.getCommonTimeLine_TLIs();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.UDInformationImpl <em>UD Information</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.UDInformationImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getUDInformation()
		 * @generated
		 */
		EClass UD_INFORMATION = eINSTANCE.getUDInformation();

		/**
		 * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UD_INFORMATION__ATTRIBUTE_NAME = eINSTANCE.getUDInformation_AttributeName();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UD_INFORMATION__VALUE = eINSTANCE.getUDInformation_Value();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl <em>Speaker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getSpeaker()
		 * @generated
		 */
		EClass SPEAKER = eINSTANCE.getSpeaker();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__ID = eINSTANCE.getSpeaker_Id();

		/**
		 * The meta object literal for the '<em><b>Abbreviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__ABBREVIATION = eINSTANCE.getSpeaker_Abbreviation();

		/**
		 * The meta object literal for the '<em><b>Sex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__SEX = eINSTANCE.getSpeaker_Sex();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__COMMENT = eINSTANCE.getSpeaker_Comment();

		/**
		 * The meta object literal for the '<em><b>Ud Speaker Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPEAKER__UD_SPEAKER_INFORMATIONS = eINSTANCE.getSpeaker_UdSpeakerInformations();

		/**
		 * The meta object literal for the '<em><b>Language Used</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__LANGUAGE_USED = eINSTANCE.getSpeaker_LanguageUsed();

		/**
		 * The meta object literal for the '<em><b>L1</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__L1 = eINSTANCE.getSpeaker_L1();

		/**
		 * The meta object literal for the '<em><b>L2</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPEAKER__L2 = eINSTANCE.getSpeaker_L2();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl <em>Tier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTier()
		 * @generated
		 */
		EClass TIER = eINSTANCE.getTier();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIER__CATEGORY = eINSTANCE.getTier_Category();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIER__DISPLAY_NAME = eINSTANCE.getTier_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIER__TYPE = eINSTANCE.getTier_Type();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIER__EVENTS = eINSTANCE.getTier_Events();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIER__ID = eINSTANCE.getTier_Id();

		/**
		 * The meta object literal for the '<em><b>Speaker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIER__SPEAKER = eINSTANCE.getTier_Speaker();

		/**
		 * The meta object literal for the '<em><b>Ud Tier Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIER__UD_TIER_INFORMATIONS = eINSTANCE.getTier_UdTierInformations();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>Ud Informations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__UD_INFORMATIONS = eINSTANCE.getEvent_UdInformations();

		/**
		 * The meta object literal for the '<em><b>Start</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__START = eINSTANCE.getEvent_Start();

		/**
		 * The meta object literal for the '<em><b>End</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__END = eINSTANCE.getEvent_End();

		/**
		 * The meta object literal for the '<em><b>Medium</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__MEDIUM = eINSTANCE.getEvent_Medium();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__URL = eINSTANCE.getEvent_Url();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENT__VALUE = eINSTANCE.getEvent_Value();

		/**
		 * The meta object literal for the '<em><b>Tier</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__TIER = eINSTANCE.getEvent_Tier();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl <em>TLI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTLI()
		 * @generated
		 */
		EClass TLI = eINSTANCE.getTLI();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLI__TIME = eINSTANCE.getTLI_Time();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLI__TYPE = eINSTANCE.getTLI_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TLI__ID = eINSTANCE.getTLI_Id();

		/**
		 * The meta object literal for the '<em><b>Starting Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLI__STARTING_EVENTS = eINSTANCE.getTLI_StartingEvents();

		/**
		 * The meta object literal for the '<em><b>Ending Events</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TLI__ENDING_EVENTS = eINSTANCE.getTLI_EndingEvents();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX <em>SPEAKER SEX</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getSPEAKER_SEX()
		 * @generated
		 */
		EEnum SPEAKER_SEX = eINSTANCE.getSPEAKER_SEX();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE <em>TIER TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTIER_TYPE()
		 * @generated
		 */
		EEnum TIER_TYPE = eINSTANCE.getTIER_TYPE();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE <em>TIME TYPE</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getTIME_TYPE()
		 * @generated
		 */
		EEnum TIME_TYPE = eINSTANCE.getTIME_TYPE();

		/**
		 * The meta object literal for the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM <em>EVENT MEDIUM</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getEVENT_MEDIUM()
		 * @generated
		 */
		EEnum EVENT_MEDIUM = eINSTANCE.getEVENT_MEDIUM();

		/**
		 * The meta object literal for the '<em>URL</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.net.URL
		 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicPackageImpl#getURL()
		 * @generated
		 */
		EDataType URL = eINSTANCE.getURL();

	}

} //ExmaraldaBasicPackage
