package org.learning.hibernate.pojo;

public class Contact {
    private int id;
    private String fullName;
    private String mobileNumber;
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
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }
    
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    
    public String getMobileNumber() {
        return mobileNumber;
    }
    
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    public String getEmailID() {
        return emailID;
    }


}
