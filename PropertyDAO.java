package com.jayasri;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class PropertyDAO {
    public void save(Property property) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(property);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}

