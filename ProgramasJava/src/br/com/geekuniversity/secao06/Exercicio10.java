package br.com.geekuniversity.secao06;

import java.util.*;

public class Exercicio10 {

	public static void main(String[] args) {
		
		int i;
		Scanner tela	=	new Scanner(System.in);
		
		System.out.println("Informe a idade do nadador: ");
		i	=	tela.nextInt();
		
		if(i	>=	5	&&	i	<=	7) {
			
			System.out.printf("%nQuem possui %d anos é recomendada a categoria Infantil A.", i);
			
		}
		
		else if(i	>=	8	&&	i	<=	11) {
			
			System.out.printf("%nQuem possui %d anos é recomendada a categoria Infantil B.", i);			
			
		}

		else if(i	>=	12	&&	i	<=	13) {
			
			System.out.printf("%nQuem possui %d anos é recomendada a categoria Juvenil A.", i);
			
		}
		
		else if(i	>=	14	&&	i	<=	17) {
			
			System.out.printf("%nQuem possui %d anos é recomendada a categoria Juvenil B.", i);			
			
		}
		
		else if(i	>=	18) {
			
			System.out.printf("%nQuem possui %d anos é recomendada a categoria Adulto.", i);
			
		}
		
		else {
			
			System.out.printf("%nQuem possui %d anos ainda não possui uma categoria própria.", i);
			
		}
		tela.close();
		
	}

}
