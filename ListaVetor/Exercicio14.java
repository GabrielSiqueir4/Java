package ListaVetor;

public class Exercicio14 {

    public static void main(String[] args) {
        int[] VetorA = new int[10];
        double contPares = 0;
        double contImpares = 0;


        for (int i = 0; i < 10; i++) {
            VetorA[i] = 3 * (i + 3);

        }


        System.out.println("\n Vetor A");
        for (int i = 0; i < 10; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");

            if (VetorA[i] % 2 == 0) {
                contPares = contPares + 1;
            } else {
                contImpares = contImpares + 1;
            }
            ;


        }

        System.out.println(" O percentual de números pares é de  " + (contPares / VetorA.length) * 100 + "%");
        System.out.println(" O percentual de números Impares é de  " + (contImpares / VetorA.length) * 100 + "%");
    }
}
