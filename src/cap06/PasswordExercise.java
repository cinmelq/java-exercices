package cap06;

public class PasswordExercise {

	public static void main(String[] args) {
		System.out.println(generate());
	}

	static String generate() {
		String password = "0";
		for (int i = 0; i < 8; i++) {
			password += (int) (Math.random() * 10);
		}

		return password;
	}
}