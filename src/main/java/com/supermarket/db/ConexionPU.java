package com.supermarket.db;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Werner Obdulio Emmanuel Tuj Chacom
 * @date 22/09/2022
 * @time 23:45:26
 *
 * Código técnico: IN5BV Grupo: 2/2
 *
 *
 */
public class ConexionPU {

    private static final String PERSISTENCE_UNIT_NAME = "supermarket_kinal_pu";
    private EntityManager entityManager;
    private static ConexionPU instance;

    private ConexionPU() {
        try {
            entityManager = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
            System.out.println("Conexión establecida con éxito a través de una unidad de persistencia");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }

    public static ConexionPU getInstance() {
        if (instance == null) {
            instance = new ConexionPU();
        }
        return instance;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
