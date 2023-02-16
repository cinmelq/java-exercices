package cap05;

public class EvenAndOddNumbersExercise {

	public static void main(String[] args) {
		int[] evenNumbers = new int[10];
		int[] oddNumbers = new int[10];

		for (int i = 0; i < evenNumbers.length; i++) {
			int randomNumber = 1 + (int) (Math.random() * 20);

			boolean verification = randomNumber % 2 == 0;
			if (verification) {
				evenNumbers[i] = randomNumber;
			} else {
				oddNumbers[i] = randomNumber;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(evenNumbers[i] + ", ");
		}
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.print(oddNumbers[i] + ", ");
		}

	}
}
