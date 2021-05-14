/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.HoaDonDAO;
import java.util.ArrayList;
import model.HoaDon;

/**
 *
 * @author CHINH
 */
public class HoaDonBUS {
    HoaDonDAO hoadon=new HoaDonDAO();
    public boolean addHoaDon(HoaDon s){
        if (hoadon.addHoadon(s))
            return true;
        return false;
    }
    public boolean fixHoaDon(HoaDon s){
        if (hoadon.fixHoadon(s))
            return true;
        return false;
    }
    public boolean xoaHoaDon(HoaDon s){
        if (hoadon.xoaHoadon(s))
            return true;
        return false;
    }
    public ArrayList<HoaDon> getListHoaDon(){
        return hoadon.getListHoadon();
    }
      
}
