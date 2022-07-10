package br.edu.fag.teste;

import br.edu.fag.Controller.EstadoController;
import br.edu.fag.Controller.MunicipioController;
import br.edu.fag.modelo.Estado;
import br.edu.fag.modelo.Municipio;

import javax.swing.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        String classe = JOptionPane.showInputDialog(
                " E - Estado \n " +
                        " M - Municipio \n ");

        if ("E".equals(classe)) {
            menuEstado();


        } else if ("M".equals(classe)) {
            menuMunicipio();
        }


        // DELETE
//		Estado estado = entityManager.find(Estado.class, 2);
//		entityManager.getTransaction().begin();
//		entityManager.remove(estado);
//		entityManager.getTransaction().commit();

        // MODIFY
//		Estado estado = new Estado();
//		estado.setId(1);
//		

//		entityManager.getTransaction().begin();
//		entityManager.merge(estado);
//		entityManager.getTransaction().commit();

    }

    private static void menuEstado() {
        EstadoController estadoController = new EstadoController();
        String opc = JOptionPane.showInputDialog(
                " 1 - Lista \n"
                        + " 2 - Insert \n"
                        + " 3 - Find por ID \n "
                        + " 4 - Update \n "
                        + " 5 - Delete ");

        switch (opc) {
            case "1":
                List<Estado> listEstado = estadoController.listEstado();
                for (Estado e : listEstado) {
                    JOptionPane.showMessageDialog(null, e.toString());
                }
            case "2":
                estadoController.inserir();
                break;
            case "3":
                JOptionPane.showMessageDialog(null, estadoController.find());
                break;
            case "4":
                estadoController.update();
            case "5":
                estadoController.delete();
        }
    }

    private static void menuMunicipio() {
        MunicipioController municipioController = new MunicipioController();
        String opc = JOptionPane.showInputDialog(
                " 1 - Lista \n"
                        + " 2 - Insert \n"
                        + " 3 - Find por ID \n "
                        + " 4 - Update \n "
                        + " 5 - Delete ");

        switch (opc) {
            case "1":
                List<Municipio> listMunicipio = municipioController.listMunicipio();
                for (Municipio m : listMunicipio) {
                    JOptionPane.showMessageDialog(null, m.toString());
                }
            case "2":
                municipioController.inserir();
                break;
            case "3":
                JOptionPane.showMessageDialog(null, municipioController.find());
                break;
            case "4":
                municipioController.update();
            case "5":
                municipioController.delete();
        }
    }

}
