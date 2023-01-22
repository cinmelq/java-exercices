package cap02;
import javax.swing.JOptionPane;
public class ImpostoSobreTransmissaoDeBensMoveisExercicio {
	
	public static void main(String[] args) {
		String aux;
		float valorDaTransacao, valorVenal, percentualDeImposto, valorDoImposto;
		try {
			aux = JOptionPane.showInputDialog("Entre com o valor da transação");
			valorDaTransacao = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o valor venal");
			valorVenal = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com o percentual de imposto");
			percentualDeImposto = Float.parseFloat(aux);
			
			valorDoImposto = Math.max(valorDaTransacao, valorVenal) * percentualDeImposto / 100;
			JOptionPane.showMessageDialog(null, "Valor do imposto: " + valorDoImposto);

		} catch(NumberFormatException e) {
			System.out.println("Houve erro na conversão, digite apenas caracteres numericos");
	}
}
	}