package ListaVetor;

public class Exercicio21 {

    public static void main(String[] args) {

        int varX = 10;

        float[] VetorA = new float[varX];


        for (int i = 0; i < varX; i++) {
            VetorA[i] = (int) Math.round(Math.random() * 1);
            System.out.println(VetorA[i]);

            if (VetorA[i] % 2 != 0) {
                System.out.println("STOP");
                System.exit(1);
            }
        }

        System.out.println("FINISH");
    }

}
