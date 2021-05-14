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
public class ChiTietKhuyenMai extends KhuyenMai{
    String MaMatHang,LoaiKhuyenMai,DiscountValue;
    public ChiTietKhuyenMai(){
        
    }

    public String getMaMatHang() {
        return MaMatHang;
    }

    public void setMaMatHang(String MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public String getLoaiKhuyenMai() {
        return LoaiKhuyenMai;
    }

    public void setLoaiKhuyenMai(String LoaiKhuyenMai) {
        this.LoaiKhuyenMai = LoaiKhuyenMai;
    }

    public String getDiscountValue() {
        return DiscountValue;
    }

    public void setDiscountValue(String DiscountValue) {
        this.DiscountValue = DiscountValue;
    }
    
    
}
