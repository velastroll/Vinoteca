/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matorb
 */
@Entity
@Table(name = "VINO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vino.findAll", query = "SELECT v FROM Vino v"),
    @NamedQuery(name = "Vino.findById", query = "SELECT v FROM Vino v WHERE v.id = :id"),
    @NamedQuery(name = "Vino.findByNombrecomercial", query = "SELECT v FROM Vino v WHERE v.nombrecomercial = :nombrecomercial"),
    @NamedQuery(name = "Vino.findByComentario", query = "SELECT v FROM Vino v WHERE v.comentario = :comentario"),
    @NamedQuery(name = "Vino.findByIdbodega", query = "SELECT v FROM Vino v WHERE v.idbodega = :idbodega"),
    @NamedQuery(name = "Vino.findByCategoria", query = "SELECT v FROM Vino v WHERE v.categoria = :categoria"),
    @NamedQuery(name = "Vino.findByIddenominacion", query = "SELECT v FROM Vino v WHERE v.iddenominacion = :iddenominacion")})
public class Vino implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "NOMBRECOMERCIAL")
    private String nombrecomercial;
    @Size(max = 200)
    @Column(name = "COMENTARIO")
    private String comentario;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDBODEGA")
    private int idbodega;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATEGORIA")
    private Character categoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDDENOMINACION")
    private int iddenominacion;

    public Vino() {
    }

    public Vino(Integer id) {
        this.id = id;
    }

    public Vino(Integer id, int idbodega, Character categoria, int iddenominacion) {
        this.id = id;
        this.idbodega = idbodega;
        this.categoria = categoria;
        this.iddenominacion = iddenominacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombrecomercial() {
        return nombrecomercial;
    }

    public void setNombrecomercial(String nombrecomercial) {
        this.nombrecomercial = nombrecomercial;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getIdbodega() {
        return idbodega;
    }

    public void setIdbodega(int idbodega) {
        this.idbodega = idbodega;
    }

    public Character getCategoria() {
        return categoria;
    }

    public void setCategoria(Character categoria) {
        this.categoria = categoria;
    }

    public int getIddenominacion() {
        return iddenominacion;
    }

    public void setIddenominacion(int iddenominacion) {
        this.iddenominacion = iddenominacion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vino)) {
            return false;
        }
        Vino other = (Vino) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Vino[ id=" + id + " ]";
    }
    
}
