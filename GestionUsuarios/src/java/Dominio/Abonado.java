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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Abonado Entity Class from USUARIO database.
 * @author Álvaro Velasco
 * @author Mario Torbado
 */
@Entity
@Table(name = "ABONADO")
@NamedQueries({
    @NamedQuery(name = "Abonado.findAll", query = "SELECT a FROM Abonado a")
    , @NamedQuery(name = "Abonado.findByAbLogin", query = "SELECT a FROM Abonado a WHERE a.abLogin = :abLogin")
    , @NamedQuery(name = "Abonado.findByAbPasswd", query = "SELECT a FROM Abonado a WHERE a.abPasswd = :abPasswd")})
public class Abonado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "AB_LOGIN")
    private String abLogin;
    @Size(max = 8)
    @Column(name = "AB_PASSWD")
    private String abPasswd;
    @JoinColumn(name = "AB_NIF", referencedColumnName = "NIF")
    @ManyToOne
    private Persona abNif;
    
    /**
     * Empty constructor.
     */
    public Abonado() {
    }

    /**
     * Regular constructor.
     * @param abLogin login for new Abonado instance
     */
    public Abonado(String abLogin) {
        this.abLogin = abLogin;
    }
    
    /**
     * Returns Abonado's login.
     * @return abLogin
     */
    public String getAbLogin() {
        return abLogin;
    }
    
    /**
     * Sets Abonado's new login.
     * @param abLogin 
     */
    public void setAbLogin(String abLogin) {
        this.abLogin = abLogin;
    }

    /**
     * Returns Abonado's password.
     * @return abPasswd
     */
    public String getAbPasswd() {
        return abPasswd;
    }

    /**
     * Sets Abonado's new password.
     * @param abPasswd 
     */
    public void setAbPasswd(String abPasswd) {
        this.abPasswd = abPasswd;
    }

    /**
     * Returns the Persona instance corresponding to the Abonado.
     * @return abNif (Persona)
     */
    public Persona getAbNif() {
        return abNif;
    }

    /**
     * Sets the corresponding Persona instance to the Abonado.
     * @param abNif (Persona)
     */
    public void setAbNif(Persona abNif) {
        this.abNif = abNif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (abLogin != null ? abLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Abonado)) {
            return false;
        }
        Abonado other = (Abonado) object;
        if ((this.abLogin == null && other.abLogin != null) || (this.abLogin != null && !this.abLogin.equals(other.abLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Abonado[ abLogin=" + abLogin + " ]";
    }
    
}
