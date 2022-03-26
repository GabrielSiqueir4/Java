package ListaDeExercicios.EX006.EX11;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean valido = false, salario = false;

        String nome = "";
        double salarioAtual = 0, salarioNovo = 0, aumeto = 0, porCento = 0;
        while (valido == false) {
            while (salario == false) {
                System.out.println("insira o nome do funcionario:");
                nome = scanner.next();
                System.out.println("insira o salario atual:");
                salarioAtual = scanner.nextDouble();
                if (salarioAtual < 0) {
                    System.out.println("insira um salario valido");
                } else {
                    salario = true;
                }
            }
            if (salarioAtual > 1500) {
                porCento = 5;
                salarioNovo = salarioAtual * 1.05;
                valido = true;
            } else if (salarioAtual > 280) {
                porCento = 15;
                salarioNovo = salarioAtual * 1.15;
                valido = true;
            } else {
                porCento = 20;
                salarioNovo = salarioAtual * 1.2;
                valido = true;
            }
        }
        aumeto = salarioNovo - salarioAtual;

        System.out.println("nome do funcionario:" + nome + " " + "salario antigo" + salarioAtual + "" + "salario novo" + salarioNovo + "porcentagem" + porCento + "%" + "aumento" + aumeto);

    }
}
