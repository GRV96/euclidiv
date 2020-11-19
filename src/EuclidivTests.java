import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit tests for class EuclideanDivison
 * @author Guyllaume Rousseau
 */
public class EuclidivTests {

	@Test
	public void posPosTest() {
		// 20 = 7 * 2 + 6
		EuclideanDivision ed = new EuclideanDivision(20, 7);
		assertEquals(6, ed.getRemainder());
		assertEquals(2, ed.getQuotient());
	}

	@Test
	public void posNegTest() {
		// 20 = -7 * -2 + 6
		EuclideanDivision ed = new EuclideanDivision(20, -7);
		assertEquals(6, ed.getRemainder());
		assertEquals(-2, ed.getQuotient());
	}

	@Test
	public void negPosTest() {
		// -20 = 7 * -3 + 1
		EuclideanDivision ed = new EuclideanDivision(-20, 7);
		assertEquals(1, ed.getRemainder());
		assertEquals(-3, ed.getQuotient());
	}

	@Test
	public void negNegTest() {
		// -20 = -7 * 3 + 1
		EuclideanDivision ed = new EuclideanDivision(-20, -7);
		assertEquals(1, ed.getRemainder());
		assertEquals(3, ed.getQuotient());
	}

	@Test(expected=IllegalArgumentException.class)
	public void zeroDividendTest() {
		EuclideanDivision ed = new EuclideanDivision(0, 7);
	}

	@Test(expected=IllegalArgumentException.class)
	public void zeroDivisorTest() {
		EuclideanDivision ed = new EuclideanDivision(20, 0);
	}
}
