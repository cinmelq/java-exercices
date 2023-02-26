package cap06;

public class MyArraysExercise {

	public static void main(String[] args) {
		int[] numbers = { 5, 6, 8, 1, 0, 6, 9 };
		int[] numbers2 = { 5, 7, 6, 8, 2, 1 };
		System.out.println(findUniformNumbers(numbers, numbers2, 6));

		int[] arrayRandomNumbers = randomNumbers(10);
		for (int i = 0; i < arrayRandomNumbers.length; i++) {
			System.out.print(arrayRandomNumbers[i] + ", ");
		}
	}

	static int findUniformNumbers(int[] array1, int[] array2, int numberToFind) {
		int findNumberArray1 = 0;
		int countArray1 = 0;
		int findNumberArray2 = 0;
		int countArray2 = 0;
		
		for (int i = 0; i < array1.length; i++) {
			countArray1++;
			if (array1[i] == numberToFind) {
				findNumberArray1 = 1;
			}
		}
		System.out.println("count Array 1: " + countArray1);
		
		
		for (int i = 0; i < array2.length; i++) {
			countArray2++;
			if (array2[i] == numberToFind) {
				findNumberArray2 = 1;
			}
		}
		System.out.println("Count Array 2: " + countArray2);
		
		int findNumbersArraySumValues = findNumberArray1 + findNumberArray2;
		if (findNumbersArraySumValues == 2) {
			return 2;
		} else if (findNumbersArraySumValues == 1) {
			return 1;
		} else {
			return 0;
		}
	}

	static int[] randomNumbers(int number) {

		int[] randomNumbersArray = new int[number];
		for (int i = 0; i < randomNumbersArray.length; i++) {
			randomNumbersArray[i] += (int) (Math.random() * 1001);
		}
		return randomNumbersArray;
	}
}