/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.controller.v1;

import com.lgrapp.waiterws.model.ProdutoIngrediente;
import com.lgrapp.waiterws.service.v1.custom.IProdutoIngredienteServiceV1;
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
@Path("v1/produtoingrediente")
public class ProdutoIngredienteControllerV1 {

    @Inject
    @Named("produtoIngredienteServiceV1")
    IProdutoIngredienteServiceV1 produtoIngredienteServiceV1;

    public ProdutoIngredienteControllerV1() {

    }

    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(ProdutoIngrediente entity) {
        produtoIngredienteServiceV1.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, ProdutoIngrediente entity) {
        produtoIngredienteServiceV1.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        produtoIngredienteServiceV1.remove(id);
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public ProdutoIngrediente find(@PathParam("id") Long id) {
        return produtoIngredienteServiceV1.find(id);
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ProdutoIngrediente> findAll() {
        return produtoIngredienteServiceV1.findAll();
    }

    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Path("active")
    public List<ProdutoIngrediente> findAllActive() {
        return produtoIngredienteServiceV1.findAllActive();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<ProdutoIngrediente> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return produtoIngredienteServiceV1.findRange(from, to);
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public int countREST() {
        return produtoIngredienteServiceV1.count();
    }

}
