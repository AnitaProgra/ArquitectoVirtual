package com.tallerwebi.infraestructura;

import com.tallerwebi.dominio.Proyecto;
import com.tallerwebi.dominio.RepositorioProyecto;
import com.tallerwebi.dominio.Usuario;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RepositorioProyectoImpl implements RepositorioProyecto {

    private SessionFactory sessionFactory;

    @Autowired
    public RepositorioProyectoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Proyecto> proyectosPorId(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        return (List<Proyecto>) session.createCriteria(Proyecto.class)
                .add(Restrictions.eq("usuario", id)).list();
    }

    @Override
    public Proyecto buscarProyecto(Integer id) {
        final Session session = sessionFactory.getCurrentSession();
        return (Proyecto) session.createCriteria(Proyecto.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    @Override
    public void ingresarProyecto(Proyecto proyecto) {

    }

    @Override
    public void eliminarProyecto(Integer id) {

    }

    @Override
    public Proyecto modificarProyecto(Proyecto proyecto) {
        return null;
    }
}
