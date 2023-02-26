package cap06;

public class CountExercise {
	
	public static void main(String[] args) throws InterruptedException{
		count(1, 10, 1);
		count(1, 10);
		count(10);
		count();
	}
	
	static void count() throws InterruptedException {
		count(10);
	}

	static void count(int end) throws InterruptedException {
		count(1, end);
	}

	static void count(int start, int end) throws InterruptedException {
		count(start, end, 0);
	}

	static void count(int start, int end, int stop) throws InterruptedException {
		for (int i = start; i <= end; i++) {
			System.out.print(i + ", ");
			Thread.sleep(stop*1000);
		}
		System.out.println();
	}

}
