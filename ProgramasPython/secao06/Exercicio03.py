num = int(input("Digite um número: "));

if num % 2 == 0:
    
    p = num;
    i = 0;
    
elif num % 2 != 0:
    
    i = num;
    p = 0;

print("\nO valor do nº par é {0} e o nº ímpar é {1}.".format(p, i));