package ListaVetor;

public class Exercicio9 {

    public static void main(String[] args) {
        int[] VetorA = new int[15];
        int[] VetorB = new int[15];


        for (int i = 0; i < 8; i++) {
            VetorA[i] = 3 * (i + 3);
            VetorB[i] = VetorA[i] % 2;

        }


        System.out.println(" Vetor A");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");
        }


        System.out.println(" Vetor B");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorB[i]);
            System.out.print(" ");
        }

    }

}
