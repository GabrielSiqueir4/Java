package Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char opcao = 's';
        try (Scanner leitor = new Scanner(System.in)) {
            Lampada lampada = new Lampada();

            System.out.print("Ligar a lâmpada?[S/N]: ");
            opcao = leitor.next().charAt(0);

            if (opcao == 's' || opcao == 'S')
                lampada.setLigada(true);

            else if (opcao == 'n' || opcao == 'N')
                lampada.setLigada(false);

            if (lampada.isLigada())
                System.out.println("\nLigando a lâmpada...");

            else
                System.out.println("\nDesligando a lâmpada...");
        }
    }

}
