#include <stdio.h>

int main() {

	int n1, n2, n3, n4, q1, q2, q3, q4;

	printf("Informe o primeiro n�mero:");
	fflush(stdout);
	scanf("%d", &n1);
	printf("Informe o segundo n�mero:");
	fflush(stdout);
	scanf("%d", &n2);
	printf("Informe o terceiro n�mero:");
	fflush(stdout);
	scanf("%d", &n3);
	printf("Informe o quarto n�mero:");
	fflush(stdout);
	scanf("%d", &n4);

	q1 = n1 * n1;
	q2 = n2 * n2;
	q3 = n3 * n3;
	q4 = n4 * n4;

	if (q3 >= 1000) {

		printf("O valor do quadrado de %d � %d.", n3, q3);

	}

	else {

		printf("O valor do quadrado de %d � %d.\n", n1, q1);
		printf("O valor do quadrado de %d � %d.\n", n2, q2);
		printf("O valor do quadrado de %d � %d.\n", n3, q3);
		printf("O valor do quadrado de %d � %d.", n4, q4);

	}

}
