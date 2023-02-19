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
		
		for(int i = 0 + 1 ; i < numbers.length; i++) {
			for(int j = 0 ; j < numbers.length; j++) {
				if(numbers[i] < numbers[j]) {
					int auxiliar = numbers[j];
					numbers[j] = numbers[i];
					numbers[i] = auxiliar;
				}
			}
		}
				
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + ", ");
		}
		
		System.out.println();
		
		int temporary [] = new int [numbers.length];
		
		int count = 0;
		
		for(int i = 0; i < numbers.length - 1; i++) {
			if(numbers[i] != numbers[i+1]) {
				temporary[count++] = numbers[i];
			}
		}
		
		temporary[count++] = numbers.length -1;
		
		int [] unique = new int [count];
		for(int i = 0; i < unique.length; i++) {
			unique[i] = temporary[i];
		}
		
		for(int i = 0; i < unique.length; i++) {
		System.out.print(unique[i] + ", ");
		}
	}
}
