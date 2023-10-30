package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Proyecto;
import com.tallerwebi.dominio.RepositorioProyecto;
import com.tallerwebi.dominio.ServicioProyecto;
import com.tallerwebi.dominio.excepcion.UsuarioExistente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("servicioProyecto")
@Transactional
public class ServicioProyectoImpl implements ServicioProyecto {

    private RepositorioProyecto repositorioProyecto;

    @Autowired
    public ServicioProyectoImpl(RepositorioProyecto repositorioProyecto) {
        this.repositorioProyecto = repositorioProyecto;
    }

    @Override
    public List<Proyecto> todosLosProyectosPorIdUsuario(Integer id) {
        List<Proyecto> proyectos = repositorioProyecto.proyectosPorId(id);
        if(proyectos!=null){
            return proyectos;
        }
        return null;
    }

    @Override
    public Proyecto buscarProyecto(Integer id) {
        Proyecto proyecto = repositorioProyecto.buscarProyecto(id);
        if(proyecto!=null){
            return proyecto;
        }
        return null;
    }

    @Override
    public void guardarProyecto(Proyecto proyecto) {

    }

    @Override
    public void eliminarProyecto(Proyecto proyecto) {

    }

    @Override
    public void modificarProyecto(Proyecto proyecto) {

    }
}
