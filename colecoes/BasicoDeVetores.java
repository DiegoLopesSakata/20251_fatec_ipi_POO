package colecoes;

public class BasicoDeVetores{
    public static void main(String[] args) {
        // {0, 0, 0, 0}
        int [] v1 = {5, 7, 2, 2};
        System.out.println(v1.length);
        
        //calcule a média desse vetor
        var media = 0d;
        for(int i = 0; i < v1.length; i++){
            media += v1[i];
        }

        media /= v1.length;
        System.out.println(media);
    }
}