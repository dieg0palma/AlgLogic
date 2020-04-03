package br.com.geekuniversity.secao02;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num1, num2, soma, mult;			
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe o 1º número: ");
		num1 = tela.nextInt();
		System.out.println("Informe o 2º número: ");
		num2 = tela.nextInt();
		
		soma = (num1 + num2);
		mult = (soma * num1);
		
		System.out.println("O somatório dos nº é " + soma + ". "
				+ "O resultado da multiplicação é " + mult + ".");
		tela.close();
	}

}
