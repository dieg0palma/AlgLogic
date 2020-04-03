#include <stdio.h>

int main() {

	int i;

	printf("Informe a idade do nadador: ");
	fflush(stdout);
	scanf("%d", &i);

	if (i >=5 && i <=7){

		printf("Infantil A é para quem possui %d anos.", i);

	}

	else if (i >=8 && i <=11) {

		printf("Infantil B é para quem possui %d anos.", i);

	}

	else if (i >=12 && i <=13) {

		printf("Juvenil A é para quem possui %d anos.", i);

	}

	else if (i >=14 && i <=17) {

		printf("Juvenil B é para quem possui %d anos.", i);

	}

	else if (i >=18) {

		printf("Adulto é para quem possui %d anos.", i);

	}

	else {

		printf("Ainda não há uma categoria para essa idade.");

	}

}
