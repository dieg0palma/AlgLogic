package br.com.geekuniversity.secao03;

import java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {

		int mts, cms;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Insira o valor, em metros, a ser convertido: ");
		mts = tela.nextInt();
		cms = (mts * 100);
		
		System.out.printf("O total de " + mts + " metros pode ser convertido para "
				+ cms + " centimetros.");
		
		tela.close();

	}

}
