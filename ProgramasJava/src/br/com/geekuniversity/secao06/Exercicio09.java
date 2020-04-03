package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio09 {

	public static void main(String[] args) {
		
		float indice;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe o valor do índice de poluição: ");
		indice	=	tela.nextFloat();
		
		if(indice >= 0.3 && indice < 0.4) {
		
			System.out.printf("%nSuspender atividades das empresas do grupo 1.");
			
		}
		
		else if (indice >= 0.4 && indice < 0.5) {
			
			System.out.printf("%nSuspender atividades das empresas do grupo 1 e 2.");
			
		}
		
		else if (indice >= 0.5) {
			
			System.out.printf("%nSuspender atividades de todas as empresas.");
			
		}
		
		else {
			
			System.out.printf("%nIndíce de poluição dentro dos limites.");
			
		}
		
		tela.close();
		
	}

}
