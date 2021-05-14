/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.LoaiHangDAO;
import java.util.ArrayList;
import model.LoaiHang;

/**
 *
 * @author CHINH
 */
public class LoaiHangBUS {
    LoaiHangDAO loaihang =new LoaiHangDAO();
    public boolean addLoaiHang(LoaiHang s){
        if (loaihang.addLoaiHang(s))
            return true;
        return false;
    }
    public boolean updateLoaiHang(LoaiHang s){
        if (loaihang.updateLoaiHang(s))
            return true;
        return false;
    }
    public boolean deleteLoaiHang(LoaiHang s){
        if (loaihang.deleteLoaiHang(s))
            return true;
        return false;
    }
    public ArrayList<LoaiHang> getListLoaiHang(){
        return loaihang.getListLoaiHang();
    }
}
