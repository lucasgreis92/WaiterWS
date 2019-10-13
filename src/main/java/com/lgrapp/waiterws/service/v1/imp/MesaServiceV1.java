/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IMesaDAOV1;
import com.lgrapp.waiterws.model.Mesa;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IMesaServiceV1;

/**
 *
 * @author adm
 */
@Named("mesaServiceV1")
public class MesaServiceV1 extends AbstractService<Mesa> implements IMesaServiceV1 {

    @Inject
    @Named("mesaDAOV1")
    IMesaDAOV1 mesaDAOV1;

    @Override
    public IMesaDAOV1 getCrud() {
        return mesaDAOV1;
    }

}
