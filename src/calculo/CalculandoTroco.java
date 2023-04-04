package calculo;

import java.util.Scanner;

public class CalculandoTroco {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor recebido:  ");
		double valorRecebido = scanner.nextDouble();
		
		System.out.print("Digite o valor do produto: ");
		double valorProduto = scanner.nextDouble();
		
		
		double troco = valorRecebido - valorProduto;
		System.out.println("Troco no valor de: " + troco);
	
		scanner.close();

	}

}
