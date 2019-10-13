/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IPedidoItemDAOV1;
import com.lgrapp.waiterws.model.PedidoItem;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IPedidoItemServiceV1;

/**
 *
 * @author adm
 */
@Named("pedidoItemServiceV1")
public class PedidoItemServiceV1 extends AbstractService<PedidoItem> implements IPedidoItemServiceV1 {

    @Inject
    @Named("pedidoItemDAOV1")
    IPedidoItemDAOV1 pedidoItemDAOV1;

    @Override
    public IPedidoItemDAOV1 getCrud() {
        return pedidoItemDAOV1;
    }

}
