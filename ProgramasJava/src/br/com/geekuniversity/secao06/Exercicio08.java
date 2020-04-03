package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int n;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Digite um número qualquer:");
		n = tela.nextInt();
		
		if(n == 0) {

			System.out.printf("%nO nº %d é neutro.", n);
			
		}
		
		else if (n % 2 == 0) {
			
			if(n > 0) {
			
				System.out.printf("%nO nº %d é par e positivo", n);
				
			}
			
			
			else {
				
				System.out.printf("%nO nº %d é par e negativo", n);
				
			}
			
		}
		
		else if (n % 2 != 0) {
			
			if(n > 0) {
			
				System.out.printf("%nO nº %d é ímpar e positivo", n);
				
			}
			
			
			else {
				
				System.out.printf("%nO nº %d é ímpar e negativo", n);
				
			}
			
		}
		
		tela.close();
		
	}

}
