numero = int(input("Insira um nº inteiro: "));

if numero == 0:
    
    print("O nº digitado é neutro.");
    
elif numero % 2 == 0:
    
    if numero > 0:
        
        print("O nº {0} é par e positivo.".format(numero))
        
    else:
        
        print("O nº {0} é par e negativo.".format(numero))
        
else:
    
    if numero > 0:
        
        print("O nº {0} é ímpar e positivo.".format(numero))
        
    else:
        
        print("O nº {0} é ímpar e negativo.".format(numero))
    