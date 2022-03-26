package Exericios;

public class Exercicio1 {

    public static void main(String[] args) {

        int [] VetorA = new int[8];
        int [] VetorB = new int[8];


        for (int i = 0; i < 8; i++) {
            VetorA[i]=i;//valor aleatório
            VetorB[i]=VetorA[i]*2;
        }


        for (int i = 0; i < 8; i++) {

            System.out.println(VetorB[i]);
        }

    }

}
