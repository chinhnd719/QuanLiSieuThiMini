/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;
import java.sql.Statement;
import model.NhanVien;

/**
 *
 * @author The Phong
 */
public class NhanVienDAO {

    private Connection conn;
    private static String DB_URL = "jdbc:mysql://localhost:3306/banhang";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public NhanVienDAO() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    

    public boolean addNhanVien(NhanVien s) {
        String sql = "INSERT INTO `nhanvien`(`MaNV`, `TenNV`, `DiaChiNV`, `NgaySinh`, `MucLuong`, `NgayVaoLam`, `SDT`, `GioiTinh`, `CMND`) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaNV());
            ps.setString(2, s.getTenNV());
            ps.setString(3, s.getDiaChiNV());
            ps.setDate(4, new Date(s.getNgaySinh().getTime()));
            ps.setInt(5, s.getMucLuong());
            ps.setDate(6, new Date(s.getNgayVaoLam().getTime()));
            ps.setString(7, s.getSDT());
            ps.setString(8, s.getGioiTinh());
            ps.setString(9, s.getCMND());
        
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
        }
        return false;
    }

    
    public boolean suaNhanVien(NhanVien s) {
        String sql = "UPDATE `nhanvien` SET `TenNV`=?,`DiaChiNV`=?,`NgaySinh`=?,`MucLuong`=?,`NgayVaoLam`=?,`SDT`=?,`GioiTinh`=?,`CMND`=? WHERE `MaNV`=?"; 
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(9, s.getMaNV());
            ps.setString(1, s.getTenNV());
            ps.setString(2, s.getDiaChiNV());
            ps.setDate(3, new Date(s.getNgaySinh().getTime()));
            ps.setInt(4, s.getMucLuong());
            ps.setDate(5, new Date(s.getNgayVaoLam().getTime()));
            ps.setString(6, s.getSDT());
            ps.setString(7, s.getGioiTinh());
            ps.setString(8, s.getCMND());
            
            return ps.executeUpdate() > 0;

        } catch (Exception e) {
        }
        return false;

    }

    
    public boolean xoaNhanVien(NhanVien s ){
        String sql="DELETE FROM `nhanvien` WHERE MaNV=?";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getMaNV());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    

    public ArrayList<NhanVien> getListNhanVien() {
        ArrayList<NhanVien> ListNhanVien = new ArrayList<>();
        String sql = "SELECT * FROM `nhanvien`";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVien s = new NhanVien();
                s.setMaNV(rs.getString("MaNV"));
                s.setTenNV(rs.getString("TenNV"));
                s.setDiaChiNV(rs.getString("DiaChiNV"));
                s.setNgaySinh(rs.getDate("NgaySinh"));
                s.setMucLuong(rs.getInt("MucLuong"));
                s.setNgayVaoLam(rs.getDate("NgayVaoLam"));
                s.setSDT(rs.getString("SDT"));
                s.setGioiTinh(rs.getString("GioiTinh"));
                s.setCMND(rs.getString("CMND"));
                ListNhanVien.add(s);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ListNhanVien;
    }

    
}
