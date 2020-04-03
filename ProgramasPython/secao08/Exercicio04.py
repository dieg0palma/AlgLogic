vetor = [];
somar = 0;

for i in range(0,20):
    
    n = int(input("Insira o {0}º número no vetor: ".format(i+1)));
    vetor.append(n);
    somar = somar + n;
    
print("A soma de todos os valores do vetor é {0}".format(somar))