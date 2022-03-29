package Exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex002 {
    public static void main(String[] args) {
        List<Integer>listaA = new ArrayList<>();
        for(int i=1; i<= 15; i++){
            listaA.add(new Random().nextInt(30));
        }
        List<Integer>listaB = new ArrayList<>();
        for(Integer i : listaA){
            listaB.add(i * i);
        }
        System.out.println(listaA);
        System.out.println(listaB);
    }
}
