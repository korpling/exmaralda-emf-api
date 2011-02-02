/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.util;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicPackage
 * @generated
 */
public class ExmaraldaBasicAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExmaraldaBasicPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExmaraldaBasicAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ExmaraldaBasicPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExmaraldaBasicSwitch<Adapter> modelSwitch =
		new ExmaraldaBasicSwitch<Adapter>() {
			@Override
			public Adapter caseBasicTranscription(BasicTranscription object) {
				return createBasicTranscriptionAdapter();
			}
			@Override
			public Adapter caseMetaInformation(MetaInformation object) {
				return createMetaInformationAdapter();
			}
			@Override
			public Adapter caseCommonTimeLine(CommonTimeLine object) {
				return createCommonTimeLineAdapter();
			}
			@Override
			public Adapter caseUDInformation(UDInformation object) {
				return createUDInformationAdapter();
			}
			@Override
			public Adapter caseSpeaker(Speaker object) {
				return createSpeakerAdapter();
			}
			@Override
			public Adapter caseTier(Tier object) {
				return createTierAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseTLI(TLI object) {
				return createTLIAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription <em>Basic Transcription</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription
	 * @generated
	 */
	public Adapter createBasicTranscriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation <em>Meta Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.MetaInformation
	 * @generated
	 */
	public Adapter createMetaInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine <em>Common Time Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.CommonTimeLine
	 * @generated
	 */
	public Adapter createCommonTimeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation <em>UD Information</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.UDInformation
	 * @generated
	 */
	public Adapter createUDInformationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Speaker
	 * @generated
	 */
	public Adapter createSpeakerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier <em>Tier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier
	 * @generated
	 */
	public Adapter createTierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI <em>TLI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI
	 * @generated
	 */
	public Adapter createTLIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ExmaraldaBasicAdapterFactory
