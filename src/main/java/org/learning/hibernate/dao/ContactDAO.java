/**
 * @author jagdeepjain
 *
 */
package org.learning.hibernate.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.learning.hibernate.pojo.Contact;
import org.learning.hibernate.utils.HibernateUtils;

public class ContactDAO {
    
    // add contact to the table
    public void addContact(String fullName, String mobileNumber, String emailID) {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transcation = null;
        try {
            transcation = session.beginTransaction();
            Contact contact = new Contact(fullName, mobileNumber, emailID);
            session.save(contact);
            transcation.commit();
        } catch (HibernateException e) {
            if (transcation != null)
                transcation.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
    
    // list contact
    public List<Contact> listOfContacts() {
        Session session = HibernateUtils.getSessionFactory().openSession();
        Transaction transcation = null;
        List<Contact> contactList = null;
        try {
            transcation = session.beginTransaction();
            contactList = session.createQuery("FROM Contact").list();
            transcation.commit();
            
        } catch (HibernateException e) {
            if (transcation != null)
                transcation.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return contactList;
    }
    
}
