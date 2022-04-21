package ListaDeExercicios.EX006.EX10;

import java.util.Locale;
import java.util.Scanner;

public class EX10 {
    public static void main(String[] args) {
        Scanner informacao = new Scanner(System.in);

        System.out.println("informe em que turno você esta, Matutino, Vespertino, Noturno");
        String periodo = informacao.nextLine();

        if(periodo == "Matutino") {
            System.out.println(periodo.equalsIgnoreCase());
        }
    }

}
