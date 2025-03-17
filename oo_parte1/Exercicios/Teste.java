public class Teste{
    public static void main (String... args){
        Carro carro1 = new Carro("verde", "fusca");
        Carro carro2 = new Carro("azul", "chevette");

        System.out.println(carro1.getCor());
        System.out.println(carro1.getModelo());
        carro1.exibirMensagem();

        System.out.println(carro2.getCor());
        System.out.println(carro2.getModelo());
        carro2.exibirMensagem();
    }
}