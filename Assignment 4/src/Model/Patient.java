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
public class Patient extends Person {
    Encounter encounter;
//    private ArrayList<Encounter> encounterHistory;
    EncounterHistory encounterHistory;

    public EncounterHistory getEncounterHistory() {
        return encounterHistory;
    }

    public void setEncounterHistory(EncounterHistory encounterHistory) {
        this.encounterHistory = encounterHistory;
    }
    
    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }
    
    public Patient(){
         EncounterHistory encounterHistory = new EncounterHistory();
         setEncounterHistory(encounterHistory);
//         this.encounterHistory = encounterHistory;
    }
}
