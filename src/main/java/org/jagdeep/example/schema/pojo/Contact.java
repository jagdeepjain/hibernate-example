package org.jagdeep.example.schema.pojo;


import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTACT")
public class Contact implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id @GeneratedValue
    @Column(name = "ID")
    private int id;
    
    @Column(name = "FULLNAME")
    private String fullName;
    
    @Column(name = "MOBILENUMBER")
    private String mobileNumber;
    
    @Column(name = "EMAILID")
    private String emailID;

    public Contact() {
    }
    
    public Contact(String fullName, String mobileNumber, String emailID) {
        this.fullName = fullName;
        this.mobileNumber = mobileNumber;
        this.emailID = emailID;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
        
    public String getFullName() {
        return fullName;
    }   
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }  
    
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public String getEmailID() {
        return emailID;
    }
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

}
