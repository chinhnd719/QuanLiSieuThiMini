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
import model.LoaiHang;

/**
 *
 * @author CHINH
 */
public class LoaiHangDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public LoaiHangDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addLoaiHang(LoaiHang s){
        String sql="insert into loaihang(MaLoaiHang,TenLoaiHang,DacTinh)"
                +"values(?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, s.getMaLoaiHang());
            ps.setString(2, s.getTenLoaiHang());
            ps.setString(3, s.getDacTinh());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateLoaiHang(LoaiHang s){
        String sql="update loaihang set TenLoaiHang=?,DacTinh=? where MaLoaiHang=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);

            ps.setString(1, s.getTenLoaiHang());
            ps.setString(2, s.getDacTinh());
            ps.setString(3, s.getMaLoaiHang());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean deleteLoaiHang(LoaiHang s){
        String sql="delete from loaihang where MaLoaiHang=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, s.getMaLoaiHang());
            return ps.executeUpdate()>0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ArrayList<LoaiHang> getListLoaiHang(){
        ArrayList<LoaiHang> list=new ArrayList<>();
        String sql="select * from loaihang";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                LoaiHang s=new LoaiHang();
                s.setMaLoaiHang(rs.getString("MaLoaiHang"));
                s.setTenLoaiHang(rs.getString("TenLoaiHang"));
                s.setDacTinh(rs.getString("DacTinh"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
