/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Time Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine#getTLIs <em>TL Is</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getCommonTimeLine()
 * @model
 * @generated
 */
public interface CommonTimeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>TL Is</b></em>' containment reference list.
	 * The list contents are of type {@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TL Is</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TL Is</em>' containment reference list.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage#getCommonTimeLine_TLIs()
	 * @model containment="true"
	 * @generated
	 */
	EList<TLI> getTLIs();

} // CommonTimeLine
