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

import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Event;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.ExmaraldaBasicFactory;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.TLI;
import de.hu_berlin.german.korpling.saltnpepper.misc.exmaralda.Tier;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TLI</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TLITest extends TestCase {

	/**
	 * The fixture for this TLI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLI fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TLITest.class);
	}

	/**
	 * Constructs a new TLI test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLITest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this TLI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TLI fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this TLI test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TLI getFixture() {
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
		setFixture(ExmaraldaBasicFactory.eINSTANCE.createTLI());
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
	 * Checks if the reverse connection to a {@link Event} object is working correctly. Checks the methods 
	 * {@link TLI#getStartingEvents()} and {@link TLI#getEndingEvents()}.
	 */
	public void testReverseConnectionToEvent()
	{
		Event event1= ExmaraldaBasicFactory.eINSTANCE.createEvent();
		event1.setStart(getFixture());
		assertNotNull(this.getFixture().getStartingEvents());
		assertEquals(1, this.getFixture().getStartingEvents().size());
		assertTrue(this.getFixture().getStartingEvents().contains(event1));
		
		event1.setEnd(getFixture());
		assertNotNull(this.getFixture().getEndingEvents());
		assertEquals(1, this.getFixture().getEndingEvents().size());
		assertTrue(this.getFixture().getEndingEvents().contains(event1));
	}
} //TLITest
