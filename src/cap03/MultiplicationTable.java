package cap03;

import javax.swing.JOptionPane;

public class MultiplicationTable {

	public static void main(String[] args) {
		int valueInput = Integer.parseInt(JOptionPane.showInputDialog("Input the value"));
		String multiplicationTable = "";

		for (int i = 1; i <= 10; i++) {
			int calculation = valueInput * i;
			multiplicationTable += valueInput + " x " + i + " = " + calculation + "\n";
		}
		JOptionPane.showMessageDialog(null, multiplicationTable);
	}

}
