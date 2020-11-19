import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for class EuclideanDivison
 * @author Guyllaume Rousseau
 */
public class EuclidivTests {

	private static void runDivTest(int dividend, int divisor, boolean allowNegRem,
			int quotient, int remainder) throws AssertionError {
		EuclideanDivision ed =
				new EuclideanDivision(dividend, divisor, allowNegRem);
		assertEquals(remainder, ed.getRemainder());
		assertEquals(quotient, ed.getQuotient());
	}

	@Test
	public void posPosTestPosRem() {
		// 20 = 7 * 2 + 6
		runDivTest(20, 7, false, 2, 6);
	}

	@Test
	public void posPosTestNegRem() {
		// 20 = 7 * 2 + 6
		runDivTest(20, 7, true, 2, 6);
	}

	@Test
	public void posNegTestPosRem() {
		// 20 = -7 * -2 + 6
		runDivTest(20, -7, false, -2, 6);
	}

	@Test
	public void posNegTestNegRem() {
		// 20 = -7 * -2 + 6
		runDivTest(20, -7, true, -2, 6);
	}

	@Test
	public void negPosTestPosRem() {
		// -20 = 7 * -3 + 1
		runDivTest(-20, 7, false, -3, 1);
	}

	@Test
	public void negPosTestNegRem() {
		// -20 = 7 * -2 - 6
		runDivTest(-20, 7, true, -2, -6);
	}

	@Test
	public void negNegTestPosRem() {
		// -20 = -7 * 3 + 1
		runDivTest(-20, -7, false, 3, 1);
	}

	@Test
	public void negNegTestNegRem() {
		// -20 = -7 * 2 - 6
		runDivTest(-20, -7, true, 2, -6);
	}

	@Test(expected=IllegalArgumentException.class)
	public void zeroDividendTest() {
		EuclideanDivision ed = new EuclideanDivision(0, 7, false);
	}

	@Test(expected=IllegalArgumentException.class)
	public void zeroDivisorTest() {
		EuclideanDivision ed = new EuclideanDivision(20, 0, false);
	}
}
