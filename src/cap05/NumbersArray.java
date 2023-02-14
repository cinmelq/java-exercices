package cap05;

import java.text.DecimalFormat;

public class NumbersArray {

	public static void main(String[] args) {
		int[] integer = new int[10];
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.applyPattern("000");
		for (int i = 0; i < integer.length; i++) {
			integer[i] = (int) (Math.random() * 1000);
			System.out.println(decimalFormat.format(integer[i]));
		}
	}
}
