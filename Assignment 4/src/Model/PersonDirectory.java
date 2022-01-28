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
public class PersonDirectory {
    private ArrayList<Person> personHistory = new ArrayList<Person>();
    private Person selectedView;

    public Person getSelectedView() {
        return selectedView;
    }

    public ArrayList<Person> getPersonHistory() {
        return personHistory;
    }

    public void setPersonHistory(ArrayList<Person> personHistory) {
        this.personHistory = personHistory;
    }
    
    public Person addPersonData(){
        Person newPersonData = new Person();
        personHistory.add(newPersonData);
        return newPersonData;
    }
    
    public void deleteData(Person person){
        personHistory.remove(person);
    }
    
    public void updateData(int index, Person person){
        personHistory.set(index, person);
    }
    
    public void setSelectedView(Person selectedView) {
        this.selectedView = selectedView;
    }
}
