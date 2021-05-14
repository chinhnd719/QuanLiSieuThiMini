/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author E480
 */
public class MySQLConnection {
     private  String url="jdbc:mysql://localhost:3306/banhang?useUnicode=true&characterEncoding=UTF-8" ;     
    private  String username="root" ;   
    private  String password="" ;
    private String host="localhost";
    private String database="banhang";
    private Connection con = null;
    private Statement stm = null;
    private ResultSet rs = null;
    
    public MySQLConnection(String host,String username,String password,String database){
        this.host=host;
        this.username=username;
        this.password=password;
        this.database=database;
        
    }
    protected void drivetest() throws Exception{
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            
        }
        catch(java.lang.ClassNotFoundException e){
            throw new Exception("Error driver ");
        }
    }
    public Connection getConnection() throws Exception{
        try{
        this.con=DriverManager.getConnection(url,username,password);
        }
         catch(SQLException e){
         }
        return con;
    }
     public Connection getConnection(String url,String username,String password) throws Exception{
        try{
        this.con=DriverManager.getConnection(url,username,password);
        }
         catch(SQLException e){
         }
        return con;
    }
    public Statement getStatement() throws Exception{
         try{
        this.stm=con.createStatement();
        }
         catch(SQLException e){
         }
        return stm;
    }
    public ResultSet getResult(String sql) throws Exception{
        try{
        this.rs=stm.executeQuery(sql);
        }
         catch(SQLException e){
         }
        return rs;
    }
    
    
}
