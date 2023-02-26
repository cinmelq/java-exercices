package cap06;

import javax.swing.JOptionPane;

public class CallMethods {

	public static void main(String[] args) {
		String name = InputDataWithMethods.readString("Input your name");
		int age = InputDataWithMethods.readIntegerNumbers(0, 120, "Input your age");
		float height = InputDataWithMethods.readFloatNumbers(0, 2.5f, "Input your height");
		double weight = InputDataWithMethods.readDoubleNumber(0, 300, "Input your weight");
		char option = InputDataWithMethods.selectOption("Do you like Java?");
		JOptionPane.showMessageDialog(null, "Name: " + name + "\nAge: " + age + "\nHeight: " + height + "\nWeight: "
				+ weight + "\nSelect Option: " + option);
	}
}
