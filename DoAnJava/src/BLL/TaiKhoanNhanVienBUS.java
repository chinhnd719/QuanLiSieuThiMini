/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.TaiKhoanNhanVienDAO;
import java.util.ArrayList;
import model.TaiKhoanNhanVien;

/**
 *
 * @author CHINH
 */
public class TaiKhoanNhanVienBUS {
    TaiKhoanNhanVienDAO taikhoannhhanvien=new TaiKhoanNhanVienDAO();
    public boolean addTaiKhoanNhanVien(TaiKhoanNhanVien s)
    {
        if (taikhoannhhanvien.addTaiKhoanNhanVien(s))
            return true;
        return false;
    }
    public boolean updateTaiKhoanNhanVien(TaiKhoanNhanVien s){
        if (taikhoannhhanvien.updateTaiKhoanNhanVien(s))
            return true;
        return false;
    }
    public boolean deleteTaiKhoanNhanVien(TaiKhoanNhanVien s){
        if (taikhoannhhanvien.deleteTaiKhoanNhanVien(s))
            return true;
        return false;
    }
    public ArrayList<TaiKhoanNhanVien> getListTaiKhoanNhanVien(){
        return taikhoannhhanvien.getListTaiKhoanNhanVien();
    }
}
