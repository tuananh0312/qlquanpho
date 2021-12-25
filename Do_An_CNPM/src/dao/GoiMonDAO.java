/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huynh Hy Qui
 */
public class GoiMonDAO {
    private static Connection_Database c = new Connection_Database();
    private static PreparedStatement ps;
    
    public static ArrayList<ArrayList<String>> getG(String soban){
        int so = Integer.parseInt(soban);
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        String sql = "SELECT hoadon.sophieu,loaito.tento,chitiet.soluong,loaito.giato*chitiet.soluong AS thanhtien "
                + "FROM loaito,hoadon,chitiet "
                + "WHERE chitiet.sophieu=hoadon.sophieu AND chitiet.mato=loaito.mato AND hoadon.soban=? AND hoadon.trangthai=0";
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, so);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ArrayList<String> list = new ArrayList<String>();
                list.add(String.valueOf(rs.getInt("sophieu")));
                list.add(rs.getString("tento"));
                list.add(String.valueOf(rs.getInt("soluong")));
                list.add(String.valueOf(rs.getInt("thanhtien")));
                LIST.add(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LIST;
    }
    
    public static ArrayList<ArrayList<String>> getNgay(String ngay){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        String sql = "SELECT sophieu,soban,tongtien FROM hoadon WHERE giothanhtoan LIKE '"+ngay+"%' AND trangthai=1";
        try {
            ps = c.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ArrayList<String> list = new ArrayList<String>();
                list.add(String.valueOf(rs.getInt("sophieu")));
                list.add(String.valueOf(rs.getInt("soban")));
                list.add(String.valueOf(rs.getInt("tongtien")));
                LIST.add(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LIST;
    }
    
    public static ArrayList<ArrayList<String>> getThang(String thang){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        String sql = "SELECT sophieu,soban,tongtien FROM hoadon WHERE giothanhtoan LIKE '"+thang+"%' AND trangthai=1";
        try {
            ps = c.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ArrayList<String> list = new ArrayList<String>();
                list.add(String.valueOf(rs.getInt("sophieu")));
                list.add(String.valueOf(rs.getInt("soban")));
                list.add(String.valueOf(rs.getInt("tongtien")));
                LIST.add(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LIST;
    }
    
    public static ArrayList<ArrayList<String>> getNam(String nam){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        String sql = "SELECT sophieu,soban,tongtien FROM hoadon WHERE giothanhtoan LIKE '"+nam+"%' AND trangthai=1";
        try {
            ps = c.getConn().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                ArrayList<String> list = new ArrayList<String>();
                list.add(String.valueOf(rs.getInt("sophieu")));
                list.add(String.valueOf(rs.getInt("soban")));
                list.add(String.valueOf(rs.getInt("tongtien")));
                LIST.add(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return LIST;
    }
    
    public static boolean ghiHoaDon(String sophieu,String soban){
        String sql = "INSERT INTO hoadon(sophieu,soban) VALUE (?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soban);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, b);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToDB(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 1);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToLon(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 2);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToNho(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 3);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToQuay(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 4);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToHotGa(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 5);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToBanhPho(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 6);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToTiet(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 7);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToTietHotGa(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 8);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean ghiToThit(String sophieu,String soluong,String tong){
        String sql = "INSERT INTO chitiet(sophieu,mato,soluong,thanhtien) VALUE (?,?,?,?)";
        int a = Integer.parseInt(sophieu);
        int b = Integer.parseInt(soluong);
        int d = Integer.parseInt(tong);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ps.setInt(2, 9);
            ps.setInt(3, b);
            ps.setInt(4, d);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean banCoKhach(String soban){
        String sql = "UPDATE ban SET tinhtrang=? WHERE soban=?";
        int a = Integer.parseInt(soban);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setString(1, "Có khách");
            ps.setInt(2, a);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean checkBan(String soban){
        String sql = "SELECT * FROM ban WHERE soban=? AND tinhtrang='Có khách'";
        int a = Integer.parseInt(soban);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean checkSoPhieu(String so){
        String sql = "SELECT * FROM hoadon WHERE sophieu=?";
        int a = Integer.parseInt(so);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, a);
            ResultSet rs = ps.executeQuery();
            if (rs.next()){
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean banTrong(String soban){
        String sql = "UPDATE ban SET tinhtrang=? WHERE soban=?";
        int a = Integer.parseInt(soban);
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setString(1, "Trống");
            ps.setInt(2, a);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public static boolean updateHD(String so,String tong){
        int a = Integer.parseInt(so);
        int b = Integer.parseInt(tong);
        String sql = "UPDATE hoadon SET trangthai=?,tongtien=?, giothanhtoan=current_timestamp() WHERE soban=?";
        try {
            ps = c.getConn().prepareStatement(sql);
            ps.setInt(1, 1);
            ps.setInt(2, b);
            ps.setInt(3, a);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    
}
