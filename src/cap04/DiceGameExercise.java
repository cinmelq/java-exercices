package cap04;

import javax.swing.JOptionPane;

public class DiceGameExercise {

	public static void main(String[] args) {
		int startInput = JOptionPane.showConfirmDialog(null, "Do you want to play the dice?");

		if (startInput == 0) {
			int[] valueDiceArr = new int[3];
			for (int i = 0; i < 3; i++) {
				int value = 1 + (int) (Math.random() * 6);
				valueDiceArr[i] += value;
			}
			int sum = valueDiceArr[0] + valueDiceArr[1] + valueDiceArr[2];
			JOptionPane.showMessageDialog(null,
					valueDiceArr[0] + "\n" + valueDiceArr[1] + "\n" + valueDiceArr[2] + "\nTotal = " + sum);
		} else if (startInput == 1) {
			JOptionPane.showMessageDialog(null, "See you!");
		} else {
			JOptionPane.showMessageDialog(null, "Canceled!");
		}

	}
}
