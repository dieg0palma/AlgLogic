#include <stdio.h>

int main(){

	int vetor[10], maior = 0;

	for (int i = 0; i < 10; i++) {
		printf("Insira o %dº número do vetor: ", (i + 1));
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	for(int i = 0; i < 10; i++) {
		if(vetor[i] > 50) {
		printf("O nº %d está na posição %d do vetor.\n", vetor[i], i);
		maior = 1;
		}
	}

	if(maior < 1) {
		printf("Não foi inserido nenhum nº acima de 50.");
	}

}
