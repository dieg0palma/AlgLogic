#include <stdio.h>

int main(){
	int hrsJob;
	float valorHrs, salario;

	printf("Digite o valor que voc� ganha por hora: ");
	fflush(stdout);
	scanf("%f", &valorHrs);

	printf("Digite o valor de horas que voc� trabalhou no m�s: ");
	fflush(stdout);
	scanf("%d", &hrsJob);

	salario = (hrsJob * valorHrs);

	printf("Este m�s, voc� receber� R$ %.2f", salario);
}
