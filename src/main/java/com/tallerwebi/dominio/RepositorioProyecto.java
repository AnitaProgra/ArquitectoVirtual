package com.tallerwebi.dominio;

import java.util.List;

public interface RepositorioProyecto {

    List<Proyecto> proyectosPorId(Integer id);
    Proyecto buscarProyecto(Integer id);
    void ingresarProyecto(Proyecto proyecto);
    void eliminarProyecto(Integer id);
    Proyecto modificarProyecto(Proyecto proyecto);
}
