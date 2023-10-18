package Login;

import java.util.ArrayList;

public class BOLogin {

    ArrayList<Acc> accs = new ArrayList<>();

    public BOLogin() {
    }

    public void add() {
        this.accs.add(new Acc("ad1", "1", 1));
        this.accs.add(new Acc("emp1", "1", 2));
        this.accs.add(new Acc("emp2", "1", 2));
        this.accs.add(new Acc("emp3", "1", 2));
    }

    public Acc checkAcc(String userName, String passWord) {

        for (Acc a : this.accs) {
            if (a.getUserName().equalsIgnoreCase(userName)
                    && a.getPassWord().equalsIgnoreCase(passWord)) {
                return a;
            }
        }
        return null;
    }

    public void delete() {
        this.accs.clear();
    }

}
