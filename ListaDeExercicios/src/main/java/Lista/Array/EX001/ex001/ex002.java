package Lista.Array.EX001.ex001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex002 {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listaA.add(new Random().nextInt(100));
        }
        List<Integer> numeroPar = new ArrayList<>();
        List<Integer> numeroImpar = new ArrayList<>();
        for (Integer num : listaA) {
            if (num % 2 == 0) {
                numeroPar.add(num);
            } else {
                numeroImpar.add(num);
            }
        }
        System.out.println("Numeros pares: " + numeroPar);
        System.out.println("Numeros Impares: "+ numeroImpar);
    }
}

