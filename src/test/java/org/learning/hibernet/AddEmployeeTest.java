package org.learning.hibernet;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.learning.hibernate.dao.ContactDAO;

public class AddEmployeeTest {
    
    ContactDAO contactsdao = new ContactDAO();
    
    @Before
    public void setup() {
        contactsdao.addContact("Jagdeep Jain", "123", "jain@gmail.com");
    }
    
    @Test
    public void addContactTest() {
        assertTrue(contactsdao.listOfContacts().get(0).getId() == 1);
        assertTrue(contactsdao.listOfContacts().get(0).getFullName()
                .equals("Jagdeep Jain"));
        assertTrue(contactsdao.listOfContacts().get(0).getEmailID()
                .equals("jain@gmail.com"));
        assertTrue(contactsdao.listOfContacts().get(0).getMobileNumber()
                .equals("123"));
    }
    
    @After
    public void tearDown() {
        
    }
}
