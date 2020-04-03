#include <stdio.h>
#include <string.h>

int main() {

	char nome[100], senha[100];

	printf("Digite seu nome: ");
	fflush(stdout);
	gets(nome);
	printf("Digite sua senha: ");
	fflush(stdout);
	gets(senha);

	while (!strcmp(nome, senha)) {
		printf("Nome e senha precisam ser diferentes!\n");
		printf("Digite seu nome: ");
		fflush(stdout);
		gets(nome);
		printf("Digite sua senha: ");
		fflush(stdout);
		gets(senha);
	}

	printf("Os dados conferem, acesso autorizado.");
}
