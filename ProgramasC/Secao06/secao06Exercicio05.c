#include <stdio.h>

int main(){

	float excesso = 0, peso = 0, multa;


	printf("Informe quantos quilos foram pescados hoje:");
	fflush(stdout);
	scanf("%f", &peso);

	if(peso > 50){
		excesso = peso - 50;
		multa = excesso * 4;
		printf("Voc� excedeu em %.3f quilos o limite pescado.\n", excesso);
		printf("O total pescado foi de %.3f quilos de peixe.\n", peso);
		printf("O valor a pagar de multa ser� de R$ %.2f.", multa);
	}

	else if(peso < 50) {
		printf("Seu total pescado de %.3f n�o ultrapassou o limite.\n", peso);
		printf("Por isso, o excedente � de %.3f quilo de peixe.\n", excesso);
		printf("Portanto, o valor de %.2f � referente a multa.", multa);
	}

}
