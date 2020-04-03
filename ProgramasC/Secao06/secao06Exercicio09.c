#include <stdio.h>

int main() {

	float indice;

	printf("Informe o valor do índice de poluição atual: ");
	fflush(stdout);
	scanf("%f", &indice);

	if (indice >= 0.3 && indice < 0.4) {
		printf("Suspender atividades das empresas do grupo 1.");
	}

	else if (indice >= 0.4 && indice < 0.5) {
		printf("Suspender atividades das empresas dos grupos 1 e 2.");

	}

	else if (indice >= 0.5) {
		printf("Suspender atividades de todas as empresas.");
	}

	else {
		printf("Niveis de poluição aceitáveis");
	}

}
