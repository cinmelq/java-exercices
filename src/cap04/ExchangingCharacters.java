package cap04;

import javax.swing.JOptionPane;

public class ExchangingCharacters {
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence");
		JOptionPane.showMessageDialog(null, "Sentence: " + sentence + "\nRemoving the spaces: "
				+ sentence.replace(" ", "") + "\nReplacing a for u: " + sentence.replace("a", "u"));
	}
}
