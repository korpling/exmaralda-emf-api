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
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExmaraldaBasicPackageImpl extends EPackageImpl implements ExmaraldaBasicPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicTranscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metaInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commonTimeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass udInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass speakerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tliEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum speakeR_SEXEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tieR_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timE_TYPEEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum evenT_MEDIUMEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExmaraldaBasicPackageImpl() {
		super(eNS_URI, ExmaraldaBasicFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ExmaraldaBasicPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExmaraldaBasicPackage init() {
		if (isInited) return (ExmaraldaBasicPackage)EPackage.Registry.INSTANCE.getEPackage(ExmaraldaBasicPackage.eNS_URI);

		// Obtain or create and register package
		ExmaraldaBasicPackageImpl theExmaraldaBasicPackage = (ExmaraldaBasicPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ExmaraldaBasicPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ExmaraldaBasicPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theExmaraldaBasicPackage.createPackageContents();

		// Initialize created meta-data
		theExmaraldaBasicPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExmaraldaBasicPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExmaraldaBasicPackage.eNS_URI, theExmaraldaBasicPackage);
		return theExmaraldaBasicPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicTranscription() {
		return basicTranscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTranscription_CommonTimeLine() {
		return (EReference)basicTranscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTranscription_MetaInformation() {
		return (EReference)basicTranscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTranscription_Speakertable() {
		return (EReference)basicTranscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicTranscription_Tiers() {
		return (EReference)basicTranscriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaInformation() {
		return metaInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_ProjectName() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_TranscriptionName() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_ReferencedFile() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_Comment() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMetaInformation_UdMetaInformations() {
		return (EReference)metaInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMetaInformation_TranscriptionConvention() {
		return (EAttribute)metaInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommonTimeLine() {
		return commonTimeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommonTimeLine_TLIs() {
		return (EReference)commonTimeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUDInformation() {
		return udInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDInformation_AttributeName() {
		return (EAttribute)udInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUDInformation_Value() {
		return (EAttribute)udInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpeaker() {
		return speakerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_Id() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_Abbreviation() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_Sex() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_Comment() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpeaker_UdSpeakerInformations() {
		return (EReference)speakerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_LanguageUsed() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_L1() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpeaker_L2() {
		return (EAttribute)speakerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTier() {
		return tierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTier_Category() {
		return (EAttribute)tierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTier_DisplayName() {
		return (EAttribute)tierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTier_Type() {
		return (EAttribute)tierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTier_Events() {
		return (EReference)tierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTier_Id() {
		return (EAttribute)tierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTier_Speaker() {
		return (EReference)tierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTier_UdTierInformations() {
		return (EReference)tierEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvent() {
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_UdInformations() {
		return (EReference)eventEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Start() {
		return (EReference)eventEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_End() {
		return (EReference)eventEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Medium() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Url() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvent_Value() {
		return (EAttribute)eventEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEvent_Tier() {
		return (EReference)eventEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTLI() {
		return tliEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLI_Time() {
		return (EAttribute)tliEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLI_Type() {
		return (EAttribute)tliEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTLI_Id() {
		return (EAttribute)tliEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLI_StartingEvents() {
		return (EReference)tliEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTLI_EndingEvents() {
		return (EReference)tliEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSPEAKER_SEX() {
		return speakeR_SEXEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTIER_TYPE() {
		return tieR_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTIME_TYPE() {
		return timE_TYPEEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEVENT_MEDIUM() {
		return evenT_MEDIUMEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExmaraldaBasicFactory getExmaraldaBasicFactory() {
		return (ExmaraldaBasicFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		basicTranscriptionEClass = createEClass(BASIC_TRANSCRIPTION);
		createEReference(basicTranscriptionEClass, BASIC_TRANSCRIPTION__COMMON_TIME_LINE);
		createEReference(basicTranscriptionEClass, BASIC_TRANSCRIPTION__META_INFORMATION);
		createEReference(basicTranscriptionEClass, BASIC_TRANSCRIPTION__SPEAKERTABLE);
		createEReference(basicTranscriptionEClass, BASIC_TRANSCRIPTION__TIERS);

		metaInformationEClass = createEClass(META_INFORMATION);
		createEAttribute(metaInformationEClass, META_INFORMATION__PROJECT_NAME);
		createEAttribute(metaInformationEClass, META_INFORMATION__TRANSCRIPTION_NAME);
		createEAttribute(metaInformationEClass, META_INFORMATION__REFERENCED_FILE);
		createEAttribute(metaInformationEClass, META_INFORMATION__COMMENT);
		createEReference(metaInformationEClass, META_INFORMATION__UD_META_INFORMATIONS);
		createEAttribute(metaInformationEClass, META_INFORMATION__TRANSCRIPTION_CONVENTION);

		commonTimeLineEClass = createEClass(COMMON_TIME_LINE);
		createEReference(commonTimeLineEClass, COMMON_TIME_LINE__TL_IS);

		udInformationEClass = createEClass(UD_INFORMATION);
		createEAttribute(udInformationEClass, UD_INFORMATION__ATTRIBUTE_NAME);
		createEAttribute(udInformationEClass, UD_INFORMATION__VALUE);

		speakerEClass = createEClass(SPEAKER);
		createEAttribute(speakerEClass, SPEAKER__ID);
		createEAttribute(speakerEClass, SPEAKER__ABBREVIATION);
		createEAttribute(speakerEClass, SPEAKER__SEX);
		createEAttribute(speakerEClass, SPEAKER__COMMENT);
		createEReference(speakerEClass, SPEAKER__UD_SPEAKER_INFORMATIONS);
		createEAttribute(speakerEClass, SPEAKER__LANGUAGE_USED);
		createEAttribute(speakerEClass, SPEAKER__L1);
		createEAttribute(speakerEClass, SPEAKER__L2);

		tierEClass = createEClass(TIER);
		createEAttribute(tierEClass, TIER__CATEGORY);
		createEAttribute(tierEClass, TIER__DISPLAY_NAME);
		createEAttribute(tierEClass, TIER__TYPE);
		createEReference(tierEClass, TIER__EVENTS);
		createEAttribute(tierEClass, TIER__ID);
		createEReference(tierEClass, TIER__SPEAKER);
		createEReference(tierEClass, TIER__UD_TIER_INFORMATIONS);

		eventEClass = createEClass(EVENT);
		createEReference(eventEClass, EVENT__UD_INFORMATIONS);
		createEReference(eventEClass, EVENT__START);
		createEReference(eventEClass, EVENT__END);
		createEAttribute(eventEClass, EVENT__MEDIUM);
		createEAttribute(eventEClass, EVENT__URL);
		createEAttribute(eventEClass, EVENT__VALUE);
		createEReference(eventEClass, EVENT__TIER);

		tliEClass = createEClass(TLI);
		createEAttribute(tliEClass, TLI__TIME);
		createEAttribute(tliEClass, TLI__TYPE);
		createEAttribute(tliEClass, TLI__ID);
		createEReference(tliEClass, TLI__STARTING_EVENTS);
		createEReference(tliEClass, TLI__ENDING_EVENTS);

		// Create enums
		speakeR_SEXEEnum = createEEnum(SPEAKER_SEX);
		tieR_TYPEEEnum = createEEnum(TIER_TYPE);
		timE_TYPEEEnum = createEEnum(TIME_TYPE);
		evenT_MEDIUMEEnum = createEEnum(EVENT_MEDIUM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(basicTranscriptionEClass, BasicTranscription.class, "BasicTranscription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasicTranscription_CommonTimeLine(), this.getCommonTimeLine(), null, "commonTimeLine", null, 0, 1, BasicTranscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicTranscription_MetaInformation(), this.getMetaInformation(), null, "metaInformation", null, 0, 1, BasicTranscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicTranscription_Speakertable(), this.getSpeaker(), null, "speakertable", null, 0, -1, BasicTranscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasicTranscription_Tiers(), this.getTier(), null, "tiers", null, 0, -1, BasicTranscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(metaInformationEClass, MetaInformation.class, "MetaInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMetaInformation_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaInformation_TranscriptionName(), ecorePackage.getEString(), "transcriptionName", null, 0, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaInformation_ReferencedFile(), ecorePackage.getEString(), "referencedFile", null, 0, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaInformation_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMetaInformation_UdMetaInformations(), this.getUDInformation(), null, "udMetaInformations", null, 0, -1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMetaInformation_TranscriptionConvention(), ecorePackage.getEString(), "transcriptionConvention", null, 0, 1, MetaInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(commonTimeLineEClass, CommonTimeLine.class, "CommonTimeLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommonTimeLine_TLIs(), this.getTLI(), null, "TLIs", null, 0, -1, CommonTimeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(udInformationEClass, UDInformation.class, "UDInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUDInformation_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, UDInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUDInformation_Value(), ecorePackage.getEString(), "value", null, 0, 1, UDInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(speakerEClass, Speaker.class, "Speaker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpeaker_Id(), ecorePackage.getEString(), "id", null, 0, 1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeaker_Abbreviation(), ecorePackage.getEString(), "abbreviation", null, 0, 1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeaker_Sex(), this.getSPEAKER_SEX(), "sex", null, 0, 1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeaker_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpeaker_UdSpeakerInformations(), this.getUDInformation(), null, "udSpeakerInformations", null, 0, -1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeaker_LanguageUsed(), ecorePackage.getEString(), "languageUsed", null, 0, -1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeaker_L1(), ecorePackage.getEString(), "l1", null, 0, -1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpeaker_L2(), ecorePackage.getEString(), "l2", null, 0, -1, Speaker.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tierEClass, Tier.class, "Tier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTier_Category(), ecorePackage.getEString(), "category", null, 0, 1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTier_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTier_Type(), this.getTIER_TYPE(), "type", null, 0, 1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTier_Events(), this.getEvent(), this.getEvent_Tier(), "events", null, 0, -1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTier_Id(), ecorePackage.getEString(), "id", null, 0, 1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTier_Speaker(), this.getSpeaker(), null, "speaker", null, 0, 1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTier_UdTierInformations(), this.getUDInformation(), null, "udTierInformations", null, 0, -1, Tier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eventEClass, Event.class, "Event", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEvent_UdInformations(), this.getUDInformation(), null, "udInformations", null, 0, -1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Start(), this.getTLI(), this.getTLI_StartingEvents(), "start", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_End(), this.getTLI(), this.getTLI_EndingEvents(), "end", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Medium(), this.getEVENT_MEDIUM(), "medium", "", 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Url(), ecorePackage.getEString(), "url", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvent_Value(), ecorePackage.getEString(), "value", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvent_Tier(), this.getTier(), this.getTier_Events(), "tier", null, 0, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tliEClass, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI.class, "TLI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTLI_Time(), ecorePackage.getEString(), "time", null, 0, 1, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLI_Type(), this.getTIME_TYPE(), "type", "", 0, 1, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTLI_Id(), ecorePackage.getEString(), "id", null, 0, 1, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLI_StartingEvents(), this.getEvent(), this.getEvent_Start(), "startingEvents", null, 0, -1, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTLI_EndingEvents(), this.getEvent(), this.getEvent_End(), "endingEvents", null, 0, -1, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(speakeR_SEXEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX.class, "SPEAKER_SEX");
		addEEnumLiteral(speakeR_SEXEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX.M);
		addEEnumLiteral(speakeR_SEXEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX.F);
		addEEnumLiteral(speakeR_SEXEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX.U);

		initEEnum(tieR_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE.class, "TIER_TYPE");
		addEEnumLiteral(tieR_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE.T);
		addEEnumLiteral(tieR_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE.D);
		addEEnumLiteral(tieR_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE.A);
		addEEnumLiteral(tieR_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE.L);
		addEEnumLiteral(tieR_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE.U);

		initEEnum(timE_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE.class, "TIME_TYPE");
		addEEnumLiteral(timE_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE.UNSP);
		addEEnumLiteral(timE_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE.USER);
		addEEnumLiteral(timE_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE.OTHR);
		addEEnumLiteral(timE_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE.INTP);
		addEEnumLiteral(timE_TYPEEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE.APPL);

		initEEnum(evenT_MEDIUMEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM.class, "EVENT_MEDIUM");
		addEEnumLiteral(evenT_MEDIUMEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM.AUD);
		addEEnumLiteral(evenT_MEDIUMEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM.VID);
		addEEnumLiteral(evenT_MEDIUMEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM.IMG);
		addEEnumLiteral(evenT_MEDIUMEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM.TXT);
		addEEnumLiteral(evenT_MEDIUMEEnum, de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM.OTH);

		// Create resource
		createResource(eNS_URI);
	}

} //ExmaraldaBasicPackageImpl
