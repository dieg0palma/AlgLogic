horas   =   int(input("Digite o total de horas que você trabalhou neste mês: "));
valor   =   float(input("Informe o valor ganho por hora trabalhada: "));
salario =   (horas * valor);

print("O salário ganho neste mês é de R${0:.2f}.".format(salario));