package ListaVetores.Vetor.EX001.ex002;

import java.util.Random;

public class EX002 {
    public static void main(String[] args) {
        int[] vetorA = new int[15];
        for (int i = 0; i < 15; i++) {
            vetorA[i] = new Random().nextInt(30); //deixa o maximo ate 30
        }
        int[] vetorB = new int[15];
        for (int i = 0; i < 15; i++) {
            vetorB[i] = vetorA[i] * vetorA[i];
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