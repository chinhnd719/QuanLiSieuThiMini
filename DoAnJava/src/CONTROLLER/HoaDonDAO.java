/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.HoaDon;

/**
 *
 * @author Than
 */
public class HoaDonDAO {
    private Connection conn;
    private static String DB_URL = "jdbc:mysql://localhost:3306/banhang";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";
    
    public HoaDonDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public boolean addHoadon(HoaDon s){
        
        String sql = "INSERT INTO hoadon(MaHoaDon, MaNV, MaChuongTrinh, MaKH, NgayLapHD,GhiChu) "
                + "VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaHoaDon());
            ps.setString(2, s.getMaNV());
            ps.setString(3, s.getMaChuongTrinh());
            ps.setString(4, s.getMaKH());
            ps.setString(5, s.getNgayLapHD());
            ps.setString(6, s.getGhiChu());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    public boolean fixHoadon(HoaDon s){
        
        String sql = "UPDATE `hoadon` SET MaNV=?,MaChuongTrinh=?,MaKH=?,NgayLapHD=?,GhiChu=? WHERE MaHoaDon=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaNV());
            ps.setString(2, s.getMaChuongTrinh());
            ps.setString(3, s.getMaKH());
            ps.setString(4, s.getNgayLapHD());
            ps.setString(5, s.getGhiChu());
            ps.setString(6, s.getMaHoaDon());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
               
        return false;
    }
     public boolean xoaHoadon(HoaDon s){
        
        String sql = "DELETE FROM `hoadon` WHERE MaHoaDon=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaHoaDon());
           return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
 
    public ArrayList<HoaDon> getListHoadon(){
        ArrayList<HoaDon> list = new ArrayList<>();
        String sql = "SELECT * FROM hoadon";
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HoaDon s = new HoaDon();
                s.setMaHoaDon(rs.getString("MaHoaDon"));
                s.setMaNV(rs.getString("MaNV"));
                s.setMaChuongTrinh(rs.getString("MaChuongTrinh"));
                s.setMaKH(rs.getString("MaKH"));
                s.setNgayLapHD(rs.getString("NgayLapHD"));
                s.setGhiChu(rs.getString("GhiChu"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
       
    
    public static void main(String[] args) {
        new HoaDonDAO();
    }
}
