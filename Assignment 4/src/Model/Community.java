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
public class Community {
    ArrayList<String> communityList = new ArrayList<>();

    public ArrayList<String> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<String> communityList) {
        this.communityList = communityList;
    }
    
    public void addCommunityList(String data){
        communityList.add(data);
    }
    
}
