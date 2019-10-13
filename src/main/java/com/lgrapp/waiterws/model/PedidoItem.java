/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "pedido_item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoItem.findAll", query = "SELECT p FROM PedidoItem p")
    , @NamedQuery(name = "PedidoItem.findByIdPedidoItem", query = "SELECT p FROM PedidoItem p WHERE p.idPedidoItem = :idPedidoItem")
    , @NamedQuery(name = "PedidoItem.findByQtProduto", query = "SELECT p FROM PedidoItem p WHERE p.qtProduto = :qtProduto")})
public class PedidoItem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_pedido_item")
    private Long idPedidoItem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "qt_produto")
    private int qtProduto;
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
    @ManyToOne(optional = false)
    private Produto idProduto;
    @JoinColumn(name = "id_pedido", referencedColumnName = "id_pedido")
    @ManyToOne(optional = false)
    private Pedido idPedido;

    
    public PedidoItem() {
    }

    public PedidoItem(Long idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }

    public PedidoItem(Long idPedidoItem, int qtProduto) {
        this.idPedidoItem = idPedidoItem;
        this.qtProduto = qtProduto;
    }

    public Long getIdPedidoItem() {
        return idPedidoItem;
    }

    public void setIdPedidoItem(Long idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }

    public int getQtProduto() {
        return qtProduto;
    }

    public void setQtProduto(int qtProduto) {
        this.qtProduto = qtProduto;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedidoItem != null ? idPedidoItem.hashCode() : 0);
        return hash;
    }

    public Pedido getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Pedido idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoItem)) {
            return false;
        }
        PedidoItem other = (PedidoItem) object;
        if ((this.idPedidoItem == null && other.idPedidoItem != null) || (this.idPedidoItem != null && !this.idPedidoItem.equals(other.idPedidoItem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lgrapp.waiterws.model.PedidoItem[ idPedidoItem=" + idPedidoItem + " ]";
    }

}
