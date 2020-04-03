#include <stdio.h>

int main(){

	int num, a, b;

	printf("Escolha um número: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num > 0){
		a = num;
		printf("O número %d é positivo.", a);
	} else if(num < 0){
		b = num;
		printf("O número %d é negativo.", b);
	} else {
		printf("O número %d é neutro.", num);
	}

}
