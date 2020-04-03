#include <stdio.h>

int main() {

	int valor, maior = -999, menor = 999, soma;
	float media;

	for(int i = 0; i < 10 ; i++) {
		printf("Digite um nº: ");
		fflush(stdout);
		scanf("%d", &valor);

		if(valor > 0) {

			if(valor > maior) {

				maior = valor;

			}
			if(valor < menor) {

				menor = valor;

			}

			soma = soma + valor;

		}
		else {
			i--;
		}

	}

	media = soma / 10;
	printf("O maior nº é %d.\n",maior);
	printf("O menor nº é %d.\n",menor);
	printf("O valor médio dos nº é de %.2f.\n",media);

}
