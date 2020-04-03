#include <stdio.h>

int main() {

	int i;

	printf("Informe a idade do nadador: ");
	fflush(stdout);
	scanf("%d", &i);

	switch(i){

	case 1:
	case 2:
	case 3:
	case 4:

		printf("Ainda não há categoria para essa idade.");
		break;

	case 5:
	case 6:
	case 7:

		printf("Atleta pertencente à categoria Infantil A.");
		break;

	case 8:
	case 9:
	case 10:
	case 11:

		printf("Atleta pertencente à categoria Infantil B.");
		break;

	case 12:
	case 13:

		printf("Atleta pertencente à categoria Juvenil A.");
		break;

	case 14:
	case 15:
	case 16:
	case 17:

		printf("Atleta pertencente à categoria Juvenil B.");
		break;

	default:

		printf("Atleta pertencente à categoria Adulto.");
		break;
	}

}
