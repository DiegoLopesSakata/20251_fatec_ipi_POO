import javax.sound.midi.Soundbank;

public class Personagem{
    String nome;
    int energia = 10;
    int fome;
    int sono;

    void cacar(){
        if(energia >= 2){
            System.out.println(nome + " cacando");
            energia -= 2;
        }
        else{
            System.out.println(nome + " sem energia para cacar");
        }
        fome = fome < 10 ? fome += 1 : fome;
        sono = Math.min(sono + 1, 10);
    }

    void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            fome--;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem fome");
        }
    }

    void dormir(){
        if(sono >= 1){
            System.out.println(nome + " dormindo");
            sono--;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem sono");
        }
    }

    @Override
    public String toString(){
        return String.format(
            "%s: e: %d, f: %d, s: %d", nome, energia, fome, sono
        );
    }
}