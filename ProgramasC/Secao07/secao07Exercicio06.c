#include <stdio.h>

int main() {

	int n, r;

	printf("*************************\n");
	printf("* Consultando a tabuada *\n");
	printf("*************************\n\n");
	printf("Informe o n�mero que deseja consultar:");
	fflush(stdout);
	scanf("%d", &n);

	while(n >10 || n < 1){
		printf("Esse n�mero n�o pode ser consultado, tente novamente.\n");
		printf("\nInforme o n�mero que deseja consultar:");
		fflush(stdout);
		scanf("%d", &n);
	}

	printf("Tabuada de %d\n", n);

	for(int i = 0;i <= 10; i++){
		r = (n * i);
		printf("%d x %d = %d\n", n, i, r);
	}

}
