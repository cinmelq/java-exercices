package cap03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleArrays {

	public static void main(String[] args) {
		// How to declare an array?
		/*
		 * JavaScript: const names = []; names[0] = 'banana'; names[1] = 'Eric';
		 * names[2] = 'Shane';
		 * 
		 * const fruits = ['Jaca', 'Strawberry', 'Apple'];
		 * 
		 */

		/*
		 * Arrays in Java 1 - Needs to declare the type of the array (String, int,
		 * double, float...) 2 - [] comes right after the type 3 - needs to use the
		 * reserved keyword 'new' to instantiate a new array 4 - Needs to specify the
		 * size of the array
		 */
		char aLetter = 'c';
		String[] names = new String[3];
		names[0] = "Bruno";
		names[1] = "Cinthia";
		names[2] = "Lara";
		// Cannot pass different types to the array
//		names[2] = aLetter;
//		names[2] = 1;
//		names[2] = 2.45332;
//		names[2] = 2.34533f;

		String[] fruits = { "Jaca", "Strawberry", "Apple" };
		System.out.println("The names array size is =" + names.length);
		System.out.println("The fruits array size is =" + fruits.length);

		for (int i = 0; i < 3; i++) {
			System.out.println("The " + i + " fruit is: ");
			System.out.println(fruits[i] + "\n");
			System.out.println("The " + i + " name is: ");
			System.out.println(names[i] + "\n");
		}

		// Passing a value to the array
		names[2] = "Leandro";
		System.out.println(names[2]);

		for (int i = 0; i < fruits.length; i++) {
			fruits[i] = "Banana";
		}

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		// Get the highest number from the array - By hand
		int[] numbers = { 2, 1, 4, 3 };

		int highestNumber = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > highestNumber) {
				highestNumber = numbers[i];
			}
		}

		System.out.println("The highest number is = " + highestNumber);

		int highestNumberEasy = Arrays.stream(numbers).max().getAsInt();
		System.out.println("The highest number, in an easy way, is = " + highestNumberEasy);

		// Using streams...
		List<Integer> multipliedByTwo = Arrays.stream(numbers)
				.map(number -> number * 2) // map: transform each value from the source array as you want
				.boxed() // transforms the IntStream to Stream so you can...
				.collect(Collectors.toList()); // Collect the stream values as a List

		System.out.println(multipliedByTwo);

	}

}
