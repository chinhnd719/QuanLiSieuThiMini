/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author E480
 */
public class MatHang {
    public String MaMatHang;
    public String MaLoaiHang;
    public String TenMatHang;
    public int DonGia;
    public Date NgaySanXuat;
    public Date HanSuDung;
    public int SoLuong;
    public byte [] HinhAnh;
    public MatHang(){
        
    }

    public String getMaMatHang() {
        return MaMatHang;
    }

    public void setMaMatHang(String MaMatHang) {
        this.MaMatHang = MaMatHang;
    }

    public String getMaLoaiHang() {
        return MaLoaiHang;
    }

    public void setMaLoaiHang(String MaLoaiHang) {
        this.MaLoaiHang = MaLoaiHang;
    }

    public String getTenMathang() {
        return TenMatHang;
    }

    public void setTenMathang(String TenMathang) {
        this.TenMatHang = TenMathang;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

    public Date getNgaySanXuat() {
        return NgaySanXuat;
    }

    public void setNgaySanXuat(Date NgaySanXuat) {
        this.NgaySanXuat = NgaySanXuat;
    }

    public Date getHanSuDung() {
        return HanSuDung;
    }

    public void setHanSuDung(Date HanSuDung) {
        this.HanSuDung = HanSuDung;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public byte[] getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(byte[] HinhAnh) {
        this.HinhAnh = HinhAnh;
    }
    public void GanMatHang(MatHang mh){
        this.MaLoaiHang=mh.getMaLoaiHang();
        this.DonGia=mh.getDonGia();
        this.HanSuDung=mh.getHanSuDung();
        this.HinhAnh=mh.getHinhAnh();
        this.MaMatHang=mh.getMaMatHang();
        this.SoLuong=mh.getSoLuong();
        this.NgaySanXuat=mh.getNgaySanXuat();
        this.TenMatHang=mh.getTenMathang();
    }
    @Override
    public boolean equals(Object obj){
        if (obj == this) {
         return true;
      }
      if (!(obj instanceof MatHang)) {
         return false;
      }
      MatHang mh = (MatHang) obj;
      return MaMatHang.equals(mh.MaMatHang) ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.MaMatHang);
        return hash;
    }
    
    
}
