package cap04;

import javax.swing.JOptionPane;

public class CeilingRounding {

	public static void main(String[] args) {

		final float BUS_LOTATION = 50;
		int passengersNumber = Integer.parseInt(JOptionPane.showInputDialog("Input passengers number"));
		float numberOfBuses = passengersNumber / BUS_LOTATION;
		JOptionPane.showMessageDialog(null, "Passengers number: " + passengersNumber + "\nCalculaded amount: "
				+ numberOfBuses + "\nNumber of buses needed: " + (int) Math.ceil(numberOfBuses));
		System.exit(0);
	}
}