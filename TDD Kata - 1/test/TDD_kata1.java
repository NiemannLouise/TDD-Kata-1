import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TDD_kata1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	//Sammen med Anders
	public void testEmptyStringEqualsZero() {
		assertEquals(0, new StringCalculator().add(""));
	}
	
	@Test
	public void testSingleStringEqualsOne() {
		assertEquals(1, new StringCalculator().add("1"));
	}

	@Test
	public void testTwoStringEqualsThree() {
		assertEquals(3, new StringCalculator().add("1,2"));
	}
	
	@Test
	public void testTvelweEqualsTvelwe() {
		assertEquals(12, new StringCalculator().add("12"));
	}
	
	@Test
	public void testFifteenAndSeventeenEquals32() {
		assertEquals(32, new StringCalculator().add("15,17"));
	}
	
	@Test
	public void testMoreThanTwoNumbers() {
		assertEquals(34, new StringCalculator().add("15,17,2"));
	}
}
