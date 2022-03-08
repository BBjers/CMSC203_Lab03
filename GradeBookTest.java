import static org.junit.jupiter.api.Assertions.*;

/*GradeBookTest is created to test methods from GradeBook*/

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook gbook1, gbook2;
	
	/**
	 * Create objects and set values for testing
	 * @throws Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		gbook1 = new GradeBook(5);
		gbook1.addScore(70.5);
		gbook1.addScore(80.5);
		gbook1.addScore(90.5);
		
		gbook2 = new GradeBook(5);
		gbook2.addScore(90.0);
		gbook2.addScore(100.0);
	}

	/**
	 * Reset values to null for a new test run
	 * @throws Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		gbook1 = null;
		gbook2 = null;
	}

	/**
	 * Run the test method testAddScore()
	 */
	@Test
	void testAddScore() {
		// Compare the contents contents in scores array vs 
		// what is expected to be in the scores array
		assertTrue(gbook1.toString().equals("70.5 80.5 90.5 "));
        assertTrue(gbook2.toString().equals("90.0 100.0 "));
        
        // Compare the scoreSize to the expected number of scores entered
        assertEquals(3, gbook1.getScoreSize());
        assertEquals(2, gbook2.getScoreSize());
	}
	
	/**
	 * Run test method sum() to the expected sum of the scores entered
	 */
	@Test
	void testSum() {
		assertEquals(241.5, gbook1.sum(), .0001);
		assertEquals(190.0, gbook2.sum(), .0001);
	}

	/**
	 * Run test method minimum() to the expected minimum of the scores entered
	 */
	@Test
	void testMinimum() {
		assertEquals(70.5, gbook1.minimum(), .001);
		assertEquals(90.0, gbook2.minimum(), .001);
	}
	
	/**
	 * Test to compare what is returned by finalScore() to the expected finalScore of the scores entered
	 */
	@Test
	void testFinalScore() {
		assertEquals(171.0, gbook1.finalScore(), .0001);
		assertEquals(100.0, gbook2.finalScore(), .0001);
	}

	/**
	 * Run test to compare the scoreSize to the expected number of scores entered.
	 */
	@Test
	void testGetScoreSize() {
		assertEquals(3, gbook1.getScoreSize());
		assertEquals(2, gbook2.getScoreSize());
	}

	@Test
	void testToString() {
		 // fail("Not yet implemented");
	}

}
