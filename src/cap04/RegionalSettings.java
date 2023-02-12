package cap04;

import java.text.DecimalFormat;
import java.util.Locale;

import javax.swing.JOptionPane;

public class RegionalSettings {
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat();
		Locale locale = Locale.getDefault();
		double value = 1370.25;
		if (locale.getCountry().equals("BR")) {
			decimalFormat.applyPattern("R$ #,##0.00");
		}
		JOptionPane.showMessageDialog(null,
				"Operacional System settings: " + "\nAcronym: " + locale.getCountry() + "\nCountry: "
						+ locale.getDisplayCountry() + "\nLangage: " + locale.getDisplayLanguage() + "\nKeyboard: "
						+ locale.getDisplayName() + "\nValue: " + decimalFormat.format(value));
	}
}
