package sena.ejemplo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol {
    
    // Atributos

    // Primary Key

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdRol;

    @Column(name="nombre", nullable = false)
    private String nombre;

    // CONSTRUCTORES

    public Rol(){
    }

    public Rol(Integer idRol, String nombre) {
        IdRol = idRol;
        this.nombre = nombre;
    }

    // GETTERS AND SETTERS

    public Integer getIdRol() {
        return IdRol;
    }

    public void setIdRol(Integer idRol) {
        IdRol = idRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
