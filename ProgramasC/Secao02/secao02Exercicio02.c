#include <stdio.h>
//std significa standard
//io significa input/output

int main(){
	//declara��o das vari�veis
	int num1, num2, soma, mult;

	//entradas
	printf("Digite o primeiro n�mero: ");
	fflush(stdout);
	scanf("%d", &num1);

	printf("Digite o segundo n�mero: ");
	fflush(stdout);
	scanf("%d", &num2);

	//processamento
	soma = num1+num2;
	mult = soma*num1;

	//sa�da
	printf("O resultado � %d", mult);
}
