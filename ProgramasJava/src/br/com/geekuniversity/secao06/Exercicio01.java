package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int num;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		num = tela.nextInt();
		
		if (num > 100) {
			
			System.out.println("\n" + num);
			
		} else {
			
			num = 0;
			System.out.println("\n" + num);
			
		}
		
		tela.close();
		
	}

}
