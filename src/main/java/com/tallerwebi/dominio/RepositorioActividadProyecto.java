package com.tallerwebi.dominio;

import java.util.List;

public interface RepositorioActividadProyecto {

    List<ActividadProyecto> actividadesPorIdProyecto(Integer idProyecto);
    ActividadProyecto buscarActividadProyecto(Integer idActividad);
    void insertarActividadProyecto(ActividadProyecto actividadProyecto);
    void eliminarActividadProyecto(ActividadProyecto actividadProyecto);
    ActividadProyecto modificarActividadProyecto(ActividadProyecto actividadProyecto);
}
