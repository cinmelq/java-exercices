package cap04;

import javax.swing.JOptionPane;

public class SentenceLength {
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence");
		int length = sentence.length();
		JOptionPane.showMessageDialog(null, "Sentence: " + sentence + "\nCharacteres quantity: " + length);
	}
}
