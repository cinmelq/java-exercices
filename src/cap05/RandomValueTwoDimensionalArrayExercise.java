package cap05;

public class RandomValueTwoDimensionalArrayExercise {

	public static void main(String[] args) {

		int[][] valueImage = new int[40][40];

		for (int line = 0; line < valueImage.length; line++) {
			for (int column = 0; column < valueImage.length; column++) {
				valueImage[line][column] = (int) (Math.random() * 256);
				System.out.print(valueImage[line][column] + ", ");
			}
			System.out.println();
		}
	}
}
