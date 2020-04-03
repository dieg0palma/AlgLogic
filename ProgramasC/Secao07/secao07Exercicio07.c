#include <stdio.h>

int main(){

	int mouse, def1, def2, def3, def4, idMouse, defeito;
	float pct1, pct2, pct3, pct4;

	printf("Informe o id do mouse: ");
	fflush(stdout);
	scanf("%d",idMouse);

	while(idMouse != 0) {

		printf("1- Necessita de esfera.\n");
		printf("2- Necessita de limpeza.\n");
		printf("3- Necessita de troca do cabo.\n");
		printf("4- Quebrado.\n");
		printf("\nInforme o defeito apresentado: ");
		fflush(stdout);
		scanf("%d",defeito);

		switch(defeito){
		case 1:

			def1 = def1 + 1;
			break;

		case 2:

			def2 = def2 + 1;
			break;

		case 3:

			def3 = def3 + 1;
			break;

		case 4:

			def4 = def4 + 1;
			break;

		default:

			printf("Código inválido, insira um código existente.\n");
			printf("\n Informe o defeito apresentado: ");
			fflush(stdout);
			scanf("%d",defeito);
			break;

		}
		mouse++;
		printf("Informe o id do mouse: ");
		fflush(stdout);
		scanf("%d",idMouse);

	}

	pct1 = (def1 * 100) / mouse;
	pct2 = (def2 * 100) / mouse;
	pct3 = (def3 * 100) / mouse;
	pct4 = (def4 * 100) / mouse;

	printf("A quantidade total de mouses é de %d.\n", mouse);
	printf("Código			Quantidade			Percentual.\n");
	printf("1- Necessita de esfera.			%d			%.2f%%\n", def1, pct1);
	printf("2- Necessita de limpeza.			%d			%.2f%%\n", def2, pct2);
	printf("3- Necessita de troca do cabo.	%d			%.2f%%\n", def3, pct3);
	printf("4- Quebrado.			%d			%.2f%%", def4, pct4);

}
