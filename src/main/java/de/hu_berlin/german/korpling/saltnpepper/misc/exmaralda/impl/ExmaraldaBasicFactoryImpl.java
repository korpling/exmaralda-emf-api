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

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.*;

import java.net.URL;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExmaraldaBasicFactoryImpl extends EFactoryImpl implements ExmaraldaBasicFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExmaraldaBasicFactory init() {
		try {
			ExmaraldaBasicFactory theExmaraldaBasicFactory = (ExmaraldaBasicFactory)EPackage.Registry.INSTANCE.getEFactory("exb"); 
			if (theExmaraldaBasicFactory != null) {
				return theExmaraldaBasicFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExmaraldaBasicFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExmaraldaBasicFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION: return createBasicTranscription();
			case ExmaraldaBasicPackage.META_INFORMATION: return createMetaInformation();
			case ExmaraldaBasicPackage.COMMON_TIME_LINE: return createCommonTimeLine();
			case ExmaraldaBasicPackage.UD_INFORMATION: return createUDInformation();
			case ExmaraldaBasicPackage.SPEAKER: return createSpeaker();
			case ExmaraldaBasicPackage.TIER: return createTier();
			case ExmaraldaBasicPackage.EVENT: return createEvent();
			case ExmaraldaBasicPackage.TLI: return createTLI();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExmaraldaBasicPackage.SPEAKER_SEX:
				return createSPEAKER_SEXFromString(eDataType, initialValue);
			case ExmaraldaBasicPackage.TIER_TYPE:
				return createTIER_TYPEFromString(eDataType, initialValue);
			case ExmaraldaBasicPackage.TIME_TYPE:
				return createTIME_TYPEFromString(eDataType, initialValue);
			case ExmaraldaBasicPackage.EVENT_MEDIUM:
				return createEVENT_MEDIUMFromString(eDataType, initialValue);
			case ExmaraldaBasicPackage.URL:
				return createURLFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExmaraldaBasicPackage.SPEAKER_SEX:
				return convertSPEAKER_SEXToString(eDataType, instanceValue);
			case ExmaraldaBasicPackage.TIER_TYPE:
				return convertTIER_TYPEToString(eDataType, instanceValue);
			case ExmaraldaBasicPackage.TIME_TYPE:
				return convertTIME_TYPEToString(eDataType, instanceValue);
			case ExmaraldaBasicPackage.EVENT_MEDIUM:
				return convertEVENT_MEDIUMToString(eDataType, instanceValue);
			case ExmaraldaBasicPackage.URL:
				return convertURLToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTranscription createBasicTranscription() {
		BasicTranscriptionImpl basicTranscription = new BasicTranscriptionImpl();
		return basicTranscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaInformation createMetaInformation() {
		MetaInformationImpl metaInformation = new MetaInformationImpl();
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommonTimeLine createCommonTimeLine() {
		CommonTimeLineImpl commonTimeLine = new CommonTimeLineImpl();
		return commonTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UDInformation createUDInformation() {
		UDInformationImpl udInformation = new UDInformationImpl();
		return udInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker createSpeaker() {
		SpeakerImpl speaker = new SpeakerImpl();
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tier createTier() {
		TierImpl tier = new TierImpl();
		return tier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLI createTLI() {
		TLIImpl tli = new TLIImpl();
		return tli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPEAKER_SEX createSPEAKER_SEXFromString(EDataType eDataType, String initialValue) {
		SPEAKER_SEX result = SPEAKER_SEX.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSPEAKER_SEXToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIER_TYPE createTIER_TYPEFromString(EDataType eDataType, String initialValue) {
		TIER_TYPE result = TIER_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTIER_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIME_TYPE createTIME_TYPEFromString(EDataType eDataType, String initialValue) {
		TIME_TYPE result = TIME_TYPE.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTIME_TYPEToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVENT_MEDIUM createEVENT_MEDIUMFromString(EDataType eDataType, String initialValue) {
		EVENT_MEDIUM result = EVENT_MEDIUM.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEVENT_MEDIUMToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL createURLFromString(EDataType eDataType, String initialValue) {
		return (URL)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURLToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExmaraldaBasicPackage getExmaraldaBasicPackage() {
		return (ExmaraldaBasicPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExmaraldaBasicPackage getPackage() {
		return ExmaraldaBasicPackage.eINSTANCE;
	}

} //ExmaraldaBasicFactoryImpl
