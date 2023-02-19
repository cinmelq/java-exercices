package cap05;

public class NumbersNotRepeatedExercise {
	
	public static void main(String[] args) {
		int [] numbers = new int [10];
		
		for(int i = 0; i < numbers.length; i++) {
			int randomNumbers = (int) (Math.random()*10);
			numbers[i] = randomNumbers;
			System.out.print(numbers[i] + ", ");
		}
		
		System.out.println();
		
		sort(numbers);
				
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		
		System.out.println();
		

		int[] removeDuplicatesResult = removeDuplicates(numbers);
		
		for(int i = 0; i < removeDuplicatesResult.length; i++) {
		System.out.print(removeDuplicatesResult[i] + ", ");
		}
		
	}
	static void sort(int[] array) {
		for(int i = 0 + 1 ; i < array.length; i++) {
			for(int j = 0 ; j < array.length; j++) {
				if(array[i] < array[j]) {
					int auxiliar = array[j];
					array[j] = array[i];
					array[i] = auxiliar;
				}
			}
		}
	}
	static int[] removeDuplicates(int[] array) {
		int temporary [] = new int [array.length];
		
		int count = 0;
		
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i] != array[i+1]) {
				temporary[count++] = array[i];
			}
		}
		
		temporary[count++] = array.length -1;
		
		int [] unique = new int [count];
		for(int i = 0; i < unique.length; i++) {
			unique[i] = temporary[i];
		}
		return unique;
	}
}
