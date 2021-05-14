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
import model.KhuyenMai;

/**
 *
 * @author CHINH
 */
public class KhuyenMaiDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public KhuyenMaiDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addKhuyenMai(KhuyenMai s){
        String sql="insert into chuongtrinhkhuyenmai(MaChuongTrinh,TenChuongTrinh,NgayBatDau,NgayKetThuc,NoiDungChuongTrinh)"
                +"values(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaChuongTrinh());
            ps.setString(2, s.getTenChuongTrinh());
            ps.setString(3, s.getNgayBatDau());
            ps.setString(4, s.getNgayKetThuc());
            ps.setString(5, s.getNoiDungChuongTrinh());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
     public boolean updateKhuyenMai(KhuyenMai s){
        String sql="UPDATE `chuongtrinhkhuyenmai` SET `TenChuongTrinh`=?,`NgayBatDau`=?,`NgayKetThuc`=?,`NoiDungChuongTrinh`=? WHERE `MaChuongTrinh`=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, s.getTenChuongTrinh());
            ps.setString(2, s.getNgayBatDau());
            ps.setString(3, s.getNgayKetThuc());
            ps.setString(4, s.getNoiDungChuongTrinh());
            ps.setString(5,s.getMaChuongTrinh());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
      public boolean deleteKhuyenMai(KhuyenMai s){
        String sql="delete from chuongtrinhkhuyenmai where MaChuongTrinh=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaChuongTrinh());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }    
        return false;
    }
    public ArrayList<KhuyenMai> getListKhuyenMai(){
        ArrayList<KhuyenMai> list=new ArrayList<>();
        String sql="select *from chuongtrinhkhuyenmai";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                KhuyenMai s=new KhuyenMai();
                s.setMaChuongTrinh(rs.getString("MaChuongTrinh"));
                s.setTenChuongTrinh(rs.getString("TenChuongTrinh"));
                s.setNgayBatDau(rs.getString("NgayBatDau"));
                s.setNgayKetThuc(rs.getString("NgayKetThuc"));
                s.setNoiDungChuongTrinh(rs.getString("NoiDungChuongTrinh"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
