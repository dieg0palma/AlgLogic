#include <stdio.h>

int main(){
	int n1, n2, soma;

	printf("Digite o primeiro numero: ");
	fflush(stdout);
	scanf("%d", &n1);

	printf("Digite o segundo numero: ");
	fflush(stdout);
	scanf("%d", &n2);

	soma = n1 + n2;
	printf("Sua soma é %d", soma);
}
