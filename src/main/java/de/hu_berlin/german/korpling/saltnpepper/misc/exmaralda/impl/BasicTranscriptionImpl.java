/**
 * Copyright 2009 Humboldt-Universität zu Berlin, INRIA.
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

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basic Transcription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl#getCommonTimeLine <em>Common Time Line</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl#getSpeakertable <em>Speakertable</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.BasicTranscriptionImpl#getTiers <em>Tiers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasicTranscriptionImpl extends EObjectImpl implements BasicTranscription {
	/**
	 * The cached value of the '{@link #getCommonTimeLine() <em>Common Time Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommonTimeLine()
	 * @generated
	 * @ordered
	 */
	protected CommonTimeLine commonTimeLine;

	/**
	 * The cached value of the '{@link #getMetaInformation() <em>Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaInformation()
	 * @generated
	 * @ordered
	 */
	protected MetaInformation metaInformation;

	/**
	 * The cached value of the '{@link #getSpeakertable() <em>Speakertable</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakertable()
	 * @generated
	 * @ordered
	 */
	protected EList<Speaker> speakertable;

	/**
	 * The cached value of the '{@link #getTiers() <em>Tiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTiers()
	 * @generated
	 * @ordered
	 */
	protected EList<Tier> tiers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicTranscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExmaraldaBasicPackage.Literals.BASIC_TRANSCRIPTION;
	}

	/**
	 * Returns the {@link CommonTimeLine} object. If no one is already set, one will be created.
	 */
	public CommonTimeLine getCommonTimeLine() {
		if (commonTimeLine== null)
			this.commonTimeLine= ExmaraldaBasicFactory.eINSTANCE.createCommonTimeLine();
		return commonTimeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommonTimeLine(CommonTimeLine newCommonTimeLine, NotificationChain msgs) {
		CommonTimeLine oldCommonTimeLine = commonTimeLine;
		commonTimeLine = newCommonTimeLine;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE, oldCommonTimeLine, newCommonTimeLine);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommonTimeLine(CommonTimeLine newCommonTimeLine) {
		if (newCommonTimeLine != commonTimeLine) {
			NotificationChain msgs = null;
			if (commonTimeLine != null)
				msgs = ((InternalEObject)commonTimeLine).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE, null, msgs);
			if (newCommonTimeLine != null)
				msgs = ((InternalEObject)newCommonTimeLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE, null, msgs);
			msgs = basicSetCommonTimeLine(newCommonTimeLine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE, newCommonTimeLine, newCommonTimeLine));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaInformation getMetaInformation() {
		return metaInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetaInformation(MetaInformation newMetaInformation, NotificationChain msgs) {
		MetaInformation oldMetaInformation = metaInformation;
		metaInformation = newMetaInformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION, oldMetaInformation, newMetaInformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaInformation(MetaInformation newMetaInformation) {
		if (newMetaInformation != metaInformation) {
			NotificationChain msgs = null;
			if (metaInformation != null)
				msgs = ((InternalEObject)metaInformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION, null, msgs);
			if (newMetaInformation != null)
				msgs = ((InternalEObject)newMetaInformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION, null, msgs);
			msgs = basicSetMetaInformation(newMetaInformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION, newMetaInformation, newMetaInformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Speaker> getSpeakertable() {
		if (speakertable == null) {
			speakertable = new EObjectContainmentEList<Speaker>(Speaker.class, this, ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__SPEAKERTABLE);
		}
		return speakertable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tier> getTiers() {
		if (tiers == null) {
			tiers = new EObjectContainmentEList<Tier>(Tier.class, this, ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__TIERS);
		}
		return tiers;
	}
	/**
	 * Contains all {@link TLI} objects having corresponding {@link Event} objects.
	 */
	private Map<TLI, EList<Event>> tli2Events= null;
	
	/**
	 * {@inheritDoc BasicTranscription#getEventsByTLI(TLI)}
	 */
	public EList<Event> getEventsByTLI(TLI tli) 
	{
		EList<Event> retVal= null;
		if (tli2Events!= null)
		{
			retVal= tli2Events.get(tli);
		}
		return(retVal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE:
				return basicSetCommonTimeLine(null, msgs);
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION:
				return basicSetMetaInformation(null, msgs);
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__SPEAKERTABLE:
				return ((InternalEList<?>)getSpeakertable()).basicRemove(otherEnd, msgs);
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__TIERS:
				return ((InternalEList<?>)getTiers()).basicRemove(otherEnd, msgs);
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
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE:
				return getCommonTimeLine();
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION:
				return getMetaInformation();
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__SPEAKERTABLE:
				return getSpeakertable();
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__TIERS:
				return getTiers();
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
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE:
				setCommonTimeLine((CommonTimeLine)newValue);
				return;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION:
				setMetaInformation((MetaInformation)newValue);
				return;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__SPEAKERTABLE:
				getSpeakertable().clear();
				getSpeakertable().addAll((Collection<? extends Speaker>)newValue);
				return;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__TIERS:
				getTiers().clear();
				getTiers().addAll((Collection<? extends Tier>)newValue);
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
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE:
				setCommonTimeLine((CommonTimeLine)null);
				return;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION:
				setMetaInformation((MetaInformation)null);
				return;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__SPEAKERTABLE:
				getSpeakertable().clear();
				return;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__TIERS:
				getTiers().clear();
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
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__COMMON_TIME_LINE:
				return commonTimeLine != null;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__META_INFORMATION:
				return metaInformation != null;
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__SPEAKERTABLE:
				return speakertable != null && !speakertable.isEmpty();
			case ExmaraldaBasicPackage.BASIC_TRANSCRIPTION__TIERS:
				return tiers != null && !tiers.isEmpty();
		}
		return super.eIsSet(featureID);
	}
    
} //BasicTranscriptionImpl
