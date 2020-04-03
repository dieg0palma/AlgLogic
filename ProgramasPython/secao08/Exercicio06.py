vetor = []

codigo = int(input("Digite o código ( 0 / 1 / 2 ): "));

if codigo != 0:
    
    for n in range(0,5):
        
        num = float(input("Digite um nº real: "));
        vetor.append(num);
    
    if codigo == 1:
        
        for n in vetor:
            print(n);
            
    if codigo == 2:
        
        vetor.reverse();
        
        for n in vetor:
            
            print(n);