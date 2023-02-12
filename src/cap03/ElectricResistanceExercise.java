package cap03;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ElectricResistanceExercise {

	public static void main(String[] args) {

		int[] resistanceArr = new int[4];

		for (int i = 0; i < 4; i++) {
			int resistanceInput = Integer.parseInt(JOptionPane.showInputDialog("Input resistance number " + (i + 1)));
			resistanceArr[i] = resistanceInput;
		}
		
		int[] originalResistanceArr = Arrays.copyOf(resistanceArr, 4);
		
		Arrays.sort(resistanceArr);

		JOptionPane.showMessageDialog(null,
				"Inputted resistances:\n" + originalResistanceArr[0] + ", " + originalResistanceArr[1] + ", " + originalResistanceArr[2] + ", "
						+ originalResistanceArr[3] + "\nThe lowest resistance is: "
						+ resistanceArr[0]
						+ "\nThe highest resistance is " + resistanceArr[3]);
		
	}
}
