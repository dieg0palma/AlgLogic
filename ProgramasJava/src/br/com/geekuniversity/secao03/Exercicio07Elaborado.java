package br.com.geekuniversity.secao03;

import java.math.*;
import java.util.*;

public class Exercicio07Elaborado {

	public static void main(String[] args) {
		
		float altura, ideal, peso;
		BigDecimal bPeso, bIdeal;
		
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe sua altura: ");
		altura	= tela.nextFloat();
		
		System.out.println("Informe seu peso atual: ");
		peso	= tela.nextFloat();
		bPeso	= new BigDecimal(peso).setScale(2, RoundingMode.HALF_EVEN);

		ideal	= (float) ((72.7 * altura) - 58);
		bIdeal	= new BigDecimal(ideal).setScale(2, RoundingMode.HALF_EVEN);		
		
		if (bPeso.floatValue() > bIdeal.floatValue()) {
			
			float difere = bPeso.floatValue() - bIdeal.floatValue();
			System.out.printf("%nSeu peso ideal � de %.2f quilos.",			bIdeal);
			System.out.printf("%nSeu peso atual � de %.2f quilos.",			bPeso);
			System.out.printf("%nVoc� possui %.2f quilos do recomendado.",	difere);
			
		} else if (bPeso.floatValue() < bIdeal.floatValue()) {
			
			float difere = bPeso.floatValue() - bIdeal.floatValue();
			System.out.printf("%nSeu peso ideal � de %.2f quilos.",			bIdeal);
			System.out.printf("%nSeu peso atual � de %.2f quilos.",			bPeso);
			System.out.printf("%nVoc� possui %.2f quilos do recomendado.",	difere);
			
		} else {
			
			System.out.println("\nParab�ns, voc� est� dentro do peso recomendado.");
			
		}
		
		tela.close();

	}

}
