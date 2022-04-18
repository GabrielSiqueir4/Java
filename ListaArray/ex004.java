package Exercicios.curso.Array.Lista;

import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class ex004 {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        System.out.println("informe um valor");
        int vl01 = valor.nextInt();

        List<Integer> listaA = new ArrayList<>();

        for (int i = 1; i <= 15; i++) {
            listaA.add(vl01);
            vl01 = vl01 * vl01;

        }
        System.out.println("NUMEROS" + listaA);

    }
}
