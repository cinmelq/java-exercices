package cap02;
import javax.swing.JOptionPane;
public class MediaProvasExercicio {
	
	public static void main(String[] args) {
		String aux;
		float nota1, nota2, notaDoTrabalho, media;
		try {
			aux = JOptionPane.showInputDialog("Entre com a nota da primeira prova");
			nota1 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com a nota da segunda prova");
			nota2 = Float.parseFloat(aux);
			
			aux = JOptionPane.showInputDialog("Entre com a nota do trabalho");
			notaDoTrabalho = Float.parseFloat(aux);
			
			media = (nota1 + nota2 + notaDoTrabalho)/3;
			JOptionPane.showMessageDialog(null, "Sua média é: " + media);
		}catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos" + erro.toString());
		}
	}
}
