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
package de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.tests;

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Basic Transcription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getEventsByTLI(de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI) <em>Get Events By TLI</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BasicTranscriptionTest extends TestCase {

	/**
	 * The fixture for this Basic Transcription test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicTranscription fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BasicTranscriptionTest.class);
	}

	/**
	 * Constructs a new Basic Transcription test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicTranscriptionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Basic Transcription test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(BasicTranscription fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Basic Transcription test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasicTranscription getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ExmaraldaBasicFactory.eINSTANCE.createBasicTranscription());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Checks if all inserted {@link TLI} and {@link Event} objects are connected, and returned correctly.
	 * @see de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.BasicTranscription#getEventsByTLI(de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI)
	 */
	public void testGetEventsByTLI__TLI() 
	{
		TLI tli1= ExmaraldaBasicFactory.eINSTANCE.createTLI();
		this.getFixture().getCommonTimeLine().getTLIs().add(tli1);
		TLI tli2= ExmaraldaBasicFactory.eINSTANCE.createTLI();
		this.getFixture().getCommonTimeLine().getTLIs().add(tli2);
		TLI tli3= ExmaraldaBasicFactory.eINSTANCE.createTLI();
		this.getFixture().getCommonTimeLine().getTLIs().add(tli3);
		TLI tli4= ExmaraldaBasicFactory.eINSTANCE.createTLI();
		this.getFixture().getCommonTimeLine().getTLIs().add(tli4);
		
		Tier tier= ExmaraldaBasicFactory.eINSTANCE.createTier();
		this.getFixture().getTiers().add(tier);
		
		Event event1= ExmaraldaBasicFactory.eINSTANCE.createEvent();
		event1.setStart(tli1);
		event1.setEnd(tli2);
		tier.getEvents().add(event1);
		
		assertNotNull(this.getFixture().getEventsByTLI(tli1));
		assertEquals(1, this.getFixture().getEventsByTLI(tli1).size());
		assertTrue(this.getFixture().getEventsByTLI(tli1).contains(event1));
		
		assertNotNull(this.getFixture().getEventsByTLI(tli2));
		assertEquals(1, this.getFixture().getEventsByTLI(tli2).size());
		assertTrue(this.getFixture().getEventsByTLI(tli2).contains(event1));
		
		Event event2= ExmaraldaBasicFactory.eINSTANCE.createEvent();
	}
} //BasicTranscriptionTest
