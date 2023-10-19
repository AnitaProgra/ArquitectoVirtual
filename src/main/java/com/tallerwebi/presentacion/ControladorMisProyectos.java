package com.tallerwebi.presentacion;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorMisProyectos {

    @RequestMapping("/misProyectos")
    public ModelAndView irAMisProyectos() {

        return new ModelAndView("misProyectos");
    }
}
