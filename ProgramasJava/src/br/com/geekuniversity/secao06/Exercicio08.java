package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio08 {

	public static void main(String[] args) {
		
		int n;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Digite um n�mero qualquer:");
		n = tela.nextInt();
		
		if(n == 0) {

			System.out.printf("%nO n� %d � neutro.", n);
			
		}
		
		else if (n % 2 == 0) {
			
			if(n > 0) {
			
				System.out.printf("%nO n� %d � par e positivo", n);
				
			}
			
			
			else {
				
				System.out.printf("%nO n� %d � par e negativo", n);
				
			}
			
		}
		
		else if (n % 2 != 0) {
			
			if(n > 0) {
			
				System.out.printf("%nO n� %d � �mpar e positivo", n);
				
			}
			
			
			else {
				
				System.out.printf("%nO n� %d � �mpar e negativo", n);
				
			}
			
		}
		
		tela.close();
		
	}

}
