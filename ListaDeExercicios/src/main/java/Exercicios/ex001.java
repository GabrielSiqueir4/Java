package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class ex001 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(5);
        lista.add(9);
        lista.add(13);
        lista.add(3);
        lista.add(7);
        lista.add(11);
        lista.add(15);
        List<Integer> listaB = new ArrayList<>();
        for (Integer i : lista) {
            listaB.add(i * i);
        }
        System.out.print(lista);
        System.out.print(listaB);
    }
}
