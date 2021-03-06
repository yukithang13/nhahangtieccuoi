/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlnhahangtieccuoi;

import Process.BaoCao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thang Le
 */
public class XemDSBaoCao extends javax.swing.JFrame {
    private final DefaultTableModel tableModel = new DefaultTableModel();
    BaoCao bc = new BaoCao();
    
    /**
     * Creates new form XemDSBaoCao
     */
    public XemDSBaoCao() throws SQLException {
        initComponents();
        ImageIcon img = new ImageIcon("E:\\java\\QLNhaHang\\QLNhaHangTiecCuoi\\src\\Database/2.jpg");
        this.setIconImage(img.getImage());
        String []colsName = {"Mã Báo Cáo", "Mã Nhân Viên", "Ngày Lập","Tên Nhân Viên", "Số Lượng Tiệc","Tổng Tiền"};
        
        tableModel.setColumnIdentifiers(colsName);
        tabBC.setModel(tableModel);
        ShowData();
        
    }

    
    public void ShowData() throws SQLException{ 
        ResultSet result= bc.ShowBaoCao(); 
    try { 
        while(result.next()){ // nếu còn đọc tiếp được một dòng dữ liệu
        String rows[] = new String[6];
        rows[0] = result.getString(1); // lấy dữ liệu tại cột số 1 (ứng với mã hàng)
        rows[1] = result.getString(2);
        rows[2] = result.getString(3); 
        rows[3] = result.getString(4);
        rows[4] = result.getString(5);
        rows[5] = result.getString(6);


        tableModel.addRow(rows); // đưa dòng dữ liệu vào tableModel 
        //mỗi lần có sự thay đổi dữ liệu ở tableModel thì Jtable sẽ tự động update 
        //txtSumClient.Text = tabDT.Rows.Count.ToString();
    }
    } 
    catch (SQLException e) {
        
    } 
    } 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabBC = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnThoat = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabBC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabBC);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 82, 882, 257));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Danh Sach Báo Cáo");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 11, -1, -1));

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        getContentPane().add(btnThoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(868, 357, -1, 42));

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuayLai, new org.netbeans.lib.awtextra.AbsoluteConstraints(779, 359, -1, 39));

        jLabel2.setIcon(new javax.swing.ImageIcon("F:\\Tai_xuong_Google\\TiecCuoi_Image\\nen.jpg")); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        try {
            // TODO add your handling code here:
            LapBaoCao lbc = new LapBaoCao();
            lbc.setVisible(true);
            setVisible(false);
        } catch (SQLException ex) {
            Logger.getLogger(XemDSBaoCao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XemDSBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemDSBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemDSBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemDSBaoCao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new XemDSBaoCao().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(XemDSBaoCao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnThoat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabBC;
    // End of variables declaration//GEN-END:variables
}
