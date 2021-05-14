/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.ChiTietKhuyenMaiDAO;
import java.util.ArrayList;
import model.ChiTietKhuyenMai;

/**
 *
 * @author CHINH
 */
public class ChiTietKhuyenMaiBUS {
    ChiTietKhuyenMaiDAO chitiethkhuyenmai=new ChiTietKhuyenMaiDAO();
    public boolean addChiTietKhuyenMai(ChiTietKhuyenMai s){
        if (chitiethkhuyenmai.addChiTietKhuyenMai(s))
            return true;
        return false;
    }
    public boolean updateChiTietKhuyenMai(ChiTietKhuyenMai s){
        if (chitiethkhuyenmai.updateChiTietKhuyenMai(s))
            return true;
        return false;
    }
    public boolean deleteChiTietKhuyenMai(ChiTietKhuyenMai s){
        if (chitiethkhuyenmai.deleteChiTietKhuyenMai(s))
            return true;
        return false;
    }
    public ArrayList<ChiTietKhuyenMai> getListChiTietKhuyenMai(){
        return chitiethkhuyenmai.getListChiTietKhuyenMai();
    }
    
}
