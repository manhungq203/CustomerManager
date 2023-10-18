/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

/**
 *
 * @author User
 */
public class Acc {
    private String userName;
    private String passWord;
    private int codeUser;

    public Acc(String userName, String passWord, int codeUser) {
        this.userName = userName;
        this.passWord = passWord;
        this.codeUser = codeUser;
    }

    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getCodeUser() {
        return codeUser;
    }

    public void setCodeUser(int codeUser) {
        this.codeUser = codeUser;
    }

    @Override
    public String toString() {
        return this.userName+" , "+this.passWord+" , "+this.codeUser;
    }
    
}
