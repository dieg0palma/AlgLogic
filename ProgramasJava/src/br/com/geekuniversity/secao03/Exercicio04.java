package br.com.geekuniversity.secao03;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {

		int num1, num2, soma;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Insira o 1� n�: ");
		num1 = tela.nextInt();
		System.out.println("Insira o 2� n�");
		num2 = tela.nextInt();
		soma = num1 + num2;
		
		System.out.println("O resultado da soma desses n�meros � " + soma + ".");
		
		tela.close();
		
	}

}
