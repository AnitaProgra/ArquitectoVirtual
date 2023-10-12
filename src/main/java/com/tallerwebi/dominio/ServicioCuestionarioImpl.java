package com.tallerwebi.dominio;

import com.tallerwebi.presentacion.RespuestaCuestionario;
import org.springframework.stereotype.Service;

@Service
public class ServicioCuestionarioImpl implements ServicioCuestionario {
    public boolean validarRespuestas(RespuestaCuestionario respuesta) {
        // Realiza la validación de las respuestas aquí

        for (String valorRespuesta : respuesta.getPreguntas().values()) {
            if (valorRespuesta == null) {
                return false; // Respuesta no válida
            }
        }
        return true;
    }
}