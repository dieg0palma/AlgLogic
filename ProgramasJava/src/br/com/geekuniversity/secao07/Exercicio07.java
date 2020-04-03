package br.com.geekuniversity.secao07;

import java.util.*;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int mouse = 0, def1 = 0, def2 = 0, def3 = 0, def4 = 0, idMouse, defeito;
		float pct1 = 0, pct2 = 0, pct3 = 0, pct4 = 0;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe o id do mouse: ");
		idMouse	=	tela.nextInt();
		
		while(idMouse != 0) {
			
			System.out.println("1 - Necessita de esfera.\n");
			System.out.println("2 - Necessita de limpeza.\n");
			System.out.println("3 - Necessita de troca do cabo.\n");
			System.out.println("4 - Quebrado.\n");
			
			System.out.println("\nInforme o defeito apresentado: ");
			defeito = tela.nextInt();
			
			switch(defeito){
			case 1:

				def1 = def1 + 1;
				break;

			case 2:

				def2 = def2 + 1;
				break;

			case 3:

				def3 = def3 + 1;
				break;

			case 4:

				def4 = (def4 + 1);
				break;

			default:

				System.out.println("Código inválido, insira um código existente.\n");
				System.out.println("\nInforme o defeito apresentado: ");
				defeito = tela.nextInt();

				break;

			}
			
			mouse++;
			System.out.println("Informe o id do mouse: ");
			idMouse	=	tela.nextInt();			
			
		}
		
		pct1 = (def1 * 100) / mouse;
		pct2 = (def2 * 100) / mouse;
		pct3 = (def3 * 100) / mouse;
		pct4 = (def4 * 100) / mouse;

		System.out.printf("%nA quantidade total de mouses é de %d.", mouse);
		System.out.printf("%nCódigo \t\t\t\tQuantidade \tPercentual.");
		System.out.printf("%n1- Necessita de esfera. \t\t%d \t\t%.2f%%", def1, pct1);
		System.out.printf("%n2- Necessita de limpeza. \t\t%d \t\t%.2f%%", def2, pct2);
		System.out.printf("%n3- Necessita de troca do cabo. \t\t%d \t\t%.2f%%", def3, pct3);
		System.out.printf("%n4- Quebrado. 	\t\t\t%d \t\t%.2f%%", def4, pct4);
		
		tela.close();
		
	}

}
