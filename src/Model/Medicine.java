/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Medicine {
    String medicineName;
    Double dosage;
    
    public Medicine(){
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setDosage(Double dosage) {
        this.dosage = dosage;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public Double getDosage() {
        return dosage;
    }
    @Override
    public String toString(){
        return this.medicineName;
    }
    
    
}
