#include <stdio.h>

int main(){

	int num, a, b;

	printf("Escolha um n�mero: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num > 0){
		a = num;
		printf("O n�mero %d � positivo.", a);
	} else if(num < 0){
		b = num;
		printf("O n�mero %d � negativo.", b);
	} else {
		printf("O n�mero %d � neutro.", num);
	}

}
