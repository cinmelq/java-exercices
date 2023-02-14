package cap05;

import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class SortGradesExercise {

	public static void main(String[] args) {
		float[] grades = new float[5];

		for (int i = 0; i < grades.length; i++) {
			float gradesInput = Float.parseFloat(JOptionPane.showInputDialog("Input your grade"));
			grades[i] = gradesInput;
			System.out.println(grades[i]);
		}

		System.out.println();

		Arrays.sort(grades);

		System.out.println(grades[4]);
		System.out.println(grades[3]);
		System.out.println(grades[2]);
		System.out.println(grades[1]);
		System.out.println(grades[0]);

		float gradeSum = 0;
		for (int i = 0; i < grades.length; i++) {
			gradeSum += grades[i];
		}

		DecimalFormat decimalFormat = new DecimalFormat();
		float meanGrade = gradeSum / grades.length;
		decimalFormat.applyPattern("0.00");

		JOptionPane.showMessageDialog(null, "Mean grade: " + decimalFormat.format(meanGrade));
	}
}
