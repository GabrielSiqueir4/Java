package ListaVetor;

public class Exercicio5 {

    public static void main(String[] args) {


        int[] VetorA = new int[10];
        int[] VetorB = new int[10];
        int[] VetorC = new int[10];
        for (int i = 0; i < 8; i++) {
            VetorA[i] = 3 * (i + 3);
            VetorB[i] = 4 * (i + 4);
            VetorC[i] = VetorA[i] + VetorB[i];
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


        System.out.println(" Vetor C");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorC[i]);
            System.out.print(" ");
        }

    }
}
