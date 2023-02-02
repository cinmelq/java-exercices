package cap03;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		String input = "";

		do {
			input = JOptionPane
					.showInputDialog("Input an option:\n1-Exercise 1\n2-Exercise 2\n3-Exercise 3\n4-Exercise 4");
			if (input == null) {
				input = "Exit";
			}

			switch (input) {
			case "1":
				ProductDiscountExercise.main(args);
				break;
			case "2":
				ElectricResistanceExercise.main(args);
				break;
			case "3":
				PasswordExercise.main(args);
				break;
			case "4":
				MultiplicationTable.main(args);
				break;
			case "Exit":
				JOptionPane.showMessageDialog(null, "Thank you, please come again!");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Nonexistent value");

			}
		} while (input != "Exit");

	}
}
