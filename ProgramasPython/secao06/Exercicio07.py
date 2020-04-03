n1 = int(input("Insira o 1º número: "));
n2 = int(input("Insira o 2º número: "));
n3 = int(input("Insira o 3º número: "));
n4 = int(input("Insira o 4º número: "));

q1 = n1 ** 2;
q2 = n2 ** 2;
q3 = n3 ** 2;
q4 = n4 ** 2;

if q3 >= 1000:
    
    print("O quadrado de {0} é {1}.".format(n3, q3));
    
else:
    
    print("O quadrado de {0} é {1}.".format(n1, q1));
    print("O quadrado de {0} é {1}.".format(n2, q2));
    print("O quadrado de {0} é {1}.".format(n3, q3));
    print("O quadrado de {0} é {1}.".format(n4, q4));