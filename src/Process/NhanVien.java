/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Database.Connect;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thang Le
 */
public class NhanVien {
    public Connect cn = new Connect(); 
    //Truy van tat ca du lieu trong Table LoaiSP
    public ResultSet ShowNhanVien() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM NhanVien"; 
        return cn.LoadData(sql);
    }
        
    //Truy van cac dong du lieu trong Table NhanVien theo MaNhanVien
    public ResultSet ShowNhanVien(String MaNV) throws SQLException
    { 
        String sql = "SELECT * FROM NhanVien where MaNhanVien='" + MaNV +"'"; 
        return cn.LoadData(sql);    
    }
    //Theo moi 1 dong du lieu vao table NhanVien
    public void InsertData(String MaNV, String TenNV, String SDT, String DC, String CV) throws SQLException
    { 
        String sql = "INSERT INTO NhanVien values('" + MaNV +"',N'" + TenNV +"',N'" + SDT +"',N'" + DC +"',N'" + CV +"')"; 
        cn.UpdateData(sql);
    }
    //Dieu chinh 1 dong du lieu vao table NhanVien
    public void EditData(String MaNV, String TenNV, String SDT, String DC, String CV) throws SQLException
    { 
        String sql = "Update NhanVien set TenNhanVien=N'" + TenNV + "', SoDienThoai= '" + SDT + "', DiaChi=N'" + DC + "', ChucVu=N'" + CV + "' where MaNhanVien='" + MaNV +"'"; 
        cn.UpdateData(sql);
    }
    //Xoa 1 dong du lieu vao table NhanVien
    public void DeleteData(String MaNV) throws SQLException
    { 
        String sql = "Delete from NhanVien where MaNhanVien='" + MaNV +"'"; 
        cn.UpdateData(sql);
    }
    
    
}
