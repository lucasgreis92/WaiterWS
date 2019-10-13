/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.service.v1.custom;

import com.lgrapp.fileserver.base.crud.interfaces.ICrud;
import com.lgrapp.waiterws.model.Categoria;
import java.util.List;

/**
 *
 * @author adm
 */
public interface ICategoriaServiceV1 extends ICrud<Categoria> {

    List<Categoria> findAllActive();
}
