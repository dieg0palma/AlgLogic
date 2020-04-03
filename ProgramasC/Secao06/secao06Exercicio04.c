#include <stdio.h>
#include <ctype.h>

int main(){

	float altura, peso;
	char sexo;

	printf("Informe sua altura: ");
	fflush(stdout);
	scanf("%f", &altura);
	gets(stdin);
	printf("Informe seu sexo (m/f): ");
	fflush(stdout);
	scanf("%c", &sexo);

	if (tolower(sexo) == 'm'){
		peso = (72.7 * altura) - 58;
		printf("Para quem possui %.2f metros, o peso ideal é de "
				"%.2f quilos.", altura, peso);
	}

	else if (tolower(sexo) == 'f') {
		peso = (62.1 * altura) - 44.7;
		printf("Para quem possui %.2f metros, o peso ideal é de "
				"%.2f quilos.",	altura, peso);
	}

	else{
		printf("Não possuimos informações para o seu caso.");
	}

}
