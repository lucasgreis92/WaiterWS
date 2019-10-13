/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.dao.v1.imp;

import com.lgrapp.waiterws.dao.AbstractDAO;
import com.lgrapp.waiterws.dao.v1.custom.ICategoriaDAOV1;
import com.lgrapp.waiterws.dao.v1.custom.IPedidoItemDAOV1;
import com.lgrapp.waiterws.model.Categoria;
import com.lgrapp.waiterws.model.PedidoItem;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author adm
 */
@Named("pedidoItemDAOV1")
public class PedidoItemDAOV1 extends AbstractDAO<PedidoItem> implements IPedidoItemDAOV1 {

    @PersistenceContext(unitName = "waiter_PU")
    private EntityManager entityManager;

    public PedidoItemDAOV1() {
        super(PedidoItem.class);
    }

    @Override
    public EntityManager getEntityManager() {
        return entityManager;
    }

}
