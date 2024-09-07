package demo.snippet3;

import java.util.Arrays;

public class Snippet3_1 {
	// Using streams to simplify the logic and adding null check
	public int calculateSum(int[] numbers) {
	    return numbers == null ? 0 : Arrays.stream(numbers).sum();
	}

}
