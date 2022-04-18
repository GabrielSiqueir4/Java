package ListaVetor;

public class Exercicio12 {

    public static void main(String[] args) {
        int[] VetorA = new int[15];
        int somaValores = 0;


        for (int i = 0; i < 8; i++) {
            VetorA[i] = 3 * (i + 3);

        }


        System.out.println("\n Vetor A");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");

            if (VetorA[i] % 5 == 0) {
                somaValores = somaValores + VetorA[i];
            }

        }
        System.out.println(" A quantidade de valores pares é " + somaValores);

    }
}
