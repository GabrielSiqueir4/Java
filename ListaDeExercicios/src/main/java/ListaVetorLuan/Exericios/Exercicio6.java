package Exericios;

/*
* 6.	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja: C[i] = A[i] – B[i]. */



public class Exercicio6 {

    public static void main(String[] args) {


        int [] VetorA = new int[10];
        int [] VetorB = new int[10];
        int [] VetorC = new int[10];
        for (int i = 0; i < 8; i++) {
            VetorA[i]=3*(i+3);//valor aleatório
            VetorB[i]=4*(i+4);
            VetorC[i]=VetorA[i]-VetorB[i];
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

        //imprimir VET C
        System.out.println("\n Vetor C");
        for (int i = 0; i < 8; i++) {
            System.out.print(VetorC[i]);
            System.out.print(" ");
        }
    }

}
