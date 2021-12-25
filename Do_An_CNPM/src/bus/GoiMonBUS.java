/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.GoiMonDAO;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Huynh Hy Qui
 */
public class GoiMonBUS {
    public ArrayList<ArrayList<String>> getG(String soban){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        LIST = GoiMonDAO.getG(soban);
        return LIST;
    }
    
    public static ArrayList<ArrayList<String>> getNgay(String ngay){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        LIST = GoiMonDAO.getNgay(ngay);
        return LIST;
    }
    
    public static ArrayList<ArrayList<String>> getThang(String thang){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        LIST = GoiMonDAO.getThang(thang);
        return LIST;
    }
    
    public static ArrayList<ArrayList<String>> getNam(String nam){
        ArrayList<ArrayList<String>> LIST = new ArrayList<ArrayList<String>>();
        LIST = GoiMonDAO.getNam(nam);
        return LIST;
    }
    
    public static boolean ghiHoaDon(String sophieu,String soban){
        if (GoiMonDAO.ghiHoaDon(sophieu, soban)==true){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToDB(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToDB(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToLon(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToLon(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToNho(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToNho(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToQuay(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToQuay(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToHotGa(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToHotGa(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToBanhPho(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToBanhPho(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToTiet(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToTiet(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToTietHotGa(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToTietHotGa(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean ghiToThit(String sophieu,String soluong,String tong){
        if (GoiMonDAO.ghiToThit(sophieu, soluong, tong)){
            return true;
        }
        return false;
    }
    
    public static boolean banCoKhach(String soban){
        if (GoiMonDAO.banCoKhach(soban)){
            return true;
        }
        return false;
    }
    
    public static boolean checkBan(String soban){
        if (GoiMonDAO.checkBan(soban)){
            return true;
        }
        return false;
    }
    
    public static boolean checkSoPhieu(String so){
        if (GoiMonDAO.checkSoPhieu(so)){
            return true;
        }
        return false;
    }
    
    public static boolean banTrong(String soban){
        if (GoiMonDAO.banTrong(soban)){
            return true;
        }
        return false;
    }
    
    public static boolean updateHD(String so,String tong){
        if (GoiMonDAO.updateHD(so, tong)){
            return true;
        }
        return false;
    }
}
