package Business;

import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account        

        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole(), "admin");
        
        return system;
    }
    
}
