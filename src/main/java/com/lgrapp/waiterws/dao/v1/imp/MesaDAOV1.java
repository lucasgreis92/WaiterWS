/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.IMesaDAOV1;
import com.lgrapp.waiterws.model.Mesa;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("mesaDAOV1")
public class MesaDAOV1 extends AbstractDAO<Mesa> implements IMesaDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public MesaDAOV1() {
        super(Mesa.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

}
