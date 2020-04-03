package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int codigo;
		float hora, salario, excedente = 0, valor = 10;
		Scanner tela = new Scanner (System.in); 
		
		System.out.println("Informe o c�digo do funcion�rio: ");
		codigo	=	tela.nextInt();
		
		System.out.println("Informe o total de horas trabalhadas: ");
		hora	=	tela.nextFloat();
		
		if(hora > 50) {
			
			excedente	=	((hora - 50) * 20);
			salario		=	((50 * valor) + excedente);
			System.out.printf("%nC�digo do funcion�rio consultado: %d",	codigo);
			System.out.printf("%nSal�rio a ser pago: R$%.2f",			salario);
			System.out.printf("%nSal�rio excedente a ser pago:R$%.2f",	excedente);
			
		} else {
			
			salario = (hora * valor);
			System.out.printf("%nC�digo do funcion�rio consultado: %d",	codigo);
			System.out.printf("%nSal�rio a ser pago: R$%.2f",			salario);
			System.out.printf("%nSal�rio excedente a ser pago:R$%.2f",	excedente);
			
		}
		
		tela.close();
		
	}

}
