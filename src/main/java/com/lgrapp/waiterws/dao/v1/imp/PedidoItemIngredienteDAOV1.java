/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.IPedidoItemIngredienteDAOV1;
import com.lgrapp.waiterws.model.PedidoItemIngrediente;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("pedidoItemIngredienteDAOV1")
public class PedidoItemIngredienteDAOV1 extends AbstractDAO<PedidoItemIngrediente> implements IPedidoItemIngredienteDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public PedidoItemIngredienteDAOV1() {
        super(PedidoItemIngrediente.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

}
