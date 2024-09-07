package demo.snippet3;

public class Snippet {
	// Calculate sum of an array of numbers
	public int calculateSum(int[] numbers) {
	    int sum = 0;
	    for (int i = 0; i < numbers.length; i++) {
	        sum += numbers[i];
	    }
	    return sum;
	}

}
