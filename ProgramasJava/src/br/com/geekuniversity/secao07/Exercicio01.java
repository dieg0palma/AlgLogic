package br.com.geekuniversity.secao07;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int n, m = 0;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe um n� qualquer: ");
		n = tela.nextInt();
		
		while (n != 0) {
			
			if (n > m) {
				
				m = n;
				
			}
			
			System.out.println("Informe um n� qualquer: ");
			n = tela.nextInt();
			
		}
		
		System.out.printf("%nO maior n� digitado foi %d.", m);
		
		tela.close();
		
	}

}
