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
public class Booking {
    private ArrayList<Car> bookHistory;
    
    public Booking(){
        this.bookHistory = new ArrayList<Car>();
    }

    public ArrayList<Car> getHistory() {
        return bookHistory;
    }

    public void setHistory(ArrayList<Car> history) {
        this.bookHistory = history;
    }
    
    public Car addCarData(){
        Car newCarData = new Car();
        bookHistory.add(newCarData);
        return newCarData;
    }
    
    public void deleteData(Car car){
        bookHistory.remove(car);
    }
}
