package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.*;
import com.tallerwebi.dominio.excepcion.UsuarioExistente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@Service("servicioProyectManager")
@Transactional
public class ServicioProyectManagerImpl implements ServicioProyectManager {

    private RepositorioActividadProyecto repositorioActividadProyecto;

    @Autowired
    public ServicioProyectManagerImpl(RepositorioActividadProyecto repositorioActividadProyecto) {
        this.repositorioActividadProyecto = repositorioActividadProyecto;
    }

    @Override
    public List<ActividadProyecto> actividadesPorIdProyecto(Integer id) {
        List<ActividadProyecto> actividadesProyecto = repositorioActividadProyecto.actividadesPorIdProyecto(id);
//        Map actividadesPorEtapas = separarPorEtapas(actividadesProyecto);
        if(actividadesProyecto!=null){
            return actividadesProyecto;
        }
        return null;
    }

    @Override
    public ActividadProyecto buscarActividadProyecto(Integer id) {
        return null;
    }

    @Override
    public void insertarActividadProyecto(ActividadProyecto actividadProyecto) {

    }

    @Override
    public ActividadProyecto modificarActividadProyecto(ActividadProyecto actividadProyecto) {
        return null;
    }

    private Map separarPorEtapas(List<ActividadProyecto> actividadesProyecto) {
        Map<String, List<ActividadProyecto>> etapas =null;
        for (ActividadProyecto actividadProyecto: actividadesProyecto) {

        }
        return etapas;
    }
}

