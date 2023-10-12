package com.tallerwebi.dominio;

import com.tallerwebi.presentacion.RespuestaCuestionario;

public interface ServicioCuestionario {
    boolean validarRespuestas(RespuestaCuestionario respuesta);
}