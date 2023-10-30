package com.tallerwebi.dominio;

import com.tallerwebi.dominio.excepcion.UsuarioExistente;

import java.util.List;

public interface ServicioProyecto {

    List<Proyecto> todosLosProyectosPorIdUsuario(Integer id);
    Proyecto buscarProyecto(Integer id);
    void guardarProyecto(Proyecto proyecto);
    void eliminarProyecto(Proyecto proyecto);
    void modificarProyecto(Proyecto proyecto);


}
