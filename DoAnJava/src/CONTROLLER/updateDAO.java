/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CONTROLLER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import model.MatHang;

/**
 *
 * @author CHINH
 */
public class updateDAO {
    private Connection con;
    private static String url="jdbc:mysql://localhost:3306/banhang";
    private static String name="root";
    private static String pass="";
    public updateDAO(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,name,pass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean updateMatHang(MatHang s){
        String sql="UPDATE mathang SET SoLuong=? WHERE MaMatHang=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,s.getSoLuong());
            ps.setString(2,s.getMaMatHang());
            if (ps.executeUpdate()>0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
