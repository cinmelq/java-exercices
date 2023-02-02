package cap03;

import java.io.IOException;
import javax.swing.JOptionPane;

public class InstrucaoThrows {

	public static void main(String[] args) throws IOException {
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
			if (idade < 18) {
				throw new IOException("Menor de idade, entrada não permitida!!");
			} else {
				JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo!");
			}
			// continua a execução normalmente
		} catch (IOException erro) {
			JOptionPane.showMessageDialog(null, erro.toString());
		}
	}
}
