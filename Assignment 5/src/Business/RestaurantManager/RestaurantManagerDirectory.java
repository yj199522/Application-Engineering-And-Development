/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.RestaurantManager;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author yashj
 */
public class RestaurantManagerDirectory {
    private ArrayList<RestaurantManager> restaurantManagerList;
    
    public RestaurantManagerDirectory() {
        restaurantManagerList = new ArrayList();
    }

    public ArrayList<RestaurantManager> getRestaurantManagerList() {
        return restaurantManagerList;
    }
    
     public void setCustomerList(ArrayList<RestaurantManager> restaurantManagerList) {
        this.restaurantManagerList = restaurantManagerList;
    }
    
    public Boolean deleteRestaurantManager(String name, EcoSystem system) {
        for(int i = 0; i < restaurantManagerList.size(); i ++) {
            if(restaurantManagerList.get(i).getName().equals(name)) {
                system.getUserAccountDirectory().deleteUser(restaurantManagerList.get(i).getAccountDetails().getUsername());
                restaurantManagerList.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public RestaurantManager createRestaurantManager(String name, UserAccount ua, String phone, String address){
        RestaurantManager cust = new RestaurantManager();
        cust.setName(name);
        cust.setAccountDetails(ua);
        cust.setAddress(address);
        cust.setPhone(phone);
        restaurantManagerList.add(cust);
        return cust;
    }
}
