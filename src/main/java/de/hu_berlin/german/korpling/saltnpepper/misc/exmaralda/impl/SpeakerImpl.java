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

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.SPEAKER_SEX;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Speaker</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getAbbreviation <em>Abbreviation</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getSex <em>Sex</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getUdSpeakerInformations <em>Ud Speaker Informations</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getLanguageUsed <em>Language Used</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getL1 <em>L1</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.SpeakerImpl#getL2 <em>L2</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpeakerImpl extends EObjectImpl implements Speaker {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBREVIATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbreviation() <em>Abbreviation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbreviation()
	 * @generated
	 * @ordered
	 */
	protected String abbreviation = ABBREVIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected static final SPEAKER_SEX SEX_EDEFAULT = SPEAKER_SEX.M;

	/**
	 * The cached value of the '{@link #getSex() <em>Sex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSex()
	 * @generated
	 * @ordered
	 */
	protected SPEAKER_SEX sex = SEX_EDEFAULT;

	/**
	 * This is true if the Sex attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sexESet;

	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected String comment = COMMENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUdSpeakerInformations() <em>Ud Speaker Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdSpeakerInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<UDInformation> udSpeakerInformations;

	/**
	 * The cached value of the '{@link #getLanguageUsed() <em>Language Used</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageUsed()
	 * @generated
	 * @ordered
	 */
	protected EList<String> languageUsed;

	/**
	 * The cached value of the '{@link #getL1() <em>L1</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL1()
	 * @generated
	 * @ordered
	 */
	protected EList<String> l1;

	/**
	 * The cached value of the '{@link #getL2() <em>L2</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getL2()
	 * @generated
	 * @ordered
	 */
	protected EList<String> l2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpeakerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExmaraldaBasicPackage.Literals.SPEAKER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.SPEAKER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbreviation() {
		return abbreviation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbreviation(String newAbbreviation) {
		String oldAbbreviation = abbreviation;
		abbreviation = newAbbreviation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.SPEAKER__ABBREVIATION, oldAbbreviation, abbreviation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPEAKER_SEX getSex() {
		return sex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSex(SPEAKER_SEX newSex) {
		SPEAKER_SEX oldSex = sex;
		sex = newSex == null ? SEX_EDEFAULT : newSex;
		boolean oldSexESet = sexESet;
		sexESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.SPEAKER__SEX, oldSex, sex, !oldSexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSex() {
		SPEAKER_SEX oldSex = sex;
		boolean oldSexESet = sexESet;
		sex = SEX_EDEFAULT;
		sexESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExmaraldaBasicPackage.SPEAKER__SEX, oldSex, SEX_EDEFAULT, oldSexESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSex() {
		return sexESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComment(String newComment) {
		String oldComment = comment;
		comment = newComment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.SPEAKER__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UDInformation> getUdSpeakerInformations() {
		if (udSpeakerInformations == null) {
			udSpeakerInformations = new EObjectContainmentEList<UDInformation>(UDInformation.class, this, ExmaraldaBasicPackage.SPEAKER__UD_SPEAKER_INFORMATIONS);
		}
		return udSpeakerInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getLanguageUsed() {
		if (languageUsed == null) {
			languageUsed = new EDataTypeUniqueEList<String>(String.class, this, ExmaraldaBasicPackage.SPEAKER__LANGUAGE_USED);
		}
		return languageUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getL1() {
		if (l1 == null) {
			l1 = new EDataTypeUniqueEList<String>(String.class, this, ExmaraldaBasicPackage.SPEAKER__L1);
		}
		return l1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getL2() {
		if (l2 == null) {
			l2 = new EDataTypeUniqueEList<String>(String.class, this, ExmaraldaBasicPackage.SPEAKER__L2);
		}
		return l2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.SPEAKER__UD_SPEAKER_INFORMATIONS:
				return ((InternalEList<?>)getUdSpeakerInformations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExmaraldaBasicPackage.SPEAKER__ID:
				return getId();
			case ExmaraldaBasicPackage.SPEAKER__ABBREVIATION:
				return getAbbreviation();
			case ExmaraldaBasicPackage.SPEAKER__SEX:
				return getSex();
			case ExmaraldaBasicPackage.SPEAKER__COMMENT:
				return getComment();
			case ExmaraldaBasicPackage.SPEAKER__UD_SPEAKER_INFORMATIONS:
				return getUdSpeakerInformations();
			case ExmaraldaBasicPackage.SPEAKER__LANGUAGE_USED:
				return getLanguageUsed();
			case ExmaraldaBasicPackage.SPEAKER__L1:
				return getL1();
			case ExmaraldaBasicPackage.SPEAKER__L2:
				return getL2();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExmaraldaBasicPackage.SPEAKER__ID:
				setId((String)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__ABBREVIATION:
				setAbbreviation((String)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__SEX:
				setSex((SPEAKER_SEX)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__COMMENT:
				setComment((String)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__UD_SPEAKER_INFORMATIONS:
				getUdSpeakerInformations().clear();
				getUdSpeakerInformations().addAll((Collection<? extends UDInformation>)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__LANGUAGE_USED:
				getLanguageUsed().clear();
				getLanguageUsed().addAll((Collection<? extends String>)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__L1:
				getL1().clear();
				getL1().addAll((Collection<? extends String>)newValue);
				return;
			case ExmaraldaBasicPackage.SPEAKER__L2:
				getL2().clear();
				getL2().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExmaraldaBasicPackage.SPEAKER__ID:
				setId(ID_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.SPEAKER__ABBREVIATION:
				setAbbreviation(ABBREVIATION_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.SPEAKER__SEX:
				unsetSex();
				return;
			case ExmaraldaBasicPackage.SPEAKER__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.SPEAKER__UD_SPEAKER_INFORMATIONS:
				getUdSpeakerInformations().clear();
				return;
			case ExmaraldaBasicPackage.SPEAKER__LANGUAGE_USED:
				getLanguageUsed().clear();
				return;
			case ExmaraldaBasicPackage.SPEAKER__L1:
				getL1().clear();
				return;
			case ExmaraldaBasicPackage.SPEAKER__L2:
				getL2().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExmaraldaBasicPackage.SPEAKER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExmaraldaBasicPackage.SPEAKER__ABBREVIATION:
				return ABBREVIATION_EDEFAULT == null ? abbreviation != null : !ABBREVIATION_EDEFAULT.equals(abbreviation);
			case ExmaraldaBasicPackage.SPEAKER__SEX:
				return isSetSex();
			case ExmaraldaBasicPackage.SPEAKER__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ExmaraldaBasicPackage.SPEAKER__UD_SPEAKER_INFORMATIONS:
				return udSpeakerInformations != null && !udSpeakerInformations.isEmpty();
			case ExmaraldaBasicPackage.SPEAKER__LANGUAGE_USED:
				return languageUsed != null && !languageUsed.isEmpty();
			case ExmaraldaBasicPackage.SPEAKER__L1:
				return l1 != null && !l1.isEmpty();
			case ExmaraldaBasicPackage.SPEAKER__L2:
				return l2 != null && !l2.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", abbreviation: ");
		result.append(abbreviation);
		result.append(", sex: ");
		if (sexESet) result.append(sex); else result.append("<unset>");
		result.append(", comment: ");
		result.append(comment);
		result.append(", languageUsed: ");
		result.append(languageUsed);
		result.append(", l1: ");
		result.append(l1);
		result.append(", l2: ");
		result.append(l2);
		result.append(')');
		return result.toString();
	}

} //SpeakerImpl
