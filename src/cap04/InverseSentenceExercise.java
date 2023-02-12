package cap04;

import javax.swing.JOptionPane;

public class InverseSentenceExercise {
	
	public static void main(String[] args) {
		String sentenceInput = JOptionPane.showInputDialog("Input a sentence");
		String removeSpaces = sentenceInput.replaceAll(" ", "");
		String inverseSentence = "";
		for(int i = removeSpaces.length() - 1; i >= 0; i--) {
			inverseSentence += removeSpaces.charAt(i);
		}
		
		JOptionPane.showMessageDialog(null, "Sentence Input: " + sentenceInput + "\nInverse sentence: " + inverseSentence);
	}
}
