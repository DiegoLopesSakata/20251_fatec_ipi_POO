package sobrecarga;

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;

    public Pessoa(){
        System.out.println("Padrão...");
    }

    public Pessoa(String nome, int idade, char sexo){
        System.out.println("String, int, char");
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade){
        this(nome, idade, '\0');
        System.out.println("String, int");
        // this.nome = nome;
        // this.idade = idade;
    }

    public Pessoa(int idade, String nome){
        this(nome, idade);
        System.out.println("Int, string");
        // this.idade = idade;
        // this.nome = nome;
    }

    public Pessoa(String nome){
        this(nome, 0);
        System.out.println("String");
    }

    public Pessoa(int idade){
        this(idade, null);
        System.out.println("Int");
    }
}
