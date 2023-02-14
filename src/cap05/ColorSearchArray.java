package cap05;

import javax.swing.JOptionPane;

public class ColorSearchArray {

	public static void main(String[] args) {
		String[] colors = { "green, yellow, blue, red, black" };
		String color = JOptionPane.showInputDialog("Input a color");
		String message = "Color not found";
		for (String element : colors) {
			if (element.equals(color)) {
				message = "Found color";
				break;
			}
		}
		JOptionPane.showMessageDialog(null, message);
	}
}
