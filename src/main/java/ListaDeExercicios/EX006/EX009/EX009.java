package ListaDeExercicios.EX006.EX009;

import javax.swing.*;
import java.util.Scanner;

public class EX009 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("informe o primeiro numero");
        double numero1 = numero.nextDouble();

        System.out.println("informe o segundo numero");
        double numero2 = numero.nextDouble();

        System.out.println("informe o terceiro numero");
        double numero3 = numero.nextDouble();

        double aux;

        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        if (numero2 > numero3) {
            aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
        if (numero1 > numero2) {
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        System.out.println("ordem crescente: " + numero1 + " - " + numero2 + " - " + numero3);
        System.out.println("ordem decrecente: " + numero3 + " - " + numero2 + " - " + numero1);
    }
}
