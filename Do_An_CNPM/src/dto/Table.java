/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Huynh Hy Qui
 */
public class Table {
    private int soban;
    private String loaiban,tinhTrang;

    public Table() {
    }

    public Table(int soban, String loaiban, String tinhtrang) {
        this.soban = soban;
        this.loaiban = loaiban;
        this.tinhTrang = tinhtrang;
    }

    public int getSoban() {
        return soban;
    }

    public void setSoban(int soban) {
        this.soban = soban;
    }

    public String getLoaiban() {
        return loaiban;
    }

    public void setLoaiban(String loaiban) {
        this.loaiban = loaiban;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
