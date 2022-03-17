package ProjetoAula.Exercicio14;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioH;
        double numeroHoraT;
        double salarioMensal;
        double inss;
        double sindicato;

        System.out.println("Informe qual o valor que você ganha por hora?");
        salarioH = scanner.nextDouble();

        System.out.println("Informe o numero de horas trabalhadas no mes :  ");
        numeroHoraT = scanner.nextDouble();

        System.out.println("Informe quanto você paga no INSS :");
        inss = scanner.nextDouble();

        System.out.println("Informe quanto você paga para o sindicato: ");
        sindicato = scanner.nextDouble();



    }
}
