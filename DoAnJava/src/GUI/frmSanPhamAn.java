/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.MatHangBUS;
import model.MatHang;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import Connection.MySQLConnection;
/**
 *
 * @author The Phong
 */
public class frmSanPhamAn extends javax.swing.JFrame {
    static ArrayList<MatHang> DSMH=new ArrayList<>();
    static DefaultTableModel mode ;
    static String pathimg;
   
    /**
     * Creates new form frmSanPhamAn
     */
    public frmSanPhamAn() {
        initComponents();
        
        
    }
     public ImageIcon sizeOfImage (String pathImage, byte [] img){
        
        ImageIcon myImage = null;
        if (pathImage != null){
            myImage=new ImageIcon(pathImage);
        }
        else
        {
            myImage=new ImageIcon(img);
        }
        Image img1 = myImage.getImage();
        Image img2=img1.getScaledInstance(LabelHinhAnh.getWidth(), LabelHinhAnh.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(img2);
        return image;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelSanPham = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNgaySanXuat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTenMatHang = new javax.swing.JTextField();
        txtMaMatHang = new javax.swing.JTextField();
        txtMaLoaiHang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        PanelHinhAnh = new javax.swing.JPanel();
        LabelHinhAnh = new javax.swing.JLabel();
        txtHanSuDung = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        LoadSanPham = new javax.swing.JButton();
        ButtonThem = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        ButtonChonAnh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangSanPham = new javax.swing.JTable();
        labelHinhAnhAn = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(915, 650));

        PanelSanPham.setBackground(new java.awt.Color(204, 204, 255));
        PanelSanPham.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                PanelSanPhamComponentShown(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("Tên Mặt Hàng");

        jLabel1.setText("Mã Mặt Hàng");

        jLabel3.setText("Mã Loại Hàng");

        txtDonGia.setEditable(true);

        jLabel4.setText("Đơn Giá");

        txtNgaySanXuat.setEditable(true);
        txtNgaySanXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySanXuatActionPerformed(evt);
            }
        });

        jLabel5.setText("Ngày Sản Xuất");

        txtTenMatHang.setEditable(true);

        txtMaMatHang.setEditable(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenMatHang)
                    .addComponent(txtNgaySanXuat)
                    .addComponent(txtDonGia)
                    .addComponent(txtMaMatHang)
                    .addComponent(txtMaLoaiHang, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTenMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNgaySanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel9.setText("Hạn Sử Dụng");

        jLabel10.setText("Số Lượng");

        jLabel12.setText("Tìm Kiếm");

        txtSoLuong.setEditable(true);

        javax.swing.GroupLayout PanelHinhAnhLayout = new javax.swing.GroupLayout(PanelHinhAnh);
        PanelHinhAnh.setLayout(PanelHinhAnhLayout);
        PanelHinhAnhLayout.setHorizontalGroup(
            PanelHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
        );
        PanelHinhAnhLayout.setVerticalGroup(
            PanelHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        LoadSanPham.setText("ReLoad");
        LoadSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadSanPhamActionPerformed(evt);
            }
        });

        ButtonThem.setText("Thêm");
        ButtonThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonThemActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Sửa");

        jButton5.setText("Search");

        ButtonChonAnh.setText("Chọn Hình");
        ButtonChonAnh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChonAnhActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(LoadSanPham))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(38, 38, 38)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSoLuong)
                                    .addComponent(txtHanSuDung, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(txtTimKiem)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(ButtonThem)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addComponent(ButtonChonAnh, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addGap(18, 18, 18)
                .addComponent(PanelHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PanelHinhAnh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTimKiem)
                                .addComponent(jButton5))
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonThem)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LoadSanPham)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ButtonChonAnh)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        BangSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "MaMatHang", "MaLoaiHang", "TenMatHang", "DonGia", "NgaySanXuat", "HanSuDung", "SoLuong", "HinhAnh"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BangSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BangSanPhamMouseClicked(evt);
            }
        });
        BangSanPham.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                BangSanPhamInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        BangSanPham.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BangSanPhamPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(BangSanPham);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Mặt Hàng");

        javax.swing.GroupLayout PanelSanPhamLayout = new javax.swing.GroupLayout(PanelSanPham);
        PanelSanPham.setLayout(PanelSanPhamLayout);
        PanelSanPhamLayout.setHorizontalGroup(
            PanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSanPhamLayout.createSequentialGroup()
                .addGroup(PanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelSanPhamLayout.createSequentialGroup()
                            .addGap(363, 363, 363)
                            .addComponent(jLabel7))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(labelHinhAnhAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelSanPhamLayout.setVerticalGroup(
            PanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSanPhamLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelHinhAnhAn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(PanelSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BangSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BangSanPhamMouseClicked
        int viTriDongVuaBam = BangSanPham.getSelectedRow();
        txtMaMatHang.setText(BangSanPham.getValueAt(viTriDongVuaBam, 0).toString());
        txtMaLoaiHang.setText(BangSanPham.getValueAt(viTriDongVuaBam, 1).toString());
        txtTenMatHang.setText(BangSanPham.getValueAt(viTriDongVuaBam, 2).toString());
        txtDonGia.setText(BangSanPham.getValueAt(viTriDongVuaBam, 3).toString());
        txtNgaySanXuat.setText(BangSanPham.getValueAt(viTriDongVuaBam, 4).toString());
        txtHanSuDung.setText(BangSanPham.getValueAt(viTriDongVuaBam, 5).toString());
        txtSoLuong.setText(BangSanPham.getValueAt(viTriDongVuaBam, 6).toString());
        byte [] imgbytes;
        imgbytes=(byte[]) BangSanPham.getValueAt(viTriDongVuaBam, 7);
        Image img;
        img=getToolkit().createImage(imgbytes);
       // ImageIcon icon=new ImageIcon(img);
        LabelHinhAnh.setIcon(sizeOfImage(null, imgbytes));
       
        

       
    }//GEN-LAST:event_BangSanPhamMouseClicked

    private void PanelSanPhamComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_PanelSanPhamComponentShown
      
    }//GEN-LAST:event_PanelSanPhamComponentShown

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void BangSanPhamPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BangSanPhamPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_BangSanPhamPropertyChange

    private void BangSanPhamInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_BangSanPhamInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_BangSanPhamInputMethodTextChanged

    private void LoadSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadSanPhamActionPerformed
        MatHangBUS bus=new MatHangBUS();
        if(MatHangBUS.DSMH==null) try {
            bus.ReadDSMH();
        } catch (Exception ex) {
            Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector header=new Vector();
        header.add("MaMatHang");
        header.add("MaLoaiHang");
        header.add("TenMatHang");
        header.add("DonGia");
        header.add("NgaySanXuat");
        header.add("HanSuDung");
        header.add("SoLuong");
        header.add("HinhAnh");
        mode=new DefaultTableModel(header,0);
        for(MatHang mh : MatHangBUS.DSMH){
            Vector row=new Vector();
            row.add(mh.MaMatHang);
            row.add(mh.MaLoaiHang);
            row.add(mh.TenMatHang);
            row.add(mh.DonGia);
            row.add(mh.NgaySanXuat);
            row.add(mh.HanSuDung);
            row.add(mh.SoLuong);
            row.add(mh.HinhAnh);
            mode.addRow(row);
       }
        BangSanPham.setModel(mode);
    }//GEN-LAST:event_LoadSanPhamActionPerformed

    private void ButtonThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonThemActionPerformed
       MatHang mh=new MatHang();
       mh.MaMatHang=txtMaMatHang.getText();
       mh.MaLoaiHang=txtMaLoaiHang.getText();
       mh.TenMatHang=txtTenMatHang.getText();
       mh.DonGia=Integer.parseInt(txtDonGia.getText());
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       String nsx=txtNgaySanXuat.getText();
       Date mynsx;
        try {
            mynsx = df.parse(nsx);
            java.sql.Date sqlDate = new java.sql.Date(mynsx.getTime());
            mh.NgaySanXuat=sqlDate;
        } catch (ParseException ex) {
            Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
        }
        String hsd=txtHanSuDung.getText();
       Date myhsd;
        try {
            myhsd = df.parse(nsx);
            java.sql.Date sqlDate = new java.sql.Date(myhsd.getTime());
            mh.HanSuDung=sqlDate;
        } catch (ParseException ex) {
            Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
        }
        mh.SoLuong=Integer.parseInt(txtSoLuong.getText());
       
        MatHangBUS bus=new MatHangBUS();
        try {
            bus.AddMatHang(mh);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
        }
        Vector row=new Vector();
            row.add(mh.MaMatHang);
            row.add(mh.MaLoaiHang);
            row.add(mh.TenMatHang);
            row.add(mh.DonGia);
            row.add(mh.NgaySanXuat);
            row.add(mh.HanSuDung);
            row.add(mh.SoLuong);
            row.add(mh.HinhAnh);
            mode.addRow(row);
             BangSanPham.setModel(mode);
       
       
    }//GEN-LAST:event_ButtonThemActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtNgaySanXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySanXuatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySanXuatActionPerformed

    private void ButtonChonAnhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChonAnhActionPerformed
          
          JFileChooser file=new JFileChooser();
      //  file.setCurrentDirectory(new File(System.getProperties("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("jpg","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(null);
        if(result ==JFileChooser.APPROVE_OPTION){
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            LabelHinhAnh.setIcon(sizeOfImage(path, null));
            pathimg=path;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"No picture chosen");
        }
    }//GEN-LAST:event_ButtonChonAnhActionPerformed

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
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSanPhamAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSanPhamAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangSanPham;
    private javax.swing.JButton ButtonChonAnh;
    private javax.swing.JButton ButtonThem;
    private javax.swing.JLabel LabelHinhAnh;
    private javax.swing.JButton LoadSanPham;
    private javax.swing.JPanel PanelHinhAnh;
    private javax.swing.JPanel PanelSanPham;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHinhAnhAn;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtHanSuDung;
    private javax.swing.JTextField txtMaLoaiHang;
    private javax.swing.JTextField txtMaMatHang;
    private javax.swing.JTextField txtNgaySanXuat;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMatHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
