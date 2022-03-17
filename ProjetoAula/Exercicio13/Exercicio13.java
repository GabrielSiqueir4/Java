package ProjetoAula.Exercicio13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     double tamanho;
     double internet;
     double velocidade;

        System.out.println("Qual o tamanha do arquivo para dowload em (MB)?");
        tamanho = scanner.nextDouble();

        System.out.println("Informe a velocidade da sua Internet em (Mbps) :");
        internet = scanner.nextDouble();

        velocidade = (tamanho / internet) ;

        System.out.println("A velocidade de Dowload é: " + velocidade);




    }
}
