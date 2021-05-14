/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.PhieuNhapDAO;
import java.util.ArrayList;
import model.PhieuNhap;

/**
 *
 * @author CHINH
 */
public class PhieuNhapBUS {
    PhieuNhapDAO phieunhap=new PhieuNhapDAO();
    public boolean addPhieuNhap(PhieuNhap s){
        if (phieunhap.addPhieuNhap(s))
            return true;
        return false;
    }
    public boolean updatePhieuNhap(PhieuNhap s){
        if (phieunhap.updatePhieuNhap(s))
            return true;
        return false;
    }
    public boolean deletePhieuNhap(PhieuNhap s){
        if (phieunhap.deletePhieuNhap(s))
            return true;
        return false;
    }
    public ArrayList<PhieuNhap> getListPhieuNhap(){
        return phieunhap.getListPhieuNhap();
    }
}
