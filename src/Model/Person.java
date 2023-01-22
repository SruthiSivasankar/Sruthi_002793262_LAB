/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person obj = new Person();
        obj.setFirstname("");
        obj.setLastname("");
        obj.setCollege("");
        obj.setNUID("");
        
        Address permanentAdd = obj.getPermanentAddress();
        permanentAdd.setApartNo("");
        permanentAdd.setStreetName("");
        permanentAdd.setCity("");
        permanentAdd.setZipCode("");
        
        Address currentAdd = obj.getCurrentAddress();
        currentAdd.setApartNo("");
        currentAdd.setStreetName("");
        currentAdd.setCity("");
        currentAdd.setZipCode("");
        
        Contact personalContact = obj.getPersonalContact();
        personalContact.setPhone("");
        personalContact.setEmailId("");
        
        Contact officeContact = obj.getOfficeContact();
        officeContact.setPhone("");
        officeContact.setEmailId("");       
    }
    
    String firstname;
    String lastname;
    String college;
    String NUID;
    Address permanentAddress;
    Address currentAddress;
    Contact personalContact;
    Contact officeContact;
    

    
    public Person(){
        this.firstname = "";
        this.lastname ="";
        this.college="";
        this.NUID="";
        this.permanentAddress = new Address();
        this.currentAddress= new Address();
        this.personalContact= new Contact();
        this.officeContact = new Contact();
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setNUID(String NUID) {
        this.NUID = NUID;
    }

    public String getCollege() {
        return college;
    }

    public String getNUID() {
        return NUID;
    }
    
    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }
    
    
}
