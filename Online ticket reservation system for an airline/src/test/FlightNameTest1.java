package test;

import static org.junit.jupiter.api.Assertions.*;

import org.FlightName;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FlightNameTest1 {

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
			
			String name="Airline";
			

			
			FlightName names =new FlightName();
			
			int actucal=names.FlightName("Airline");
			int expected=0;
			
			assertEquals(expected,actucal);
			
		}




}
