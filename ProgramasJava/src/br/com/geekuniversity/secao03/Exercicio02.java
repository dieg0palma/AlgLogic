package br.com.geekuniversity.secao03;

import java.util.*;

public class Exercicio02 {

	public static void main(String[] args) {
		
		int minimo, maximo, medio;			
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe a quantidade minima do estoque: ");
		minimo = tela.nextInt();
		System.out.println("Informe a quantidade m�xima do estoque: ");
		maximo = tela.nextInt();
		
		medio = (minimo + maximo) / 2;
		
		System.out.println("O valor m�dio do estoque � de " + medio + ".");
		tela.close();

	}

}
