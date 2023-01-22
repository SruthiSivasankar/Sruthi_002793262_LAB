/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Contact {
    String phone;
    String emailId;
    
    public Contact(){
        this.phone="";
        this.emailId="";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmailId() {
        return emailId;
    }
    
}
