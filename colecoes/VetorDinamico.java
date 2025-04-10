package colecoes;

public class VetorDinamico {
    private static final int LIMIAR_INFERIOR = 4;
    private int [] elementos;
    private int quantidade;
    private int capacidade;

    VetorDinamico(){
        quantidade = 0;
        capacidade = LIMIAR_INFERIOR;
        elementos = new int[capacidade];
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }

    public void remover(){
        if(!estaVazio()){
            quantidade--;
            if(capacidade > LIMIAR_INFERIOR && quantidade == capacidade / 4){
                //1. alocar um novo vetor com metade do tamanho
                //2. copiar todo mundo
                //3. ajustar a capacidade
                //4. ajustar a variavel elementos
                
                int [] aux = new int[capacidade / 2];
                for(int i = 0; i < quantidade; i++){
                    aux[i] = elementos[i];
                }

                elementos = aux;
                capacidade /= 2;
            }
        }
    }

    public boolean estaCheio(){
        return quantidade == capacidade;
    }

    public void adicionar(int e){
        //se esta cheio
        if(estaCheio()){
            //redimensionar
            //1. Alocar um novo vetor com o dobro da capacidade
            //2. Copiar todo mundo do elementos para o novo vetor
            //3. Atualizar o vetor de capacidade
            //4. Atualizar a variavel de referencia elementos, ela deve apontar par ao novo vetor

            int [] aux = new int [capacidade * 2];
            for(int i = 0; i < quantidade; i++){
                aux[i] = elementos[i];
            }
            capacidade *= 2;
            elementos = aux;

        }
        elementos[quantidade++] = e;
    }

    public String toString(){
        // String s = "a" + "b";
        //qtde: 3
        //cap: 4
        //1 2 3
        // return String.format{

        // };
        var sb = new StringBuilder("");
        sb.append("Qtde: ").append(quantidade).append("\n");
        sb.append("Cap: ").append(capacidade).append("\n");
        for(int i = 0; i < quantidade; i++){
            sb.append(elementos[i]).append(i != quantidade - 1 ? " " : "");
        }
        return sb.toString();
    }

}
