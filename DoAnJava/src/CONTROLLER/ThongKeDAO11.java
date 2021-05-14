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
import model.HoaDon;
import model.ThongKe11;
import model.ThongKe22;
import model.ThongKe33;

/**
 *
 * @author CHINH
 */
public class ThongKeDAO11 {
   private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public ThongKeDAO11(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 
    public ArrayList<ThongKe11> getListThongKe(){
        ArrayList<ThongKe11> list=new ArrayList<>();
        String sql="SELECT MaHoaDon,NgayLapHD,MaKH,COUNT(*) AS Soluong FROM hoadon GROUP BY MaKH";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ThongKe11 s=new ThongKe11();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setMaKH(rs.getString("MaKH"));
                s.setSoLuong(rs.getInt("SoLuong"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<ThongKe22> getListHoaDon(){
        ArrayList<ThongKe22> list= new ArrayList<>();
        String sql= "SELECT MaHoaDon,NgayLapHD, COUNT(*) as SoLuong from hoadon GROUP BY NgayLapHD";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ThongKe22 s=new ThongKe22();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setSoLuong(rs.getInt("SoLuong"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    public ArrayList<ThongKe33> getListPhieuNhap(){
        ArrayList<ThongKe33> list =new ArrayList<>();
        String sql="SELECT MaPN,NgayNhap,TongTien FROM phieunhaphang";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ThongKe33 s=new ThongKe33();
                s.setMaPN(rs.getString("MaPN"));
                s.setNgayNhap(rs.getString("NgayNhap"));
                s.setTongTien(rs.getInt("TongTien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
