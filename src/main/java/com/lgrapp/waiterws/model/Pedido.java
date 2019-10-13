/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lgrapp.waiterws.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pedido.findAll", query = "SELECT p FROM Pedido p")
    , @NamedQuery(name = "Pedido.findByIdPedido", query = "SELECT p FROM Pedido p WHERE p.idPedido = :idPedido")
    , @NamedQuery(name = "Pedido.findByDtAberturaPedido", query = "SELECT p FROM Pedido p WHERE p.dtAberturaPedido = :dtAberturaPedido")
    , @NamedQuery(name = "Pedido.findByDtFechamentoPedido", query = "SELECT p FROM Pedido p WHERE p.dtFechamentoPedido = :dtFechamentoPedido")
    , @NamedQuery(name = "Pedido.findByTotal", query = "SELECT p FROM Pedido p WHERE p.total = :total")})
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "pedido_gem", sequenceName = "\"pedido_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pedido_gem")
    @Column(name = "id_pedido")
    private Long idPedido;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dt_abertura_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAberturaPedido;
    @Column(name = "dt_fechamento_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtFechamentoPedido;
    @Column(name = "dt_entrega_pedido")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtEntregaPedido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "total")
    private Double total;
    @JoinColumn(name = "id_comanda", referencedColumnName = "id_comanda")
    @ManyToOne(optional = false)
    private Comanda idComanda;
    @JoinColumn(name = "id_mesa", referencedColumnName = "id_mesa")
    @ManyToOne(optional = false)
    private Mesa idMesa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPedido")
    private List<PedidoItem> pedidoItemList;

    public Pedido() {
    }

    public Pedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Pedido(Long idPedido, Date dtAberturaPedido, Double total) {
        this.idPedido = idPedido;
        this.dtAberturaPedido = dtAberturaPedido;
        this.total = total;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Date getDtAberturaPedido() {
        return dtAberturaPedido;
    }

    public void setDtAberturaPedido(Date dtAberturaPedido) {
        this.dtAberturaPedido = dtAberturaPedido;
    }

    public Date getDtFechamentoPedido() {
        return dtFechamentoPedido;
    }

    public void setDtFechamentoPedido(Date dtFechamentoPedido) {
        this.dtFechamentoPedido = dtFechamentoPedido;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Comanda getIdComanda() {
        return idComanda;
    }

    public void setIdComanda(Comanda idComanda) {
        this.idComanda = idComanda;
    }

    public Mesa getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(Mesa idMesa) {
        this.idMesa = idMesa;
    }

    public List<PedidoItem> getPedidoItemList() {
        return pedidoItemList;
    }

    public void setPedidoItemList(List<PedidoItem> pedidoItemList) {
        this.pedidoItemList = pedidoItemList;
    }

    public Date getDtEntregaPedido() {
        return dtEntregaPedido;
    }

    public void setDtEntregaPedido(Date dtEntregaPedido) {
        this.dtEntregaPedido = dtEntregaPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPedido != null ? idPedido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pedido)) {
            return false;
        }
        Pedido other = (Pedido) object;
        if ((this.idPedido == null && other.idPedido != null) || (this.idPedido != null && !this.idPedido.equals(other.idPedido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lgrapp.waiterws.model.Pedido[ idPedido=" + idPedido + " ]";
    }

}
