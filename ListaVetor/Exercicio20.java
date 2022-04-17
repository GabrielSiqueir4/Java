package ListaVetor;

public class Exercicio20 {

    public static void main(String[] args) {

        int varX = 10;

        float[] VetorA = new float[varX];
        float cont1 = 0;
        float cont1Por;


        for (int i = 0; i < varX; i++) {
            VetorA[i] = (int) Math.round(Math.random() * 1);
            System.out.println(VetorA[i]);

            if (VetorA[i] == 1) {
                cont1 = cont1 + 1;
            }
        }

        cont1Por = (cont1 / varX) * 100;
        System.out.println("A % de itens 1 é " + cont1Por + " %");
        System.out.println("A % de itens 0 é " + (100 - cont1Por) + " %");
    }
}
