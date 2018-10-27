/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Persona Entity Class from USUARIO database.
 * @author Alvaro Velasco
 * @author Mario Torbado
 */
@Entity
@Table(name = "PERSONA")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")
    , @NamedQuery(name = "Persona.findByNif", query = "SELECT p FROM Persona p WHERE p.nif = :nif")
    , @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Persona.findByApellidos", query = "SELECT p FROM Persona p WHERE p.apellidos = :apellidos")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "NIF")
    private String nif;
    @Size(max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 20)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "emNif")
    private Collection<Empleado> empleadoCollection;
    @OneToMany(mappedBy = "abNif")
    private Collection<Abonado> abonadoCollection;

    /**
     * Empty constructor.
     */
    public Persona() {
    }

    /**
     * Regular constructor.
     * @param nif NIF for new Persona instance
     */
    public Persona(String nif) {
        this.nif = nif;
    }

    /**
     * Returns Persona's NIF.
     * @return nif
     */
    public String getNif() {
        return nif;
    }

    /**
     * Sets Persona's new NIF.
     * @param nif 
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Returns Persona's name.
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets Persona's new name.
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Returns Persona's surnames.
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * Sets Persona's new surnames.
     * @param apellidos 
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * Returns the Collection of Empleado from the database.
     * @return empleadoCollection
     */
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    /**
     * Sets a new Collection of Empleado.
     * @param empleadoCollection 
     */
    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    /**
     * Returns the Collection of Abonado from the database.
     * @return abonadoCollection
     */
    public Collection<Abonado> getAbonadoCollection() {
        return abonadoCollection;
    }

    /**
     * Sets a new Collection of Abonado
     * @param abonadoCollection 
     */
    public void setAbonadoCollection(Collection<Abonado> abonadoCollection) {
        this.abonadoCollection = abonadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nif != null ? nif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.nif == null && other.nif != null) || (this.nif != null && !this.nif.equals(other.nif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Dominio.Persona[ nif=" + nif + " ]";
    }
    
}
