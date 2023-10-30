package com.tallerwebi.dominio;

import java.util.List;

public interface ServicioProyectManager {
    List<ActividadProyecto> actividadesPorIdProyecto(Integer id);
    ActividadProyecto buscarActividadProyecto(Integer id);
    void insertarActividadProyecto(ActividadProyecto actividadProyecto);
    ActividadProyecto modificarActividadProyecto(ActividadProyecto actividadProyecto);
}