/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.RestaurantManager.RestaurantManager;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantList;
    
    public RestaurantDirectory() {
        restaurantList = new ArrayList();
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }
    
    public Boolean deleteRestaurant(String name) {
        for(int i = 0; i < restaurantList.size(); i ++) {
            if(restaurantList.get(i).getName().equals(name)) {
                restaurantList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public Restaurant createRestaurant(String name, RestaurantManager rm, String phone, String location){
        Restaurant rest = new Restaurant();
        rest.setName(name);        
        rest.setPhone(phone);
        rest.setLocation(location);
        rest.setManagerDetails(rm);
        rest.setUserAccount(rm.getAccountDetails());
        restaurantList.add(rest);
        return rest;
    }
}
