

public class JogoV1 {
    public static void main(String[] args) {
        //1. Construir um objeto do tipo personagem
        var p1 = new Personagem();

        //2. Atribua um nome ao seu personagem
        p1.nome = "Cleiton";

        //3. Fazer com que ele execute todos os seus comportamentos, na ordem que vc desejar
        p1.cacar();
        p1.comer();
        p1.dormir();
    }
}
