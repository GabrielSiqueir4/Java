package ListaVetores.Vetor.EX001.ex008;

import java.util.Random;

public class ex008 {
    public static void main(String[] args) {

        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        for (int i = 0; i < 10; i++) {
            vetorA[i] = new Random().nextInt();
            vetorB[i] = new Random().nextInt();
        }
        double[] vetorC = new double[10];
        for (int i = 0; i < 10; i++) {
            vetorC[i] = vetorA[i] / Double.parseDouble(vetorB[i]+ "");
        }
        System.out.println("Vetor C");
        for (int i = 0; i < 8; i++) {
            System.out.println(vetorC[i] + "");
        }
    }
}
