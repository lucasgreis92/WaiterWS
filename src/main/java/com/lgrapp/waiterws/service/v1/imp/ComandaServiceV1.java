/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IComandaDAOV1;
import com.lgrapp.waiterws.model.Comanda;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IComandaServiceV1;

/**
 *
 * @author adm
 */
@Named("comandaServiceV1")
public class ComandaServiceV1 extends AbstractService<Comanda> implements IComandaServiceV1 {

    @Inject
    @Named("comandaDAOV1")
    IComandaDAOV1 comandaDAOV1;

    @Override
    public IComandaDAOV1 getCrud() {
        return comandaDAOV1;
    }

}
