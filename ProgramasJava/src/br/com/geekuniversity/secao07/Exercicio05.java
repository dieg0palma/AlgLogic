package br.com.geekuniversity.secao07;

import java.util.*;

public class Exercicio05 {

	public static void main(String[] args) {
		
		String nome, senha;
		Scanner tela = new Scanner(System.in);
		
		System.out.println("Insira o nome de usuário: ");
		nome	=	tela.next();
		
		System.out.println("Insira a senha de usuário: ");
		senha	=	tela.next();
		
		while(nome.equals(senha)) {
			System.out.println("Nome e senha devem ser diferentes. Tente novamente.");
			
			System.out.println("Insira o nome de usuário: ");
			nome	=	tela.next();
			
			System.out.println("Insira a senha de usuário: ");
			senha	=	tela.next();			
			
		}
		
		tela.close();
		
	}

}
