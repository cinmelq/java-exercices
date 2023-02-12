package cap04;

import javax.swing.JOptionPane;

public class RemovingSpaces {
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence");
		sentence = "     " + sentence + "     ";
		JOptionPane.showMessageDialog(null,
				"With spaces: " + "-" + sentence + "-" + "\nWithout spaces: " + "-" + sentence.trim() + "-");
	}
}
