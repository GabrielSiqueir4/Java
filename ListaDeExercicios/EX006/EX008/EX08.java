package ListaDeExercicios.EX006.EX008;

import java.util.Scanner;

public class EX08 {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);

        System.out.println("informe o preço do primeiro produto!");
        double produto01 = produto.nextDouble();
        System.out.println("informe o preço do segundo produto!");
        double produto02 = produto.nextDouble();
        System.out.println("informe o preço do terceiro produto!");
        double produto03 = produto.nextDouble();


        if (produto01 < produto02 && produto01 < produto03) {
            System.out.println("o produto mais barato é : " + produto01);
        } else if (produto02 < produto01 && produto02 < produto03) {
            System.out.println("o produto mais barato é : " + produto02);
        }
        if (produto03 < produto01 && produto03 < produto02) {
            System.out.println("o produto mais barato é :" + produto03);
        }
    }
}
