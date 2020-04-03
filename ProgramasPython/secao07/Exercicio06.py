consulta = int(input("Digite um nº para consultar a tabuada: "));

while consulta > 10 or consulta < 1:
    
    print("\nNão é possível consultar {0}, digite um nº válido.".format(consulta));
    consulta = int(input("Digite um nº para consultar a tabuada: "));
    
print("\nTabuada de {0}:\n".format(consulta));

for i in range(1,11):
    
    print("{0} x {1} = {2}".format(consulta, i,(consulta * i)));