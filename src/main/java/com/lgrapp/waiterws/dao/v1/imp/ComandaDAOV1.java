/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.IComandaDAOV1;
import com.lgrapp.waiterws.model.Comanda;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("comandaDAOV1")
public class ComandaDAOV1 extends AbstractDAO<Comanda> implements IComandaDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public ComandaDAOV1() {
        super(Comanda.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

}
