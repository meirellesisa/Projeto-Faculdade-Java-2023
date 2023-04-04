package calculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BreakSeValoresIguais {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<Integer> x = new ArrayList<Integer>();
		
		
		List<Integer> y = new ArrayList<Integer>();
		
		Integer valor = null;
		
		boolean sair = false;
	
		while (sair != true) {
			
			System.out.print("Digite um numero : ");
			int valorX = scanner.nextInt();
			x.add(valorX);
			
			System.out.println();
			
			System.out.print("Digite outro numero: ");
			int valorY = scanner.nextInt();
			y.add(valorY);
			
			for (Integer itemX : x) {
				for (Integer itemY : y) {
					if(itemX == itemY) {
						valor = itemX;
						
						System.out.println("IGUAL");
						System.out.println(x);
						System.out.println(y);
						//x.clear();
						//y.clear();
						break;
						
					}
					
		         }
				
		
			}
			if(valor != null) {
				break;
			}
			
		}
	
		scanner.close();
			
		
}
}
