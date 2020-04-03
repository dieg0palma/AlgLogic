#include <stdio.h>

int main(){
	int minimo, maximo;
	float estoque;

	printf("Informe a quantidade mínima no estoque: ");
	fflush(stdout);
	scanf("%d", &minimo);

	printf("Informe a quantidade máxima no estoque: ");
	fflush(stdout);
	scanf("%d", &maximo);

	estoque = (minimo + maximo) / 2;
	printf("O tamanho do estoque médio é de %f", estoque);
}
