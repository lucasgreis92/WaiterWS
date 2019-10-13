/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "pedido_item_ingrediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PedidoItemIngrediente.findAll", query = "SELECT p FROM PedidoItemIngrediente p")
    , @NamedQuery(name = "PedidoItemIngrediente.findByIdPedidoItemIngrediente", query = "SELECT p FROM PedidoItemIngrediente p WHERE p.idPedidoItemIngrediente = :idPedidoItemIngrediente")})
public class PedidoItemIngrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "pedido_item_ingrediente_gem", sequenceName = "\"pedido_item_ingrediente_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_item_ingrediente_gem")
    @Column(name = "id_pedido_item_ingrediente")
    private Long idPedidoItemIngrediente;
    @JoinColumn(name = "id_pedido_item", referencedColumnName = "id_pedido_item")
    @ManyToOne
    private PedidoItem idPedidoItem;
    @JoinColumn(name = "id_produto_ingrediente", referencedColumnName = "id_produto_ingrediente")
    @ManyToOne
    private ProdutoIngrediente idProdutoIngrediente;

    public PedidoItemIngrediente() {
    }

    public PedidoItemIngrediente(Long idPedidoItemIngrediente) {
        this.idPedidoItemIngrediente = idPedidoItemIngrediente;
    }

    public Long getIdPedidoItemIngrediente() {
        return idPedidoItemIngrediente;
    }

    public void setIdPedidoItemIngrediente(Long idPedidoItemIngrediente) {
        this.idPedidoItemIngrediente = idPedidoItemIngrediente;
    }

    public PedidoItem getIdPedidoItem() {
        return idPedidoItem;
    }

    public void setIdPedidoItem(PedidoItem idPedidoItem) {
        this.idPedidoItem = idPedidoItem;
    }

    public ProdutoIngrediente getIdProdutoIngrediente() {
        return idProdutoIngrediente;
    }

    public void setIdProdutoIngrediente(ProdutoIngrediente idProdutoIngrediente) {
        this.idProdutoIngrediente = idProdutoIngrediente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedidoItemIngrediente != null ? idPedidoItemIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoItemIngrediente)) {
            return false;
        }
        PedidoItemIngrediente other = (PedidoItemIngrediente) object;
        if ((this.idPedidoItemIngrediente == null && other.idPedidoItemIngrediente != null) || (this.idPedidoItemIngrediente != null && !this.idPedidoItemIngrediente.equals(other.idPedidoItemIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lgrapp.waiterws.model.PedidoItemIngrediente[ idPedidoItemIngrediente=" + idPedidoItemIngrediente + " ]";
    }

}
