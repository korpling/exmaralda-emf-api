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
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation;

import java.net.URL;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Meta Information</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl#getProjectName <em>Project Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl#getTranscriptionName <em>Transcription Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl#getReferencedFile <em>Referenced File</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl#getUdMetaInformations <em>Ud Meta Informations</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.MetaInformationImpl#getTranscriptionConvention <em>Transcription Convention</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MetaInformationImpl extends EObjectImpl implements MetaInformation {
	/**
	 * The default value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProjectName() <em>Project Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProjectName()
	 * @generated
	 * @ordered
	 */
	protected String projectName = PROJECT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranscriptionName() <em>Transcription Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscriptionName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSCRIPTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranscriptionName() <em>Transcription Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscriptionName()
	 * @generated
	 * @ordered
	 */
	protected String transcriptionName = TRANSCRIPTION_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencedFile() <em>Referenced File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFile()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedFile() <em>Referenced File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedFile()
	 * @generated
	 * @ordered
	 */
	protected String referencedFile = REFERENCED_FILE_EDEFAULT;

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
	 * The cached value of the '{@link #getUdMetaInformations() <em>Ud Meta Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdMetaInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<UDInformation> udMetaInformations;

	/**
	 * The default value of the '{@link #getTranscriptionConvention() <em>Transcription Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscriptionConvention()
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSCRIPTION_CONVENTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTranscriptionConvention() <em>Transcription Convention</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranscriptionConvention()
	 * @generated
	 * @ordered
	 */
	protected String transcriptionConvention = TRANSCRIPTION_CONVENTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetaInformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExmaraldaBasicPackage.Literals.META_INFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProjectName(String newProjectName) {
		String oldProjectName = projectName;
		projectName = newProjectName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.META_INFORMATION__PROJECT_NAME, oldProjectName, projectName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranscriptionName() {
		return transcriptionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranscriptionName(String newTranscriptionName) {
		String oldTranscriptionName = transcriptionName;
		transcriptionName = newTranscriptionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_NAME, oldTranscriptionName, transcriptionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedFile() {
		return referencedFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedFile(String newReferencedFile) {
		String oldReferencedFile = referencedFile;
		referencedFile = newReferencedFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.META_INFORMATION__REFERENCED_FILE, oldReferencedFile, referencedFile));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.META_INFORMATION__COMMENT, oldComment, comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UDInformation> getUdMetaInformations() {
		if (udMetaInformations == null) {
			udMetaInformations = new EObjectContainmentEList<UDInformation>(UDInformation.class, this, ExmaraldaBasicPackage.META_INFORMATION__UD_META_INFORMATIONS);
		}
		return udMetaInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTranscriptionConvention() {
		return transcriptionConvention;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranscriptionConvention(String newTranscriptionConvention) {
		String oldTranscriptionConvention = transcriptionConvention;
		transcriptionConvention = newTranscriptionConvention;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_CONVENTION, oldTranscriptionConvention, transcriptionConvention));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.META_INFORMATION__UD_META_INFORMATIONS:
				return ((InternalEList<?>)getUdMetaInformations()).basicRemove(otherEnd, msgs);
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
			case ExmaraldaBasicPackage.META_INFORMATION__PROJECT_NAME:
				return getProjectName();
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_NAME:
				return getTranscriptionName();
			case ExmaraldaBasicPackage.META_INFORMATION__REFERENCED_FILE:
				return getReferencedFile();
			case ExmaraldaBasicPackage.META_INFORMATION__COMMENT:
				return getComment();
			case ExmaraldaBasicPackage.META_INFORMATION__UD_META_INFORMATIONS:
				return getUdMetaInformations();
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_CONVENTION:
				return getTranscriptionConvention();
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
			case ExmaraldaBasicPackage.META_INFORMATION__PROJECT_NAME:
				setProjectName((String)newValue);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_NAME:
				setTranscriptionName((String)newValue);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__REFERENCED_FILE:
				setReferencedFile((String)newValue);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__COMMENT:
				setComment((String)newValue);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__UD_META_INFORMATIONS:
				getUdMetaInformations().clear();
				getUdMetaInformations().addAll((Collection<? extends UDInformation>)newValue);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_CONVENTION:
				setTranscriptionConvention((String)newValue);
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
			case ExmaraldaBasicPackage.META_INFORMATION__PROJECT_NAME:
				setProjectName(PROJECT_NAME_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_NAME:
				setTranscriptionName(TRANSCRIPTION_NAME_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__REFERENCED_FILE:
				setReferencedFile(REFERENCED_FILE_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__UD_META_INFORMATIONS:
				getUdMetaInformations().clear();
				return;
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_CONVENTION:
				setTranscriptionConvention(TRANSCRIPTION_CONVENTION_EDEFAULT);
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
			case ExmaraldaBasicPackage.META_INFORMATION__PROJECT_NAME:
				return PROJECT_NAME_EDEFAULT == null ? projectName != null : !PROJECT_NAME_EDEFAULT.equals(projectName);
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_NAME:
				return TRANSCRIPTION_NAME_EDEFAULT == null ? transcriptionName != null : !TRANSCRIPTION_NAME_EDEFAULT.equals(transcriptionName);
			case ExmaraldaBasicPackage.META_INFORMATION__REFERENCED_FILE:
				return REFERENCED_FILE_EDEFAULT == null ? referencedFile != null : !REFERENCED_FILE_EDEFAULT.equals(referencedFile);
			case ExmaraldaBasicPackage.META_INFORMATION__COMMENT:
				return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
			case ExmaraldaBasicPackage.META_INFORMATION__UD_META_INFORMATIONS:
				return udMetaInformations != null && !udMetaInformations.isEmpty();
			case ExmaraldaBasicPackage.META_INFORMATION__TRANSCRIPTION_CONVENTION:
				return TRANSCRIPTION_CONVENTION_EDEFAULT == null ? transcriptionConvention != null : !TRANSCRIPTION_CONVENTION_EDEFAULT.equals(transcriptionConvention);
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
		result.append(" (projectName: ");
		result.append(projectName);
		result.append(", transcriptionName: ");
		result.append(transcriptionName);
		result.append(", referencedFile: ");
		result.append(referencedFile);
		result.append(", comment: ");
		result.append(comment);
		result.append(", transcriptionConvention: ");
		result.append(transcriptionConvention);
		result.append(')');
		return result.toString();
	}

} //MetaInformationImpl
