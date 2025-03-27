import java.util.Random;

public class Personagem{
    private String nome = null;
    private String [] possiveisNomes = {"Steve", "Alex", "Mark"};
    private int energia;
    private int fome;
    private int sono;

    public Personagem(){
        energia = 10;
        fome = 0;
        sono = 0;
    }

    private String obterNomeAleatorio(){
        var gerador = new Random();
        return possiveisNomes[gerador.nextInt(possiveisNomes.length)];
        
    }

    //deve ser possivel construir um personagem com dados passados pela classe cliente
    //se algum valor for inválido, usar aquele que é padrçao para a respectiva propriedade
    // incluir a validação de nome: somente valem nomes que tenham pelo menos 4 caracteres
    //se essa regra for violada, atribuir um nome aleatório
    public Personagem(String nome, int energia, int fome, int sono){
        this.nome = nome.length() >= 4 ? nome : obterNomeAleatorio();
        this.energia = energia >= 0 && energia <= 10 ? energia : 10;
        if(fome >= 0 && fome <=10){
            this.fome = fome;
        }
        else{
            this.fome = 0;
        }
        switch(sono){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                this.sono = sono;
                break;
            default: this.sono = 0;
        }
    }

    public void cacar(){
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

    public void comer(){
        if(fome >= 1){
            System.out.println(nome + " comendo");
            fome--;
            energia = Math.min(energia + 1, 10);
        }
        else{
            System.out.println(nome + " sem fome");
        }
    }

    public void dormir(){
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