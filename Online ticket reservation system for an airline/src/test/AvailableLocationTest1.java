package test;

import static org.junit.jupiter.api.Assertions.*;

import org.AvailableLocation;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvailableLocationTest1 {

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
	void test() {
		
		String departure="Colombo";
		String destination="Melbourne ";

		
		AvailableLocation location =new AvailableLocation();
		
		int actucal=location.AvailableLocation("Colombo", "Melbourne ");
		int expected=0;
		
		assertEquals(expected,actucal);
		
	}
	




}
