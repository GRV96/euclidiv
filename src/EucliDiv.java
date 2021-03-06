/**
 * This class performs a Euclidean division. It stores its
 * dividend, its divisor, its quotient and its remainder.
 * @author Guyllaume Rousseau
 */
public class EucliDiv {

	private int dividend;
	private int divisor;
	private int quotient;
	private int remainder;

	/**
	 * Initializes an instance's quotient and remainder
	 * according to the given dividend and divisor.
	 * @param dividend - the divided number
	 * @param divisor - the number that divides the dividend
	 * @param allowNegRem - If it is false and the remainder is
	 * negative, the remainder will be corrected to a positive value.
	 * @throws IllegalArgumentException if the divisor is 0.
	 */
	public EucliDiv(int dividend, int divisor, boolean allowNegRem)
			throws IllegalArgumentException {
		if(divisor == 0) {
			throw new IllegalArgumentException("The divisor may not be 0.");
		}

		this.dividend = dividend;
		this.divisor = divisor;
		performDivision(allowNegRem);
	}

	/**
	 * Accessor to this division's dividend
	 * @return the dividend
	 */
	public int getDividend() {return dividend;}

	/**
	 * Accessor to this division's divisor
	 * @return the divisor
	 */
	public int getDivisor() {return divisor;}

	/**
	 * Accessor to this division's quotient
	 * @return the quotient
	 */
	public int getQuotient() {return quotient;}

	/**
	 * Accessor to this division's remainder
	 * @return the remainder
	 */
	public int getRemainder() {return remainder;}

	/**
	 * Calculates the quotient and the remainder
	 * from the dividend and the divisor.
	 * @param allowNegRem - If it is false and the remainder is
	 * negative, the remainder will be corrected to a positive value.
	 */
	private void performDivision(boolean allowNegRem) {
		remainder = dividend % divisor;

		if(!allowNegRem && remainder < 0) {
			remainder += Math.abs(divisor);
		}

		quotient = (dividend - remainder) / divisor;
	}
}
