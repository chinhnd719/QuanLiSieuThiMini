/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.KhuyenMaiDAO;
import java.util.ArrayList;
import model.KhuyenMai;

/**
 *
 * @author CHINH
 */
public class ChuongTrinhKhuyenMaiBUS {
    KhuyenMaiDAO khuyenmai = new KhuyenMaiDAO();
    public boolean addKhuyenMai(KhuyenMai s){
        if (khuyenmai.addKhuyenMai(s))
            return true;
        return false;
    }
    public boolean updateKhuyenMai(KhuyenMai s){
        if (khuyenmai.updateKhuyenMai(s))
            return true;
        return false;
    }
    public boolean deleteKhuyenMai(KhuyenMai s){
        if (khuyenmai.deleteKhuyenMai(s))
            return true;
        return false;
    }
    public ArrayList<KhuyenMai> getListKhuyenMai(){
        return khuyenmai.getListKhuyenMai();
    }
}
