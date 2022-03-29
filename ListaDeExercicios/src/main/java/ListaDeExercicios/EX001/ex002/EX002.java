package ListaDeExercicios.EX001.ex002;

import java.util.Scanner;

public class EX002 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        System.out.println("informe um valor");
        double numero = valor.nextInt();

        if (numero < 0) {
            System.out.println("numero negativo");

        } else if (numero == 0) {
            System.out.println("nulo");
        } else {
            System.out.println("positovo");
        }

    }
}
