package cap02;
import java.util.*;
public class AlcanceAVitoriaExercicio {
	
	public static void main(String[] args) {
		
		int quantidadeDePontosDoVencedor, quantidadeDePontosDoTimeLanterna, vitoria;
		Scanner sc;
		try {
			System.out.println("Entre com os pontos do vencedor");
			sc = new Scanner(System.in);
			quantidadeDePontosDoVencedor = sc.nextInt();
			
			System.out.println("Entre com os pontos do time lanterna");
			sc = new Scanner (System.in);
			quantidadeDePontosDoTimeLanterna = sc.nextInt();
			
			vitoria = (quantidadeDePontosDoVencedor - quantidadeDePontosDoTimeLanterna) / 3;
			System.out.println("Pontos para alcançar o time vencedor: " + vitoria);
			
		} catch (NumberFormatException e) {
			System.out.println("Houve um erro na conversão, digite apenas caracteres numericos");
		}
	}
	
}
