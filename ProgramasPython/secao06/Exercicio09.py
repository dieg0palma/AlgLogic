poluicao = float(input("Insira o índice de poluição: "));

if poluicao < 0.3:
    
    print("Valores toleráveis.")

elif poluicao >= 0.3 and poluicao < 0.4:
    
    print("Suspender atividades das empresas do grupo 1.");
    
elif poluicao >= 0.4 and poluicao < 0.5:
    
    print("Suspender atividades das empresas dos grupos 1 e 2.");
    
elif poluicao >= 0.5:
    
    print("Suspender atividades de todas as empresas.");