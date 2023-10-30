package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.ActividadProyecto;
import com.tallerwebi.dominio.Proyecto;
import com.tallerwebi.dominio.RepositorioActividadProyecto;
import com.tallerwebi.dominio.RepositorioProyecto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioActividadProyectoImpl implements RepositorioActividadProyecto {

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioActividadProyectoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<ActividadProyecto> actividadesPorIdProyecto(Integer idProyecto) {
        final Session session = sessionFactory.getCurrentSession();
        return (List<ActividadProyecto>) session.createCriteria(ActividadProyecto.class)
                .add(Restrictions.eq("idProyecto", idProyecto)).list();
    }

    @Override
    public ActividadProyecto buscarActividadProyecto(Integer idActividad) {
        return null;
    }

    @Override
    public void insertarActividadProyecto(ActividadProyecto actividadProyecto) {

    }

    @Override
    public void eliminarActividadProyecto(ActividadProyecto actividadProyecto) {

    }

    @Override
    public ActividadProyecto modificarActividadProyecto(ActividadProyecto actividadProyecto) {
        return null;
    }
}
