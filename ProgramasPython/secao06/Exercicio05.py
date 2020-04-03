excesso = 0;
multa   = 0;

peso = float(input("Informe o total de peixe pescado:"));

if peso > 50:
    
    excesso = peso - 50;
    multa = excesso * 4;
    
print("\nO total pescado foi de {0:.3f} quilos.".format(peso));
print("Excendente pescado: {0:.3f} quilos.".format(excesso));
print("Multa a ser paga: R${0:.2f}.".format(multa));