package ListaVetor;

import java.util.Random;

public class Exercicio17 {

    public static void main(String[] args) {


        int varX = 10;
        int maior;
        int menor;
        int VarC = 0;

        int[] VetorA = new int[varX];


        for (int i = 0; i < varX; i++) {
            VetorA[i] = new Random().nextInt(100);
            System.out.print(VetorA[i] + " ");
        }


        menor = VetorA[0];
        maior = VetorA[0];


        for (int i = 0; i < varX; i++) {

            for (int x = 0; x < varX; x++) {

                if (VetorA[i] > maior) {
                    maior = VetorA[i];
                } else if (VetorA[i] < menor) {
                    menor = VetorA[i];
                }
            }

        }

        System.out.println(" Maior:" + maior);
        System.out.println(" Menor:" + menor);

    }
}