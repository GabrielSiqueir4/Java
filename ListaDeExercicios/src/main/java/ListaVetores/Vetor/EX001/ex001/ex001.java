package ListaVetores.Vetor.EX001.ex001;

public class ex001 {
    public static void main(String[] args) {
        int[] vetorA = new int[8];
        vetorA[0] = 2;
        vetorA[1] = 8;
        vetorA[2] = 9;
        vetorA[3] = 10;
        vetorA[4] = 11;
        vetorA[5] = 12;
        vetorA[6] = 13;
        vetorA[7] = 14;

        int[] vetorB = new int[8];
        for (int i = 0; i < 8; i++) {
            vetorB[i] = vetorA[i] * 2;
        }
        System.out.println("Vetor A");
        for (int i = 0; i < 8; i++) {
            System.out.println(vetorA[i] + "");
        }
        System.out.println("Vetor B");
        for (int i = 0; i < 8; i++) {
            System.out.println(vetorB[i] + "");


        }
    }
}