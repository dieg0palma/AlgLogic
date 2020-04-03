nome = input("Digite o nome de usuário: ");
senha = input("\nDigite a senha: ");

while nome == senha:
    
    print("\nNome e senha não podem ser iguais.");
    nome = input("Digite o nome de usuário: ");
    senha = input("\nDigite a senha: ");