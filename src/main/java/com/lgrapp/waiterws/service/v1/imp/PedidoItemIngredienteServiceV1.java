/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IPedidoItemIngredienteDAOV1;
import com.lgrapp.waiterws.model.PedidoItemIngrediente;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IPedidoItemIngredienteServiceV1;

/**
 *
 * @author adm
 */
@Named("pedidoItemIngredienteServiceV1")
public class PedidoItemIngredienteServiceV1 extends AbstractService<PedidoItemIngrediente> implements IPedidoItemIngredienteServiceV1 {

    @Inject
    @Named("pedidoItemIngredienteDAOV1")
    IPedidoItemIngredienteDAOV1 pedidoItemIngredienteDAOV1;

    @Override
    public IPedidoItemIngredienteDAOV1 getCrud() {
        return pedidoItemIngredienteDAOV1;
    }

}
