package cap06;

public class MethodsWithoutReturn {

	public static void main(String[] args) {
		print();
		printText("Hello, world!");
		add(10, 20);
		showSquad(10);
		showMax(10, 20, 30);
		showSexFemaleOrMale('F');
	}

	public static void print() {
		System.out.println("Learning Java Language");
	}

	public static void printText(String text) {
		System.out.println(text);
	}

	public static void add(int a, int b) {
		System.out.println(a + b);
	}

	public static void showSquad(int value) {
		System.out.println(Math.pow(value, 2));
	}

	public static void showMax(int a, int b, int c) {
		System.out.println(Math.max(c, Math.max(a, b)));
	}

	public static void showSexFemaleOrMale(char sex) {
		if (sex == 'F' || sex == 'f') {
			System.out.println("Female");
		} else if (sex == 'M' || sex == 'm') {
			System.out.println("Male");
		} else {
			System.out.println("Unidentified Sex");
		}
	}
}