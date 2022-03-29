package ListaDeExercicios.EX006.ex14;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false;
        double delta, a = 0, b = 0, c = 0, rx1 = 0, rx2 = 0;

        System.out.println("digite o valor de a");
        a = scanner.nextDouble();
        System.out.println("digite o valor de b");
        b = scanner.nextDouble();
        System.out.println("digite o valor de c");
        c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            rx1 = (-b + Math.sqrt(delta)) / 2 * a;
            rx2 = (-b - Math.sqrt(delta)) / 2 * a;
            System.out.println("x1 =" + rx1);
            System.out.println("x2 =" + rx2);

        }
    }
}
