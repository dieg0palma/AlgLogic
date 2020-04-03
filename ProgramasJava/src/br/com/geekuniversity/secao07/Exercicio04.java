package br.com.geekuniversity.secao07;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		
		int valor, maior = -999, menor = 999;
		float soma = 0, media = 0;
		Scanner tela = new Scanner (System.in);
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Digite um número: ");
			valor = tela.nextInt();
			
			if(valor >= 0) {
				
				if(valor > maior) {
				
					maior = valor;
					
				}
				
				if(valor < menor) {
					
					menor = valor;
					
				}
				
				soma	=	soma	+	valor;
				
			}
			
			else {
				
				i--;
				
			}
			
		}
		
		media	=	(float) (soma	/	10);
		System.out.printf("%nO maior nº digitado é %d.",			maior);
		System.out.printf("%nO menor nº digitado é %d.",			menor);
		System.out.printf("%nA média dos números digitados é %.2f.",media);
		
		tela.close();
		
	}

}
