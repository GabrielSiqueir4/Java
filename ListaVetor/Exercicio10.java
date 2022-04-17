package ListaVetor;

public class Exercicio10 {
    public static void main(String[] args) {
        int[] VetorA = new int[15];
        int contPares = 0;


        for (int i = 0; i < 8; i++) {
            VetorA[i] = 3 * (i + 3);

        }


        System.out.println(" Vetor A");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");
            if (VetorA[i] % 2 == 0) {
                contPares = contPares + 1;
            }

        }
        System.out.println("\n A quantidade de valores pares é " + contPares);

    }

}
