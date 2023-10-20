package com.tallerwebi.dominio;


import javax.persistence.*;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreProyecto;
    private int usuario;

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto, int usuario) {
        this.nombreProyecto = nombreProyecto;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }


}
