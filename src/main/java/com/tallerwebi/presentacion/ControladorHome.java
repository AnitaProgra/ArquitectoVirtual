package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.Proyecto;
import com.tallerwebi.dominio.ServicioProyecto;
import com.tallerwebi.dominio.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ControladorHome {

    private ServicioProyecto servicioProyecto;

    @Autowired
    public ControladorHome(ServicioProyecto servicioProyecto) {
        this.servicioProyecto = servicioProyecto;
    }


    @RequestMapping("/home")
    public ModelAndView irAHome(HttpServletRequest request) {
        ModelMap modelo = new ModelMap();
        Usuario usuario = (Usuario) request.getSession().getAttribute("USUARIO");
        List<Proyecto> proyectos = servicioProyecto.todosLosProyectosPorId(usuario.getId().intValue());
        //modelo.addAttribute("proyectos", Arrays.asList("uno","dos","tres"));
        modelo.addAttribute("proyectos",proyectos);
        return new ModelAndView("home",modelo);
    }
}
