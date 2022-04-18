package Exercicio2;

public class Main {

    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario();
        f1.setNome("Joao");
        System.out.println("O Nome do Funcionario é: " + f1.getNome());
        

        Salario s1 = new Salario();
        s1.setSalaro(250);
        System.out.println("O salario atual é :" + s1.getSalario());

        NovoSalario n1 = new NovoSalario();
        n1.setNovo(s1.getSalario() * 1.11);
        System.out.println("O Novo Salario é :" + n1.getNovo());
    }
}