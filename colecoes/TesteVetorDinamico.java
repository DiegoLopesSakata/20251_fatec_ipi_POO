package colecoes;
import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
        var gerador = new Random();
        var v = new VetorDinamico();
        while(true){
            var numero = gerador.nextInt(1, 7); // [1, 7[
                v.adicionar(numero);
            System.out.println(v);
            System.out.println("******************************************\n");
            Thread.sleep(5000);
        }
    }
}
