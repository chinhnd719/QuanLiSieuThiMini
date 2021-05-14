/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.ChiTietPhieuNhapDAO;
import java.util.ArrayList;
import model.ChiTietPhieuNhap;

/**
 *
 * @author CHINH
 */
public class ChiTietPhieuNhapBUS {
    ChiTietPhieuNhapDAO chitietphieunhap =new ChiTietPhieuNhapDAO();
    public boolean addChiTietPhieuNhap(ChiTietPhieuNhap s){
        if (chitietphieunhap.addChiTietPhieuNhap(s))
            return true;
        return false;
    }
    public boolean updateChiTietPhieuNhap(ChiTietPhieuNhap s){
        if (chitietphieunhap.updateChiTietPhieuNhap(s))
            return true;
        return false;
    }
    public boolean deleteChiTietPhieuNhap(ChiTietPhieuNhap s){
        if (chitietphieunhap.deleteChiTietPhieuNhap(s))
            return true;
        return false;
    }
    public ArrayList<ChiTietPhieuNhap> getListChiTietPhieuNhap(){
        return chitietphieunhap.getListChiTietPhieuNhap();
    }
}
