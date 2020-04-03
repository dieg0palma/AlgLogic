#include <stdio.h>

int main(){

	float altura, pesoCerto;

	printf("Informe sua altura: ");
	fflush(stdout);
	scanf("%f", &altura);

	pesoCerto = (72.7 * altura) - 58;

	printf("Seu peso ideal seria de %.2f quilos.", pesoCerto);
}
