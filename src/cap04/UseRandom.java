package cap04;

import javax.swing.JOptionPane;

public class UseRandom {
	public static void main(String[] args) {
		String password = "";
		for (int i = 1; i <= 10; i++) {
			int number = (int) (Math.random() * 10);
			password += number;
		}
		JOptionPane.showMessageDialog(null, "Generated password: " + password);

		for (int card = 1; card <= 4; card++) {
			String cardNumbers = "";
			for (int cardNumber = 1; cardNumber <= 6; cardNumber++) {
				int number = (int) (Math.random() * 100);
				cardNumbers += number + "   ";
			}
			JOptionPane.showMessageDialog(null, "Card numbers: " + card + "\n" + cardNumbers);
		}
	}
}
