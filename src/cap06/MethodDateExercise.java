package cap06;

import java.text.DecimalFormat;

public class MethodDateExercise {

	static int getDay(String date) {
		String input = date;
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.applyPattern("00/00/0000");
		decimalFormat.format(input);
		if (date != "") {
			return 0;
		} else {
			String day = date.substring(0, 1);
			int conversionStringToInteger = Integer.parseInt(day);
			return conversionStringToInteger;
		}
	}

	static int getMonth(String date) {
		if (date != "  /  /    ") {
			return 0;
		} else {
			String day = date.substring(3, 4);
			int conversionStringToInteger = Integer.parseInt(day);
			return conversionStringToInteger;
		}
	}

	static int getYear(String date) {
		if (date != "  /  /    ") {
			return 0;
		} else {
			String day = date.substring(6, 9);
			int conversionStringToInteger = Integer.parseInt(day);
			return conversionStringToInteger;
		}
	}
}
