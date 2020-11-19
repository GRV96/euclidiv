import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for class EucliDiv
 * @author Guyllaume Rousseau
 */
public class EucliDivTests {

	private static void runDivTest(int dividend, int divisor,
			boolean allowNegRem, int quotient, int remainder)
					throws AssertionError, IllegalArgumentException {
		EucliDiv ed = new EucliDiv(dividend, divisor, allowNegRem);
		/*
		 * EucliDiv.performDivision calculates the remainder first then uses
		 * it to calculate the quotient. The remainder must therefore be
		 * tested first.
		 */
		assertEquals(remainder, ed.getRemainder());
		assertEquals(quotient, ed.getQuotient());
	}

	@Test
	public void dividendZeroTestPosRem() {
		// 0 = 7 * 0 + 0
		runDivTest(0, 7, false, 0, 0);
	}

	@Test
	public void dividendZeroTestNegRem() {
		// 0 = 7 * 0 - 0
		runDivTest(0, 7, true, 0, 0);
	}

	@Test(expected=IllegalArgumentException.class)
	public void divisorZeroTest() {
		runDivTest(20, 0, false, -1, -1);
	}

	@Test
	public void exactDivisionTestPosRem() {
		// 20 = 5 * 4 + 0
		runDivTest(20, 5, false, 4, 0);
	}

	@Test
	public void exactDivisionTestNegRem() {
		// 20 = 5 * 4 - 0
		runDivTest(20, 5, true, 4, 0);
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
}
