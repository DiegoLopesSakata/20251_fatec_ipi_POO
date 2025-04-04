package colecoes;

public class BasicoDeVetores2 {
    public static void main(String[] args) {
        //passagem de parâmetro por valor e por referência
        int [] v = {1, 2};
        manipulaVetor(v);
        System.out.println(v[0]);
        System.out.println(v[1]);
    }

    static void manipulaVetor(int [] x){
        x[0] = 10;
        x[1] = 20;
    }

    static void manipulaValor(int a){
        a = 2;
    }
}
