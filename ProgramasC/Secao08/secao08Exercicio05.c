#include <stdio.h>

int main(){

	int vetor[10], maior = 0;

	for (int i = 0; i < 10; i++) {
		printf("Insira o %d� n�mero do vetor: ", (i + 1));
		fflush(stdout);
		scanf("%d", &vetor[i]);
	}

	for(int i = 0; i < 10; i++) {
		if(vetor[i] > 50) {
		printf("O n� %d est� na posi��o %d do vetor.\n", vetor[i], i);
		maior = 1;
		}
	}

	if(maior < 1) {
		printf("N�o foi inserido nenhum n� acima de 50.");
	}

}
