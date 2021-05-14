/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.ThongKeDAO11;
import java.util.ArrayList;
import model.ThongKe11;
import model.ThongKe22;
import model.ThongKe33;

/**
 *
 * @author CHINH
 */
public class ThongKeBUS {
    ThongKeDAO11 s=new ThongKeDAO11();
    public ArrayList<ThongKe11> getListThongKe(){
        return s.getListThongKe();
    }
    public ArrayList<ThongKe22> getListHoaDon(){
        return s.getListHoaDon();
    }
    public ArrayList<ThongKe33> getListPhieuNhap(){
        return s.getListPhieuNhap();
    }
}
