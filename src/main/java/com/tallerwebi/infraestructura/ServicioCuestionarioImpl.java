package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Cuestionario;

public class ServicioCuestionarioImpl {
    private String pisos = "Para hace pisos necesitas tal y tal cosa, preferentemente haces tal cosa antes que otra.."

    public void evaluacionPregunta1(Cuestionario cuestionario){
        //Construccion de pisos.
        //Texto = "Materiales, paso a paso y los profesionales a usar
        cuestionario.tipoConstruccion = "pisos";
        return pisos;

    }

    public void evaluacionPregunta2(Cuestionario cuestionario){
        if(cuestionario.tipoConstruccion == "pisos") {
            dimensionesPisos(cuestionario.dimensiones);
        }

    }
}

//todo Controlador
//formPostMap [a, b, 32x25,

//String textitoQueVaAIrALaVista = ServicioCuestionarioImpl.evaluacionPregunta1(cuestionario);