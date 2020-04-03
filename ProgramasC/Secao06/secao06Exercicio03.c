#include <stdio.h>

int main(){
	int p = 0, i = 0, num;

	printf("Escolha um número: ");
	fflush(stdout);
	scanf("%d", &num);

	if (num % 2 == 0) {
		p = num;
	} else {
		i = num;
	}
	printf("%d\n", p);
	printf("%d", i);
}
