/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.MatHangBUS;
import model.MatHang;


import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author E480
 */
public class MatHang_Form extends javax.swing.JFrame {
  public static String pathimg;
   public static DefaultTableModel mode ;
   public static int index;
   public static TableRowSorter<TableModel> rowSorter;
            
    /**
     * Creates new form MatHang
     */
    public MatHang_Form() {
        initComponents();
        LoadData();
    }
    public void TimKiem(){
         txtTimKiem.getDocument().addDocumentListener(new DocumentListener(){

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = txtTimKiem.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = txtTimKiem.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

             

        });
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
    public byte[] extractBytes (String ImageName) throws IOException {
       File file = new File(pathimg);
        System.out.println(file.exists() + "!!");
 
        FileInputStream fis = new FileInputStream(file);
        //create FileInputStream which obtains input bytes from a file in a file system
        //FileInputStream is meant for reading streams of raw bytes such as image data. For reading streams of characters, consider using FileReader.
 
        //InputStream in = resource.openStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                bos.write(buf, 0, readNum); 
                 }
        } catch (IOException ex) {
            Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
           byte[] bytes = bos.toByteArray();
           return bytes;
}
    public void LoadData(){
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
        TableMatHang.setModel(mode);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBig = new javax.swing.JPanel();
        PanelMatHang = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        PanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMatHang = new javax.swing.JTable();
        PanelTextField = new javax.swing.JPanel();
        LabelMaMatHang = new javax.swing.JLabel();
        txtMaMatHang = new javax.swing.JTextField();
        LabelMaLoaiHang = new javax.swing.JLabel();
        txtMaLoaiHang = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtTenMatHang = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNgaySanXuat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHanSuDung = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        txtTimKiem = new javax.swing.JTextField();
        btThem = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        SearchButton = new javax.swing.JButton();
        PanelHinhAnh = new javax.swing.JPanel();
        LabelHinhAnh = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNgayBatDau = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNgayKetThuc = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(new java.awt.FlowLayout());

        PanelBig.setPreferredSize(new java.awt.Dimension(960, 615));

        PanelMatHang.setBackground(new java.awt.Color(204, 204, 255));
        PanelMatHang.setPreferredSize(new java.awt.Dimension(960, 42));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/mathang.png"))); // NOI18N
        jLabel9.setText("Mặt Hàng");

        javax.swing.GroupLayout PanelMatHangLayout = new javax.swing.GroupLayout(PanelMatHang);
        PanelMatHang.setLayout(PanelMatHangLayout);
        PanelMatHangLayout.setHorizontalGroup(
            PanelMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMatHangLayout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelMatHangLayout.setVerticalGroup(
            PanelMatHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMatHangLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel9))
        );

