/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import controller.NhanVienDAO;
import java.util.ArrayList;
import model.NhanVien;

/**
 *
 * @author CHINH
 */
public class NhanVienBUS {
    NhanVienDAO nhanvien=new NhanVienDAO();
    public boolean addNhanVien(NhanVien s){
        if (nhanvien.addNhanVien(s))
            return true;
        return false;
    }
    public boolean suaNhanVien(NhanVien s){
        if (nhanvien.suaNhanVien(s))
            return true;
        return false;
    }
    public boolean xoaNhanVien(NhanVien s){
        if (nhanvien.xoaNhanVien(s))
            return true;
        return false;
    }
    public ArrayList<NhanVien> getListNhanVien(){
        return nhanvien.getListNhanVien();
    }
}
