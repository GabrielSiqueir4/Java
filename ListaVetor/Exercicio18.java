package ListaVetor;

import java.util.Random;

public class Exercicio18 {

    public static void main(String[] args) {


        int varX = 10;
        int maior;
        int menor;
        int media = 0;

        int[] VetorA = new int[varX];
        int[] VetorB = new int[varX];


        System.out.println("Nota 01");
        for (int i = 0; i < varX; i++) {

            VetorA[i] = new Random().nextInt(100);
            System.out.println("Aluno " + (i + 1) + ": " + VetorA[i] + " ");
        }
        System.out.println("Nota 02");
        for (int i = 0; i < varX; i++) {
            VetorB[i] = new Random().nextInt(100);
            System.out.println("Aluno " + (i + 1) + ": " + VetorB[i] + " ");
        }
        System.out.println("Média");
        for (int i = 0; i < varX; i++) {
            media = (VetorA[i] + VetorB[i]) / 2;
            System.out.println("Aluno " + (i + 1) + ": " + media);
        }

    }
}


