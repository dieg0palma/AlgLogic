#include <stdio.h>

int main(){
	int hrsJob;
	float valorHrs, salario;

	printf("Digite o valor que você ganha por hora: ");
	fflush(stdout);
	scanf("%f", &valorHrs);

	printf("Digite o valor de horas que você trabalhou no mês: ");
	fflush(stdout);
	scanf("%d", &hrsJob);

	salario = (hrsJob * valorHrs);

	printf("Este mês, você receberá R$ %.2f", salario);
}
