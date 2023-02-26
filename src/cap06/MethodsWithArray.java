package cap06;

import java.util.Arrays;

public class MethodsWithArray {

	/**
	 * Receives an array of numbers and returns the maximum value, it needs to contain
	 * at least an element or else it will throw an exception
	 * 
	 * @stop numbers = the numbers to be compared
	 * @return = the maximum number
	 */
	public static double searchMaximum(double[] numbers) {
		double maximum = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
		}
		return maximum;
	}

	/**
	 * receives an array of the words and returns in increasing sort
	 * 
	 * @stop words = the words to be sorted
	 * @return = the sorted array
	 */
	public static String[] sortWords(String[] words) {
		Arrays.sort(words);
		return words;
	}
}
