package ListaVetor;

public class Exercicio15 {


    public static void main(String[] args) {


        int VarX = 10;
        int SomaInfQuinze = 0;
        int QtdQuinze = 0;
        int somaSupQuinze = 0;
        int contSupQuinze = 0;


        int[] VetorA = new int[VarX];


        for (int i = 0; i < VarX; i++) {


            VetorA[i] = (i + 1) * (i + 2);
            System.out.print(VetorA[i] + " ");


            if (VetorA[i] < 15) {
                SomaInfQuinze = SomaInfQuinze + VetorA[i];
            } else if (VetorA[i] == 15) {
                QtdQuinze = QtdQuinze + 1;
            } else {//c
                somaSupQuinze = somaSupQuinze + VetorA[i];
                contSupQuinze = contSupQuinze + 1;
            }

        }
        System.out.println(" a) A soma de elementos inferior a 15 é " + SomaInfQuinze);
        System.out.println(" b) A quantidade de elementos igual a 15 é " + QtdQuinze);
        System.out.println(" c) A média dos elementos maior que  15 é " + somaSupQuinze / contSupQuinze);
    }
}
