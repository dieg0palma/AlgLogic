package br.com.geekuniversity.secao03;

import java.util.*;

public class Exercicio07 {

	public static void main(String[] args) {
		
		float altura, ideal;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura = tela.nextFloat();
		
		ideal = (float) ((72.7 * altura) - 58);
		
		System.out.printf("Seu peso ideal é de %.2f quilos.", ideal);
		
		tela.close();
		
	}

}
