package com.tallerwebi.infraestructura;

import com.tallerwebi.auxiliar.Respuestas;
import com.tallerwebi.dominio.ServicioCuestionario;
import org.springframework.stereotype.Service;

@Service
public class ServicioCuestionarioImpl implements ServicioCuestionario {
    public String validarRespuestas(String respuesta) {
        Respuestas resp = new Respuestas();
        // Realiza la validación de las respuestas aquí

        if(respuesta.equals("piso")){
            return resp.piso;
        }else if(respuesta.equals("pared")){
            return resp.pared;
        }else{
            return resp.habitacion;
        }
    }
}