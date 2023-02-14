package cap05;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int[][] headquarters = new int[3][3];
		headquarters[0][0] = 120;
		headquarters[0][1] = 129;
		headquarters[0][2] = 128;
		headquarters[1][0] = 232;
		headquarters[2][0] = 201;
		headquarters[1][1] = 129;
		headquarters[1][1] = 111;
		headquarters[2][1] = 187;
		headquarters[2][2] = 128;
		headquarters[1][2] = 247;
		headquarters[2][2] = 123;

		for (int line = 0; line < headquarters.length; line++) {
			for (int column = 0; column < headquarters[line].length; column++) {
				System.out.println("[" + line + "," + column + "]" + " = " + headquarters[line][column]);
			}

		}
	}
}
