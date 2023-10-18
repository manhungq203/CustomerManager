package Entity;

import java.util.ArrayList;

public class BOCustomer {
    private final ArrayList<Customer> cus = new ArrayList<>();

    public ArrayList<Customer> getCus() {
        return cus;
    }
     
    public BOCustomer() {
    }
    
    public boolean addCus(Customer c){
        if(findCusByID(c.getId())!=null){
            cus.add(c);
            return true;
        }else{
            return false;
        }
    }
    
    public Customer findCusByID(String s){
        for(Customer c : cus){
            if(c.getId().equalsIgnoreCase(s)){
                return c;
            }
        }
        return null;
    }
    
    public boolean deleteCus(Customer c){
        if(findCusByID(c.getId())!=null){
            cus.remove(findCusByID(c.getId()));
            return true;
        }else{
            return false;
        }
    }
    
}
