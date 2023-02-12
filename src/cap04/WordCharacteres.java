package cap04;

import javax.swing.JOptionPane;

public class WordCharacteres {

	public static void main(String[] args) {
		String word = JOptionPane.showInputDialog("Input a word with at least four letters");
		JOptionPane.showMessageDialog(null, "Word: " + word + "\nCharactere 1: " + word.charAt(0) + "\nCharactere 2: "
				+ word.charAt(1) + "\nCharactere 3: " + word.charAt(2) + "\nCharactere 4: " + word.charAt(3));

	}
}
