package cap04;

import java.text.DecimalFormat;

public class NumbersFormatting {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat();
		short age = 38;
		decimalFormat.applyPattern("000");
		System.out.println(decimalFormat.format(age));

		int quantity = 9750;
		decimalFormat.applyPattern("#0,000");
		System.out.println(decimalFormat.format(quantity));

		long stock = 198564;
		decimalFormat.applyPattern("#,##0,000");
		System.out.println(decimalFormat.format(stock));

		float height = 1.74f;
		decimalFormat.applyPattern("#0.00");
		System.out.println(decimalFormat.format(height));

		double weight = 70.25;
		decimalFormat.applyPattern("#0.00");
		System.out.println(decimalFormat.format(weight));

		String reaisValue = "2583.75";
		decimalFormat.applyPattern("R$ #,##0.00");
		System.out.println(decimalFormat.format(Double.parseDouble(reaisValue)));
	}
}
