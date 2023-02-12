package cap04;

import javax.swing.JOptionPane;

public class FloorRounding {

	public static void main(String[] args) {
		float grades = Float.parseFloat(JOptionPane.showInputDialog("Input your grade:"));
		JOptionPane.showMessageDialog(null, "Original Grade: " + grades + "\nRounding floor: " + Math.floor(grades));
	}
}
