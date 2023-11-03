package org.example.crud;

import org.example.HibernateUtil;
import org.example.entities.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientCrudService implements CRUD <Client> {
    private final SessionFactory sessionFactory =
            HibernateUtil.getInstance().getSessionFactory();

    @Override
    public void create(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(client);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Client read(Object id) {
        try (Session session = sessionFactory.openSession()) {
            Client client = session.get(Client.class, id);
            return client;
        }
    }

    @Override
    public void update(Client client) {
            try (Session session = sessionFactory.openSession()) {
                Transaction transaction = session.beginTransaction();
                session.merge(client);
                transaction.commit();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void delete(Client client) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.remove(client);
            transaction.commit();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
