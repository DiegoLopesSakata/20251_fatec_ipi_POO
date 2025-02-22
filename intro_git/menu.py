import calculadora

def entradaValores():
    a=int(input("Por favor, digite o primeiro numero da operacao: "))
    b=int(input("Digite o segundo numero: "))
    return a, b

def menu():
    menu = {}
    menu['1']="Somar"
    menu['2']="Subtrair"
    menu['3']="Multiplicar"
    menu['4']="Dividir"
    menu['5']="Sair do sistema"

    while True:
        options=sorted(menu.keys())

        for entry in options:
            print(entry, menu[entry])

        selection=input("Por favor, selecione uma opcao: ")
        match selection:
            case '1':
                a, b = entradaValores()
                print(calculadora.somar(a, b))
                print("\n")
            case '2':
                a, b = entradaValores()
                print(calculadora.subtrair(a, b))
                print("\n")
            case '3':
                a, b = entradaValores()
                print(calculadora.multiplicar(a, b))
                print("\n")
            case '4':
                a, b = entradaValores()
                print(calculadora.dividir(a, b))
                print("\n")