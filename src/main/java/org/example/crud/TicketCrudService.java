package org.example.crud;

import org.example.HibernateUtil;
import org.example.entities.Ticket;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TicketCrudService implements CRUD <Ticket>{
    private final SessionFactory sessionFactory =
            HibernateUtil.getInstance().getSessionFactory();

    @Override
    public void create(Ticket ticket) {
        if (ticket == null || ticket.getToPlanet() == null || ticket.getFromPlanet() == null) {
        throw new IllegalArgumentException("Client and planets not null");
        }
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(ticket);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Ticket read(Object id) {
        try (Session session = sessionFactory.openSession()) {
            Ticket ticket = session.get(Ticket.class, id);
            return ticket;
        }
    }

    @Override
    public void update(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.merge(ticket);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Ticket ticket) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(ticket);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}