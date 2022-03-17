package ProjetoAula.Exercicio16;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media1, media2;
        double soma;
        int numero1, numero2, numero3,numero4,numero5,numero6;

        numero1 = 8;
        numero2 = 9;
        numero3 = 7;
        numero4 = 4;
        numero5 = 5;
        numero6 = 6;

        media1 = (numero1 + numero2 + numero3) /3;
        media2 =  (numero3 + numero4 + numero5) / 3;
        soma = media1 + media2;

        System.out.println(" A media é : " + soma);
        }
    }

