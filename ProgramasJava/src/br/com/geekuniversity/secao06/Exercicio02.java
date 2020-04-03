package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num, pos, neg;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		num = tela.nextInt();
		
		if (num > 0) {
			
			pos = num;
			System.out.printf("%nO nº %d é positivo.", pos);
			
		} else if (num < 0) {
			
			neg = num;
			System.out.printf("%nO nº %d é negativo.", neg);
			
		} else {
			
			System.out.printf("%nO número %d é neutro.", num);
			
		}
		
		tela.close();
		
	}

}
