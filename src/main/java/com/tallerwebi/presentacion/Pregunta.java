package com.tallerwebi.presentacion;

import java.util.List;

public class Pregunta {
    private String id;
    private String enunciado;
    private List<String> opciones;

    public Pregunta(String id, String enunciado, List<String> opciones) {
        this.id = id;
        this.enunciado = enunciado;
        this.opciones = opciones;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }
}