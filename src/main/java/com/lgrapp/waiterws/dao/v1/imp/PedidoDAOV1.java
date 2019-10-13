/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.IPedidoDAOV1;
import com.lgrapp.waiterws.model.Pedido;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("pedidoDAOV1")
public class PedidoDAOV1 extends AbstractDAO<Pedido> implements IPedidoDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public PedidoDAOV1() {
        super(Pedido.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

}
