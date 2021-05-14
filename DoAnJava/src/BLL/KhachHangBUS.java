/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.KhachHangDAO;
import java.util.ArrayList;
import model.KhachHang;

/**
 *
 * @author CHINH
 */
public class KhachHangBUS {
    KhachHangDAO khachhang=new KhachHangDAO();
    public boolean addKhachHang(KhachHang s){
        if (khachhang.addKhachHang(s))
            return true;
        return false;
    }
    public boolean updateKhachHang(KhachHang s){
        if (khachhang.updateKhachHang(s))
            return true;
        return false;
    }
    public boolean deleteKhachHang(KhachHang s){
        if (khachhang.deleteKhachHang(s))
            return true;
        return false;
    }
    public ArrayList<KhachHang> getListKhachHang(){
        return khachhang.getListKhachHang();
    }
}
