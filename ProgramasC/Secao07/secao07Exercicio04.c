#include <stdio.h>

int main() {

	int valor, maior = -999, menor = 999, soma;
	float media;

	for(int i = 0; i < 10 ; i++) {
		printf("Digite um n�: ");
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
	printf("O maior n� � %d.\n",maior);
	printf("O menor n� � %d.\n",menor);
	printf("O valor m�dio dos n� � de %.2f.\n",media);

}
