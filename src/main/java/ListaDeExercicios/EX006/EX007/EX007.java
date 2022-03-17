package ListaDeExercicios.EX006.EX007;

import java.util.Scanner;

public class EX007 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);


        System.out.println("informe o primeiro numero");
        double primeiro = numero.nextDouble();
        System.out.println("informe o segundo numero");
        double segundo = numero.nextDouble();
        System.out.println("informe o terceiro numero");
        double terceiro = numero.nextDouble();

        if (primeiro == segundo && primeiro == terceiro) {
            System.out.println("erro");
        } else if (segundo == terceiro) {
            System.out.println("erro");
        }


        if (primeiro > segundo && primeiro > terceiro) {
            System.out.println("o numero maior é:" + primeiro);
        } else if (primeiro < segundo && primeiro < terceiro) {
            System.out.println("o numero menor é" + primeiro);
        }


        if (segundo > primeiro && segundo > terceiro) {
            System.out.println("o numero maior é:" + segundo);
        } else if (segundo < primeiro && segundo < terceiro) {
            System.out.println("o numero menor é:" + segundo);
        }


        if (terceiro > segundo && terceiro > primeiro) {
            System.out.println("o numero maior é" + terceiro);
        } else if (terceiro < segundo && terceiro < primeiro) {
            System.out.println("o numero menor é" + terceiro);
        }

    }
}
