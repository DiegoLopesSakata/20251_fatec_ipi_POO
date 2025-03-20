

public class Personagem{
    String nome;
    int energia;
    int fome;
    int sono;

    void cacar(){
        System.out.println(nome + " cacando");
    }

    void comer(){
        System.out.print(nome + " comendo\n");
    }

    void dormir(){
        System.out.printf("%s dormindo\n", nome);
    }
    
}