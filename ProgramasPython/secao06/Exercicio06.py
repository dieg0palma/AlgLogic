hora = 10;
excedente = 20;
e = 0;

c = input("Informe o código do funcionário: ")
n = int(input("Insira o nº de horas trabalhadas: "))

if n > 50:
    
    e = (n - 50) * excedente;
    salario = (50 * hora) + e;
    print("Salário total: R${0:.2f}.".format(salario))
    print("Salário excedente: R${0:.2f}.".format(e))
    
else:
    
    salario = n * hora;
    print("Salário total: R${0:.2f}.".format(salario))
    print("Salário excedente: R${0:.2f}.".format(e))