rato = 0; def1 = 0; def2 = 0; def3 = 0; def4 = 0; pct1 = 0; pct2 = 0; pct3 = 0; pct4 = 0;
rata = int(input("Informe o id do mouse: "));

while rata != 0:
    
    print("1 - Necessita de esfera");
    print("2 - Necessita de limpeza");
    print("3 - Necessita de troca de cabo");
    print("4 - Quebrado");
    defeito = int(input("\nInforme o defeito apresentado ( 1 / 2 / 3 / 4 ): "));
    
    if defeito == 1:
        
        def1 = def1 + 1;
        
    elif defeito == 2:
    
        def2 = def2 + 1;
        
    elif defeito == 3:
        
        def3 = def3 + 1;
        
    elif defeito == 4:        

        def4 = def4 + 1;

    else:
        
        print("Código do defeito inválido, insira um código existente.\n");
        defeito = int(input("\nInforme o defeito apresentado ( 1 / 2 / 3 / 4 ): "));
        
    rato = rato + 1;
    rata = int(input("Informe o id do mouse: "));
    
pct1 = (def1 * 100) / rato;
pct2 = (def2 * 100) / rato;
pct3 = (def3 * 100) / rato;
pct4 = (def4 * 100) / rato;

print("\nA quantidade total de mouses é de {0}.\n".format(rato))
print("Código                          Quantidade       Percentual")
print(" 1 - Necessita de esfera           {0}               {1:.2f}%".format(def1,pct1))
print(" 2 - Necessita de limpeza          {0}               {1:.2f}%".format(def2,pct2))
print(" 3 - Necessita de troca de cabo    {0}               {1:.2f}%".format(def3,pct3))
print(" 4 - Quebrado                      {0}               {1:.2f}%".format(def4,pct4))