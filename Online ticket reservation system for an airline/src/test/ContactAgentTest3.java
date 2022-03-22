package test;

import static org.junit.jupiter.api.Assertions.*;

import org.AvailableLocation;
import org.ContactAgent;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContactAgentTest3 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAgent() {
		String name="Gihan";
		String age="35 ";

		
		ContactAgent agent =new ContactAgent();
		
		int actucal=agent.ContactAgent("Gihan", "35 ");
		int expected=0;
		
		assertEquals(expected,actucal);
	}

}
