class Carro{
    private String cor;
    private String modelo;

    //constructor
    public Carro(String cor, String modelo){
        setCor(cor);
        setModelo(modelo);
    }

    //getter
    public String getCor(){
        return cor;
    }

    public String getModelo(){
        return modelo;
    }

    //setter

    public void setCor(String n){
        cor = n;
    }

    public void setModelo(String n){
        modelo = n;
    }

    public void exibirMensagem(){
        System.out.println("O carro tem a cor " + cor);
        System.out.println("E o seu modelo eh " + modelo);
    }

}