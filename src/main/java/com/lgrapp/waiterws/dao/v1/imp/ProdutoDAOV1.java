/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.IProdutoDAOV1;
import com.lgrapp.waiterws.model.Produto;
import java.util.List;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("produtoDAOV1")
public class ProdutoDAOV1 extends AbstractDAO<Produto> implements IProdutoDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public ProdutoDAOV1() {
        super(Produto.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public List<Produto> findAllActive() {
        return entityManager.createNamedQuery("Produto.findAllActive").getResultList();
    }

}
