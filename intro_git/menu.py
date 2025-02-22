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