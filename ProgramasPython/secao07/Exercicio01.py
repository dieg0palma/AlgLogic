maior = 0;
tela = int(input("Insira um nº na tela: "));

while tela != 0:
    
    if tela > maior:
        
        maior = tela;
        
    tela = int(input("Insira um nº na tela: "));

print("O maior nº é {0}.".format(maior));