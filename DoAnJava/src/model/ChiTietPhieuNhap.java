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
public class ChiTietPhieuNhap extends PhieuNhap{
    String  MaMatHang;
    Integer Soluong,GiaNhap;
    public ChiTietPhieuNhap(){
        
    }

    public String getMaPN() {
        return MaPN;
    }

    public void setMaPN(String MaPN) {
        this.MaPN = MaPN;
    }

    public String getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(String MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public String getNgayNhap() {
        return NgayNhap;
    }

    public void setNgayNhap(String NgayNhap) {
        this.NgayNhap = NgayNhap;
    }

    public Integer getTongTien() {
        return TongTien;
    }

    public void setTongTien(Integer TongTien) {
        this.TongTien = TongTien;
    }
    

    public String getMaMatHang() {
        return MaMatHang;
    }

    public void setMaMatHang(String MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public Integer getSoluong() {
        return Soluong;
    }

    public void setSoluong(Integer Soluong) {
        this.Soluong = Soluong;
    }

    public Integer getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(Integer GiaNhap) {
        this.GiaNhap = GiaNhap;
    }
    
}
