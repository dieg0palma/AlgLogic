#include <stdio.h>
//std significa standard
//io significa input/output

int main(){
	//declaração das variáveis
	int num1, num2, soma, mult;

	//entradas
	printf("Digite o primeiro número: ");
	fflush(stdout);
	scanf("%d", &num1);

	printf("Digite o segundo número: ");
	fflush(stdout);
	scanf("%d", &num2);

	//processamento
	soma = num1+num2;
	mult = soma*num1;

	//saída
	printf("O resultado é %d", mult);
}
