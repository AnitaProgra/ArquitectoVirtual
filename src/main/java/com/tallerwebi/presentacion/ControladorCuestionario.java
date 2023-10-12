package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ServicioCuestionario;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.Clock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ControladorCuestionario {
    private List<Pregunta> preguntas = new ArrayList<>();
    @Autowired
    private ServicioCuestionario servicioCuestionario;

    @RequestMapping("/cuestionario")
    public ModelAndView irACuestionario() {
        /*preguntas.clear(); // Limpia las preguntas existentes (hasta que tengamos la bdd)
        // Agrega preguntas al cuestionario
        preguntas.add(new Pregunta("1", "¿Qué tipo de proyecto desea realizar?", Arrays.asList(new String[]{"Piso", "Pared", "Habitación"})));
        preguntas.add(new Pregunta("2", "¿Qué dimensiones tiene?", Arrays.asList("Altura", "Ancho")));*/
        /*ModelMap modelo = new ModelMap();
        modelo.put("preguntas", preguntas);
        modelo.put("respuestas", new RespuestaCuestionario());*/
        ModelMap modelo = new ModelMap();
        modelo.put("datosProyecto", new DatosProyecto());

        return new ModelAndView("formulario",modelo);
    }

    @RequestMapping(path = "/guardarRespuesta", method = RequestMethod.POST)
    public ModelAndView guardarRespuesta(@ModelAttribute("datosProyecto") DatosProyecto datosProyecto) {
        ModelMap model = new ModelMap();
        // Llama al servicio para validar las respuestas
        //boolean respuestasValidas = servicioCuestionario.validarRespuestas(respuesta);
        String respuesta = servicioCuestionario.validarRespuestas(datosProyecto.getTipo_proyecto());
        model.put("respuesta",respuesta);
        model.put("datos",datosProyecto);
        return new ModelAndView("respuesta",model);
        /*if (respuestasValidas) {
            return new ModelAndView("siguiente-proceso", model);
        } else {
            model.put("error", "Respuesta no válida");
            return new ModelAndView("formulario-inicial", model);
        }*/
    }
}
