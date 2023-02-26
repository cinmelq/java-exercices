package cap06;

public class MethodMonthExercise {

	static String getMonthInExtensive(int month, int language) {
		
		String monthInExtensive = "";
		switch(month) {
		case 1:
			if(language == 1) {
				monthInExtensive = "Janeiro";
			} else {
				monthInExtensive = "January";
			}
			break;
		case 2:
			if(language == 1) {
				monthInExtensive = "Fevereiro";
			} else {
				monthInExtensive = "Febuery";
			}
			break;
		case 3:
			if(language == 1) {
				monthInExtensive = "Março";
			} else {
				monthInExtensive = "March";
			}
			break;
		case 4:
			if(language == 1) {
				monthInExtensive = "Abril";
			} else {
				monthInExtensive = "April";
			}
			break;
		case 5:
			if(language == 1) {
				monthInExtensive = "Maio";
			} else {
				monthInExtensive = "May";
			}
			break;
		case 6:
			if(language == 1) {
				monthInExtensive = "Junho";
			} else {
				monthInExtensive = "June";
			}
			break;
		}
		return monthInExtensive;
	}
}
