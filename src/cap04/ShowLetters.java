package cap04;

import javax.swing.JOptionPane;

public class ShowLetters {

	public static void main(String[] args) throws InterruptedException {
		String word = JOptionPane.showInputDialog("Input a word");
		for (int i = 0; i <= word.length(); i++) {
			char c = word.charAt(i);
			System.out.println(c);
			Thread.sleep(1000);
		}
		System.out.println();
		for (int i = word.length() - 1; i >= 0; i--) {
			char c = word.charAt(i);
			System.out.println(c);
			Thread.sleep(1000);
		}
	}
}
