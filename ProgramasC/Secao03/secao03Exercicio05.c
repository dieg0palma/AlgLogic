#include <stdio.h>

int main(){

	float cms, mts;

	printf("Digite o valor, em metros: ");
	fflush(stdout);
	scanf("%f", &mts);

	cms = (mts * 100);

	printf("%.2f metros em centimetros é o total de %.2f", mts, cms);
}
