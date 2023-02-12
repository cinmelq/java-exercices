package cap04;

import javax.swing.JOptionPane;

public class RandomPasswordGeneratorExercise {

	public static void main(String[] args) {

		int randomNumber = 5 + (int) (Math.random() * 6);

		String passwordGenerator = "";
		for (int i = 0; i < randomNumber; i++) {
			int randomPassword = (int) (Math.random() * 10);
			String randonNumberConversion = String.valueOf(randomPassword);
			passwordGenerator += randonNumberConversion;
		}
		JOptionPane.showMessageDialog(null, "Random number: " + randomNumber + "\nPassword Generator: " + passwordGenerator);
	}
}
