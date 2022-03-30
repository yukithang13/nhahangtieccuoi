/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Process;

import Database.Connect;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Thang Le
 */
public class HopDong {
    public Connect cn = new Connect(); 
    public ResultSet ShowHopDong() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM ThongTinDatTiec"; 
        return cn.LoadData(sql);
    }
    public ResultSet ShowHopDong(String MaDT) throws SQLException
    { 
        String sql = "SELECT * FROM ThongTinDatTiec where MaDatTiec='" + MaDT +"'"; 
        return cn.LoadData(sql);
    }
    
    public ResultSet ShowHopDongKH() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM ThongTinKhachHang"; 
        return cn.LoadData(sql);
    }
    public ResultSet ShowHopDongKH(String MaKH) throws SQLException
    { 
        String sql = "SELECT * FROM ThongTinKhachHang where MaKhachHang='" + MaKH +"'"; 
        return cn.LoadData(sql);
    }
    // Them Vao Hợp Đồng
    //--------------------------------------------------------------------------------------
    
    public ResultSet ShowThucDon() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM ThucDon"; 
        return cn.LoadData(sql);
    }
    
    public ResultSet ShowThucDon(String MaTD) throws SQLException
    { 
        String sql = "SELECT * FROM ThucDon where MaThucDon='" + MaTD +"'"; 
        return cn.LoadData(sql);
    }
    
    //--------------------------------------------------------------------------------------
    public ResultSet ShowDichVu() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM DichVu"; 
        return cn.LoadData(sql);
    }
    
    public ResultSet ShowDichVu(String MaDV) throws SQLException
    { 
        String sql = "SELECT * FROM DichVu where MaDichVu='" + MaDV +"'"; 
        return cn.LoadData(sql);
    }
    
    //--------------------------------------------------------------------------------------
    public void InsertHD(String MaKH, Date NgayLap, String TenKH, String TenChuR, String TenCoR, String DC, String SDT,Date NgayToChuc,double TienCoc) throws SQLException
    { 
        String sql = "INSERT INTO ThongTinKhachHang values('" + MaKH +"',N'" + TenKH +"',N'" + TenChuR +"',N'" + TenCoR +"',N'" + DC +",N'" + SDT +",N'" + NgayToChuc +", N'" + TienCoc +"')"; 
        cn.UpdateData(sql);
    }
    // Thêm Vào ---------------------------------------------------------------------
    
    public void InsertDT(String MaDT, String MaDichVu, String MaKH, String MaThucDon, String MaNhanVien, int SoLuongNhanVien, int SoLuongBan,double TongTien) throws SQLException
    { 
        
        String sql = "INSERT INTO ThongTinDatTiec values(" + MaDT +"'," + MaDichVu +"'," + MaKH +"'," + MaThucDon +"'," + MaNhanVien +",N'" + SoLuongNhanVien +"," + SoLuongBan +", " + TongTien +"')"; 
        cn.UpdateData(sql);
    }
    
    
    
    public void DeleteHD(String MaKH) throws SQLException
    { 
        String sql = "Delete from ThongTinKhachHang where MaKhachHang='" + MaKH +"'"; 
        cn.UpdateData(sql);
    }
    
    public void DeleteDT(String MaDT) throws SQLException
    { 
        String sql = "Delete from ThongTinDatTiec where MaDatTiec='" + MaDT +"'"; 
        cn.UpdateData(sql);
    }

    public ResultSet ShowMaKH() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM ThongTinKhachHang"; 
        return cn.LoadData(sql);
    }
    
    public ResultSet ShowMaKH(String MaKH) throws SQLException
    { 
        String sql = "SELECT * FROM ThongTinKhachHang where MaKhachHang='" + MaKH +"'"; 
        return cn.LoadData(sql);
    }

    public ResultSet ShowTTKH() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM ThongTinKhachHang"; 
        return cn.LoadData(sql);
    }
        
    //Truy van cac dong du lieu trong Table NhanVien theo MaNhanVien
    
    
    public ResultSet ShowTTDT() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM ThongTinDatTiec"; 
        return cn.LoadData(sql);
    }
        
    //Truy van cac dong du lieu trong Table NhanVien theo MaNhanVien
    
    
    
}


