package cap03;

import javax.swing.JOptionPane;

public class PasswordExercise {

	public static void main(String[] args) {

		String username = "java";
		String password = "java";
		String loginInput = JOptionPane.showInputDialog("Input your username:");
		String passwordInput = JOptionPane.showInputDialog("Input the password:");

		for (int i = 0; i < 3; i++) {
			if (loginInput.equals(username) && passwordInput.equals(password)) {
				JOptionPane.showMessageDialog(null, "Login and password have been accepted.");
				break;
			} else {
				if (i == 0) {
					JOptionPane.showMessageDialog(null,
							"Invalid login or password, check and try again! \nYou have 2 attempts.");
					loginInput = JOptionPane.showInputDialog("Input the login:");
					passwordInput = JOptionPane.showInputDialog("Input the password:");
				} else if (i == 1) {
					JOptionPane.showMessageDialog(null,
							"Invalid login or password, check and try again! \nYou have 1 attempts.");
					loginInput = JOptionPane.showInputDialog("Input the login:");
					passwordInput = JOptionPane.showInputDialog("Input the password:");
				} else if (i == 2) {
					JOptionPane.showMessageDialog(null, "The account has been blocked.");
				}

			}
		}
	}
}
