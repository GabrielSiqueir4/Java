package Exercicios.curso.Array.Lista;

import java.util.ArrayList;
import java.util.List;


public class ex001 {
    public static void main(String[] args) {
        List<Integer> Num = new ArrayList<>();
        Num.add(2);
        Num.add(5);
        Num.add(3);
        Num.add(9);
        Num.add(2);
        Num.add(4);
        Num.add(3);
        Num.add(8);
        Num.add(5);

        for (Integer aux : Num) {
            System.out.println(aux);

        }
    }

}
