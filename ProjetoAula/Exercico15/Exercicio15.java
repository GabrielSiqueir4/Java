package ProjetoAula.Exercico15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double idade;
        double meses;
        double dias;
        double resultado;

        System.out.println("Informe sua idade");
        idade = scanner.nextDouble();
        System.out.println("Informe em que mes você nasceu:");
        meses = scanner.nextDouble();
        System.out.println("Informe em que dia você nasceu:");
        dias = scanner.nextDouble();

        resultado = (idade * 365 + meses * 30 + dias);
        System.out.println("você viveu " + resultado + " Dias");
    }
}
