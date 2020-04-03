#include <stdio.h>

int main() {

	int vetor[5], par[5], c = 0;

	for(int i = 0; i < 5; i++){

		printf("Insira um número no vetor: ");
		fflush(stdout);
		scanf("%d", &vetor[i]);

		if(vetor[i] % 2 == 0) {
			if(vetor[i] > 0){
				par[c] = vetor[c];
				c = c + 1;
			}

		}

	}
	for (int i = 0; i < c; i++) {

		printf("Os números pares, pertencentes ao vetor, são: \n %d \n", par[i]);

	}
}
