package cap05;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class BinarySearchArray {

	public static void main(String[] args) {
		int[] number = new int[10000];
		for (int i = 0; i < number.length; i++) {
			number[i] = (int) (Math.random() * 1000);
		}
		int value = Integer.parseInt(JOptionPane.showInputDialog("Input a number"));
		String message = "Value not found ";
		for (int i = 0; i < number.length; i++) {
			if (number[i] == value) {
				message = "Found value in a position " + i;
				break;
			}
		}
		System.out.println(message);

		Arrays.sort(number);
		int position = Arrays.binarySearch(number, value);
		System.out.println("New order position: " + position);
	}
}
