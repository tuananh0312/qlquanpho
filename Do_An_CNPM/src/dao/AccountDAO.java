/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import dao.Connection_Database;
import dto.Account;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author Huynh Hy Qui
 */
public class AccountDAO {
    Connection_Database c = new Connection_Database();
    
    public boolean loginUser(String user,String pass){
        String sql = "SELECT * FROM taikhoan WHERE username=? AND password=? AND type=?";
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, 1);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean loginAdmin(String user,String pass){
        String sql = "SELECT * FROM taikhoan WHERE username=? AND password=? AND type=?";
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            ps.setInt(3, 0);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) return true;
        } catch (Exception e) {
        }
        return false;
    }
    
    public boolean addAccount(Account a){
        String sql = "INSERT INTO taikhoan(username,password,type,fullname,birthday,address,phone) VALUE (?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ps.setString(1, a.getUserName());
            ps.setString(2, a.getPassWord());
            ps.setInt(3, 1);
            ps.setString(4, a.getFullName());
            ps.setDate(5, new Date(a.getBirthDay().getTime()));
            ps.setString(6, a.getAddress());
            ps.setString(7, a.getPhone());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<Account> getNhanVien(){
        String sql = "SELECT * FROM taikhoan WHERE type = 1";
        ArrayList<Account> list = new ArrayList<>();
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Account a = new Account();
                a.setUserName(rs.getString(1));
                a.setPassWord(rs.getString(2));
                a.setFullName(rs.getString(4));
                a.setBirthDay(rs.getDate(5));
                a.setAddress(rs.getString(6));
                a.setPhone(rs.getString(7));
                list.add(a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public boolean updateAccount(Account a){
        String sql = "UPDATE taikhoan SET password=?,fullname=?,birthday=?,address=?,phone=? WHERE username=?";
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ps.setString(1, a.getPassWord());
            ps.setString(2, a.getFullName());
            ps.setDate(3, new Date(a.getBirthDay().getTime()));
            ps.setString(4, a.getAddress());
            ps.setString(5, a.getPhone());
            ps.setString(6, a.getUserName());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean deleteAccount(Account a){
        String sql = "DELETE FROM taikhoan WHERE username=?";
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ps.setString(1, a.getUserName());
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean checkAccount(String ma){
        String sql = "SELECT * FROM taikhoan WHERE username=?";
        try {
            PreparedStatement ps = c.getConn().prepareStatement(sql);
            ps.setString(1, ma);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
