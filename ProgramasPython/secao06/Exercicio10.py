idade = int(input("Insira a idade do nadador: "));

if idade >= 5 and idade <= 7:
    
    print("O nadador pertence a categoria Infantil A.");

elif idade >= 8 and idade <= 11:
    
    print("O nadador pertence a categoria Infantil B.");
    
elif idade >= 12 and idade <= 13:
    
    print("O nadador pertence a categoria Juvenil A.");

elif idade >= 14 and idade <= 17:
    
    print("O nadador pertence a categoria Juvenil B.");
    
elif idade >= 18:
    
    print("O nadador pertence a categoria Adulto.");
    
else:
    
    print("Não existe ainda uma categoria para essa idade.");