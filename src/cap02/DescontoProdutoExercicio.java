package cap02;
import java.io.*;
public class DescontoProdutoExercicio {
	
	public static void main(String[] args) {
		String s;
		float valorDoProduto, percentualDeDesconto, valorDoDesconto;
		BufferedReader dado;
		try {
			System.out.println("Entre com o valor do produto");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			valorDoProduto = Float.parseFloat(s);
						
			System.out.println("Entre com a porgentagem de desconto");
			dado = new BufferedReader(new InputStreamReader(System.in));
			s = dado.readLine();
			percentualDeDesconto = Float.parseFloat(s);
			
			valorDoDesconto = valorDoProduto * percentualDeDesconto / 100;
			
			System.out.println("Valor do Produto: " + valorDoProduto);
			System.out.println("Valor do Desconto: " + valorDoDesconto);
			
		} catch (IOException erro) {
			System.out.println("Houve erro na entrada de dados " + erro.toString());
		} catch (NumberFormatException erro) {
			System.out.println("Houve erro na conversão, digite apenas caracteres numéricos " + erro.toString());
		}
	}
}
