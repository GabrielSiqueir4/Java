package Exericios;

public class Exercicio4 {

    public static void main(String[] args) {

        int [] VetorA = new int[10];
        int [] VetorB = new int[10];


        for (int i = 0; i < 8; i++) {
            VetorA[i]=3*(i+3);//valor aleatório
            VetorB[i]=VetorA[i]*i;

        }

        //imprimir VET A
        System.out.println("\n Vetor A");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorA[i]);
            System.out.print(" ");
        }

        //imprimir VET B
        System.out.println("\n Vetor B");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorB[i]);
            System.out.print(" ");
        }

    }

}
