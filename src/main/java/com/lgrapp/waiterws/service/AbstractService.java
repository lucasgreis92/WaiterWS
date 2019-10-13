/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.fileserver.service;

import com.lgrapp.fileserver.base.crud.interfaces.ICrud;
import java.util.List;

/**
 *
 * @author adm
 */
public abstract class AbstractService<T> {

    public void create(T entity) {
        getCrud().create(entity);
    }

    public void edit(T entity) {
        getCrud().edit(entity);
    }

    public void remove(Long id) {
        getCrud().remove(id);
    }

    public T find(Object id) {
        return (T) getCrud().find(id);
    }

    public List<T> findAll() {
        return getCrud().findAll();
    }

    public List<T> findRange(int first, int max) {
        return getCrud().findRange(first, max);
    }

    public int count() {
        return getCrud().count();
    }

    public abstract ICrud getCrud();

}
