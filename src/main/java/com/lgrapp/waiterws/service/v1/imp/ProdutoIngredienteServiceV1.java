/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IProdutoIngredienteDAOV1;
import com.lgrapp.waiterws.model.ProdutoIngrediente;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IProdutoIngredienteServiceV1;
import java.util.List;

/**
 *
 * @author adm
 */
@Named("produtoIngredienteServiceV1")
public class ProdutoIngredienteServiceV1 extends AbstractService<ProdutoIngrediente> implements IProdutoIngredienteServiceV1 {

    @Inject
    @Named("produtoIngredienteDAOV1")
    IProdutoIngredienteDAOV1 produtoIngredienteDAOV1;

    @Override
    public IProdutoIngredienteDAOV1 getCrud() {
        return produtoIngredienteDAOV1;
    }

    @Override
    public List<ProdutoIngrediente> findAllActive() {
        return produtoIngredienteDAOV1.findAllActive();
    }

}
