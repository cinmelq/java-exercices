package cap06;

public class Recursiveness {

	public static void main(String[] args) {
		for (long i = 0; i <= 10; i++) {
			System.out.println(i + "! = " + factorialCalculate(i));
		}
	}

	public static long factorialCalculate(long number) {
		if (number <= 1) {
			return 1;
		} else {
			return (number * factorialCalculate(number - 1));
		}
	}
}