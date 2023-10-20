package com.tallerwebi.dominio;

import com.tallerwebi.dominio.excepcion.UsuarioExistente;

import java.util.List;

public interface ServicioProyecto {

    List<Proyecto> todosLosProyectosPorId(Integer id);
    void guardarProyecto(Proyecto proyecto) throws UsuarioExistente;
}
