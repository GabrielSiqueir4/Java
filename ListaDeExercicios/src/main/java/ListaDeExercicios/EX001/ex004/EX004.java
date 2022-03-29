package ListaDeExercicios.EX001.ex004;

import java.util.Locale;
import java.util.Scanner;

public class EX004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe a letra ");
        String letra = leitor.next();

        if (letra.equalsIgnoreCase("a")
                || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i")
                || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }

        String vogais = "aeiou";
        if (vogais.indexOf(letra.toLowerCase()) != -1) {
            System.out.println("vogal");
        } else {
            System.out.println("consoante");
        }


    }
}


