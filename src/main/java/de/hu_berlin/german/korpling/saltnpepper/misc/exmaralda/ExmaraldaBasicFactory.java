/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage
 * @generated
 */
public interface ExmaraldaBasicFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExmaraldaBasicFactory eINSTANCE = de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.impl.ExmaraldaBasicFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Basic Transcription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basic Transcription</em>'.
	 * @generated
	 */
	BasicTranscription createBasicTranscription();

	/**
	 * Returns a new object of class '<em>Meta Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Meta Information</em>'.
	 * @generated
	 */
	MetaInformation createMetaInformation();

	/**
	 * Returns a new object of class '<em>Common Time Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Common Time Line</em>'.
	 * @generated
	 */
	CommonTimeLine createCommonTimeLine();

	/**
	 * Returns a new object of class '<em>UD Information</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>UD Information</em>'.
	 * @generated
	 */
	UDInformation createUDInformation();

	/**
	 * Returns a new object of class '<em>Speaker</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Speaker</em>'.
	 * @generated
	 */
	Speaker createSpeaker();

	/**
	 * Returns a new object of class '<em>Tier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tier</em>'.
	 * @generated
	 */
	Tier createTier();

	/**
	 * Returns a new object of class '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event</em>'.
	 * @generated
	 */
	Event createEvent();

	/**
	 * Returns a new object of class '<em>TLI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>TLI</em>'.
	 * @generated
	 */
	TLI createTLI();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ExmaraldaBasicPackage getExmaraldaBasicPackage();

} //ExmaraldaBasicFactory
