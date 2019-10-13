/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "comanda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comanda.findAll", query = "SELECT c FROM Comanda c")
    , @NamedQuery(name = "Comanda.findByIdComanda", query = "SELECT c FROM Comanda c WHERE c.idComanda = :idComanda")
    , @NamedQuery(name = "Comanda.findByDsComanda", query = "SELECT c FROM Comanda c WHERE c.dsComanda = :dsComanda")})
public class Comanda implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "comanda_gem", sequenceName = "\"comanda_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "comanda_gem")
    @Column(name = "id_comanda")
    private Long idComanda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ds_comanda")
    private String dsComanda;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idComanda")
    private List<Pedido> pedidoList;

    public Comanda() {
    }

    public Comanda(Long idComanda) {
        this.idComanda = idComanda;
    }

    public Comanda(Long idComanda, String dsComanda) {
        this.idComanda = idComanda;
        this.dsComanda = dsComanda;
    }

    public Long getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Long idComanda) {
        this.idComanda = idComanda;
    }

    public String getDsComanda() {
        return dsComanda;
    }

    public void setDsComanda(String dsComanda) {
        this.dsComanda = dsComanda;
    }

    @XmlTransient
    public List<Pedido> getPedidoList() {
        return pedidoList;
    }

    public void setPedidoList(List<Pedido> pedidoList) {
        this.pedidoList = pedidoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idComanda != null ? idComanda.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comanda)) {
            return false;
        }
        Comanda other = (Comanda) object;
        if ((this.idComanda == null && other.idComanda != null) || (this.idComanda != null && !this.idComanda.equals(other.idComanda))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lgrapp.waiterws.model.Comanda[ idComanda=" + idComanda + " ]";
    }

}
