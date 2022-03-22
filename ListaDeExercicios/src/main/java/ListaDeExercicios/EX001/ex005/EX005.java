package ListaDeExercicios.EX001.ex005;

import java.util.Scanner;

public class EX005 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("informe a primeira nota");
        double nota = leitor.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("nota invalida");
            System.exit(0);
        }
        System.out.println("informe a segunda nota");
        double nota2 = leitor.nextDouble();

        double media = (nota + nota2) / 2;
        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media > 7 && media < 10) {
            System.out.println("aprovado");
        } else if (media == 10) {
            System.out.println("aprovado com louvor");
        }
    }
}
