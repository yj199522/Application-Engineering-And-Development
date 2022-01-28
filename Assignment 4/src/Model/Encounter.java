/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author yashjain
 */
public class Encounter {
    private String doctorName;
    private double doctorAge;
    private String wardCategory;
    private String clinicName;
//    private Encounter encounter;
    private VitalSigns vital;

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public double getDoctorAge() {
        return doctorAge;
    }

    public void setDoctorAge(double doctorAge) {
        this.doctorAge = doctorAge;
    }

    public String getWardCategory() {
        return wardCategory;
    }

    public void setWardCategory(String wardCategory) {
        this.wardCategory = wardCategory;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public VitalSigns getVital() {
        return vital;
    }

    public void setVital(VitalSigns vital) {
        this.vital = vital;
    }
    
    public Encounter(){
        vital = new VitalSigns();
        setVital(vital);
    }
    
    @Override
    public String toString(){
        return ""+doctorName+"";
    }
}
