#include <stdio.h>

int main(){
	int minimo, maximo;
	float estoque;

	printf("Informe a quantidade m�nima no estoque: ");
	fflush(stdout);
	scanf("%d", &minimo);

	printf("Informe a quantidade m�xima no estoque: ");
	fflush(stdout);
	scanf("%d", &maximo);

	estoque = (minimo + maximo) / 2;
	printf("O tamanho do estoque m�dio � de %f", estoque);
}
