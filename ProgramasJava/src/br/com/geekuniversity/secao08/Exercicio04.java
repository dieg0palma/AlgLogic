package	br.com.geekuniversity.secao08;

import	java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int[] vetor		=	new int[20];
		int soma = 0;
		Scanner tela = new Scanner(System.in);		
		
		for(int i = 0; i <20; i++) {
			
			System.out.println("Digite um nº: ");
			vetor[i]	=	tela.nextInt();
			soma		=	soma + vetor[i];
			
		}
		
		System.out.printf("%nA soma de todos os itens do vetor é de %d.", soma);
		
		tela.close();
		
	}

}
