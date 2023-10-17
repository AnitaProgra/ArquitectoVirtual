package com.tallerwebi.presentacion;

import com.tallerwebi.dominio.Usuario;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

public class UnControladorQueHizoNicoPeroVaABorrarse {

 /*   // La carga de la vista formulario
    @RequestMapping("/formulario")
    public ModelAndView irAFormulario() {

        ModelMap modelo = new ModelMap();
        modelo.put("proyecto", new DatosProyecto());
        return new ModelAndView("formulario", modelo);
    }

    //
    @RequestMapping(path = "/respuesta", method = RequestMethod.POST)
    public ModelAndView responderFormulario(@ModelAttribute("datosLogin") DatosLogin datosLogin, HttpServletRequest request) {
        ModelMap model = new ModelMap();

        Usuario usuarioBuscado = servicioLogin.consultarUsuario(datosLogin.getEmail(), datosLogin.getPassword());
        if (usuarioBuscado != null) {
            request.getSession().setAttribute("ROL", usuarioBuscado.getRol());
            return new ModelAndView("redirect:/home");
        } else {
            model.put("error", "Usuario o clave incorrecta");
        }
        return new ModelAndView("login", model);
    }*/
}
