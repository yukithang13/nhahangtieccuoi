/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.*;
import javax.swing.*;
public class Connect {
 public Connection conn = null;
 //Phuong thuc thuc hien ket noi CSDL
 public void connectSQL() throws SQLException{
 try {
    String userName ="sa";
    String password = "123456";
    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLNhaHangTC;";
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    conn = java.sql.DriverManager.getConnection(url,userName,password);
    } 
    catch (ClassNotFoundException e)
    {
         JOptionPane.showMessageDialog(null,"Ket noi CSDL that bai","Thong bao",1);
    } 
 } 
 //Phuong thuc dung de truy van CSDL
 public ResultSet LoadData(String sql)
 {
    ResultSet result = null;
    try {
        Statement statement = conn.createStatement();
        return statement.executeQuery(sql);
        } 
    catch (SQLException e)
    {
        e.printStackTrace();
        return null ;
    }
 } 
 //Phuong thuc thuc hien Them, Xoa, Sua du lieu
 public void UpdateData(String sql)
    { 
        try {
                Statement statement = conn.createStatement();
                statement.executeUpdate(sql);
            } 
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
    } 
}
