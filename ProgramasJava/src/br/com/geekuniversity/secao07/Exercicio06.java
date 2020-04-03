package br.com.geekuniversity.secao07;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int n, r;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Digite um nº a ser consultada a tabuada: ");
		n	=	tela.nextInt();
		
		while(n > 10 || n < 1) {
			
			System.out.println("Esse nº não pode ser consultado, tente de novo.");
			
			System.out.println("Digite um nº a ser consultada a tabuada: ");
			n	=	tela.nextInt();			
		}
		
		System.out.printf("%nTabuada de %d: ", n);
		
		for(int i = 1; i <=10; i++) {
			
			r	=	(n	*	i);
			
			System.out.printf("%n %d x %d = %d", n, i, r);
			
		}
		
		tela.close();
		
	}

}