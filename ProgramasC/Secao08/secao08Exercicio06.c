#include <stdio.h>

int main() {

	float num, vetor[5];
	int codigo;

	printf("Informe um dos c�digos (0/1/2): ");
	fflush(stdout);
	scanf("%d", &codigo);

	if(codigo != 0) {

		for(int i = 0; i < 5; i++){

			printf("Informe um n�mero real: ");
			fflush(stdout);
			scanf("%f", &num);
			vetor[i] = num;
		}

		if (codigo == 1) {

			for(int i = 0; i < 5; i++){

				printf("O n�mero %.2f est� na posi��o %d do vetor.\n", vetor[i], i);

			}
		}

		else if (codigo == 2) {

			for(int i = 4; i >= 0; i--){

				printf("O n�mero %.2f est� na posi��o %d do vetor.\n", vetor[i], i);

			}
		}
	}

}
