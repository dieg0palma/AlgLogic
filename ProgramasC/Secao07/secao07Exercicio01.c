#include <stdio.h>

int main() {

	int num, maior = 0;

	printf("Informe um n�mero: ");
	fflush(stdout);
	scanf("%d", &num);

	while(num != 0) {
		if (num > maior){
			maior = num;
		}
		printf("Informe um n�mero: ");
		fflush(stdout);
		scanf("%d", &num);
	}
	printf("O maior n�mero digitado por voc� foi %d.", maior);
}
