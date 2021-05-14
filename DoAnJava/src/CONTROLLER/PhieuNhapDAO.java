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
import model.KhachHang;
import model.PhieuNhap;
import sun.applet.Main;

/**
 *
 * @author CHINH
 */
public class PhieuNhapDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public PhieuNhapDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     public boolean addPhieuNhap(PhieuNhap s){
        String sql="INSERT INTO phieunhaphang(MaPN,MaNCC,MaNV,NgayNhap,TongTien)"
               +"VALUES(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaPN());
            ps.setString(2,s.getMaNCC());
            ps.setString(3, s.getMaNV());
            ps.setString(4, s.getNgayNhap());
            ps.setInt(5, s.getTongTien());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updatePhieuNhap(PhieuNhap s){
        String sql="update phieunhaphang set MaNCC=?,MaNV=?,NgayNhap=?,TongTien=? where MaPN=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaNCC());
            ps.setString(2,s.getMaNV());
            ps.setString(3,s.getNgayNhap());
            ps.setInt(4, s.getTongTien());
            ps.setString(5, s.getMaPN());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
    public boolean deletePhieuNhap(PhieuNhap s){
        String sql="delete from phieunhaphang where MaPN=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaPN());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
        e.printStackTrace();
        }
        return false;
    }
    public ArrayList<PhieuNhap> getListPhieuNhap(){
        ArrayList<PhieuNhap> list=new ArrayList<>();
        String sql="SELECT * FROM phieunhaphang";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                PhieuNhap s=new PhieuNhap();
                s.setMaPN(rs.getString("MaPN"));
                s.setMaNCC(rs.getString("MaNCC"));
                s.setMaNV(rs.getString("MaNV"));
                s.setNgayNhap(rs.getString("NgayNhap"));
                s.setTongTien(rs.getInt("TongTien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
  /*  public static void main(String arg[]){
        new PhieuNhapDAO();
       
    }*/
}
