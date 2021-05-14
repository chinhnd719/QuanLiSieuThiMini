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
public class ThongKe {
    private String NgayLapHD;
    private String SoLuong;
    private Integer ThanhTien;
    public ThongKe(){
        
    }
    public ThongKe(String NgayLapHD, String SoLuong) {
        this.NgayLapHD = NgayLapHD;
        this.SoLuong = SoLuong;
        this.ThanhTien=ThanhTien;
    }

    public String getNgayLapHD() {
        return NgayLapHD;
    }

    public void setNgayLapHD(String NgayLapHD) {
        this.NgayLapHD = NgayLapHD;
    }

    public Integer getSoLuong() {
        int SoLuong1=Integer.parseInt(SoLuong);
        return SoLuong1;
    }

    public void setSoLuong(String SoLuong) {
        this.SoLuong = SoLuong;
    }

    public Integer getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Integer ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
 
    
    
}
