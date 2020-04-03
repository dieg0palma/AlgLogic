#include <stdio.h>

int main() {

	int vetor1[10], vetor2[10], soma[10];

	for (int i = 0; i < 10; i++) {

		printf("Insira um número no primeiro vetor: ");
		fflush(stdout);
		scanf("%d", &vetor1[i]);
		printf("Insira um número no segundo vetor: ");
		fflush(stdout);
		scanf("%d", &vetor2[i]);

		soma[i] = (vetor1[i] + vetor2[i]);

	}

	for (int i = 0; i < 10; i++) {

		printf("A soma dos vetores da posição %d é %d \n", i, soma[i]);

	}

}
