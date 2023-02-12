package cap04;

import javax.swing.JOptionPane;

public class InappropriateContentExercise {

	public static void main(String[] args) {
		String sentenceInput = JOptionPane.showInputDialog("Input a sentence");
		int wordLocationSex = sentenceInput.indexOf("sex");
		int wordLocationSexual = sentenceInput.indexOf("sexual");

		boolean verifyIndexWords = wordLocationSex > -1 || wordLocationSexual > -1;

		if (verifyIndexWords) {
			JOptionPane.showMessageDialog(null, "Inappropriate content.");
		}

	}
}
