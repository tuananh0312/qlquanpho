/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Table;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Huynh Hy Qui
 */
public class TableDAO {
    private static Connection_Database c = new Connection_Database();
    private static PreparedStatement ps;
    
    public static ArrayList<Table> getTable(){
        ArrayList<Table> list = new ArrayList<Table>();
        String sql = "SELECT * FROM ban";
        try {
            ps = c.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Table t = new Table();
                t.setSoban(rs.getInt("soban"));
                t.setLoaiban(rs.getString("loaiban"));
                t.setTinhTrang(rs.getString("tinhtrang"));
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public static boolean updateTable(String loai,int so){
        String sql = "UPDATE ban SET loaiban=? WHERE soban=?";
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setString(1, loai);
            ps.setInt(2, so);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean addTable(String loai){
        String sql = "INSERT INTO ban(loaiban,tinhtrang) VALUE (?,?)";
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setString(1, loai);
            ps.setString(2, "Trống");
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public static boolean deleteTable(int so){
        String sql = "DELETE FROM ban WHERE soban=?";
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, so);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
