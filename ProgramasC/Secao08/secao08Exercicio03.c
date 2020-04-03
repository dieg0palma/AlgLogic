#include <stdio.h>

int main() {

	int vetor[10];

	for (int i = 0; i < 10; i++) {

		printf("Insira um número no vetor: ");
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	for (int i = 0; i < 10; i++) {

		printf("O número %d está na posição %d do vetor. \n", vetor[i], i);

	}

}
