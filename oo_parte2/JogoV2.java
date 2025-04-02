import java.util.Random;
// import java.lang.reflect.Method;

public class JogoV2 {
    public static void main(String[] args) throws Exception {
        // // Substitua 'MinhaClasse.class' pela classe que você deseja analisar
        // Class<?> classe = Personagem.class;
        // // Obtém todos os métodos da classe, incluindo os herdados
        // Method[] metodos = classe.getDeclaredMethods();
        // var a = metodos.length;

        var gerador = new Random();
        var p = new Personagem();
        var p2 = new Personagem("Lebron", 10, 10, 0);
        var p3 = new Personagem("Soneca", 4, 4, 10);
        Personagem [] personagens = {p, p2, p3};
        var quemVaiJogar = gerador.nextInt(personagens.length);

        while(true){
            //1. caçar
            //2. comer
            //3. dormir
            //descobrir quantos metodos a classe personagem tem
            var oQueFazer = 1 + gerador.nextInt(3);

            switch(oQueFazer){
                case 1: personagens[quemVaiJogar].cacar();
                    break;
                case 2: personagens[quemVaiJogar].comer();
                    break;
                case 3: personagens[quemVaiJogar].dormir();
                    break;
            }
            System.out.println(p);
            System.out.println("**********************");
            Thread.sleep(8000);
        }
    }
}
