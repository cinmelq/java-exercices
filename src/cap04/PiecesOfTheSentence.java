package cap04;

import javax.swing.JOptionPane;

public class PiecesOfTheSentence {
	public static void main(String[] args) {
		try {

			String sentence = JOptionPane.showInputDialog("Input a sentence");
			JOptionPane.showMessageDialog(null,
					"Sentence: " + sentence + "\n(0,2): " + sentence.substring(0, 2) + "\n(3,8): "
							+ sentence.substring(3, 8) + "\n(9,11): " + sentence.substring(9, 11) + "\n(12,14): "
							+ sentence.substring(12, 14));

		} catch (StringIndexOutOfBoundsException erro) {
			JOptionPane.showConfirmDialog(null, "The sentence must have at least 15 characteres" + erro.toString());
		}
	}
}
