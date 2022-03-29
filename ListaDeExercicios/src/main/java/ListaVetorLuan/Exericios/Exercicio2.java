package Exericios;



public class Exercicio2 {

    public static void main(String[] args) {
        int [] VetorA = new int[15];
        int [] VetorB = new int[15];


        for (int i = 0; i < 8; i++) {
            VetorA[i]=i;//valor aleatório
            VetorB[i]=VetorA[i]*VetorA[i];
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
