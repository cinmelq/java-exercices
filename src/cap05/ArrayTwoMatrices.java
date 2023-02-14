package cap05;

import javax.swing.JOptionPane;

public class ArrayTwoMatrices {
	
	public static void main(String[] args) {
		int [][][] cube = new int [2][3][2];
		
		cube [0][0][0] = 1;
		cube [0][1][0] = 3;
		cube [0][2][0] = 5;
		cube [1][0][0] = 7;
		cube [1][1][0] = 9;
		cube [1][2][0] = 11;
		
		
		cube [0][0][1] = 2;
		cube [0][1][1] = 4;
		cube [0][2][1] = 6;
		cube [1][0][1] = 8;
		cube [1][1][1] = 10;
		cube [1][2][1] = 12;
		
		int pairsSum = 0;
		int imparisSum = 0;
		
		for(int line = 0; line < 2; line ++) {
			for(int column = 0; column < 3; column++) {
				for(int matrice = 0; matrice < 2; matrice++) {
					System.out.println(cube[line][column][matrice]);
					if(matrice == 1) {
						pairsSum += cube[line][column][matrice];
					} else {
						imparisSum += cube[line][column][matrice];
					}
				}
			}
		}
		JOptionPane.showMessageDialog(null, "Sum of pairs elements: " + pairsSum + "\nSum of impairs elements: " + imparisSum);
	}
}
