/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ChiTietHoaDon;

/**
 *
 * @author CHINH
 */
public class ChiTietHoaDonDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public ChiTietHoaDonDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception ex) {
            ex.printStackTrace(); 
        }
    }
   public boolean addChiTietHoaDon(ChiTietHoaDon s){
        String sql="INSERT INTO `chitiethoadon`(MaHoaDon,MaMatHang,SoLuong,ThanhTien,DonGia,TienGiamGia)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getMaHoaDon());
            ps.setString(2, s.getMaMatHang());
            ps.setString(3, s.getSoluong());
            ps.setInt(4, s.getThanhTien());
            ps.setInt(5, s.getDonGia());
            ps.setInt(6, s.getTienGiamGia());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;   
    } 
   public boolean fixChiTietHoaDon(ChiTietHoaDon s){
        String sql="UPDATE `chitiethoadon` SET MaMatHang=?,SoLuong=?,ThanhTien=?,DonGia=?,TienGiamGia=? WHERE MaHoaDon=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getMaMatHang());
            ps.setString(2, s.getSoluong());
            ps.setInt(3, s.getThanhTien());
            ps.setInt(4, s.getDonGia());
            ps.setInt(5, s.getTienGiamGia());
            ps.setString(6, s.getMaHoaDon());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;           
    } 
    public ArrayList<ChiTietHoaDon> getlistChiTietHoaDon() {
        ArrayList<ChiTietHoaDon> list =new ArrayList<>();
        String sql="SELECT * FROM chitiethoadon";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ChiTietHoaDon s=new ChiTietHoaDon();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setMaMatHang(rs.getString("MaMatHang"));
                s.setSoluong(rs.getString("SoLuong"));
                s.setThanhTien(rs.getInt("ThanhTien"));
                s.setDonGia(rs.getInt("DonGia"));
                s.setTienGiamGia(rs.getInt("TienGiamGia"));
                list.add(s);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
        
    }

}

   
