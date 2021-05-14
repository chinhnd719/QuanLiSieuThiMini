/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author CHINH
 */
public class LoaiHang {
    String MaLoaiHang,TenLoaiHang,DacTinh;
    public LoaiHang(){
        
    }

    public String getDacTinh() {
        return DacTinh;
    }

    public void setDacTinh(String DacTinh) {
        this.DacTinh = DacTinh;
    }

    public String getMaLoaiHang() {
        return MaLoaiHang;
    }

    public void setMaLoaiHang(String MaLoaiHang) {
        this.MaLoaiHang = MaLoaiHang;
    }

    public String getTenLoaiHang() {
        return TenLoaiHang;
    }

    public void setTenLoaiHang(String TenLoaiHang) {
        this.TenLoaiHang = TenLoaiHang;
    }

    
    
}
