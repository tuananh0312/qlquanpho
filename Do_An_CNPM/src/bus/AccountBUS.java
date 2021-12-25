/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.AccountDAO;
import dto.Account;
import java.util.ArrayList;

/**
 *
 * @author Huynh Hy Qui
 */
public class AccountBUS {
    AccountDAO accountDAO = new AccountDAO();
    
    public boolean loginAdmin(String user,String pass){
        if (accountDAO.loginAdmin(user, pass)==true){
            return true;
        }
        return false;
    }
    
    public boolean loginUser(String user,String pass){
        if (accountDAO.loginUser(user, pass)==true){
            return true;
        }
        return false;
    }
    
    public boolean addAccount(Account a){
        if (accountDAO.addAccount(a)==true){
            return true;
        }
        return false;
    }
    
    public ArrayList<Account> getNhanVien(){
        ArrayList<Account> list = new ArrayList<>();
        list = accountDAO.getNhanVien();
        return list;
    }
    
    public boolean updateAccount(Account a){
        if (accountDAO.updateAccount(a)==true){
            return true;
        }
        return false;
    }
    
    public boolean deleteAccount(Account a){
        if (accountDAO.deleteAccount(a)==true){
            return true;
        }
        return false;
    }
    
    public boolean checkAccount(String ma){
        if (accountDAO.checkAccount(ma)==true){
            return true;
        }
        return false;
    }
}
