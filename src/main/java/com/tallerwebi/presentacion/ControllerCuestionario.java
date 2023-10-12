package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ServicioCuestionario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ControllerCuestionario {
    private List<Pregunta> preguntas = new ArrayList<>();
    @Autowired
    private ServicioCuestionario servicioCuestionario;

    @RequestMapping("/cuestionario")
    public ModelAndView irACuestionario() {
        preguntas.clear(); // Limpia las preguntas existentes (hasta que tengamos la bdd)
        // Agrega preguntas al cuestionario
        preguntas.add(new Pregunta("1", "¿Qué tipo de proyecto desea realizar?", Arrays.asList(new String[]{"Piso", "Pared", "Habitación"})));
        preguntas.add(new Pregunta("2", "¿Qué dimensiones tiene?", Arrays.asList("Altura", "Ancho")));
        ModelMap modelo = new ModelMap();
        modelo.put("preguntas", preguntas);
        modelo.put("respuestas", new RespuestaCuestionario());
        return new ModelAndView("formulario-inicial", modelo);
    }

    @RequestMapping("/guardarRespuesta")
    public ModelAndView guardarRespuesta(@ModelAttribute RespuestaCuestionario respuesta) {
        ModelMap model = new ModelMap();
        // Llama al servicio para validar las respuestas
        boolean respuestasValidas = servicioCuestionario.validarRespuestas(respuesta);

        if (respuestasValidas) {
            return new ModelAndView("siguiente-proceso", model);
        } else {
            model.put("error", "Respuesta no válida");
            return new ModelAndView("formulario-inicial", model);
        }
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public ModelAndView inicio() {
        return new ModelAndView("redirect:/login");
    }
}
