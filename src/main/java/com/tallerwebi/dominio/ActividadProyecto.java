package com.tallerwebi.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ActividadProyecto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idActividad;
    private int idProyecto;
    private String actividad;
    private int etapa;
    private boolean estado;

    public ActividadProyecto() {
    }

    public ActividadProyecto(int idActividad, int idProyecto, String actividad, int etapa, boolean estado) {
        this.idActividad = idActividad;
        this.idProyecto = idProyecto;
        this.actividad = actividad;
        this.etapa = etapa;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getEtapa() {
        return etapa;
    }

    public void setEtapa(int etapa) {
        this.etapa = etapa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
