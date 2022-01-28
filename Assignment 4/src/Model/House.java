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
public class House {
    ArrayList<String> houseList = new ArrayList<>();

    public ArrayList<String> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<String> houseList) {
        this.houseList = houseList;
    }
    
    public void addHouseList(String data){
        houseList.add(data);
    }
}
