package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {

		float altura, ideal;
		char sexo;
		
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura	= tela.nextFloat();
		
		System.out.println("Informe sua orientação sexual (m/f): ");
		sexo = tela.next().charAt(0);
		
		if (sexo == 'm' || sexo == 'M') {

			ideal	= (float) ((72.7 * altura) - 58);
			System.out.printf("%nSeu peso ideal é de %.2f quilos.", ideal);
			
		} else if (sexo == 'f' || sexo == 'F') {
			
			ideal	= (float) ((62.1 * altura) - 44.7);
			System.out.printf("%nSeu peso ideal é de %.2f quilos.", ideal);
			
		} else {
			
			System.out.println("\nNão foi possível verificar, tente novamente.");
			
		}
		
		tela.close();

	}
	
}
