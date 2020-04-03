#include <stdio.h>

int main() {

	int vetor[20], soma = 0;

	for (int i = 0; i < 20; i++) {

		printf("Insira o %dº número do vetor: ", (i + 1));
		fflush(stdout);
		scanf("%d", &vetor[i]);
		soma = soma + vetor[i];

	}

	printf("A soma de todos os itens do vetor é %d. \n", soma);

}
