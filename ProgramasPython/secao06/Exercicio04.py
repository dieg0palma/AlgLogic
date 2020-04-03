altura  =   float(input("Informe sua altura: "));
sexo    =   input("Informe seu sexo (m/f): ");

if sexo.upper() == "M":
    
    peso = ((72.7 * altura) - 58);
    
elif sexo.upper() == "F":
    
    peso = ((62.1 * altura) - 44.7);

print("O seu peso ideal é de {0:.2f} quilos.".format(peso))