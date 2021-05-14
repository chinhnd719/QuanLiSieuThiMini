/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ChiTietHoaDon;
import model.ThongKe;
import model.ThongKe11;

/**
 *
 * @author CHINH
 */
public class ThongKeDao {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public ThongKeDao(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }
    }
    public ArrayList<ThongKe> getlistThongKe() {
        ArrayList<ThongKe> list =new ArrayList<>();
        String sql="SELECT NgayLapHD,COUNT(*) AS Soluong,ThanhTien FROM hoadon,chitiethoadon GROUP BY NgayLapHD";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ThongKe s=new ThongKe();
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setSoLuong(rs.getString("SoLuong"));
                s.setThanhTien(rs.getInt("ThanhTien"));
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
