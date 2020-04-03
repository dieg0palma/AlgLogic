soma = 0; media = 0; maior = -999; menor = 999;

for i in range(1, 11, 1):
    
    valor = int(input("Digite um nº: "));
    
    if valor > 0:
        
        if valor > maior:
            
            maior = valor;
        
        if valor < menor:
            
            menor = valor;
            
        soma = soma + valor;
        
    else:
        
        valor = int(input("Digite um nº: "));
        
media = soma / 10;
print("O maior nº digitado foi {0}.".format(maior));
print("O menor nº digitado foi {0}.".format(menor));
print("A média dos valores digitados foi {0:.2f}.".format(media));