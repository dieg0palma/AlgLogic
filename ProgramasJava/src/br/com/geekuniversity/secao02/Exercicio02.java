package br.com.geekuniversity.secao02;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num1, num2, soma, mult;			
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe o 1� n�mero: ");
		num1 = tela.nextInt();
		System.out.println("Informe o 2� n�mero: ");
		num2 = tela.nextInt();
		
		soma = (num1 + num2);
		mult = (soma * num1);
		
		System.out.println("O somat�rio dos n� � " + soma + ". "
				+ "O resultado da multiplica��o � " + mult + ".");
		tela.close();
	}

}
