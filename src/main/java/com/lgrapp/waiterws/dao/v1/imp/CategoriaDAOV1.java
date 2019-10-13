/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.ICategoriaDAOV1;
import com.lgrapp.waiterws.model.Categoria;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("categoriaDAOV1")
public class CategoriaDAOV1 extends AbstractDAO<Categoria> implements ICategoriaDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public CategoriaDAOV1() {
        super(Categoria.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Categoria> findAllActive() {
        return entityManager.createNamedQuery("Categoria.findAllActive").getResultList();
    }

}
