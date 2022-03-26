package ListaVetores.Vetor.EX001.ex003;

import java.util.Random;

public class ex003 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        for (int i = 0; i < 15; i++) {
            vetorA[i] = new Random().nextInt(30); //alimenta com numeros randomicos de 0 ate 30
        }
        double[] vetorB = new double[15];
        for(int i =0; i<15; i++){
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("vetor a");
        for (int i=0; i<8; i++){
            System.out.println(vetorA[i] +"");
        }
        System.out.println("");
        System.out.println("Vetor B");
        for(int i=0; i<8; i++){
            System.out.println(vetorB[i] +"");
        }
    }
}
