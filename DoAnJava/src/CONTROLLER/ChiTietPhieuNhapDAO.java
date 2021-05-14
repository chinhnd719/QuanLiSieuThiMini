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
import model.ChiTietPhieuNhap;
import model.KhachHang;

/**
 *
 * @author CHINH
 */
public class ChiTietPhieuNhapDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public ChiTietPhieuNhapDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public boolean addChiTietPhieuNhap(ChiTietPhieuNhap s){
        String sql="INSERT INTO chitietphieunhap(MaPN,MaMatHang,SoLuong,GiaNhap)"
               +"VALUES(?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaPN());
            ps.setString(2,s.getMaMatHang());
            ps.setInt(3, s.getSoluong());
            ps.setInt(4, s.getGiaNhap());
            
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateChiTietPhieuNhap(ChiTietPhieuNhap s){
        String sql="update chitietphieunhap set MaMatHang=?,SoLuong=?,GiaNhap=? where MaPN=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaMatHang());
            ps.setInt(2,s.getSoluong());
            ps.setInt(3,s.getGiaNhap());
            ps.setString(4, s.getMaPN());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
    public boolean deleteChiTietPhieuNhap(ChiTietPhieuNhap s){
        String sql="delete from chitietphieunhap where MaPN=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaPN());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
    public ArrayList<ChiTietPhieuNhap> getListChiTietPhieuNhap(){
        ArrayList<ChiTietPhieuNhap> list=new ArrayList<>();
        String sql="select * from chitietphieunhap";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                ChiTietPhieuNhap s=new ChiTietPhieuNhap();
                s.setMaPN(rs.getString("MaPN"));
                s.setMaMatHang(rs.getString("MaMatHang"));
                s.setSoluong(rs.getInt("SoLuong"));
                s.setGiaNhap(rs.getInt("GiaNhap"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
