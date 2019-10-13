/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author adm
 */
@javax.ws.rs.ApplicationPath("services")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(com.lgrapp.CORSFilter.class);
        resources.add(com.lgrapp.waiterws.base.exception.AlertExceptionMapper.class);
        resources.add(com.lgrapp.waiterws.base.exception.ConsistenceExceptionMapper.class);
        resources.add(com.lgrapp.waiterws.controller.v1.CategoriaControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.ComandaControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.MesaControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.PedidoControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.PedidoItemControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.PedidoItemIngredienteControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.ProdutoControllerV1.class);
        resources.add(com.lgrapp.waiterws.controller.v1.ProdutoIngredienteControllerV1.class);
    }
    
}
