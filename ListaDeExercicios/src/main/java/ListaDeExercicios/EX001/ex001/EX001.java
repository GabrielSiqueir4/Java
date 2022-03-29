package ListaDeExercicios.EX001.ex001;

import java.util.Scanner;

public class EX001 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("informe valor 1");
        double vl01 = leitor.nextInt();
        System.out.println("informe valor 2");
        double vl02 = leitor.nextInt();
        if (vl01 == vl02) {
            System.out.println("igual");
        } else if (vl01 > vl02) {
            System.out.println("maior" + vl01);
        }

        if (vl01 > vl02) {
            System.out.println("Maior" + vl01);
        } else {
            System.out.println("Maior" + vl02);
        }

    }
}
