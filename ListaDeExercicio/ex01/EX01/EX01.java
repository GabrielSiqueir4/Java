package ListaDeExercicio.ex01.EX01;

import java.util.Scanner;

public class EX01 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);


        System.out.println("informe o primeiro numero");
        double primeiro = numero.nextDouble();
        System.out.println("informe o segundo numero");
        double segundo = numero.nextDouble();
        System.out.println("informe o terceiro numero");
        double terceiro = numero.nextDouble();

        if(primeiro > segundo ){
            System.out.println("o numero Maior é o primerio");
        }


    }
}
