package cap03;

import javax.swing.JOptionPane;

public class ElectricResistanceExercise {

	public static void main(String[] args) {
		String resistanceValue = "";

		for (int i = 0; i < 4; i++) {
			int resistanceInput = Integer.parseInt(JOptionPane.showInputDialog("Input the resistance"));
			if (i == 3) {
				resistanceValue += resistanceInput;
			} else {
				resistanceValue += resistanceInput + ", ";
			}
		}
		//int resistenceInputConversionForInteger = Integer.parseInt(resistenceValue);
		
		//System.out.println(resistenceInputConversionForInteger);
		JOptionPane.showMessageDialog(null, "Inputted resistances:\n" + resistanceValue);
	}
}
