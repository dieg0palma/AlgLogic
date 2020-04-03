package br.com.geekuniversity.secao08;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int[] vetor		=	new int[10];
		Scanner tela	=	new Scanner (System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite um nº: ");
			vetor[i]	=	tela.nextInt();
			
		}
		
		int i = 9;
		
		while(i >= 0) {
			
			System.out.printf("%nContagem regressiva do vetor na posição %d: ", i);
			System.out.println(vetor[i]);
			i--;
			
		}
		
		tela.close();
		
	}

}
