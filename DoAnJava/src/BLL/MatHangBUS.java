/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import CONTROLLER.MatHangDAO;
import model.MatHang;
import GUI.MatHang_Form;
import static GUI.MatHang_Form.TableMatHang;
import static GUI.MatHang_Form.mode;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author E480
 */
public class MatHangBUS {
    public static  ArrayList<MatHang> DSMH; 
    public MatHangBUS(){
        
    }
    public void ReadDSMH() throws Exception
    {
        MatHangDAO data=new MatHangDAO();
        if(DSMH==null) DSMH=new ArrayList<>();
        DSMH=data.ReadListMatHang();
    }
    public void SearchByDate() throws Exception{
        MatHangDAO data=new MatHangDAO();
        DSMH=new ArrayList<>();
        DSMH=data.SearchByDate();
        
    }
    public void AddMatHang(MatHang mh) throws FileNotFoundException, SQLException, IOException{
        MatHangDAO data=new MatHangDAO();
               data.AddMatHang(mh);
    }
    public MatHang SearchByMaMatHang(String MaMatHang){
        MatHang kq=new MatHang();
        for (Iterator<MatHang> it = DSMH.iterator(); it.hasNext();) {
            MatHang mathang = it.next();
            if(mathang.getMaMatHang().equalsIgnoreCase(MaMatHang)==true)
            {
                  kq.GanMatHang(mathang);
            }
            
        }
        return kq;
    }
   public  MatHang SearchByTenMatHang(String TenMatHang){
        MatHang kq=new MatHang();
        for (Iterator<MatHang> it = DSMH.iterator(); it.hasNext();) {
            MatHang mathang = it.next();
            if(mathang.getTenMathang().equalsIgnoreCase(TenMatHang)==true)
            {
                  kq=mathang;
            }
            
        }
        return kq;
    }
   public void DeleteMatHang(MatHang mh){
       MatHangDAO data=new MatHangDAO();
       int ret = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Xóa Không?", "Xác Nhận", JOptionPane.YES_NO_OPTION);
       if(ret==JOptionPane.YES_OPTION){
       for (Iterator<MatHang> it = DSMH.iterator(); it.hasNext();) {
            MatHang mathang = it.next();
            if(mathang.equals(mh)==true)
            {
                
                 data.DeleteMatHang(mh.getMaMatHang());
                 it.remove();
                  int i=TableMatHang.getSelectedRow();
                  if(i>=0){
                  mode.removeRow(i);
                  TableMatHang.setModel(mode);
                  }
                 JOptionPane.showMessageDialog(null, "Đã Xóa Rồi!!!");
            }
            }
       }
 }
   public void UpdateMatHang(MatHang mh) throws FileNotFoundException{
       MatHangDAO data=new MatHangDAO();
       data.UpdateMatHang(mh);
       
       
   }
    
}
