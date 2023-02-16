package cap02;

import javax.swing.JOptionPane;

public class AposentadoriaExercicio {

	public static void main(String[] args) {

		String sexo = JOptionPane.showInputDialog("Qual seu sexo M ou F?", "Digite aqui");
		String sexoLetraMaiuscula = sexo.toUpperCase();

		boolean verificacaoSexo = sexoLetraMaiuscula.equals("M") || sexoLetraMaiuscula.equals("F");

		if (verificacaoSexo) {
			String idadeEntrada = JOptionPane.showInputDialog("Qual a sua idade?");
			int idade = Integer.parseInt(idadeEntrada);
			
			String tempoDeContribuicaoEntrada = JOptionPane.showInputDialog("Qual seu tempo de contribuição?");
			float tempoDeContribuicao = Float.parseFloat(tempoDeContribuicaoEntrada);
			
			boolean verificacaoTempoDeContribuicaoM = tempoDeContribuicao < 35;
			boolean verificacaoIdadeM = idade < 65;
			
			boolean verificacaoTempoDeContribuicaoF = tempoDeContribuicao < 30;
			boolean verificacaoIdadeF = idade < 60;

			if (sexoLetraMaiuscula.equals("M") && verificacaoTempoDeContribuicaoM && verificacaoIdadeM) {
				
				float tempoRestanteTempoDeContribuicao = 35 - tempoDeContribuicao;
				float tempoRestanteIdade = 65 - idade;
				JOptionPane.showMessageDialog(null,
						"Faltam " + tempoRestanteIdade + " anos para aposentar por idade." + "\nFaltam "
								+ tempoRestanteTempoDeContribuicao
								+ " anos para aposentar por tempo de contribuição.");
			} else if (sexoLetraMaiuscula.equals("F") && verificacaoTempoDeContribuicaoF && verificacaoIdadeF) {
				float tempoRestanteTempoDeContribuicao = 30 - tempoDeContribuicao;
				float tempoRestanteIdade = 60 - idade;
				JOptionPane.showMessageDialog(null,
						"Faltam " + tempoRestanteIdade + " anos para se aposentar por idade." + "\nFaltam "
								+ tempoRestanteTempoDeContribuicao
								+ " anos para aposentar por tempo de contribuição.");
			} else {
				JOptionPane.showMessageDialog(null, "Você já tem direito à aposentadoria!");
			}

		} else {
			JOptionPane.showMessageDialog(null, "Sexo inválido");
		}

	}
}
