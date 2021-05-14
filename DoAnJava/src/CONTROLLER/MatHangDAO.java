/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;
import BLL.MatHangBUS;
import static BLL.MatHangBUS.DSMH;
import model.MatHang;
import GUI.MatHang_Form;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import Connection.MySQLConnection;
/**
 *
 * @author E480
 */
public class MatHangDAO {
     static MySQLConnection mysqlc=new MySQLConnection("localhost","root","","banhang");
    static  Connection conn=null;
    static Statement stm=null;
   static ResultSet rs=null;
   static PreparedStatement pstm=null;
   
    public MatHangDAO(){
        
    }
     public ArrayList ReadListMatHang() throws Exception{
     MatHangBUS.DSMH=new ArrayList<>();
            
     try{
         String query="SELECT * FROM mathang";
         conn=mysqlc.getConnection();
         stm=mysqlc.getStatement();
         rs=mysqlc.getResult(query);
         while(rs.next()){
             MatHang mh=new MatHang();
             mh.MaMatHang=rs.getString(1);
             mh.MaLoaiHang=rs.getString(2);
             mh.TenMatHang=rs.getString(3);
             mh.DonGia=rs.getInt(4);
             mh.NgaySanXuat=rs.getDate(5);
             mh.HanSuDung=rs.getDate(6);
             mh.SoLuong=rs.getInt(7);
            mh.HinhAnh=rs.getBytes(8);
             MatHangBUS.DSMH.add(mh);
            }
     }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, "lỗi đọc Products List");
         }
       
    return MatHangBUS.DSMH;   
   }
    public void AddMatHang(MatHang mh) throws FileNotFoundException, SQLException, IOException{
        try
        {
//            String qry="Insert into mathang Values(";
//            qry=qry+"'"+mh.MaMatHang+"',";
//            qry=qry+"'"+mh.MaLoaiHang+"',";
//            qry=qry+"'"+mh.TenMatHang+"',";
//            qry=qry+mh.DonGia+",";
//            qry=qry+"'"+mh.NgaySanXuat+"',";
//            qry=qry+"'"+mh.HanSuDung+"',";
//            qry=qry+mh.SoLuong+",";
//           
//           qry=qry+"'"+mh.HinhAnh+"')";
//           
//            
//            stm=conn.createStatement();
//            
//            stm.executeUpdate(qry);
            String sql="Insert into mathang(MaMatHang, MaLoaiHang, TenMatHang, DonGia, NgaySanXuat, HanSuDung, SoLuong,HinhAnh) VALUES (?,?,?,?,?,?,?,?)";
            
           
            pstm=conn.prepareStatement(sql);
            pstm.setString(1, mh.getMaMatHang());
            pstm.setString(2, mh.getMaLoaiHang());
            pstm.setString(3, mh.getTenMathang());
            pstm.setInt(4, mh.getDonGia());
            pstm.setDate(5, mh.getNgaySanXuat());
            pstm.setDate(6, mh.getHanSuDung());
            pstm.setInt(7, mh.getSoLuong());
            File f=new File(MatHang_Form.pathimg);
            InputStream image= new FileInputStream(f);
            pstm.setBlob(8, image);
            pstm.executeUpdate();
            DSMH.add(mh);
                
                Vector row=new Vector();
                row.add(mh.MaMatHang);
                row.add(mh.MaLoaiHang);
                row.add(mh.TenMatHang);
                row.add(mh.DonGia);
                row.add(mh.NgaySanXuat);
                row.add(mh.HanSuDung);
                row.add(mh.SoLuong);
                row.add(mh.HinhAnh);
                MatHang_Form.mode.addRow(row);
                MatHang_Form.TableMatHang.setModel(MatHang_Form.mode); 
         
        }   
            
         
        
    
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Trùng Mã Mặt Hàng đã có trong cơ sở dữ liệu! ");
         }
        
    
    }
    public void DeleteMatHang(String MaMatHang){
        try{
            String qry="DELETE FROM mathang where MaMatHang='"+MaMatHang+"'";
            stm=conn.createStatement();
            stm.executeUpdate(qry);
        }
         catch(SQLException e){
          JOptionPane.showMessageDialog(null, "Lỗi Xóa Ở Cơ Sở Dữ Liệu!");
         }
    }
     public void UpdateMatHang(MatHang mh) throws FileNotFoundException{
        try{
            
            String qry="Update mathang SET MaMatHang=";
            qry=qry+"'"+mh.MaMatHang+"'"+",";
            qry=qry+"MaLoaiHang="+"'"+mh.MaLoaiHang+"'"+",";
            qry=qry+"TenMatHang="+"'"+mh.TenMatHang+"'"+",";
            qry=qry+"DonGia="+mh.DonGia+",";
            qry=qry+"NgaySanXuat="+"'"+mh.NgaySanXuat+"'"+",";
            qry=qry+"HanSuDung="+"'"+mh.HanSuDung+"'"+",";
            qry=qry+"SoLuong="+mh.SoLuong+",";
            qry=qry+"HinhAnh="+"'"+Arrays.toString(mh.HinhAnh)+"'";
            qry=qry+" "+"where MaMatHang='"+mh.MaMatHang+"'";
            stm=conn.createStatement();
            stm.executeUpdate(qry);
//               String sql="UPDATE mathang SET MaMatHang=?,MaLoaiHang=?,TenMatHang=?,DonGia=?,NgaySanXuat=?,HanSuDung=?,SoLuong=?,HinhAnh=? WHERE MaMatHang=? ";
//               pstm=conn.prepareStatement(sql);
//               pstm.setString(9, mh.getMaMatHang());
//               pstm.setString(1, mh.getMaMatHang());
//               pstm.setString(2, mh.getMaLoaiHang());
//               pstm.setString(3, mh.getTenMathang());
//               pstm.setInt(4, mh.getDonGia());
//               pstm.setDate(5, mh.getNgaySanXuat());
//               pstm.setDate(6, mh.getHanSuDung());
//               pstm.setInt(7, mh.getSoLuong());
//               File f=new File(MatHangForm.pathimg);
//               InputStream image= new FileInputStream(f);
//               pstm.setBlob(8, image);
//               
//               pstm.executeUpdate();
        }
         catch(SQLException e){
          JOptionPane.showMessageDialog(null, " Lỗi Update Ở Cơ Sở Dữ Liệu! ");
         }
        
    }
    public ArrayList SearchByDate() throws Exception{
        try{
         String query="SELECT * FROM mathang Where NgaySanXuat BETWEEN CAST('";
         query=query+MatHang_Form.txtNgayBatDau.getText()+"' AS DATE) AND CAST('";
         query=query+MatHang_Form.txtNgayKetThuc.getText()+"' AS DATE)";
         conn=mysqlc.getConnection();
         stm=mysqlc.getStatement();
         rs=mysqlc.getResult(query);
         while(rs.next()){
             MatHang mh=new MatHang();
             mh.MaMatHang=rs.getString(1);
             mh.MaLoaiHang=rs.getString(2);
             mh.TenMatHang=rs.getString(3);
             mh.DonGia=rs.getInt(4);
             mh.NgaySanXuat=rs.getDate(5);
             mh.HanSuDung=rs.getDate(6);
             mh.SoLuong=rs.getInt(7);
            mh.HinhAnh=rs.getBytes(8);
             MatHangBUS.DSMH.add(mh);
            }
     }
      catch(SQLException e){
          JOptionPane.showMessageDialog(null, "lỗi đọc Products List");
         }
         return MatHangBUS.DSMH;  
    }
}
