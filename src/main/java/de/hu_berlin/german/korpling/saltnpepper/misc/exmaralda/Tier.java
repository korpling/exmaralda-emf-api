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
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getCategory <em>Category</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getType <em>Type</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getEvents <em>Events</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getId <em>Id</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getSpeaker <em>Speaker</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getUdTierInformations <em>Ud Tier Informations</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier()
 * @model
 * @generated
 */
public interface Tier extends EObject {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(TIER_TYPE)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_Type()
	 * @model unsettable="true"
	 * @generated
	 */
	TIER_TYPE getType();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TIER_TYPE
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(TIER_TYPE value);

	/**
	 * Unsets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(TIER_TYPE)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(TIER_TYPE)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event}.
	 * It is bidirectional and its opposite is '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getTier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_Events()
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event#getTier
	 * @model opposite="tier" containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Speaker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speaker</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speaker</em>' reference.
	 * @see #setSpeaker(Speaker)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_Speaker()
	 * @model
	 * @generated
	 */
	Speaker getSpeaker();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier#getSpeaker <em>Speaker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speaker</em>' reference.
	 * @see #getSpeaker()
	 * @generated
	 */
	void setSpeaker(Speaker value);

	/**
	 * Returns the value of the '<em><b>Ud Tier Informations</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ud Tier Informations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ud Tier Informations</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getTier_UdTierInformations()
	 * @model containment="true"
	 * @generated
	 */
	EList<UDInformation> getUdTierInformations();

} // Tier
