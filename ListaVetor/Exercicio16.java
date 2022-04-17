package ListaVetor;

public class Exercicio16 {

    public static void main(String[] args) {


        int VarX = 10;
        int contVeinho = 0;


        int[] VetorA = new int[VarX];


        for (int i = 0; i < VarX; i++) {


            VetorA[i] = (i + 1) * (i + 2);
            System.out.print(VetorA[i] + " ");


            if (VetorA[i] > 35) {
                contVeinho = contVeinho + 1;
            }
        }
        System.out.println(" a) Existem " + contVeinho + " veinhos no vetor.");

    }

}
