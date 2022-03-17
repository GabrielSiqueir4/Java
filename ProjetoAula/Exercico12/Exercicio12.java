package ProjetoAula.Exercico12;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float altura;
        double peso;

        System.out.println("Informe a sua altura:");
        altura = scanner.nextFloat();

        peso = (72.7 * altura) - 58;
        System.out.println("O Peso Ideal para você é :" + peso);

    }
}
