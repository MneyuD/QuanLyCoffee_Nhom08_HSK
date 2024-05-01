package ui;


import connect.ConnectDB;
import dao.NhanVien_DAO;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class NhanVien extends javax.swing.JPanel {


    private DefaultTableModel modelNhanVien;
    private int row;

    public NhanVien() {
        ConnectDB.getInstance().connect();
        initComponents();

        loadData(new NhanVien_DAO().getAllEmployee());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHinhNV = new javax.swing.JLabel();
        lblMaNV = new javax.swing.JLabel();
        lblTenNV = new javax.swing.JLabel();
        lblGioiTinhNV = new javax.swing.JLabel();
        lblNgaySinhNV = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSdt = new javax.swing.JLabel();
        lbl_MatKhau = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtNgaySinhNV = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        cbbKhuVucNV = new javax.swing.JComboBox<>();
        cbbGioiTinhNV = new javax.swing.JComboBox<>();
        txtMK = new javax.swing.JTextField();
        lblKhuVuc = new javax.swing.JLabel();
        lblGhiChu = new javax.swing.JLabel();
        txtGhiChu = new javax.swing.JTextField();
        btnThemNV = new MyButton();
        btnSuaNV = new MyButton();
        jPanel2 = new javax.swing.JPanel();
        lblTimNV = new javax.swing.JLabel();
        txtTimNV = new javax.swing.JTextField();
        lblKhuVuc_Tim = new javax.swing.JLabel();
        cbbKhuVuc_Tim = new javax.swing.JComboBox<>();
        jScrollPaneTTSP = new javax.swing.JScrollPane();
        jTableThongTinSP = new javax.swing.JTable();
        btnTimNV = new MyButton();

        setBackground(new java.awt.Color(250, 238, 232));

        jPanel1.setBackground(new java.awt.Color(250, 238, 232));

        lblHinhNV.setText("Hình SP");
        lblHinhNV.setForeground(Color.BLACK);

        lblMaNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMaNV.setText("Mã nhân viên:");
        lblMaNV.setForeground(Color.BLACK);

        txtMaNV.setForeground(Color.black);
        txtMaNV.setBackground(Color.white);
        txtMaNV.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        lblTenNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenNV.setText("Họ Tên:");
        lblTenNV.setForeground(Color.BLACK);

        txtTenNV.setForeground(Color.black);
        txtTenNV.setBackground(Color.white);
        txtTenNV.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        lblGioiTinhNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGioiTinhNV.setText("Giới tính:");
        lblGioiTinhNV.setForeground(Color.BLACK);

        cbbGioiTinhNV.setForeground(Color.black);
        cbbGioiTinhNV.setBackground(Color.white);

        lblNgaySinhNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgaySinhNV.setText("Ngày sinh:");
        lblNgaySinhNV.setForeground(Color.BLACK);

        txtNgaySinhNV.setForeground(Color.black);
        txtNgaySinhNV.setBackground(Color.white);
        txtNgaySinhNV.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email:");
        lblEmail.setForeground(Color.BLACK);

        txtEmail.setForeground(Color.black);
        txtEmail.setBackground(Color.white);
        txtEmail.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));


        lblSdt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSdt.setText("Số điện thoại:");
        lblSdt.setForeground(Color.BLACK);


        txtSDT.setForeground(Color.black);
        txtSDT.setBackground(Color.white);
        txtSDT.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        lbl_MatKhau.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_MatKhau.setText("Mật khẩu:");
        lbl_MatKhau.setForeground(Color.BLACK);

        txtMK.setForeground(Color.black);
        txtMK.setBackground(Color.white);
        txtMK.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));



        txtTenNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenNVActionPerformed(evt);
            }
        });

        cbbKhuVucNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Khu vực trong nhà", "Khu vực ngoài trời", "Khu vực quầy", " " }));

        cbbGioiTinhNV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nam", "Nữ" }));
        cbbGioiTinhNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbGioiTinhNVActionPerformed(evt);
            }
        });

        lblKhuVuc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKhuVuc.setText("Khu vực:");
        lblKhuVuc.setForeground(Color.black);

        cbbKhuVucNV.setBackground(Color.white);
        cbbKhuVucNV.setForeground(Color.BLACK);

        lblGhiChu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGhiChu.setText("Ghi chú:");
        lblGhiChu.setForeground(Color.black);

        txtGhiChu.setForeground(Color.black);
        txtGhiChu.setBackground(Color.white);
        txtGhiChu.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        btnThemNV.setText("Thêm");
        btnThemNV.setBorderColor(new java.awt.Color(0, 0, 0));
        btnThemNV.setBorderPainted(false);
        btnThemNV.setFocusPainted(false);
        btnThemNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemNV.setRadius(30);
        btnThemNV.setForeground(Color.BLACK);

        btnSuaNV.setText("Cập nhật");
        btnSuaNV.setBorderColor(new java.awt.Color(0, 0, 0));
        btnSuaNV.setBorderPainted(false);
        btnSuaNV.setFocusPainted(false);
        btnSuaNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaNV.setRadius(30);
        btnSuaNV.setForeground(Color.BLACK);


        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lblHinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNV)
                            .addComponent(lblTenNV)
                            .addComponent(lblGioiTinhNV)
                            .addComponent(lblNgaySinhNV)
                            .addComponent(lblEmail)
                            .addComponent(lblSdt)
                            .addComponent(lbl_MatKhau)
                            .addComponent(lblKhuVuc)
                            .addComponent(lblGhiChu))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaNV)
                            .addComponent(txtTenNV)
                            .addComponent(txtSDT)
                            .addComponent(cbbKhuVucNV, 0, 350, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbbGioiTinhNV, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMK)
                            .addComponent(txtGhiChu, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNgaySinhNV))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenNV)
                    .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbGioiTinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGioiTinhNV))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgaySinhNV)
                    .addComponent(txtNgaySinhNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSdt))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_MatKhau)
                    .addComponent(txtMK, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbKhuVucNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKhuVuc))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGhiChu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemNV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        jPanel2.setBackground(new java.awt.Color(250, 238, 232));

        lblTimNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTimNV.setText("Tên nhân viên");
        lblTimNV.setForeground(Color.BLACK);

        txtTimNV.setForeground(Color.black);
        txtTimNV.setBackground(Color.white);
        txtTimNV.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        lblKhuVuc_Tim.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKhuVuc_Tim.setText("Khu vực");
        lblKhuVuc_Tim.setForeground(Color.BLACK);

        cbbKhuVuc_Tim.setForeground(Color.black);
        cbbKhuVuc_Tim.setBackground(Color.white);

        cbbKhuVuc_Tim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả khu vực", "Khu vực trong nhà", "Khu vực ngoài trời", "Khu vực quầy" }));

        cbbKhuVuc_Tim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbbKhuVuc_TimActionPerformed(e);
            }
        });

        jScrollPaneTTSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTableThongTinSP.setBackground(Color.white);
        jTableThongTinSP.setForeground(Color.black);
        jTableThongTinSP.setGridColor(Color.black);
        jTableThongTinSP.setShowGrid(true);
        jTableThongTinSP.setModel(modelNhanVien = new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Khu vực", "Lương"
            }
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableThongTinSP.setRowHeight(25);
        jScrollPaneTTSP.setViewportView(jTableThongTinSP);
        jScrollPaneTTSP.setBackground(Color.white);

        btnTimNV.setText("Tìm");
        btnTimNV.setBorderColor(new java.awt.Color(0, 0, 0));
        btnTimNV.setBorderPainted(false);
        btnTimNV.setFocusPainted(false);
        btnTimNV.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimNV.setRadius(10);
        btnTimNV.setForeground(Color.BLACK);


        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblTimNV))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKhuVuc_Tim)
                            .addComponent(cbbKhuVuc_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTimNV)
                    .addComponent(lblKhuVuc_Tim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbKhuVuc_Tim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jScrollPaneTTSP)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtTimNV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtTimNVActionPerformed(e);
            }
        });

        btnTimNV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnTimNVActionPerformed(e);
            }
        });

        jTableThongTinSP.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
        });
    }// </editor-fold>

    private void btnTimNVActionPerformed(ActionEvent e) {
        String tenNV = txtTimNV.getText().trim();
        if(tenNV.isEmpty()) {
            loadData(new NhanVien_DAO().getAllEmployee());
        } else {
            loadData(new NhanVien_DAO().getEmployee_ByName(tenNV));
        }
    }

    private void txtTimNVActionPerformed(ActionEvent e) {
        String tenNV = txtTimNV.getText().trim();
        if(tenNV.isEmpty()) {
            loadData(new NhanVien_DAO().getAllEmployee());
        } else {
            loadData(new NhanVien_DAO().getEmployee_ByName(tenNV));
        }
    }

    private void cbbKhuVuc_TimActionPerformed(ActionEvent e) {
        String khuVuc = cbbKhuVuc_Tim.getSelectedItem().toString();
        if(cbbKhuVuc_Tim.getSelectedIndex() == 0) {
            loadData(new NhanVien_DAO().getAllEmployee());
        } else {
            loadData(new NhanVien_DAO().getEmployee_BySpace(khuVuc));
        }
    }

    private void txtTenNVActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void cbbGioiTinhNVActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    public void loadData(ArrayList<entity.NhanVien> list) {
        modelNhanVien.setRowCount(0);
        for(entity.NhanVien nv : list) {
            modelNhanVien.addRow(new Object[] {nv.getMaNV(), nv.getTenNV(), nv.getKhuVuc().getKhuVuc(), nv.getLuong()});
        }
    }

    // Variables declaration - do not modify                     
    private MyButton btnSuaNV;
    private MyButton btnThemNV;
    private MyButton btnTimNV;
    private javax.swing.JComboBox<String> cbbGioiTinhNV;
    private javax.swing.JComboBox<String> cbbKhuVucNV;
    private javax.swing.JComboBox<String> cbbKhuVuc_Tim;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneTTSP;
    private javax.swing.JTable jTableThongTinSP;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGhiChu;
    private javax.swing.JLabel lblGioiTinhNV;
    private javax.swing.JLabel lblHinhNV;
    private javax.swing.JLabel lblKhuVuc;
    private javax.swing.JLabel lblKhuVuc_Tim;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblNgaySinhNV;
    private javax.swing.JLabel lblSdt;
    private javax.swing.JLabel lblTenNV;
    private javax.swing.JLabel lblTimNV;
    private javax.swing.JLabel lbl_MatKhau;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGhiChu;
    private javax.swing.JTextField txtMK;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinhNV;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenNV;
    private javax.swing.JTextField txtTimNV;
    // End of variables declaration                   
}
