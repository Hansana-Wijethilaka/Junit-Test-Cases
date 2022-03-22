package test;

import static org.junit.jupiter.api.Assertions.*;

import org.AvailableLocation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvailableLocationTest4 {

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
	void testAvailableLocation() {
		String departure="Durban";
		String destination="New York ";

		
		AvailableLocation location =new AvailableLocation();
		
		int actucal=location.AvailableLocation("Durban", "Newyork ");
		int expected=0;
		
		assertEquals(expected,actucal);
	}

}
