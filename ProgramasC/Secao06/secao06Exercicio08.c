#include <stdio.h>

int main() {

	int num;

	printf("Digite um numero qualquer: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num == 0) {
		printf("O número %d é neutro.", num);
	}

	else if (num % 2 == 0) {
		if (num > 0) {
			printf("O número %d é par e positivo.", num);
		}
		else if (num < 0) {
			printf("O número %d é par e negativo.", num);
		}
	}

	else if (num % 2 != 0) {
		if (num > 0) {
			printf("O número %d é ímpar e positivo.", num);
		}
		else if (num < 0) {
			printf("O número %d é ímpar e negativo.", num);
		}
	}

}
