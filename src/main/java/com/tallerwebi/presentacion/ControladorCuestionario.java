package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ServicioCuestionario;
import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.time.Clock;
import java.util.*;

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
        modelo.addAttribute("datosProyecto", new DatosProyecto());

        return new ModelAndView("formulario",modelo);
    }

    @RequestMapping(path = "/guardarRespuesta", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> guardarRespuesta(@ModelAttribute("datosProyecto") DatosProyecto datosProyecto) {
        Map<String, Object> response = new HashMap<>();

        // Llama al servicio para validar las respuestas
        String respuesta = servicioCuestionario.validarRespuestas(datosProyecto.getTipo_proyecto());

        response.put("respuesta", respuesta);
        response.put("datos", datosProyecto);

        return response;
    }
}
