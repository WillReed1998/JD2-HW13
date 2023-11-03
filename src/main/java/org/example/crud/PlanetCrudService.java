package org.example.crud;

import org.example.HibernateUtil;
import org.example.entities.Planet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class PlanetCrudService implements CRUD <Planet>{
    private final SessionFactory sessionFactory =
            HibernateUtil.getInstance().getSessionFactory();

    @Override
    public void create(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(planet);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Planet read(Object id) {
        try (Session session = sessionFactory.openSession()) {
            Planet planet = session.get(Planet.class, id);
            return planet;
        }
    }

    @Override
    public void update(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(planet);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Planet planet) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(planet);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}

