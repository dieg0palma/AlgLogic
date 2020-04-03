invertido = []

for i in range(0,10):
    
    num = int(input("Insira um número no vetor: "));
    invertido.append(num);
    
invertido.reverse();

for n in invertido:
    print(n);