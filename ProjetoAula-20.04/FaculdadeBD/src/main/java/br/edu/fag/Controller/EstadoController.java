package br.edu.fag.Controller;

import br.edu.fag.modelo.Estado;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.swing.*;
import java.util.List;

public class EstadoController {

    private EntityManagerFactory entityManagerFactory =
            Persistence.createEntityManagerFactory("BancoPU");
    private EntityManager entityManager =
            entityManagerFactory.createEntityManager();

    public void delete() {
        String sg = JOptionPane.showInputDialog("informe a sigla do estado");
        Estado estado = null;
        try {
            estado = (Estado) entityManager.createNativeQuery(
                            " select  * from Estado " + " Where sigla = :sg ", Estado.class)
                    .setMaxResults(1)
                    .setParameter("sg", sg)
                    .getSingleResult();
        } catch (NoResultException nre) {
            JOptionPane.showMessageDialog(null, "Estado (" + sg + ") não escontrado");
        }
        if (0 == JOptionPane.showConfirmDialog(null, "Deseja Excluir o " + estado.toString())) {
            entityManager.getTransaction().begin();
            entityManager.remove(estado);
            entityManager.getTransaction().commit();
            entityManager.close();
        }
    }

    public List<Estado> listEstado() {
        entityManager.getTransaction().begin();
        List<Estado> retorno =

                entityManager.createNativeQuery("select * from Estado", Estado.class).getResultList();
        entityManager.close();
        return retorno;


    }

    public void insert() {


        Estado estado = new Estado();
        estado.setCodigo(JOptionPane.showInputDialog("INFORME O CODIGO:"));
        estado.setSigla(JOptionPane.showInputDialog("INFORME A SIGLA:"));
        estado.setNome(JOptionPane.showInputDialog("INFORME O NOME"));

        entityManager.getTransaction().begin();
        entityManager.persist(estado);
        entityManager.getTransaction().commit();

    }

    public Estado find() {
        entityManager.getTransaction();
        long id = Long.parseLong(JOptionPane.showInputDialog("informe o id"));
        Estado resultado = entityManager.find(Estado.class, id);
        if (resultado == null) {
            JOptionPane.showMessageDialog(null, "ID NÃO ENCONTRADO");
        }

        entityManager.close();
        return resultado;

    }

    private void update() {
        String sg = JOptionPane.showInputDialog("informe a sigla do estado");
        entityManager.getTransaction();
        Estado estado = (Estado) entityManager.createNativeQuery(
                        "select * from Estado" + " where sigla = :sg", Estado.class)
                .setParameter("sg", sg).getSingleResult();
        try {
            estado = (Estado) entityManager.createNativeQuery(
                            "select * from Estado" + " where sigla = :sg", Estado.class)
                    .setMaxResults(1)
                    .setParameter("sg", sg).getSingleResult();


        } catch (NoResultException nre) {
            String cadastrar = JOptionPane.showInputDialog(null, "Estado (" + sg + ") não encontrado" + "Digite S para cadastrar um novo estado");
            if ("S".equals(cadastrar)) {
                insert();
                entityManager.close();

            }
        }
        if (estado == null) {
            JOptionPane.showMessageDialog(null, "Estado (" + sg + ")não encontrado");
        }
        estado.setCodigo(JOptionPane.showInputDialog("informe o nome codigo"));
        estado.setNome(JOptionPane.showInputDialog("informe o novo nome "));
        entityManager.merge(estado);
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
