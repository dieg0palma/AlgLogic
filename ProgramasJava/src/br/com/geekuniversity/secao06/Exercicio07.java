package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio07 {

	public static void main(String[] args) {
		
		int n1, n2, n3, n4, q1, q2, q3, q4;
		Scanner tela = new Scanner(System.in);
		
		System.out.printf("Informe o 1� n�mero:");
		n1	=	tela.nextInt();
		
		System.out.printf("Informe o 2� n�mero:	");
		n2	=	tela.nextInt();
		System.out.printf("Informe o 3� n�mero:	");
		n3	=	tela.nextInt();
		System.out.printf("Informe o 4� n�mero:	");
		n4	=	tela.nextInt();
		
		q1 = n1 * n1;
		q2 = n2 * n2;
		q3 = n3 * n3;
		q4 = n4 * n4;
		
		if(q3 >= 1000) {
			
			System.out.printf("%nO valor do quadrado de %d � %d.", n3, q3);
			
		} else {
			
			System.out.printf("%nO valor do quadrado de %d � %d.", n1, q1);
			System.out.printf("%nO valor do quadrado de %d � %d.", n2, q2);
			System.out.printf("%nO valor do quadrado de %d � %d.", n3, q3);
			System.out.printf("%nO valor do quadrado de %d � %d.", n4, q4);
			
		}
		
		tela.close();
		
	}

}
