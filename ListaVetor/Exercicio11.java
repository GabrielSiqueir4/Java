package ListaVetor;

public class Exercicio11 {

    public static void main(String[] args) {
        int[] VetorA = new int[15];
        int somaValores = 0;


        for (int i = 0; i < 8; i++) {
            VetorA[i] = 3 * (i + 3);
        }


        System.out.println(" Vetor A");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");

            somaValores = somaValores + VetorA[i];


        }
        System.out.println(" A quantidade de valores pares é " + somaValores);

    }
}
