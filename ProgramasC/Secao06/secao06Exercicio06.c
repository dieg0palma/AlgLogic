#include <stdio.h>

int main(){

	int codigo;
	float hrsTrab, excedente = 0, salario, vlrHr = 10.00;

	printf("Informe o c�digo: ");
	fflush(stdout);
	scanf("%d", &codigo);
	printf("Informe a quantidade de horas trabalhadas: ");
	fflush(stdout);
	scanf("%f", &hrsTrab);

	if(hrsTrab > 50){
		excedente = (hrsTrab - 50) * 20.00;
		salario = (50 * vlrHr) + excedente;
		printf("Seu sal�rio total � de R$ %.2f.\n", salario);
		printf("O valor do sal�rio excedente � de R$ %.2f.", excedente);
	} else {
		salario = hrsTrab * vlrHr;
		printf("Seu sal�rio total � de R$ %.2f.\n", salario);
		printf("O valor do sal�rio excedente � de R$ %.2f.", excedente);
	}

}
