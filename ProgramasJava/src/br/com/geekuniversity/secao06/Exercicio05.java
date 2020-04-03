package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {
		
		float peso, excesso, multa;
		Scanner tela = new Scanner (System.in);
		
		System.out.println("Informe a quantidade de peixe pescado: ");
		peso = tela.nextFloat();
		
		if(peso > 50) {
			
			excesso	=	(peso - 50);
			multa	=	(excesso * 4);
			
			System.out.printf("%nVoce pescou o total de %.3f quilos.",	peso);
			System.out.printf("%nLogo, excedeu em %.3f o total permitido.",	excesso);
			System.out.printf("%nPortanto, o valor da multa é de R$%.2f.",	multa);
			
		} else {
			
			excesso	=	0;
			multa	=	0;
			
			System.out.printf("%nVoce pescou o total de %.3f quilos.",	peso);
			System.out.printf("%n Logo, %.3f não excede o permitido.",		excesso);
			System.out.printf("%nPortanto, o valor da multa é de R$%.2f.",	multa);
			
		}
		
		tela.close();
		
	}

}
