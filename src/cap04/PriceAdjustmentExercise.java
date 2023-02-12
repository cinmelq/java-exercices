package cap04;

import javax.swing.JOptionPane;

public class PriceAdjustmentExercise {

	public static void main(String[] args) {
		float price = 0;
		do {
			String priceInput = JOptionPane.showInputDialog("Input the product price");
			if (priceInput == null || priceInput.equals("0")) {
				JOptionPane.showMessageDialog(null, "Bye!");
				break;
			}
			price = Float.parseFloat(priceInput);
			float calculation = price * 12 / 100 + price;
			float calculationRound = Math.round(calculation);
			JOptionPane.showMessageDialog(null, "The value with addition: " + "R$ " + calculation + "\nRounded value: "
					+ "R$ " + (int) calculationRound);
		} while (price != 0);
	}
}