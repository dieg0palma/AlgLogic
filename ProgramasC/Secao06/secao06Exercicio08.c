#include <stdio.h>

int main() {

	int num;

	printf("Digite um numero qualquer: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num == 0) {
		printf("O n�mero %d � neutro.", num);
	}

	else if (num % 2 == 0) {
		if (num > 0) {
			printf("O n�mero %d � par e positivo.", num);
		}
		else if (num < 0) {
			printf("O n�mero %d � par e negativo.", num);
		}
	}

	else if (num % 2 != 0) {
		if (num > 0) {
			printf("O n�mero %d � �mpar e positivo.", num);
		}
		else if (num < 0) {
			printf("O n�mero %d � �mpar e negativo.", num);
		}
	}

}
