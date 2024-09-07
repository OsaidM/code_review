package demo.snippet2;

public class Snipp2_1 {
	/**
	 * Divides two numbers and handles division by zero.
	 *
	 * @param a The numerator
	 * @param b The denominator
	 * @return The result of the division, or 0 if division by zero occurs
	 */
	public double divideNumbers(double a, double b) {
	    if (b == 0) {
	        System.out.println("Error: Division by zero is not allowed.");
	        return 0;
	    }
	    return a / b;
	}

}
