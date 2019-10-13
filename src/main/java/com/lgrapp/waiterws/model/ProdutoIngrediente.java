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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author adm
 */
@Entity
@Table(name = "produto_ingrediente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProdutoIngrediente.findAll", query = "SELECT p FROM ProdutoIngrediente p")
    , @NamedQuery(name = "ProdutoIngrediente.findByIdProdutoIngrediente", query = "SELECT p FROM ProdutoIngrediente p WHERE p.idProdutoIngrediente = :idProdutoIngrediente")
    , @NamedQuery(name = "ProdutoIngrediente.findByDsIngrediente", query = "SELECT p FROM ProdutoIngrediente p WHERE p.dsIngrediente = :dsIngrediente")
    , @NamedQuery(name = "ProdutoIngrediente.findAllActive", query = "SELECT p FROM ProdutoIngrediente p WHERE p.ieAtivo = true and p.idProduto.ieAtivo = true ")})
public class ProdutoIngrediente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @SequenceGenerator(name = "produto_ingrediente_gem", sequenceName = "\"produto_ingrediente_seq\"", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_ingrediente_gem")
    @Column(name = "id_produto_ingrediente")
    private Long idProdutoIngrediente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "ds_ingrediente")
    private String dsIngrediente;
    @JoinColumn(name = "id_produto", referencedColumnName = "id_produto")
    @ManyToOne(optional = false)
    private Produto idProduto;
    @Column(name = "ie_ativo")
    private boolean ieAtivo;

    public ProdutoIngrediente() {
    }

    public ProdutoIngrediente(Long idProdutoIngrediente) {
        this.idProdutoIngrediente = idProdutoIngrediente;
    }

    public ProdutoIngrediente(Long idProdutoIngrediente, String dsIngrediente) {
        this.idProdutoIngrediente = idProdutoIngrediente;
        this.dsIngrediente = dsIngrediente;
    }

    public Long getIdProdutoIngrediente() {
        return idProdutoIngrediente;
    }

    public void setIdProdutoIngrediente(Long idProdutoIngrediente) {
        this.idProdutoIngrediente = idProdutoIngrediente;
    }

    public String getDsIngrediente() {
        return dsIngrediente;
    }

    public void setDsIngrediente(String dsIngrediente) {
        this.dsIngrediente = dsIngrediente;
    }

    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    public boolean isIeAtivo() {
        return ieAtivo;
    }

    public void setIeAtivo(boolean ieAtivo) {
        this.ieAtivo = ieAtivo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProdutoIngrediente != null ? idProdutoIngrediente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProdutoIngrediente)) {
            return false;
        }
        ProdutoIngrediente other = (ProdutoIngrediente) object;
        if ((this.idProdutoIngrediente == null && other.idProdutoIngrediente != null) || (this.idProdutoIngrediente != null && !this.idProdutoIngrediente.equals(other.idProdutoIngrediente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lgrapp.waiterws.model.ProdutoIngrediente[ idProdutoIngrediente=" + idProdutoIngrediente + " ]";
    }

}
