package cap03;

public class Relogio {

	public static void main(String[] args) {

		int horas = 0;
		int minutos = 0;
		int segundos = 0;

		for (horas = 0; horas < 24; horas++) {
			for (minutos = 0; minutos < 60; minutos++) {
				for (segundos = 0; segundos < 60; segundos++) {
					System.out.println(horas + "h" + minutos + "min:" + segundos + "s");
				}
				try {
					Thread.sleep(1000);
					if (segundos == 10) {
						System.exit(0);
					}
				} catch (InterruptedException erro) {
					erro.toString();
				}
			}
		}
		System.exit(0);
	}

}
