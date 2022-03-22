package ListaDeExercicios.EX001.ex003;

import java.util.Scanner;

public class EX03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe F ou M");
        String valor = leitor.next();

        if (valor.equalsIgnoreCase("F")) {
            System.out.println("feminino");
        } else if (valor.equalsIgnoreCase("M")) {
            System.out.println("masculino");
        } else {
            System.out.println("invalido");
        }
    }
}
