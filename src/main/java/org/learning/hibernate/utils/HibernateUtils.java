/**
 * @author jagdeepjain
 *
 */
package org.learning.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            // Use hibernate.cfg.xml to get a SessionFactory
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Unable to create SessionFactory." + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void shutdown() {
        getSessionFactory().close();
    }
    
}
