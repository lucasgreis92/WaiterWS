/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IPedidoDAOV1;
import com.lgrapp.waiterws.model.Pedido;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IPedidoServiceV1;

/**
 *
 * @author adm
 */
@Named("pedidoServiceV1")
public class PedidoServiceV1 extends AbstractService<Pedido> implements IPedidoServiceV1 {

    @Inject
    @Named("pedidoDAOV1")
    IPedidoDAOV1 pedidoDAOV1;

    @Override
    public IPedidoDAOV1 getCrud() {
        return pedidoDAOV1;
    }

}
