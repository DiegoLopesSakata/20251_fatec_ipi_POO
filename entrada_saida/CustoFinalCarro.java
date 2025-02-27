import java.util.Scanner;

public class CustoFinalCarro{
    static public void main(String [] args){
        //declaração de varíaveis
        double distribuidor, imposto, valor, resultado;
        Scanner leitor = new Scanner(System.in);

        imposto = 0.45;
        distribuidor = 0.28;

        //entrada de dados
        System.out.println("Digite o valor de fabrica do carro:");
        valor = leitor.nextDouble();

        //processamento
        resultado = valor + (valor * distribuidor) + (valor * imposto);

        //saída
        System.out.printf("O custo do carro para o consumidor será: R$%.2f", resultado);

    }
}