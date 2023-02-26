package cap06;

import javax.swing.JOptionPane;

public class InputDataWithMethods {

	static String auxiliar = "";

	public static int readIntegerNumbers(int minimum, int maximum, String men) {
		int number = 0;
		while (true) {
			try {
				auxiliar = JOptionPane.showInputDialog(men);
				number = Integer.parseInt(auxiliar);
				if (number < minimum || number > maximum) {
					JOptionPane.showMessageDialog(null, "Input out of the allowed range");
				} else {
					break; // close the infinity loop.
				}
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Input numbers values!!\n" + erro.toString());
			}
		}
		return (number);
	}

	public static float readFloatNumbers(float minimum, float maximum, String men) {
		float number = 0;
		while (true) {
			try {
				auxiliar = JOptionPane.showInputDialog(men);
				number = Float.parseFloat(auxiliar);
				if (number < minimum || number > maximum) {
					JOptionPane.showMessageDialog(null, "Input out of the allowed range");
				} else {
					break; // close the infinity loop.
				}

			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Input numbers values!!\n" + erro.toString());
			}
		}
		return (number);
	}

	public static double readDoubleNumber(int minimum, int maximum, String men) {
		double number = 0;
		while (true) {
			try {
				auxiliar = JOptionPane.showInputDialog(men);
				number = Double.parseDouble(auxiliar);
				if (number < minimum || number > maximum) {
					JOptionPane.showMessageDialog(null, "Input out of the allowed range");
				} else {
					break; // close the infinity loop.
				}
			} catch (NumberFormatException erro) {
				JOptionPane.showMessageDialog(null, "Input numbers values!!\n" + erro.toString());
			}
		}
		return (number);
	}

	public static String readString(String men) {
		auxiliar = JOptionPane.showInputDialog(men);
		return (auxiliar);
	}

	public static char selectOption(String men) {
		Object[] option = { "yes", "no" };
		char select = 'N';
		String input = (String) JOptionPane.showInputDialog(null, men + "\n", "Search", JOptionPane.PLAIN_MESSAGE, null,
				option, "yes");
		if (input == "yes") {
			select = 'S';
		}
		return select;
	}

}
