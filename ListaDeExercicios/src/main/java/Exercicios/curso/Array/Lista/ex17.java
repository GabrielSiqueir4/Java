//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Exercicios.curso.Array.Lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class ex17 {
    public ex17() {
    }

    public static void main(String[] args) {
        List<String> listaA = new ArrayList();

        for (boolean continua = true; continua; Collections.sort(listaA)) {
            String nome = JOptionPane.showInputDialog("Digite um nome ou digite (Sair)");
            if (nome.equalsIgnoreCase("Sair")) {
                continua = false;
            } else {
                listaA.add(nome);
            }
        }

        System.out.println("Os nomes de usuarios são" + listaA);
    }
}
