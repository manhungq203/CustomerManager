
package Menu;

import Login.Acc;
import Login.Login;

public class Menuu {
     public void choice(){
        Login l = new Login();
         while (true) {             
             Acc temp = l.menu();
        if(temp.getCodeUser() == 1){
            menuAD();
        }else{
            menuEmp();
        }
         }
        
    }

    private void menuAD() {
        System.out.println("Menu ad");
    }

    private void menuEmp() {
        System.out.println("Menu emp");
    }
    
    public static void main(String[] args) {
        Menuu m = new Menuu();
        m.choice();
    }
}
