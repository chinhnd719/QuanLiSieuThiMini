/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.ChiTietHoaDonDAO;
import java.util.ArrayList;
import model.ChiTietHoaDon;

/**
 *
 * @author CHINH
 */
public class ChiTietHoaDonBUS {
    ChiTietHoaDonDAO chitiethoadon= new ChiTietHoaDonDAO();
    public boolean addChiTietHoaDon(ChiTietHoaDon s){
        if (chitiethoadon.addChiTietHoaDon(s))
            return true;
        return false;
    }
    public boolean fixChiTietHoaDon(ChiTietHoaDon s){
        if (chitiethoadon.fixChiTietHoaDon(s))
            return true;
        return false;
    }
    public ArrayList<ChiTietHoaDon> getListChiTietHoaDon(){
        return chitiethoadon.getlistChiTietHoaDon();
    }
     
}
