package br.edu.fag.teste;

import br.edu.fag.Controller.EstadoController;
import br.edu.fag.modelo.Estado;

import javax.swing.*;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        System.out.println("rodou");

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
                estadoController.insert();
                break;
            case "3":
                JOptionPane.showMessageDialog(null, estadoController.find());
                break;
            case "4":
                estadoController.insert();
            case "5":
                estadoController.delete();
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


}