        PanelTable.setBackground(new java.awt.Color(204, 204, 255));
        PanelTable.setPreferredSize(new java.awt.Dimension(960, 233));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(960, 233));

        TableMatHang.setModel(new javax.swing.table.DefaultTableModel(
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
        TableMatHang.setPreferredSize(new java.awt.Dimension(960, 450));
        TableMatHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMatHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableMatHang);

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 912, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        PanelTextField.setBackground(new java.awt.Color(204, 204, 255));
        PanelTextField.setPreferredSize(new java.awt.Dimension(960, 100));

        LabelMaMatHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/key.png"))); // NOI18N
        LabelMaMatHang.setText("Mã Mặt Hàng");

        txtMaMatHang.setEditable(true);

        LabelMaLoaiHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/key2.png"))); // NOI18N
        LabelMaLoaiHang.setText("Mã Loại Hàng");

        txtMaLoaiHang.setEditable(true);
        txtMaLoaiHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaLoaiHangActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/name.png"))); // NOI18N
        jLabel1.setText("Tên Mặt Hàng");

        txtTenMatHang.setEditable(true);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/date1.png"))); // NOI18N
        jLabel2.setText("Ngày Sản Xuất");

        txtNgaySanXuat.setEditable(true);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/date2.png"))); // NOI18N
        jLabel3.setText("Hạn Sử Dụng");

        txtHanSuDung.setEditable(true);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/amount.png"))); // NOI18N
        jLabel4.setText("Số Lượng");

        txtSoLuong.setEditable(true);
        txtSoLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoLuongActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/thongke11.png"))); // NOI18N
        jLabel5.setText("Tìm Kiếm:");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/gianhap.png"))); // NOI18N
        jLabel6.setText("Đơn Giá:");

        txtDonGia.setEditable(true);

        txtTimKiem.setEditable(true);
        txtTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimKiemActionPerformed(evt);
            }
        });

        btThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/Thêm.png"))); // NOI18N
        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/1111.png"))); // NOI18N
        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/update.png"))); // NOI18N
        jButton4.setText("Sửa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/refresh.png"))); // NOI18N
        jButton2.setText("Cập Nhật");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/icons8-google-web-search-24.png"))); // NOI18N
        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        PanelHinhAnh.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelHinhAnhLayout = new javax.swing.GroupLayout(PanelHinhAnh);
        PanelHinhAnh.setLayout(PanelHinhAnhLayout);
        PanelHinhAnhLayout.setHorizontalGroup(
            PanelHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHinhAnhLayout.createSequentialGroup()
                .addComponent(LabelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        PanelHinhAnhLayout.setVerticalGroup(
            PanelHinhAnhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LabelHinhAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
        );

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/name1.png"))); // NOI18N
        jButton1.setText("Chọn Ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/date1.png"))); // NOI18N
        jLabel7.setText("Tìm Kiếm Từ Ngày:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/date2.png"))); // NOI18N
        jLabel8.setText("Đến Ngày:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imaige/icons8-google-web-search-24.png"))); // NOI18N
        jButton3.setText("Tìm");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTextFieldLayout = new javax.swing.GroupLayout(PanelTextField);
        PanelTextField.setLayout(PanelTextFieldLayout);
        PanelTextFieldLayout.setHorizontalGroup(
            PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextFieldLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelTextFieldLayout.createSequentialGroup()
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelMaMatHang)
                            .addComponent(LabelMaLoaiHang)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaLoaiHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(txtTenMatHang, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDonGia)
                            .addComponent(txtMaMatHang)))
                    .addGroup(PanelTextFieldLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNgayBatDau, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)))
                .addGap(26, 26, 26)
                .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextFieldLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(37, 37, 37)
                        .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PanelTextFieldLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(44, 44, 44)
                            .addComponent(txtTimKiem))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextFieldLayout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextFieldLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(26, 26, 26)
                            .addComponent(txtHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextFieldLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(txtNgaySanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTextFieldLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelTextFieldLayout.createSequentialGroup()
                                .addComponent(btThem)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btXoa))
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTextFieldLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addGroup(PanelTextFieldLayout.createSequentialGroup()
                                .addComponent(SearchButton)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        PanelTextFieldLayout.setVerticalGroup(
            PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTextFieldLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTextFieldLayout.createSequentialGroup()
                        .addComponent(PanelHinhAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelTextFieldLayout.createSequentialGroup()
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelMaMatHang)
                            .addComponent(txtMaMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtNgaySanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LabelMaLoaiHang)
                            .addComponent(txtMaLoaiHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txtHanSuDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtTenMatHang)
                            .addComponent(jLabel4)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btThem)
                            .addComponent(btXoa)
                            .addComponent(jButton4))
                        .addGap(0, 0, 0)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2)))
                        .addGap(1, 1, 1)
                        .addGroup(PanelTextFieldLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNgayBatDau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtNgayKetThuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51))))
        );

        javax.swing.GroupLayout PanelBigLayout = new javax.swing.GroupLayout(PanelBig);
        PanelBig.setLayout(PanelBigLayout);
        PanelBigLayout.setHorizontalGroup(
            PanelBigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelMatHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
            .addGroup(PanelBigLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1001, Short.MAX_VALUE))
            .addComponent(PanelTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        PanelBigLayout.setVerticalGroup(
            PanelBigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBigLayout.createSequentialGroup()
                .addComponent(PanelMatHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(PanelBig);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimKiemActionPerformed
       
    }//GEN-LAST:event_txtTimKiemActionPerformed

    private void txtSoLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoLuongActionPerformed

    private void txtMaLoaiHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaLoaiHangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaLoaiHangActionPerformed

    private void TableMatHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMatHangMouseClicked
         index = TableMatHang.getSelectedRow();
        txtMaMatHang.setText(TableMatHang.getValueAt(index, 0).toString());
        txtMaLoaiHang.setText(TableMatHang.getValueAt(index, 1).toString());
        txtTenMatHang.setText(TableMatHang.getValueAt(index, 2).toString());
        txtDonGia.setText(TableMatHang.getValueAt(index, 3).toString());
        txtNgaySanXuat.setText(TableMatHang.getValueAt(index, 4).toString());
        txtHanSuDung.setText(TableMatHang.getValueAt(index, 5).toString());
        txtSoLuong.setText(TableMatHang.getValueAt(index, 6).toString());
        byte [] imgbytes;
        imgbytes=(byte[]) TableMatHang.getValueAt(index, 7);
        Image img;
        img=getToolkit().createImage(imgbytes);
       // ImageIcon icon=new ImageIcon(img);
        LabelHinhAnh.setIcon(sizeOfImage(null, imgbytes));
    }//GEN-LAST:event_TableMatHangMouseClicked

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        FileInputStream fis=null;
        
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
            File image=new File(pathimg);
            
            
          try {
           BufferedImage bImage = ImageIO.read(image);
           ByteArrayOutputStream bos = new ByteArrayOutputStream();
           ImageIO.write(bImage, "jpg", bos );
           byte [] data = bos.toByteArray();
           mh.HinhAnh=data;
          
         } catch (IOException ex) {
          Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
         }
            
            
            MatHangBUS bus=new MatHangBUS();
            try {
              bus.AddMatHang(mh);
            } catch (FileNotFoundException ex) {
              Logger.getLogger(frmSanPhamAn.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
          Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
      } catch (IOException ex) {
          Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
      }
         
        
       
        
        
    }//GEN-LAST:event_btThemActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        MatHangBUS bus=new MatHangBUS();
        MatHang mh=new MatHang();
        mh.MaMatHang=txtMaMatHang.getText();
        bus.DeleteMatHang(mh);
       
        
        
        
        
        
        
        
        
        
          
    }//GEN-LAST:event_btXoaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         MatHangBUS bus=new MatHangBUS();
         try {
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
        TableMatHang.setModel(mode);
   
// if (txtTimKiem.getText().trim().length() == 0) 
//     
//     LoadData();
//
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
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
            File image=new File(pathimg);
            
            
          try {
           BufferedImage bImage = ImageIO.read(image);
           ByteArrayOutputStream bos = new ByteArrayOutputStream();
           ImageIO.write(bImage, "jpg", bos );
           byte [] data = bos.toByteArray();
           mh.HinhAnh=data;
          
         } catch (IOException ex) {
          Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
         }
          MatHangBUS bus=new MatHangBUS();
           try {
               bus.UpdateMatHang(mh);
           } catch (FileNotFoundException ex) {
               Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
           }
           mode.setValueAt(mh.getMaMatHang(), index, 0);
           mode.setValueAt(mh.getMaLoaiHang(), index, 1);
           mode.setValueAt(mh.getTenMathang(),index, 2);
            mode.setValueAt(mh.getDonGia(),index, 3);
           mode.setValueAt(mh.getNgaySanXuat(),index, 4);
           mode.setValueAt(mh.getHanSuDung(), index, 5);
           mode.setValueAt(mh.getSoLuong(), index, 6);
           mode.setValueAt(mh.getHinhAnh(), index, 7);
           TableMatHang.setModel(mode);
           
          
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
          rowSorter= new TableRowSorter<>(TableMatHang.getModel()); 
        TableMatHang.setRowSorter(rowSorter);  
        String text = txtTimKiem.getText();
             
  if (text.trim().length() == 0) {
     rowSorter.setRowFilter(null);
     LoadData(); 
  } else {
     rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
     
  } 

    }//GEN-LAST:event_SearchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         MatHangBUS bus=new MatHangBUS();
      try {
          bus.SearchByDate();
      } catch (Exception ex) {
          Logger.getLogger(MatHang_Form.class.getName()).log(Level.SEVERE, null, ex);
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
        TableMatHang.setModel(mode);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MatHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatHang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatHang_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelHinhAnh;
    private javax.swing.JLabel LabelMaLoaiHang;
    private javax.swing.JLabel LabelMaMatHang;
    private javax.swing.JPanel PanelBig;
    private javax.swing.JPanel PanelHinhAnh;
    private javax.swing.JPanel PanelMatHang;
    private javax.swing.JPanel PanelTable;
    private javax.swing.JPanel PanelTextField;
    private javax.swing.JButton SearchButton;
    public static javax.swing.JTable TableMatHang;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtHanSuDung;
    private javax.swing.JTextField txtMaLoaiHang;
    public static javax.swing.JTextField txtMaMatHang;
    public static javax.swing.JTextField txtNgayBatDau;
    public static javax.swing.JTextField txtNgayKetThuc;
    private javax.swing.JTextField txtNgaySanXuat;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenMatHang;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
