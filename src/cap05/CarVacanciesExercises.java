package cap05;

import javax.swing.JOptionPane;

public class CarVacanciesExercises {

	public static void main(String[] args) {
		String[] carVacanicies = new String[10];
		String licensePlate = "";
		int vacancyNumber = 0;
		
		String menu = "";

		while(!menu.equals("4")) {
			menu = JOptionPane.showInputDialog("1 - Input\n2 - Car Outing\n3 - List Actual situation\n4 - Close");
			switch (menu) {
			case "1":
				vacancyNumber = Integer.parseInt(JOptionPane.showInputDialog("Input the vacancy number"));
				licensePlate = JOptionPane.showInputDialog("Input your plate");
				carVacanicies[vacancyNumber] = licensePlate;
				break;
			case "2":
				vacancyNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Input the vacancy number to be released"));
				carVacanicies[vacancyNumber] = null;
				break;
			case "3":
				for (int i = 0; i < carVacanicies.length; i++) {
					System.out.println("Actual situation: " + carVacanicies[i]);
				}
				break;
			default:
				break;
			}
			System.out.println();
		}
	}
}
