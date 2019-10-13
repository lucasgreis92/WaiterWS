/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.imp;

import com.lgrapp.fileserver.service.AbstractService;
import com.lgrapp.waiterws.dao.v1.custom.IProdutoDAOV1;
import com.lgrapp.waiterws.model.Produto;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import com.lgrapp.waiterws.service.v1.custom.IProdutoServiceV1;
import java.util.List;

/**
 *
 * @author adm
 */

@Named("produtoServiceV1")
public class ProdutoServiceV1 extends AbstractService<Produto> implements IProdutoServiceV1 {

    @Inject
    @Named("produtoDAOV1")
    IProdutoDAOV1 produtoDAOV1;

    @Override
    public IProdutoDAOV1 getCrud() {
        return produtoDAOV1;
    }

    @Override
    public List<Produto> findAllActive() {
        return produtoDAOV1.findAllActive();
    }

}
