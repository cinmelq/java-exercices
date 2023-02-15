package cap05;

import javax.swing.JOptionPane;

public class RandomMonthExercise {

	public static void main(String[] args) {
		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int randomNumber = (int) (Math.random() * 12);

		JOptionPane.showMessageDialog(null, months[randomNumber]);
	}

}
