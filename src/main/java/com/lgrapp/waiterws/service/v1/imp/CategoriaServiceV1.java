/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.ICategoriaDAOV1;
import com.lgrapp.waiterws.model.Categoria;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.ICategoriaServiceV1;
import java.util.List;

/**
 *
 * @author adm
 */
@Named("categoriaServiceV1")
public class CategoriaServiceV1 extends AbstractService<Categoria> implements ICategoriaServiceV1 {

    @Inject
    @Named("categoriaDAOV1")
    ICategoriaDAOV1 categoriaDAOV1;

    @Override
    public ICategoriaDAOV1 getCrud() {
        return categoriaDAOV1;
    }

    @Override
    public List<Categoria> findAllActive() {
        return categoriaDAOV1.findAllActive();
    }

}
