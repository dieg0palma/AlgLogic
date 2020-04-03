package	br.com.geekuniversity.secao08;

import	java.util.*;

public class Exercicio06 {

	public static void main(String[] args) {
		
		float[] vetor = new float[5];
		int codigo;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Informe o código (0/1/2):");
		codigo = tela.nextInt();
		
		if(codigo >= 1 && codigo <= 2) {
			
			for(int i = 0; i < 5; i++) {
				
				System.out.println("Digite um nº:");
				vetor[i] = tela.nextFloat();
				
			}
			
			if(codigo == 1) {
				
				for(int i = 0; i < 5; i++) {
					
					System.out.printf("%nNa posição %d, o nº %.2f.", i, vetor[i]);
					
				}
				
			}
			
			if(codigo == 2) {
				
				for(int i = (vetor.length - 1); i >=0; i--) {
					
					System.out.printf("%nNa posição %d, o nº %.2f.", i, vetor[i]);
					
				}
				
			}
			
		}
		
		tela.close();
		
	}

}
