package br.com.geekuniversity.secao03;

import java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		
		int hrs;
		float valor, salario;
		Scanner tela = new Scanner(System.in);
				
		System.out.println("Informe o valor do salário ganho por hora: ");
		valor = tela.nextFloat();
		
		System.out.println("Informe o total de horas trabalhadas no mês: ");
		hrs = tela.nextInt();
		
		salario = (valor * hrs);
		
		System.out.println("Este mês, o salário recebido será de R$" + salario);
		
		tela.close();
		
	}

}
