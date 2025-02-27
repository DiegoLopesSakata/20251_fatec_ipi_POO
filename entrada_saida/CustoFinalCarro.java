import javax.swing.JOptionPane;

public class CustoFinalCarro{
    static public void main(String [] args){
        //declaração de varíaveis
        double distribuidor, imposto, valor, resultado;
        imposto = 0.45;
        distribuidor = 0.28;

        //entrada de dados
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fabrica do carro:"));

        //processamento
        resultado = valor + (valor * distribuidor) + (valor * imposto);

        //saída
        JOptionPane.showMessageDialog(null, "O valor final do carro será: R$" + resultado);

    }
}