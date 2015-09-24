/**
 * @author jagdeepjain
 *
 */
package org.learning.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtils {
 
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable e) {
            System.err.println("Unable to create SessionFactory. ");
            System.err.println("");
            System.err.println(e);
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
