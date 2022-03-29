package Lista.Array.EX001.ex001;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ex003 {
    public static void main(String[] args) {
        List<Integer> listaA = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            listaA.add(new Random().nextInt(100));
        }
        boolean continua = true;
        while (continua) {
            continua = false;
            Integer aux = 0;
            for (Integer num : listaA) {
                if (num % 2 != 0) {
                    aux = num;
                    continua = true;
                }

            }
            if (continua) {
                listaA.remove(aux);
            }
        }
    }
}