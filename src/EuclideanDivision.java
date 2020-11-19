/**
 * This class performs a Euclidean division. It stores its
 * dividend, its divisor, its quotient and its remainder.
 * @author Guyllaume Rousseau
 */
public class EuclideanDivision {

	private int dividend;
	private int divisor;
	private int quotient;
	private int remainder;

	/**
	 * Calculates the quotient and the remainder
	 * from the dividend and the divisor.
	 * @param dividend - the divided number
	 * @param divisor - the number that divides the dividend
	 * @throws IllegalArgumentException if the dividend or the divisor is 0.
	 */
	public EuclideanDivision(int dividend, int divisor)
			throws IllegalArgumentException {
		if(dividend == 0) {
			throw new IllegalArgumentException("The dividend may not be 0.");
		}
		if(divisor == 0) {
			throw new IllegalArgumentException("The divisor may not be 0.");
		}

		this.dividend = dividend;
		this.divisor = divisor;
		performDivision();
	}

	/**
	 * Accessor of this division's dividend
	 * @return the dividend
	 */
	public int getDividend() {return dividend;}

	/**
	 * Accessor of this division's divisor
	 * @return the divisor
	 */
	public int getDivisor() {return divisor;}

	/**
	 * Accessor of this division's quotient
	 * @return the quotient
	 */
	public int getQuotient() {return quotient;}

	/**
	 * Accessor of this division's remainder
	 * @return the remainder
	 */
	public int getRemainder() {return remainder;}

	/**
	 * Calculates the quotient an the remainder.
	 */
	private void performDivision() {
		remainder = dividend % divisor;
		if(remainder < 0) {
			remainder += Math.abs(divisor);
		}
		quotient = (dividend - remainder) / divisor;
	}

	@Override
	public String toString() {
		return "" + dividend + "/" + divisor + "="
				+ quotient + "r" + remainder;
	}
}
