package cap06;

public class MethodsWithReturn {

	public static void main(String[] args) {
		System.out.println(MethodsWithReturn.sum(23.7, 5.5));
		System.out.println(MethodsWithReturn.showEvenNumbers(20));
		System.out.println(MethodsWithReturn.showDay(5));
		System.out.println(MethodsWithReturn.countLettersA("Salad"));
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static String showEvenNumbers(int value) {
		String valueReturn = "";
		for (int a = 0; a <= value; a = a + 2) {
			valueReturn += a + " ";
		}
		return valueReturn;
	}

	public static String showDay(int day) {
		String dayName = "Sunday";
		if (day == 2) {
			dayName = "Monday";
		} else if (day == 3) {
			dayName = "Tuesday";
		} else if (day == 4) {
			dayName = "Wednesday";
		} else if (day == 5) {
			dayName = "Thursday";
		} else if (day == 6) {
			dayName = "Friday";
		} else if (day == 7) {
			dayName = "Saturday";
		} else {
			dayName = "Day not found";
		}
		return dayName;
	}

	public static int countLettersA(String word) {
		int quantity = 0;
		word = word.toUpperCase();
		for (int a = 0; a < word.length(); a++) {
			if (word.charAt(a) == 'A') {
				quantity++;
			}
		}
		return quantity;
	}
}
