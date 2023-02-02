package cap03;

import javax.swing.JOptionPane;

public class ProductDiscountExercise {

	public static void main(String[] args) {

		String product = JOptionPane.showInputDialog("Input product name");
		String productValueInput = JOptionPane.showInputDialog("Digite o valor do produto");
		float productValueDecimalConversion = Float.parseFloat(productValueInput);


		if (productValueDecimalConversion < 0) {
			JOptionPane.showMessageDialog(null, "The value needs to be greater than 0");
		} else {
			float productDiscount = calculateDiscount(productValueDecimalConversion);
			JOptionPane.showMessageDialog(null, "Product name: " + product + "\nOriginal product value: "
					+ productValueDecimalConversion + "\nProduct value with discount: " + productDiscount);
			
		}
	}
	public static float calculateDiscount(float productValue) {
		float productDiscount = 0;
		if (productValue >= 50 && productValue < 200) {
			productDiscount = productValue - productValue * 5 / 100;

		} else if (productValue < 500) {
			productDiscount = productValue - productValue * 6 / 100;

		} else if (productValue < 1000) {
			productDiscount = productValue - productValue * 7 / 100;

		} else {
			productDiscount = productValue - productValue * 8 / 100;

		}
		return productDiscount;
	}
	
}