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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basic Transcription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getCommonTimeLine <em>Common Time Line</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getMetaInformation <em>Meta Information</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getSpeakertable <em>Speakertable</em>}</li>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getTiers <em>Tiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getBasicTranscription()
 * @model
 * @generated
 */
public interface BasicTranscription extends EObject {
	/**
	 * Returns the value of the '<em><b>Common Time Line</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Common Time Line</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Common Time Line</em>' containment reference.
	 * @see #setCommonTimeLine(CommonTimeLine)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getBasicTranscription_CommonTimeLine()
	 * @model containment="true"
	 * @generated
	 */
	CommonTimeLine getCommonTimeLine();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getCommonTimeLine <em>Common Time Line</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Common Time Line</em>' containment reference.
	 * @see #getCommonTimeLine()
	 * @generated
	 */
	void setCommonTimeLine(CommonTimeLine value);

	/**
	 * Returns the value of the '<em><b>Meta Information</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Meta Information</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Meta Information</em>' containment reference.
	 * @see #setMetaInformation(MetaInformation)
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getBasicTranscription_MetaInformation()
	 * @model containment="true"
	 * @generated
	 */
	MetaInformation getMetaInformation();

	/**
	 * Sets the value of the '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getMetaInformation <em>Meta Information</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meta Information</em>' containment reference.
	 * @see #getMetaInformation()
	 * @generated
	 */
	void setMetaInformation(MetaInformation value);

	/**
	 * Returns the value of the '<em><b>Speakertable</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speakertable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakertable</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getBasicTranscription_Speakertable()
	 * @model containment="true"
	 * @generated
	 */
	EList<Speaker> getSpeakertable();

	/**
	 * Returns the value of the '<em><b>Tiers</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tiers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tiers</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getBasicTranscription_Tiers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tier> getTiers();

} // BasicTranscription
