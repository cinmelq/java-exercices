package cap05;

import java.text.DecimalFormat;
import java.util.Arrays;

import java.util.Collections;
import javax.swing.JOptionPane;

public class SortGradesExercise {

  public static void main(String[] args) {
    Float[] grades = new Float[5];

    for (int i = 0; i < grades.length; i++) {
      float gradesInput = Float.parseFloat(JOptionPane.showInputDialog("Input your grade"));
      grades[i] = gradesInput;
    }

    System.out.println();
    Arrays.sort(grades, Collections.reverseOrder());

    float gradeSum = 0;
    for (int i = 0; i < grades.length; i++) {
      gradeSum += grades[i];
    }

    DecimalFormat decimalFormat = new DecimalFormat();
    decimalFormat.applyPattern("0.00");

    float average = gradeSum / grades.length;

    final String message =
        "Grades average: "
            + decimalFormat.format(average)
            + "\nAll grades:\n"
            + Arrays.toString(grades);
    JOptionPane.showMessageDialog(null, message);
  }
}
