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
import model.TaiKhoanNhanVien;

/**
 *
 * @author CHINH
 */
public class TaiKhoanNhanVienDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public TaiKhoanNhanVienDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean KiemTraTaiKhoanNhanVien(TaiKhoanNhanVien s){
        String sql = "select * from taikhoannhanvien where MaNV = ? and MatKhau= ? ";
       // String sql ="";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getMaNV());
            ps.setString(2, s.getMatKhau());
            return ps.executeUpdate() > 0;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
        
    }
    public boolean addTaiKhoanNhanVien(TaiKhoanNhanVien s){
        String sql="INSERT INTO taikhoannhanvien(MaNV,MatKhau)"
               + "VALUES(?,?)";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaNV());
            ps.setString(2,s.getMatKhau());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }                         
    public boolean updateTaiKhoanNhanVien(TaiKhoanNhanVien s){
        String sql="UPDATE `taikhoannhanvien` SET MatKhau=? WHERE MaNV=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMatKhau());
            ps.setString(2,s.getMaNV());
          
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteTaiKhoanNhanVien(TaiKhoanNhanVien s){
        String sql="delete from taikhoannhanvien where MaNV=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ps.setString(1,s.getMaNV());
            return ps.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<TaiKhoanNhanVien> getListTaiKhoanNhanVien(){
        ArrayList<TaiKhoanNhanVien> list= new ArrayList<>();
        String sql= "SELECT * FROM taikhoannhanvien";
       
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                TaiKhoanNhanVien s=new TaiKhoanNhanVien();
                s.setMaNV(rs.getString("MaNV"));
                s.setMatKhau(rs.getString("MatKhau"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}   
