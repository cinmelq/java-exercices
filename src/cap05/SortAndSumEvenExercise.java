package cap05;

public class SortAndSumEvenExercise {

	public static void main(String[] args) {
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			int randomNumber = 1 + (int) (Math.random() * 10);
			numbers[i] = randomNumber;
			System.out.print(numbers[i] + ", ");
		}

		System.out.println();

		for (int i = 0 + 1; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				if (numbers[i] < numbers[j]) {
					int auxiliar = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = auxiliar;
				}
			}
		}
		
		
		int [] evenNumbers = new int [10];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
			boolean verification = numbers[i] % 2 == 0;
			if(verification)
				evenNumbers[i] = numbers[i];
		}
		
		System.out.println();
		
		int sumEvenNumbers = 0;
		for(int i = 0; i < evenNumbers.length; i++) {
			System.out.print(evenNumbers[i] + ", ");
			sumEvenNumbers += evenNumbers[i];
		}
		
		System.out.println();
		System.out.print("Even sum: " + sumEvenNumbers);
	}
}
