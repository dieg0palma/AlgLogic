package	br.com.geekuniversity.secao08;

import	java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {
		
		int[] vetor		=	new int[10];
		boolean	maior	=	false;
		Scanner tela	=	new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Insira um n�: ");
			vetor[i]	=	tela.nextInt();
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			if(vetor[i]> 50) {
				
				System.out.printf("%nO n� %d na posi��o %d do vetor � maior que 50.", vetor[i], i);
				maior	=	true;
			}
			
		}
		
		if(maior == false) {
			
			System.out.println("N�o existem valores maiores de 50 no vetor.");
			
		}
		
		tela.close();
		
	}

}
