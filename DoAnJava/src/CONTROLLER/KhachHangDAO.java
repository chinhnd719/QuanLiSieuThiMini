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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.KhachHang;

/**
 *
 * @author CHINH
 */
public class KhachHangDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    
    public KhachHangDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addKhachHang(KhachHang s){
        String sql="INSERT INTO khachhang(MaKH,TenKH,DiaChi,SDT,GioiTinh)"
               +"VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaKH());
            ps.setString(2,s.getTenKH());
            ps.setString(3, s.getDiaChi());
            ps.setString(4, s.getSDT());
            ps.setString(5, s.getGioiTinh());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateKhachHang(KhachHang s){
        String sql="update khachhang set TenKH=?,DiaChi=?,SDT=?,GioiTinh=? where MaKH=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getTenKH());
            ps.setString(2,s.getDiaChi());
            ps.setString(3,s.getSDT());
            ps.setString(4, s.getGioiTinh());
            ps.setString(5, s.getMaKH());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
    public boolean deleteKhachHang(KhachHang s){
        String sql="delete from khachhang where MaKH=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaKH());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
    public ArrayList<KhachHang> getListKhachHang(){
        ArrayList<KhachHang> list=new ArrayList<>();
        String sql="select *from khachhang";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                KhachHang s=new KhachHang();
                s.setMaKH(rs.getString("MaKH"));
                s.setTenKH(rs.getString("TenKH"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setSDT(rs.getString("SDT"));
                s.setGioiTinh(rs.getString("GioiTinh"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return list;
    }
}
