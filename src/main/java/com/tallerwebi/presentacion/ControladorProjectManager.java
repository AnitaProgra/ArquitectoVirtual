package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.ActividadProyecto;
import com.tallerwebi.dominio.Proyecto;
import com.tallerwebi.dominio.ServicioProyectManager;
import com.tallerwebi.dominio.ServicioProyecto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ControladorProjectManager {

    private ServicioProyectManager servicioProjectManager;

    private ServicioProyecto servicioProyecto;

    @Autowired
    public ControladorProjectManager(ServicioProyectManager servicioProyectManager, ServicioProyecto servicioProyecto) {
        this.servicioProjectManager = servicioProyectManager;
        this.servicioProyecto = servicioProyecto;
    }

    @RequestMapping(value = "/projectManager", method = RequestMethod.GET)
    public ModelAndView irAProyectManager(@RequestParam("id") int proyectoId) {
        ModelMap model = new ModelMap();
        List<ActividadProyecto> actividadesProyecto = servicioProjectManager.actividadesPorIdProyecto(proyectoId);
        Proyecto proyecto = servicioProyecto.buscarProyecto(proyectoId);
        if(proyecto==null){
            model.put("error", "El proyecto solicitado no existe");
            return new ModelAndView("redirect:/home",model);
        }
        model.put("actividadesProyecto",actividadesProyecto);
        model.put("proyecto",proyecto);
        return new ModelAndView("projectManager",model);
    }
}
