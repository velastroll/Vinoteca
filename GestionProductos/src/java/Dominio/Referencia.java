/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Mario Torbado
 */
@Entity
@Table(name = "REFERENCIA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Referencia.findAll", query = "SELECT r FROM Referencia r")
    , @NamedQuery(name = "Referencia.findByCodigo", query = "SELECT r FROM Referencia r WHERE r.codigo = :codigo")
    , @NamedQuery(name = "Referencia.findByEsporcajas", query = "SELECT r FROM Referencia r WHERE r.esporcajas = :esporcajas")
    , @NamedQuery(name = "Referencia.findByContenido", query = "SELECT r FROM Referencia r WHERE r.contenido = :contenido")
    , @NamedQuery(name = "Referencia.findByPrecio", query = "SELECT r FROM Referencia r WHERE r.precio = :precio")
    , @NamedQuery(name = "Referencia.findByVinoid", query = "SELECT r FROM Referencia r WHERE r.vinoid = :vinoid")})
public class Referencia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "ESPORCAJAS")
    private Character esporcajas;
    @Column(name = "CONTENIDO")
    private Short contenido;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRECIO")
    private Float precio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "VINOID")
    private int vinoid;

    public Referencia() {
    }

    public Referencia(Integer codigo) {
        this.codigo = codigo;
    }

    public Referencia(Integer codigo, int vinoid) {
        this.codigo = codigo;
        this.vinoid = vinoid;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Character getEsporcajas() {
        return esporcajas;
    }

    public void setEsporcajas(Character esporcajas) {
        this.esporcajas = esporcajas;
    }

    public Short getContenido() {
        return contenido;
    }

    public void setContenido(Short contenido) {
        this.contenido = contenido;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public int getVinoid() {
        return vinoid;
    }

    public void setVinoid(int vinoid) {
        this.vinoid = vinoid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Referencia)) {
            return false;
        }
        Referencia other = (Referencia) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Referencia[ codigo=" + codigo + " ]";
    }
    
}
