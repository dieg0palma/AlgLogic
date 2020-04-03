package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		
		int num, p = 0, i = 0; 
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Insira um número: ");
		num = tela.nextInt();
		
		if(num % 2 == 0){
			
			p = num;
			
		} else {
			
			i = num;
			
		}
		
		System.out.printf("%n%d", p);
		System.out.printf("%n%d", i);
		
		tela.close();
	}

}
