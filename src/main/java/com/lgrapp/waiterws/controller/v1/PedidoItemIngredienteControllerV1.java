/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.controller.v1;

import com.lgrapp.waiterws.model.PedidoItemIngrediente;
import com.lgrapp.waiterws.service.v1.custom.IPedidoItemIngredienteServiceV1;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author adm
 */
@Stateless
@Path("v1/pedidoitemingrediente")
public class PedidoItemIngredienteControllerV1  {

    @Inject
    @Named("pedidoItemIngredienteServiceV1")
    IPedidoItemIngredienteServiceV1 pedidoItemIngredienteServiceV1;

    public PedidoItemIngredienteControllerV1() {
     
    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(PedidoItemIngrediente entity) {
        pedidoItemIngredienteServiceV1.create(entity);

    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, PedidoItemIngrediente entity) {
        pedidoItemIngredienteServiceV1.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        pedidoItemIngredienteServiceV1.remove(id);
        
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public PedidoItemIngrediente find(@PathParam("id") Long id) {
        return pedidoItemIngredienteServiceV1.find(id);
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<PedidoItemIngrediente> findAll() {
        return pedidoItemIngredienteServiceV1.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<PedidoItemIngrediente> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return pedidoItemIngredienteServiceV1.findRange(from, to);
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countREST() {
        return pedidoItemIngredienteServiceV1.count();
    }
    
}
