/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl;

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

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getType <em>Type</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getEvents <em>Events</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.TierImpl#getUdTierInformations <em>Ud Tier Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TierImpl extends EObjectImpl implements Tier {
	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final TIER_TYPE TYPE_EDEFAULT = TIER_TYPE.T;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TIER_TYPE type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

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
	 * The cached value of the '{@link #getSpeaker() <em>Speaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeaker()
	 * @generated
	 * @ordered
	 */
	protected Speaker speaker;

	/**
	 * The cached value of the '{@link #getUdTierInformations() <em>Ud Tier Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdTierInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<UDInformation> udTierInformations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExmaraldaBasicPackage.Literals.TIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TIER__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TIER__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TIER_TYPE getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(TIER_TYPE newType) {
		TIER_TYPE oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TIER__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		TIER_TYPE oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExmaraldaBasicPackage.TIER__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
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
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, ExmaraldaBasicPackage.TIER__EVENTS);
		}
		return events;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TIER__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker getSpeaker() {
		if (speaker != null && speaker.eIsProxy()) {
			InternalEObject oldSpeaker = (InternalEObject)speaker;
			speaker = (Speaker)eResolveProxy(oldSpeaker);
			if (speaker != oldSpeaker) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExmaraldaBasicPackage.TIER__SPEAKER, oldSpeaker, speaker));
			}
		}
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Speaker basicGetSpeaker() {
		return speaker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeaker(Speaker newSpeaker) {
		Speaker oldSpeaker = speaker;
		speaker = newSpeaker;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.TIER__SPEAKER, oldSpeaker, speaker));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UDInformation> getUdTierInformations() {
		if (udTierInformations == null) {
			udTierInformations = new EObjectContainmentEList<UDInformation>(UDInformation.class, this, ExmaraldaBasicPackage.TIER__UD_TIER_INFORMATIONS);
		}
		return udTierInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.TIER__EVENTS:
				return ((InternalEList<?>)getEvents()).basicRemove(otherEnd, msgs);
			case ExmaraldaBasicPackage.TIER__UD_TIER_INFORMATIONS:
				return ((InternalEList<?>)getUdTierInformations()).basicRemove(otherEnd, msgs);
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
			case ExmaraldaBasicPackage.TIER__CATEGORY:
				return getCategory();
			case ExmaraldaBasicPackage.TIER__DISPLAY_NAME:
				return getDisplayName();
			case ExmaraldaBasicPackage.TIER__TYPE:
				return getType();
			case ExmaraldaBasicPackage.TIER__EVENTS:
				return getEvents();
			case ExmaraldaBasicPackage.TIER__ID:
				return getId();
			case ExmaraldaBasicPackage.TIER__SPEAKER:
				if (resolve) return getSpeaker();
				return basicGetSpeaker();
			case ExmaraldaBasicPackage.TIER__UD_TIER_INFORMATIONS:
				return getUdTierInformations();
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
			case ExmaraldaBasicPackage.TIER__CATEGORY:
				setCategory((String)newValue);
				return;
			case ExmaraldaBasicPackage.TIER__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case ExmaraldaBasicPackage.TIER__TYPE:
				setType((TIER_TYPE)newValue);
				return;
			case ExmaraldaBasicPackage.TIER__EVENTS:
				getEvents().clear();
				getEvents().addAll((Collection<? extends Event>)newValue);
				return;
			case ExmaraldaBasicPackage.TIER__ID:
				setId((String)newValue);
				return;
			case ExmaraldaBasicPackage.TIER__SPEAKER:
				setSpeaker((Speaker)newValue);
				return;
			case ExmaraldaBasicPackage.TIER__UD_TIER_INFORMATIONS:
				getUdTierInformations().clear();
				getUdTierInformations().addAll((Collection<? extends UDInformation>)newValue);
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
			case ExmaraldaBasicPackage.TIER__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.TIER__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.TIER__TYPE:
				unsetType();
				return;
			case ExmaraldaBasicPackage.TIER__EVENTS:
				getEvents().clear();
				return;
			case ExmaraldaBasicPackage.TIER__ID:
				setId(ID_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.TIER__SPEAKER:
				setSpeaker((Speaker)null);
				return;
			case ExmaraldaBasicPackage.TIER__UD_TIER_INFORMATIONS:
				getUdTierInformations().clear();
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
			case ExmaraldaBasicPackage.TIER__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case ExmaraldaBasicPackage.TIER__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case ExmaraldaBasicPackage.TIER__TYPE:
				return isSetType();
			case ExmaraldaBasicPackage.TIER__EVENTS:
				return events != null && !events.isEmpty();
			case ExmaraldaBasicPackage.TIER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ExmaraldaBasicPackage.TIER__SPEAKER:
				return speaker != null;
			case ExmaraldaBasicPackage.TIER__UD_TIER_INFORMATIONS:
				return udTierInformations != null && !udTierInformations.isEmpty();
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
		result.append(" (category: ");
		result.append(category);
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //TierImpl
