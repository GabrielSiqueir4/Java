package Exercicios.curso.Array.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex005 {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listaA.add(new
                    Random().nextInt((50 - 10) + 1) + 10);
        }
        int aux = 0;
        for (Integer i : listaA) {
            if (i < aux || aux == 0) {
                aux = i;
            }
        }
        System.out.println("O valor é:" + aux);

    }


}
