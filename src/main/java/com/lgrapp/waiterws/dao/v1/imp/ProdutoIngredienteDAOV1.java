/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.IProdutoIngredienteDAOV1;
import com.lgrapp.waiterws.model.ProdutoIngrediente;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("produtoIngredienteDAOV1")
public class ProdutoIngredienteDAOV1 extends AbstractDAO<ProdutoIngrediente> implements IProdutoIngredienteDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public ProdutoIngredienteDAOV1() {
        super(ProdutoIngrediente.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<ProdutoIngrediente> findAllActive() {
        return entityManager.createNamedQuery("ProdutoIngrediente.findAllActive").getResultList();
    }

}
