package cap03;
import java.lang.Exception;
import javax.swing.JOptionPane;

public class GetMessageEPrintStackTrace {

	public static void main(String[] args){
		
		try {
			String x = JOptionPane.showInputDialog("Nome");
			Integer.parseInt(x);
			
			//int y = x / 0; // gera uma exceção
		} catch (Exception erro) {
			JOptionPane.showMessageDialog(null, erro.getMessage());
			erro.printStackTrace();
		}
	}
}
