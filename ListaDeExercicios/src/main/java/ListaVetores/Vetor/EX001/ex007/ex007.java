package ListaVetores.Vetor.EX001.ex007;

import java.util.Random;

public class ex007 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        for (int i = 0; i < 10; i++) {
            vetorA[i] = new Random().nextInt();
            vetorB[i] = new Random().nextInt();
        }
        int[] vetorC = new int[10];
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] * vetorB[i];
        }
        System.out.println("Vetor C");
        for (int i = 0; i < 8; i++) {
            System.out.println(vetorC[i] + "");
        }
    }
}
