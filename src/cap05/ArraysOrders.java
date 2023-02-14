package cap05;

import java.util.Arrays;

public class ArraysOrders {

	public static void main(String[] args) {
		String[] names = { "Cinthia", "Bruno", "Leandro", "Fernando", "Julia", "Alzira", "Nelson" };
		char[] vowels = { 'i', 'u', 'a', 'o', 'e' };
		int[] numbers = { 9, 2, 6, 7, 5, 3, 4, 8, 1, 0 };
		float[] grades = { 7.6f, 8.5f, 9.7f, 5.4f, 7.4f };
		Arrays.sort(names);
		System.out.print("\nNames: ");
		for (String name : names) {
			System.out.print(name + ", ");
		}

		Arrays.sort(vowels);
		System.out.print("\nVowels: ");
		for (char vowel : vowels) {
			System.out.print(vowel + ", ");
		}

		Arrays.sort(numbers);
		System.out.print("\nNumbers: ");
		for (int number : numbers) {
			System.out.print(number + ", ");
		}

		Arrays.sort(grades);
		System.out.print("\nGrades: ");
		for (float grade : grades) {
			System.out.print(grade + ", ");
		}
	}
}
