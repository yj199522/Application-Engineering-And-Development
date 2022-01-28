/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author yashjain
 */
public class PatientDirectory {
    private int abnormalPatientCount;
    private int abnormalAreaCount;
    private Patient selectedView;
    private ArrayList<Patient> communityAbnormalVital = new ArrayList<Patient>();
    private ArrayList<Patient> communityAbnormalPatient = new ArrayList<Patient>();
    private ArrayList<Patient> patientHistory = new ArrayList<Patient>();
     public ArrayList<Patient> getPatientHistory() {
        return patientHistory;
    }

    public void setPatientHistory(ArrayList<Patient> patientHistory) {
        this.patientHistory = patientHistory;
    }
    
    public Patient addPatientData(){
        Patient newPatientData = new Patient();
        patientHistory.add(newPatientData);
        return newPatientData;
    }
    
    public void deleteData(Patient patient){
        patientHistory.remove(patient);
    }
    
    public void updateData(int index, Patient patient){
        patientHistory.set(index, patient);
    }

    public Patient getSelectedView() {
        return selectedView;
    }

    public void setSelectedView(Patient selectedView) {
        this.selectedView = selectedView;
    }
}
