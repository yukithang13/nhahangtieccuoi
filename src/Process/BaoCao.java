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
public class BaoCao {
    public Connect cn = new Connect(); 
    
    public ResultSet ShowBaoCao() throws SQLException
    {   
        cn.connectSQL();
        String sql = "SELECT * FROM BaoCao"; 
        return cn.LoadData(sql);
    }
        
    //Truy van cac dong du lieu trong Table NhanVien theo MaNhanVien
    public ResultSet ShowBaoCao(String MaBC) throws SQLException
    { 
        String sql = "SELECT * FROM BaoCao where MaBaoCao='" + MaBC +"'"; 
        return cn.LoadData(sql);    
    }
    
    
    
    
    
    
    
}
