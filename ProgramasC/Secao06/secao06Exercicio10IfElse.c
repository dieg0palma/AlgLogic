#include <stdio.h>

int main() {

	int i;

	printf("Informe a idade do nadador: ");
	fflush(stdout);
	scanf("%d", &i);

	if (i >=5 && i <=7){

		printf("Infantil A � para quem possui %d anos.", i);

	}

	else if (i >=8 && i <=11) {

		printf("Infantil B � para quem possui %d anos.", i);

	}

	else if (i >=12 && i <=13) {

		printf("Juvenil A � para quem possui %d anos.", i);

	}

	else if (i >=14 && i <=17) {

		printf("Juvenil B � para quem possui %d anos.", i);

	}

	else if (i >=18) {

		printf("Adulto � para quem possui %d anos.", i);

	}

	else {

		printf("Ainda n�o h� uma categoria para essa idade.");

	}

}
