#include <stdio.h>

int main() {

	int num, maior = 0;

	printf("Informe um número: ");
	fflush(stdout);
	scanf("%d", &num);

	while(num != 0) {
		if (num > maior){
			maior = num;
		}
		printf("Informe um número: ");
		fflush(stdout);
		scanf("%d", &num);
	}
	printf("O maior número digitado por você foi %d.", maior);
}
