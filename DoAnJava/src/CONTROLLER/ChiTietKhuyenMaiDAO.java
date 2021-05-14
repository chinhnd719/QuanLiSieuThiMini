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
import javax.naming.spi.DirStateFactory;
import model.ChiTietKhuyenMai;
import model.KhuyenMai;

/**
 *
 * @author CHINH
 */
public class ChiTietKhuyenMaiDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public ChiTietKhuyenMaiDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addChiTietKhuyenMai(ChiTietKhuyenMai s){
        String sql="INSERT INTO `chitietkhuyenmai`(MaMatHang,MaChuongTrinh,LoaiKhuyenMai,DiscountValue)" 
                +"VALUES(?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaMatHang());
            ps.setString(2,s.getMaChuongTrinh());
            ps.setString(3,s.getLoaiKhuyenMai());
            ps.setString(4,s.getDiscountValue());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public boolean updateChiTietKhuyenMai(ChiTietKhuyenMai s){
        String sql="UPDATE `chitietkhuyenmai` SET `MaChuongTrinh`=?,`LoaiKhuyenMai`=?,`DiscountValue`=? WHERE `MaMatHang`=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaChuongTrinh());
            ps.setString(2,s.getLoaiKhuyenMai());
            ps.setString(3,s.getDiscountValue());
            ps.setString(4,s.getMaMatHang());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
     public boolean deleteChiTietKhuyenMai(ChiTietKhuyenMai s){
        String sql="delete from chitietkhuyenmai where MaMatHang=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaChuongTrinh());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public ArrayList<ChiTietKhuyenMai> getListChiTietKhuyenMai(){
        ArrayList<ChiTietKhuyenMai> list=new ArrayList<>();
        String sql="select * from chitietkhuyenmai";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ChiTietKhuyenMai s=new ChiTietKhuyenMai();
                s.setMaMatHang(rs.getString("MaMatHang"));
                s.setMaChuongTrinh(rs.getString("MaChuongTrinh"));
                s.setLoaiKhuyenMai(rs.getString("LoaiKhuyenMai"));
                s.setDiscountValue(rs.getString("DiscountValue"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
