package br.com.geekuniversity.secao08;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int[] vetor1	=	new int[10];
		int[] vetor2	=	new int[10];
		int[] soma		=	new int[10];
		Scanner tela 	=	new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("\nInsira um n�mero no 1� vetor: ");
			vetor1[i]	=	tela.nextInt();
			
			System.out.println("\nInsira um n�mero no 2� vetor: ");
			vetor2[i]	=	tela.nextInt();
			
			soma[i]		=	vetor1[i] + vetor2[i];
			
		}
		
		for(int i = 0; i <10; i++) {
			
			System.out.println("A soma dos valores dos 2 vetores na posi��o " + i +  " � igual a " + soma[i] + ".");
			
		}
		
		tela.close();
		
	}

}
