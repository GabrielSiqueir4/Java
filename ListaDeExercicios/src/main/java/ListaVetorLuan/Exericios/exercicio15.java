package ListaVetorLuan.Exericios;

import java.util.Random;
import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] vetorA = new int[10];
        int inferior15 = 0, igual15 = 0, maior15 = 0;
        int media;
        int soma = 0;
        int cont = 0;
        for (int i = 0; i < 10; i++) {
            vetorA[i] = new Random().nextInt(30); //deixa o maximo ate 30

            if (vetorA[i] < 15 ) {
                cont = cont + 1;
                inferior15 = cont + vetorA[i] ;
            } else if (vetorA[i] == 15) {
                cont = cont + 1;
                igual15 = cont ;
            } else if (vetorA[i] > 15) {
                cont = cont +1;
                maior15 = cont;

            }
            System.out.println("Vetor A" + vetorA[i]);
            System.out.println("");
        }

        media = (maior15 + igual15 + inferior15) / 3;
        System.out.println("a media é " + media);
        System.out.println("os numeros inferiores a 15 é :" + inferior15);
        System.out.println("os numeros igual a 15 sao : " + igual15);
        System.out.println("os numeros maior que  15 são :" + maior15);

    }
}