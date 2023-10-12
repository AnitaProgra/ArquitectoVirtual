package com.tallerwebi.presentacion;

import java.util.HashMap;
import java.util.Map;

public class RespuestaCuestionario {
    private Map<String, String> preguntas = new HashMap<>();

    public RespuestaCuestionario(){}

    public RespuestaCuestionario(Map<String, String> preguntas) {
        this.preguntas = preguntas;
    }

    public Map<String, String> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Map<String, String> preguntas) {
        this.preguntas = preguntas;
    }
}