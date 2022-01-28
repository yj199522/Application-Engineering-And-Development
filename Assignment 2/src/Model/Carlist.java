/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author yashjain
 */
public class Carlist {
    private ArrayList<Car> history;
    private String updateDate;
    private Car selectedView;

    public Car getSelectedView() {
        return selectedView;
    }

    public void setSelectedView(Car selectedView) {
        System.out.println(selectedView);
        this.selectedView = selectedView;
    }
    
    public Carlist(){
        this.history = new ArrayList<Car>();
       DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");  
       Date today = Calendar.getInstance().getTime();    
        this.updateDate = dateFormat.format(today);
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }
    
    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addCarData(){
        Car newCarData = new Car();
        history.add(newCarData);
        return newCarData;
    }
    
    public void deleteData(Car car){
        history.remove(car);
    }
    
    public void updateData(int index, Car car){
        history.set(index, car);
    }
}
