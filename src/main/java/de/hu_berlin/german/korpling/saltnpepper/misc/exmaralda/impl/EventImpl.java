/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.EVENT_MEDIUM;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;
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
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl#getUdInformations <em>Ud Informations</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl#getStart <em>Start</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl#getEnd <em>End</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl#getMedium <em>Medium</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.EventImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventImpl extends EObjectImpl implements Event {
	/**
	 * The cached value of the '{@link #getUdInformations() <em>Ud Informations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUdInformations()
	 * @generated
	 * @ordered
	 */
	protected EList<UDInformation> udInformations;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected TLI start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected TLI end;

	/**
	 * The default value of the '{@link #getMedium() <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @ordered
	 */
	protected static final EVENT_MEDIUM MEDIUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedium() <em>Medium</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedium()
	 * @generated
	 * @ordered
	 */
	protected EVENT_MEDIUM medium = MEDIUM_EDEFAULT;

	/**
	 * This is true if the Medium attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mediumESet;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final URL URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected URL url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExmaraldaBasicPackage.Literals.EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UDInformation> getUdInformations() {
		if (udInformations == null) {
			udInformations = new EObjectContainmentEList<UDInformation>(UDInformation.class, this, ExmaraldaBasicPackage.EVENT__UD_INFORMATIONS);
		}
		return udInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLI getStart() {
		if (start != null && start.eIsProxy()) {
			InternalEObject oldStart = (InternalEObject)start;
			start = (TLI)eResolveProxy(oldStart);
			if (start != oldStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExmaraldaBasicPackage.EVENT__START, oldStart, start));
			}
		}
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLI basicGetStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(TLI newStart) {
		TLI oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.EVENT__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLI getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (TLI)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExmaraldaBasicPackage.EVENT__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLI basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(TLI newEnd) {
		TLI oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.EVENT__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVENT_MEDIUM getMedium() {
		return medium;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedium(EVENT_MEDIUM newMedium) {
		EVENT_MEDIUM oldMedium = medium;
		medium = newMedium == null ? MEDIUM_EDEFAULT : newMedium;
		boolean oldMediumESet = mediumESet;
		mediumESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.EVENT__MEDIUM, oldMedium, medium, !oldMediumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMedium() {
		EVENT_MEDIUM oldMedium = medium;
		boolean oldMediumESet = mediumESet;
		medium = MEDIUM_EDEFAULT;
		mediumESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ExmaraldaBasicPackage.EVENT__MEDIUM, oldMedium, MEDIUM_EDEFAULT, oldMediumESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMedium() {
		return mediumESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public URL getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(URL newUrl) {
		URL oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.EVENT__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExmaraldaBasicPackage.EVENT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExmaraldaBasicPackage.EVENT__UD_INFORMATIONS:
				return ((InternalEList<?>)getUdInformations()).basicRemove(otherEnd, msgs);
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
			case ExmaraldaBasicPackage.EVENT__UD_INFORMATIONS:
				return getUdInformations();
			case ExmaraldaBasicPackage.EVENT__START:
				if (resolve) return getStart();
				return basicGetStart();
			case ExmaraldaBasicPackage.EVENT__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case ExmaraldaBasicPackage.EVENT__MEDIUM:
				return getMedium();
			case ExmaraldaBasicPackage.EVENT__URL:
				return getUrl();
			case ExmaraldaBasicPackage.EVENT__VALUE:
				return getValue();
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
			case ExmaraldaBasicPackage.EVENT__UD_INFORMATIONS:
				getUdInformations().clear();
				getUdInformations().addAll((Collection<? extends UDInformation>)newValue);
				return;
			case ExmaraldaBasicPackage.EVENT__START:
				setStart((TLI)newValue);
				return;
			case ExmaraldaBasicPackage.EVENT__END:
				setEnd((TLI)newValue);
				return;
			case ExmaraldaBasicPackage.EVENT__MEDIUM:
				setMedium((EVENT_MEDIUM)newValue);
				return;
			case ExmaraldaBasicPackage.EVENT__URL:
				setUrl((URL)newValue);
				return;
			case ExmaraldaBasicPackage.EVENT__VALUE:
				setValue((String)newValue);
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
			case ExmaraldaBasicPackage.EVENT__UD_INFORMATIONS:
				getUdInformations().clear();
				return;
			case ExmaraldaBasicPackage.EVENT__START:
				setStart((TLI)null);
				return;
			case ExmaraldaBasicPackage.EVENT__END:
				setEnd((TLI)null);
				return;
			case ExmaraldaBasicPackage.EVENT__MEDIUM:
				unsetMedium();
				return;
			case ExmaraldaBasicPackage.EVENT__URL:
				setUrl(URL_EDEFAULT);
				return;
			case ExmaraldaBasicPackage.EVENT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case ExmaraldaBasicPackage.EVENT__UD_INFORMATIONS:
				return udInformations != null && !udInformations.isEmpty();
			case ExmaraldaBasicPackage.EVENT__START:
				return start != null;
			case ExmaraldaBasicPackage.EVENT__END:
				return end != null;
			case ExmaraldaBasicPackage.EVENT__MEDIUM:
				return isSetMedium();
			case ExmaraldaBasicPackage.EVENT__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case ExmaraldaBasicPackage.EVENT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (medium: ");
		if (mediumESet) result.append(medium); else result.append("<unset>");
		result.append(", url: ");
		result.append(url);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EventImpl
