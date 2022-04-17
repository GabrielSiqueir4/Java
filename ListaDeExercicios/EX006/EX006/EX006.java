package ListaDeExercicios.EX006.EX006;

import java.util.Scanner;

public class EX006 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);


        System.out.println("informe o primeiro numero");
        double primeiro = numero.nextDouble();
        System.out.println("informe o segundo numero");
        double segundo = numero.nextDouble();
        System.out.println("informe o terceiro numero");
        double terceiro = numero.nextDouble();

        if (primeiro > segundo && primeiro > terceiro) {
            System.out.println("o numero Maior é o primerio");
        } else if (primeiro == segundo || primeiro == terceiro) {
            System.out.println("numeros iguais");
        }
        if (segundo > primeiro && segundo > terceiro) {
            System.out.println("o numero maior é o segundo");
        } else if (segundo == primeiro || segundo == terceiro) {
            System.out.println("numeros iguais");
        }
        if (terceiro > primeiro && terceiro > segundo) {
            System.out.println("o terceiro numero é o maior");
        } else if (terceiro == primeiro || terceiro == segundo) {
            System.out.println("numero iguais ");
        }


    }
}
