/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.NhaCungCapDAO;
import java.util.ArrayList;
import model.NhaCungCap;

/**
 *
 * @author CHINH
 */
public class NhaCungCapBUS {
    NhaCungCapDAO nhacungcap =new NhaCungCapDAO();
    public boolean addNhaCungCap(NhaCungCap s){
        if (nhacungcap.addNhaCungCap(s))
            return true;
        return false;
    }
    public boolean updateNhaCungCap(NhaCungCap s){
        if (nhacungcap.updateNhaCungCap(s))
            return true;
        return false;
    }
    public boolean deleteNhaCungCap(NhaCungCap s){
        if (nhacungcap.deleteNhaCungCap(s))
            return true;
        return false;
    }
    public ArrayList<NhaCungCap> gestListNhaCungCap(){
        return nhacungcap.getListNhaCungCap();
    }
}
