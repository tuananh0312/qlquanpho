/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Huynh Hy Qui
 */
public class Connection_Database {
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String url="jdbc:mysql://localhost:3306/quanlyquanpho";
    private String user="root";
    private String password="";

    public Connection_Database() {
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Connection getConn() {
        return conn;
    }

    public PreparedStatement getPs() {
        return ps;
    }

    public ResultSet getRs() {
        return rs;
    }    
    
}
