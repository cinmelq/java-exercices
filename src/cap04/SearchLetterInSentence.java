package cap04;

import javax.swing.JOptionPane;

public class SearchLetterInSentence {
	
	public static void main(String[] args) {
		String sentence = "Livro Java - Ensino Didático";
		char character = 'i';
		JOptionPane.showMessageDialog(null,
				"Sentence: " + sentence + "\nIndex: " + sentence.indexOf(character) + ", "
						+ sentence.indexOf(character, 10) + ", "
						+ sentence.indexOf("Ensino") + ", "
						+ sentence.indexOf("Java", 15));
	}
}
