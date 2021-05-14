/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.print.attribute.standard.MediaSize;

/**
 *
 * @author TuanTuti
 */
public class Menu_Form extends javax.swing.JFrame {

    /**
     * Creates new form frmQuanLy
     */
    public Menu_Form() {
       initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQuanLyQuyen1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBangSanPham = new javax.swing.JButton();
        btnBangLoaiSanPham = new javax.swing.JButton();
        btnBangNhanVien = new javax.swing.JButton();
        btnQuanLyQuyen = new javax.swing.JButton();
        btnQuanLyNguoiDung = new javax.swing.JButton();
        btnBangNhanVien1 = new javax.swing.JButton();
        btnBangNhanVien2 = new javax.swing.JButton();
        btnBangNhanVien3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCaiDat = new javax.swing.JMenu();
        mnuGioiThieu = new javax.swing.JMenu();
        mnuDangXuat = new javax.swing.JMenu();

        btnQuanLyQuyen1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyQuyen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/nhanvien.png"))); // NOI18N
        btnQuanLyQuyen1.setText("Quản Lý Quyền Sử Dụng");
        btnQuanLyQuyen1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyQuyen1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Trang Chủ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/hethong.png"))); // NOI18N
        jLabel1.setText("Hệ Thống Quản Lý");

        btnBangSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/sanpham.png"))); // NOI18N
        btnBangSanPham.setText("Quản Lý Sản Phẩm");
        btnBangSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangSanPhamActionPerformed(evt);
            }
        });

        btnBangLoaiSanPham.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/lisloaisanpham.png"))); // NOI18N
        btnBangLoaiSanPham.setText("Quản Lý Loại Sản Phẩm");
        btnBangLoaiSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangLoaiSanPhamActionPerformed(evt);
            }
        });

        btnBangNhanVien.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/phieunhap.png"))); // NOI18N
        btnBangNhanVien.setText("Quản Lý Phiếu Nhập");
        btnBangNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangNhanVienActionPerformed(evt);
            }
        });

        btnQuanLyQuyen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyQuyen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/sale.png"))); // NOI18N
        btnQuanLyQuyen.setText("Chương Trình Khuyến Mãi");
        btnQuanLyQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyQuyenActionPerformed(evt);
            }
        });

        btnQuanLyNguoiDung.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnQuanLyNguoiDung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/hoadon.png"))); // NOI18N
        btnQuanLyNguoiDung.setText("Quản Lý Hóa Đơn");
        btnQuanLyNguoiDung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuanLyNguoiDungActionPerformed(evt);
            }
        });

        btnBangNhanVien1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangNhanVien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/nhanvien.png"))); // NOI18N
        btnBangNhanVien1.setText("Quản Lý Nhân Viên");
        btnBangNhanVien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangNhanVien1ActionPerformed(evt);
            }
        });

        btnBangNhanVien2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangNhanVien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/khachhang11.png"))); // NOI18N
        btnBangNhanVien2.setText("Quản Lý Khách Hàng");
        btnBangNhanVien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangNhanVien2ActionPerformed(evt);
            }
        });

        btnBangNhanVien3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBangNhanVien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/nhacungcap.png"))); // NOI18N
        btnBangNhanVien3.setText("Nhà Cung Cấp");
        btnBangNhanVien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBangNhanVien3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBangNhanVien2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBangSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBangLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyNguoiDung, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBangNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBangNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBangNhanVien3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnQuanLyNguoiDung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBangSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBangLoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnQuanLyQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addComponent(btnBangNhanVien1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnBangNhanVien3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBangNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBangNhanVien2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 51, 51), null, new java.awt.Color(102, 0, 0), new java.awt.Color(204, 204, 0)));

        mnuHeThong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/hethong.png"))); // NOI18N
        mnuHeThong.setText("Hệ Thống");
        mnuHeThong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuHeThongMouseClicked(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/setting.png"))); // NOI18N
        jMenu1.setText("Quản lý Account");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        mnuHeThong.add(jMenu1);
        mnuHeThong.add(jSeparator1);

        jMenuBar1.add(mnuHeThong);

        mnuCaiDat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/hethongsys.png"))); // NOI18N
        mnuCaiDat.setText("Thống Kê");
        mnuCaiDat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuCaiDatMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuCaiDat);

        mnuGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/gioithieu.png"))); // NOI18N
        mnuGioiThieu.setText("Giới Thiệu");
        mnuGioiThieu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuGioiThieuMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnuGioiThieu);

        mnuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/dangxuat.png"))); // NOI18N
        mnuDangXuat.setText("Đăng Xuất");
        mnuDangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuDangXuatMouseClicked(evt);
            }
        });
        mnuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDangXuatActionPerformed(evt);
            }
        });
        jMenuBar1.add(mnuDangXuat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void showExit(){
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn đăng xuất không ?","Confirm",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
           Login s=new Login();
           s.setVisible(true);
           this.dispose();
        }
    }
    private void btnBangSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangSanPhamActionPerformed
        // TODO add your handling code here:
        MatHang_Form s=new MatHang_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBangSanPhamActionPerformed

    private void btnBangLoaiSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangLoaiSanPhamActionPerformed
        // TODO add your handling code here:
        LoaiHang_Form s=new LoaiHang_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBangLoaiSanPhamActionPerformed

    private void btnBangNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangNhanVienActionPerformed
        // TODO add your handling code here:
        PhieuNhap_Form s= new PhieuNhap_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnBangNhanVienActionPerformed

    private void btnQuanLyNguoiDungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyNguoiDungActionPerformed
        // TODO add your handling code here:
        HoaDon_form s=new HoaDon_form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
    }//GEN-LAST:event_btnQuanLyNguoiDungActionPerformed

    private void btnQuanLyQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyQuyenActionPerformed
        // TODO add your handling code here:
        KhuyenMai_Form s=new KhuyenMai_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
    }//GEN-LAST:event_btnQuanLyQuyenActionPerformed

    private void mnuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDangXuatActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnuDangXuatActionPerformed

    private void mnuDangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuDangXuatMouseClicked
        // TODO add your handling code here:
        showExit();
    }//GEN-LAST:event_mnuDangXuatMouseClicked

    private void mnuGioiThieuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuGioiThieuMouseClicked
        // TODO add your handling code here:
        GioiThieu_Form s=new GioiThieu_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      //  this.dispose();
        
       
    }//GEN-LAST:event_mnuGioiThieuMouseClicked

    private void mnuHeThongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuHeThongMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mnuHeThongMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
 
    }//GEN-LAST:event_formWindowOpened

    private void btnQuanLyQuyen1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuanLyQuyen1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnQuanLyQuyen1ActionPerformed

    private void btnBangNhanVien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangNhanVien1ActionPerformed
        // TODO add your handling code here:
        NhanVien_Form s=new NhanVien_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBangNhanVien1ActionPerformed

    private void btnBangNhanVien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangNhanVien2ActionPerformed
        // TODO add your handling code here:
        KhachHang_Form s=new KhachHang_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBangNhanVien2ActionPerformed

    private void btnBangNhanVien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBangNhanVien3ActionPerformed
        // TODO add your handling code here:
        NhaCungCap_Form s=new NhaCungCap_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnBangNhanVien3ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        TaiKhoanNhanVien_Form s=new TaiKhoanNhanVien_Form();
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_jMenu1MouseClicked

    private void mnuCaiDatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuCaiDatMouseClicked
        // TODO add your handling code here:
        ThongKe_Form s= new ThongKe_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_mnuCaiDatMouseClicked
   
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
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBangLoaiSanPham;
    private javax.swing.JButton btnBangNhanVien;
    private javax.swing.JButton btnBangNhanVien1;
    private javax.swing.JButton btnBangNhanVien2;
    private javax.swing.JButton btnBangNhanVien3;
    private javax.swing.JButton btnBangSanPham;
    private javax.swing.JButton btnQuanLyNguoiDung;
    private javax.swing.JButton btnQuanLyQuyen;
    private javax.swing.JButton btnQuanLyQuyen1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu mnuCaiDat;
    private javax.swing.JMenu mnuDangXuat;
    private javax.swing.JMenu mnuGioiThieu;
    private javax.swing.JMenu mnuHeThong;
    // End of variables declaration//GEN-END:variables
}