package br.edu.fag.Controller;

import br.com.caelum.stella.validation.CPFValidator;
import br.edu.fag.modelo.Endereco;
import br.edu.fag.modelo.Pessoa;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.*;


public class PessoaController {
    private EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("BancoPU");
    private EntityManager entityManager =
            entityManagerFactory.createEntityManager();

    public void inserir() {
        try {
            Pessoa pessoa = new Pessoa();

            pessoa.setCpf(JOptionPane.showInputDialog("Infome seu CPF"));
            pessoa.setRg(JOptionPane.showInputDialog("Informe seu RG"));
            pessoa.setNome(JOptionPane.showInputDialog("informe seu Nome "));

            MunicipioController municipioController = new MunicipioController();

        }catch (){

        }
        private void validaCPF(String cpf){
            try {
                CPFValidator cpfValidator = new CPFValidator();
                cpfValidator.assertValid(cpf);
            }catch (Exception e){
                return false;
            }
        }


    }

    public void create() {

        Endereco endereco = new Endereco();

        endereco.setLogradouro(JOptionPane.showInputDialog("Informe o Logradouro "));
        endereco.setNumero(JOptionPane.showInputDialog("Informe o numero "));
        endereco.setCep(JOptionPane.showInputDialog("informe o Cep "));
        endereco.setBairro(JOptionPane.showInputDialog("Informe o Bairro "));
        endereco.setComplemento(JOptionPane.showInputDialog("Informe o complemento "));
        endereco.setMunicipio(JOptionPane.showInputDialog("Informe o Municipio "));


    }

}
