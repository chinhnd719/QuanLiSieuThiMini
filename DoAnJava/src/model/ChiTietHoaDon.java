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
public class ChiTietHoaDon extends HoaDon{
    private String MaMatHang,Soluong;
    private Integer ThanhTien,DonGia,TienGiamGia;
    
    public String getMaMatHang() {
        return MaMatHang;
    }

    public void setMaMatHang(String MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public String getSoluong() {
        return Soluong;
    }

    public void setSoluong(String Soluong) {
        this.Soluong = Soluong;
    }

    public Integer getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(Integer ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public Integer getDonGia() {
        return DonGia;
    }

    public void setDonGia(Integer DonGia) {
        this.DonGia = DonGia;
    }

    public Integer getTienGiamGia() {
        return TienGiamGia;
    }

    public void setTienGiamGia(Integer TienGiamGia) {
        this.TienGiamGia = TienGiamGia;
    }
  
    
}
