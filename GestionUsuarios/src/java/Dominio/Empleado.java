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
 *
 * @author Alvaro Velasco
 * @author Mario Torbado
 */
@Entity
@Table(name = "EMPLEADO")
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e")
    , @NamedQuery(name = "Empleado.findByEmLogin", query = "SELECT e FROM Empleado e WHERE e.emLogin = :emLogin")
    , @NamedQuery(name = "Empleado.findByEmPasswd", query = "SELECT e FROM Empleado e WHERE e.emPasswd = :emPasswd")
    , @NamedQuery(name = "Empleado.findByPuedeModificar", query = "SELECT e FROM Empleado e WHERE e.puedeModificar = :puedeModificar")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "EM_LOGIN")
    private String emLogin;
    @Size(max = 8)
    @Column(name = "EM_PASSWD")
    private String emPasswd;
    @Column(name = "PUEDE_MODIFICAR")
    private Boolean puedeModificar;
    @JoinColumn(name = "EM_NIF", referencedColumnName = "NIF")
    @ManyToOne(optional = false)
    private Persona emNif;

    /**
     * Empty constructor.
     */
    public Empleado() {
    }

    /**
     * Regular constructor.
     * @param emLogin login for the new Empleado instance
     */
    public Empleado(String emLogin) {
        this.emLogin = emLogin;
    }

    /**
     * Returns Empleado's login.
     * @return emLogin
     */
    public String getEmLogin() {
        return emLogin;
    }

    /**
     * Sets Empleado's new login.
     * @param emLogin 
     */
    public void setEmLogin(String emLogin) {
        this.emLogin = emLogin;
    }

    /**
     * Returns Empleado's password.
     * @return emPasswd
     */
    public String getEmPasswd() {
        return emPasswd;
    }

    /**
     * Sets Empleado's new password.
     * @param emPasswd 
     */
    public void setEmPasswd(String emPasswd) {
        this.emPasswd = emPasswd;
    }

    /**
     * Returns true if Empleado is modifiable, false otherwise.
     * @return puedeModificar
     */
    public Boolean getPuedeModificar() {
        return puedeModificar;
    }

    /**
     * Sets Empleado's modicability
     * @param puedeModificar 
     */
    public void setPuedeModificar(Boolean puedeModificar) {
        this.puedeModificar = puedeModificar;
    }

    /**
     *  Returns the Persona instance corresponding to the Empleado.
     * @return emNif (Persona)
     */
    public Persona getEmNif() {
        return emNif;
    }

    /**
     * Sets the corresponding Persona instance to the Empleado.
     * @param emNif (Persona)
     */
    public void setEmNif(Persona emNif) {
        this.emNif = emNif;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (emLogin != null ? emLogin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.emLogin == null && other.emLogin != null) || (this.emLogin != null && !this.emLogin.equals(other.emLogin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Empleado[ emLogin=" + emLogin + " ]";
    }
    
}
