package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int num, pos, neg;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		num = tela.nextInt();
		
		if (num > 0) {
			
			pos = num;
			System.out.printf("%nO n� %d � positivo.", pos);
			
		} else if (num < 0) {
			
			neg = num;
			System.out.printf("%nO n� %d � negativo.", neg);
			
		} else {
			
			System.out.printf("%nO n�mero %d � neutro.", num);
			
		}
		
		tela.close();
		
	}

}
