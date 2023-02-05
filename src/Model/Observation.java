/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author sruthisivasankar
 */
public class Observation {
    int observationId;
    private double temperature;
    private double bloodPressure;
    private Medicine medication;
    
    public Observation(){
        this.medication= new Medicine();
    }

    public int getObservationId() {
        return observationId;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }

    public void setObservationId(int observationId) {
        this.observationId = observationId;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setBloodPressure(double bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public Medicine getMedication() {
        return medication;
    }

    public void setMedication(Medicine medication) {
        this.medication = medication;
    }
    
    
    @Override
    public String toString(){
        return String.valueOf(this.observationId);
    }
}


