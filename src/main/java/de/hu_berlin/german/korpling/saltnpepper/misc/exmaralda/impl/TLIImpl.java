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

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIME_TYPE;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TLI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl#getTime <em>Time</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl#getStartingEvents <em>Starting Events</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TLIImpl#getEndingEvents <em>Ending Events</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TLIImpl extends EObjectImpl implements TLI {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TIME_TYPE TYPE_EDEFAULT = TIME_TYPE.UNSP;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TIME_TYPE type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

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
	 * The cached value of the '{@link #getStartingEvents() <em>Starting Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartingEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> startingEvents;

	/**
	 * The cached value of the '{@link #getEndingEvents() <em>Ending Events</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndingEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> endingEvents;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExmaraldaBasicPackage.Literals.TLI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TLI__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIME_TYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TIME_TYPE newType) {
		TIME_TYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TLI__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TIME_TYPE oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExmaraldaBasicPackage.TLI__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TLI__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getStartingEvents() {
		if (startingEvents == null) {
			startingEvents = new EObjectWithInverseResolvingEList<Event>(Event.class, this, ExmaraldaBasicPackage.TLI__STARTING_EVENTS, ExmaraldaBasicPackage.EVENT__START);
		}
		return startingEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEndingEvents() {
		if (endingEvents == null) {
			endingEvents = new EObjectWithInverseResolvingEList<Event>(Event.class, this, ExmaraldaBasicPackage.TLI__ENDING_EVENTS, ExmaraldaBasicPackage.EVENT__END);
		}
		return endingEvents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.TLI__STARTING_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStartingEvents()).basicAdd(otherEnd, msgs);
			case ExmaraldaBasicPackage.TLI__ENDING_EVENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndingEvents()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.TLI__STARTING_EVENTS:
				return ((InternalEList<?>)getStartingEvents()).basicRemove(otherEnd, msgs);
			case ExmaraldaBasicPackage.TLI__ENDING_EVENTS:
				return ((InternalEList<?>)getEndingEvents()).basicRemove(otherEnd, msgs);
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
			case ExmaraldaBasicPackage.TLI__TIME:
				return getTime();
			case ExmaraldaBasicPackage.TLI__TYPE:
				return getType();
			case ExmaraldaBasicPackage.TLI__ID:
				return getId();
			case ExmaraldaBasicPackage.TLI__STARTING_EVENTS:
				return getStartingEvents();
			case ExmaraldaBasicPackage.TLI__ENDING_EVENTS:
				return getEndingEvents();
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
			case ExmaraldaBasicPackage.TLI__TIME:
				setTime((String)newValue);
				return;
			case ExmaraldaBasicPackage.TLI__TYPE:
				setType((TIME_TYPE)newValue);
				return;
			case ExmaraldaBasicPackage.TLI__ID:
				setId((String)newValue);
				return;
			case ExmaraldaBasicPackage.TLI__STARTING_EVENTS:
				getStartingEvents().clear();
				getStartingEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ExmaraldaBasicPackage.TLI__ENDING_EVENTS:
				getEndingEvents().clear();
				getEndingEvents().addAll((Collection<? extends Event>)newValue);
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
			case ExmaraldaBasicPackage.TLI__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.TLI__TYPE:
				unsetType();
				return;
			case ExmaraldaBasicPackage.TLI__ID:
				setId(ID_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.TLI__STARTING_EVENTS:
				getStartingEvents().clear();
				return;
			case ExmaraldaBasicPackage.TLI__ENDING_EVENTS:
				getEndingEvents().clear();
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
			case ExmaraldaBasicPackage.TLI__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case ExmaraldaBasicPackage.TLI__TYPE:
				return isSetType();
			case ExmaraldaBasicPackage.TLI__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExmaraldaBasicPackage.TLI__STARTING_EVENTS:
				return startingEvents != null && !startingEvents.isEmpty();
			case ExmaraldaBasicPackage.TLI__ENDING_EVENTS:
				return endingEvents != null && !endingEvents.isEmpty();
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
		result.append(" (time: ");
		result.append(time);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TLIImpl
