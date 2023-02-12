package cap04;

import javax.swing.JOptionPane;

public class SentenceTransformation {
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		JOptionPane.showMessageDialog(null, "Sentence: " + sentence + "\nAll upper case: " + sentence.toUpperCase()
				+ "\nAll lower case: " + sentence.toLowerCase());
	}
}
