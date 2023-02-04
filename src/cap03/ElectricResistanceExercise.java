package cap03;

import javax.swing.JOptionPane;

public class ElectricResistanceExercise {

	public static void main(String[] args) {

		int[] resistanceArr = new int[4];

		for (int i = 0; i < 4; i++) {
			int resistanceInput = Integer.parseInt(JOptionPane.showInputDialog("Input resistance number " + (i+1)));
			resistanceArr[i] = resistanceInput;
		}

		int maxResistance = 0;
		int minResistance = Integer.MAX_VALUE;
		for (int i = 0; i < resistanceArr.length; i++) {
			if (resistanceArr[i] > maxResistance) {
				maxResistance = resistanceArr[i];
			}
			if (resistanceArr[i] < minResistance) {
				minResistance = resistanceArr[i];
			}
		}

		JOptionPane.showMessageDialog(null,
				"Inputted resistances:\n" + resistanceArr[0] + ", " + resistanceArr[1] + ", " + resistanceArr[2] + ", "
						+ resistanceArr[3] + "\nThe lowest resistance is: " + minResistance
						+ "\nThe highest resistance is " + maxResistance);
	}
}
