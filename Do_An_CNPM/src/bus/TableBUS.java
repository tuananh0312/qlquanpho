/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bus;

import dao.TableDAO;
import dto.Table;
import java.util.ArrayList;

/**
 *
 * @author Huynh Hy Qui
 */
public class TableBUS {
    public static ArrayList<Table> getTable(){
        ArrayList<Table> table = new ArrayList<Table>();
        table=TableDAO.getTable();
        return table;
    }
    
    public static boolean updateTable(String loai,int so){
        if (TableDAO.updateTable(loai, so)){
            return true;
        }
        return false;
    }
    
    public static boolean addTable(String loai){
        if (TableDAO.addTable(loai)){
            return true;
        }
        return false;
    }
    
    public static boolean deleteTable(int so){
        if (TableDAO.deleteTable(so)){
            return true;
        }
        return false;
    }
}
