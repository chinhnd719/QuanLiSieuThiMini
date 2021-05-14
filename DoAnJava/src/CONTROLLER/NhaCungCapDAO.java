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
import model.NhaCungCap;

/**
 *
 * @author CHINH
 */
public class NhaCungCapDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public NhaCungCapDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addNhaCungCap(NhaCungCap s){
        String sql="insert into nhacungcap(MaNCC,TenNCC,DiaChi,SDT,Gmail)"
                +"values(?,?,?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaNCC());
            ps.setString(2,s.getTenNCC());
            ps.setString(3,s.getDiaChi());
            ps.setString(4,s.getSDT());
            ps.setString(5, s.getGmail());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateNhaCungCap(NhaCungCap s){
        String sql="update nhacungcap set TenNCC=?,DiaChi=?,SDT=?,Gmail=? where MaNCC=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getTenNCC());
            ps.setString(2,s.getDiaChi());
            ps.setString(3,s.getSDT());
            ps.setString(4, s.getGmail());
            ps.setString(5,s.getMaNCC());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteNhaCungCap(NhaCungCap s){
        String sql="delete from nhacungcap where MaNCC=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,s.getMaNCC());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<NhaCungCap> getListNhaCungCap(){
        ArrayList<NhaCungCap> list=new ArrayList<>();
        String sql="select * from nhacungcap ";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                NhaCungCap s= new NhaCungCap();
                s.setMaNCC(rs.getString("MaNCC"));
                s.setTenNCC(rs.getString("TenNCC"));
                s.setDiaChi(rs.getString("DiaChi"));
                s.setSDT(rs.getString("SDT"));
                s.setGmail(rs.getString("Gmail"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
