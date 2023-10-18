package Login;

import Validate.Validate;


public class Login {

    Validate v = new Validate();
    BOLogin l = new BOLogin();
    public Login() {
    }

    private int choice() {
        int choice;
        System.out.println("--- Login ---");
        System.out.println("1. Login");
        System.out.println("2. Exit");
        choice = v.inputInt("Enter your choice", 1, 2);
        return choice;
    }

    public Acc menu() {
        l.delete();
        l.add();
        while (true) {
            switch (choice()) {
                case 1:
                    return login();
                case 2:
                    System.exit(0);
            }
        }
    }
    
    private Acc login(){
        Acc temp;
        String name, pass;
        while (true) {
            System.out.println("");
            name = v.inputID("Enter Username");
            pass = v.inputID("Enter Password");
            temp = l.checkAcc(name, pass);
            if(temp != null){
                return temp;
            }
            System.err.println("Username and Password not correct or not exist");
        }
    }
    
    
//    public static void main(String[] args) {
//        Login l = new Login();
//        l.menu();
//    }
    
    
}
