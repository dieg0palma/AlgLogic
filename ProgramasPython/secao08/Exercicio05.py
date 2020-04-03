vetor = []
maior = False;

for n in range(0, 10):
    
    numero = int(input("Digite um nº: "));
    vetor.append(numero);

for n in vetor:
    
    if n > 50:
        
        print("O nº {0} está na posição {1} do vetor.".format(n,vetor.index(n)));
        maior = True;

if maior == False:
    
    print("Não há nenhum nº maior de 50.")    