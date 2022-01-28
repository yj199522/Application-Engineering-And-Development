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
public class City {
    ArrayList<String> CityNameList = new ArrayList<>();

    public ArrayList<String> getCityName() {
        return CityNameList;
    }

    public void setCityName(ArrayList<String> CityName) {
        this.CityNameList = CityName;
    }
    
    public void addCityNameList(String data){
        CityNameList.add(data);
    }
}
