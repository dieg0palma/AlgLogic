vetor1 = []
vetor2 = []
soma   = []

for n in range(1, 11):
    
    valor1 = int(input("Digite um nº para o 1º vetor: "));
    vetor1.append(valor1);
    valor2 = int(input("Digite um nº para o 2º vetor: "));
    vetor2.append(valor2);
    
    soma.append(valor1 + valor2);

for s in soma:
    print(s); 