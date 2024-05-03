/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;


import connect.ConnectDB;
import dao.ChiTietHD_DAO;
import dao.HoaDon_DAO;
import dao.LoaiSP_DAO;
import entity.ChiTietHD;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ThongKe extends javax.swing.JPanel {
    private static DecimalFormat df = new DecimalFormat("#,##0.00 VND");
    private final LoaiSP_DAO loaiSP_dao;
    private DefaultTableModel modelSanPham;

    public ThongKe() {
        ConnectDB.getInstance().connect();

        initComponents();
        loaiSP_dao = new LoaiSP_DAO();
        updateComboBoxData();

        loadData(new ChiTietHD_DAO().getProduct_BestSeller());

        txtTongHN.setText(df.format(new HoaDon_DAO().getDailyRevenue()));
        txtTongT.setText(df.format(new HoaDon_DAO().getMonthlyRevenue()));
        txtTongNam.setText(df.format(new HoaDon_DAO().getdRevenueForYear()));


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelTren = new javax.swing.JPanel();
        jPanelHomNay = new javax.swing.JPanel();
        lblHN = new javax.swing.JLabel();
        txtTongHN = new javax.swing.JTextField();
        jPanelNam = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        txtTongNam = new javax.swing.JTextField();
        jPanel1Thang = new javax.swing.JPanel();
        lblT = new javax.swing.JLabel();
        txtTongT = new javax.swing.JTextField();
        jPanelTuy = new javax.swing.JPanel();
        lblTC = new javax.swing.JLabel();
        txtTongTC = new javax.swing.JTextField();
        jPanelChonXTK = new javax.swing.JPanel();
        lblTuNgay = new javax.swing.JLabel();
        lblDenNgay = new javax.swing.JLabel();
        txtDenNgay_TrungKhungThongKe = new javax.swing.JTextField();
        txtTuNgay_TrongKhungThongKe = new javax.swing.JTextField();
        btnXuatTK = new ui.MyButton();
        jPanelDuoi = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        jScrollPane_ThongTinSP = new javax.swing.JScrollPane();
        jtable_ThongTinSP = new javax.swing.JTable();
        jPanelXuatTKDuoi = new javax.swing.JPanel();
        txtTuNgay_Loc = new javax.swing.JTextField();
        lblTu1 = new javax.swing.JLabel();
        lblDen1 = new javax.swing.JLabel();
        lbl_LoaiSP = new javax.swing.JLabel();
        lbl_TrangThai = new javax.swing.JLabel();
        cbbLoaiSP_Loc = new javax.swing.JComboBox<>();
        cbbTrangThaiSP_Loc = new javax.swing.JComboBox<>();
        txtDenNgay_Loc = new javax.swing.JTextField();
        btnLoc = new ui.MyButton();

        setBackground(new java.awt.Color(250, 238, 232));

        jPanel1.setBackground(new java.awt.Color(250, 238, 232));

        jPanelTren.setBackground(new java.awt.Color(250, 238, 232));
        jPanelTren.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thống kê", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), Color.black)); // NOI18N
        jPanelTren.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTren.setName(""); // NOI18N

        jPanelHomNay.setBackground(new java.awt.Color(143, 108, 101));

        lblHN.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHN.setForeground(new java.awt.Color(255, 255, 255));
        lblHN.setText("Hôm nay");

        txtTongHN.setBackground(new java.awt.Color(143, 108, 101));
        txtTongHN.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTongHN.setForeground(new java.awt.Color(255, 255, 255));
        txtTongHN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTongHN.setText("Tiền");
        txtTongHN.setBorder(null);


        javax.swing.GroupLayout jPanelHomNayLayout = new javax.swing.GroupLayout(jPanelHomNay);
        jPanelHomNay.setLayout(jPanelHomNayLayout);
        jPanelHomNayLayout.setHorizontalGroup(
                jPanelHomNayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHomNayLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(lblHN)
                                .addContainerGap(69, Short.MAX_VALUE))
                        .addGroup(jPanelHomNayLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtTongHN)
                                .addContainerGap())
        );
        jPanelHomNayLayout.setVerticalGroup(
                jPanelHomNayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelHomNayLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(lblHN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongHN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Thang.setBackground(new java.awt.Color(143, 108, 101));

        lblT.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblT.setForeground(new java.awt.Color(255, 255, 255));
        lblT.setText("Tháng");

        txtTongT.setBackground(new java.awt.Color(143, 108, 101));
        txtTongT.setFont(new java.awt.Font("Segoe UI", 1, 18));
        txtTongT.setForeground(new java.awt.Color(255, 255, 255));
        txtTongT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTongT.setText("Tiền");
        txtTongT.setBorder(null);

        javax.swing.GroupLayout jPanel1ThangLayout = new javax.swing.GroupLayout(jPanel1Thang);
        jPanel1Thang.setLayout(jPanel1ThangLayout);
        jPanel1ThangLayout.setHorizontalGroup(
                jPanel1ThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1ThangLayout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(lblT)
                                .addContainerGap(80, Short.MAX_VALUE))
                        .addComponent(txtTongT)
        );
        jPanel1ThangLayout.setVerticalGroup(
                jPanel1ThangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1ThangLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelNam.setBackground(new java.awt.Color(143, 108, 101));

        lblNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNam.setForeground(new java.awt.Color(255, 255, 255));
        lblNam.setText("Năm");

        txtTongNam.setBackground(new java.awt.Color(143, 108, 101));
        txtTongNam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTongNam.setForeground(new java.awt.Color(255, 255, 255));
        txtTongNam.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTongNam.setText("Tiền");
        txtTongNam.setBorder(null);

        javax.swing.GroupLayout jPanelNamLayout = new javax.swing.GroupLayout(jPanelNam);
        jPanelNam.setLayout(jPanelNamLayout);
        jPanelNamLayout.setHorizontalGroup(
                jPanelNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNamLayout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(lblNam)
                                .addContainerGap(81, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNamLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtTongNam)
                                .addContainerGap())
        );
        jPanelNamLayout.setVerticalGroup(
                jPanelNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelNamLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongNam, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelTuy.setBackground(new java.awt.Color(143, 108, 101));
        jPanelTuy.setForeground(new java.awt.Color(255, 255, 255));

        lblTC.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTC.setForeground(new java.awt.Color(255, 255, 255));
        lblTC.setText("Tùy chỉnh");

        txtTongTC.setBackground(new java.awt.Color(143, 108, 101));
        txtTongTC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTongTC.setForeground(new java.awt.Color(255, 255, 255));
        txtTongTC.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTongTC.setText("Tiền");
        txtTongTC.setBorder(null);

        javax.swing.GroupLayout jPanelTuyLayout = new javax.swing.GroupLayout(jPanelTuy);
        jPanelTuy.setLayout(jPanelTuyLayout);
        jPanelTuyLayout.setHorizontalGroup(
                jPanelTuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTuyLayout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(lblTC)
                                .addContainerGap(64, Short.MAX_VALUE))
                        .addGroup(jPanelTuyLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtTongTC)
                                .addContainerGap())
        );
        jPanelTuyLayout.setVerticalGroup(
                jPanelTuyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTuyLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblTC)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTongTC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(90, Short.MAX_VALUE))
        );

        jPanelChonXTK.setBackground(new java.awt.Color(250, 238, 232));

        lblTuNgay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTuNgay.setText("Từ ngày:");
        lblTuNgay.setForeground(Color.BLACK);

        txtTuNgay_TrongKhungThongKe.setBackground(Color.white);
        txtTuNgay_TrongKhungThongKe.setForeground(Color.black);
        txtTuNgay_TrongKhungThongKe.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        lblDenNgay.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDenNgay.setText("Đến ngày:");
        lblDenNgay.setForeground(Color.BLACK);


        txtDenNgay_TrungKhungThongKe.setBackground(Color.white);
        txtDenNgay_TrungKhungThongKe.setForeground(Color.black);
        txtDenNgay_TrungKhungThongKe.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        txtTuNgay_TrongKhungThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTuNgay_TrongKhungThongKeActionPerformed(evt);
            }
        });

        btnXuatTK.setText("Xuất TK");
        btnXuatTK.setBorderColor(new java.awt.Color(0, 0, 0));
        btnXuatTK.setBorderPainted(false);
        btnXuatTK.setFocusPainted(false);
        btnXuatTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXuatTK.setRadius(10);
        btnXuatTK.setForeground(Color.BLACK);

        btnXuatTK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnXuatTKActionPerformed(e);
            }
        });

        javax.swing.GroupLayout jPanelChonXTKLayout = new javax.swing.GroupLayout(jPanelChonXTK);
        jPanelChonXTK.setLayout(jPanelChonXTKLayout);
        jPanelChonXTKLayout.setHorizontalGroup(
                jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelChonXTKLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelChonXTKLayout.createSequentialGroup()
                                                .addComponent(lblDenNgay)
                                                .addGap(18, 18, 18))
                                        .addGroup(jPanelChonXTKLayout.createSequentialGroup()
                                                .addComponent(lblTuNgay)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtDenNgay_TrungKhungThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                        .addComponent(txtTuNgay_TrongKhungThongKe))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnXuatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12))
        );
        jPanelChonXTKLayout.setVerticalGroup(
                jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelChonXTKLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnXuatTK, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanelChonXTKLayout.createSequentialGroup()
                                                .addGroup(jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtTuNgay_TrongKhungThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTuNgay))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelChonXTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtDenNgay_TrungKhungThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblDenNgay))))
                                .addContainerGap(96, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelTrenLayout = new javax.swing.GroupLayout(jPanelTren);
        jPanelTren.setLayout(jPanelTrenLayout);
        jPanelTrenLayout.setHorizontalGroup(
                jPanelTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrenLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanelChonXTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTrenLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jPanelHomNay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jPanel1Thang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(110, 110, 110)
                                .addComponent(jPanelNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(jPanelTuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102))
        );
        jPanelTrenLayout.setVerticalGroup(
                jPanelTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTrenLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanelTrenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanelHomNay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel1Thang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanelTuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelChonXTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDuoi.setBackground(new java.awt.Color(250, 238, 232));

        lblThongKe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThongKe.setText("Thống kê sản phẩm:");
        lblThongKe.setForeground(Color.BLACK);


        jtable_ThongTinSP.setBackground(Color.white);
        jtable_ThongTinSP.setForeground(Color.black);
        jtable_ThongTinSP.setGridColor(Color.black);
        jtable_ThongTinSP.setShowGrid(true);
        jtable_ThongTinSP.setModel(modelSanPham = new javax.swing.table.DefaultTableModel(

                new Object [][] {
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                },
                new String [] {
                        "Mã SP", "Tên SP", "Số lượng bán", "Trạng thái"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jtable_ThongTinSP.setRowHeight(25);

        jScrollPane_ThongTinSP.setViewportView(jtable_ThongTinSP);
        jScrollPane_ThongTinSP.setBackground(Color.white);

        jPanelXuatTKDuoi.setBackground(new java.awt.Color(250, 238, 232));

        lblTu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTu1.setText("Từ ngày:");
        lblTu1.setForeground(Color.black);

        txtTuNgay_Loc.setBackground(Color.white);
        txtTuNgay_Loc.setForeground(Color.black);
        txtTuNgay_Loc.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));



        lblDen1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDen1.setText("Đến ngày:");
        lblDen1.setForeground(Color.black);

        txtDenNgay_Loc.setBackground(Color.white);
        txtDenNgay_Loc.setForeground(Color.black);
        txtDenNgay_Loc.setBorder(BorderFactory.createBevelBorder(BevelBorder.LOWERED));

        lbl_LoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_LoaiSP.setText("Loại sản phẩm:");
        lbl_LoaiSP.setForeground(Color.black);

        lbl_TrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_TrangThai.setText("Trạng thái:");
        lbl_TrangThai.setForeground(Color.black);

        cbbLoaiSP_Loc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả" }));
        cbbLoaiSP_Loc.setBackground(Color.white);
        cbbLoaiSP_Loc.setForeground(Color.black);
        cbbLoaiSP_Loc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbbLoaiSP_LocActionPerformed(e);
            }
        });

        cbbTrangThaiSP_Loc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));

        cbbTrangThaiSP_Loc.setBackground(Color.white);
        cbbTrangThaiSP_Loc.setForeground(Color.black);
        cbbTrangThaiSP_Loc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cbbTrangThaiSP_LocActionPerformed(e);
            }
        });

        javax.swing.GroupLayout jPanelXuatTKDuoiLayout = new javax.swing.GroupLayout(jPanelXuatTKDuoi);
        jPanelXuatTKDuoi.setLayout(jPanelXuatTKDuoiLayout);
        jPanelXuatTKDuoiLayout.setHorizontalGroup(
                jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelXuatTKDuoiLayout.createSequentialGroup()
                                .addContainerGap(34, Short.MAX_VALUE)
                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(cbbLoaiSP_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTu1)
                                                        .addComponent(txtTuNgay_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(lbl_LoaiSP))
                                .addGap(70, 70, 70)
                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbl_TrangThai)
                                        .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtDenNgay_Loc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(cbbTrangThaiSP_Loc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblDen1))
                                .addContainerGap())
        );
        jPanelXuatTKDuoiLayout.setVerticalGroup(
                jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelXuatTKDuoiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTu1)
                                        .addComponent(lblDen1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTuNgay_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDenNgay_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lbl_TrangThai)
                                        .addComponent(lbl_LoaiSP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanelXuatTKDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbbLoaiSP_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbTrangThaiSP_Loc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(68, Short.MAX_VALUE))
        );

        btnLoc.setText("Lọc");
        btnLoc.setBorderColor(new java.awt.Color(0, 0, 0));
        btnLoc.setBorderPainted(false);
        btnLoc.setFocusPainted(false);
        btnLoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLoc.setForeground(Color.black);

        javax.swing.GroupLayout jPanelDuoiLayout = new javax.swing.GroupLayout(jPanelDuoi);
        jPanelDuoi.setLayout(jPanelDuoiLayout);
        jPanelDuoiLayout.setHorizontalGroup(
                jPanelDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDuoiLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(jPanelDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelDuoiLayout.createSequentialGroup()
                                                .addComponent(lblThongKe)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane_ThongTinSP))
                                .addGroup(jPanelDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelDuoiLayout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addComponent(jPanelXuatTKDuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelDuoiLayout.createSequentialGroup()
                                                .addGap(89, 89, 89)
                                                .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(104, 104, 104))
        );
        jPanelDuoiLayout.setVerticalGroup(
                jPanelDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDuoiLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelDuoiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelDuoiLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(jPanelXuatTKDuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLoc, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 58, Short.MAX_VALUE))
                                        .addGroup(jPanelDuoiLayout.createSequentialGroup()
                                                .addComponent(lblThongKe)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane_ThongTinSP, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelDuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanelTren, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanelTren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelDuoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        jPanelTren.getAccessibleContext().setAccessibleName("");
        jPanelTren.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 1, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        btnLoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnLocActionPerformed(e);
            }
        });
    }// </editor-fold>

    private void btnLocActionPerformed(ActionEvent e) {
        String tuNgay = txtTuNgay_Loc.getText().trim();
        String denNgay = txtDenNgay_Loc.getText().trim();

        if(tuNgay.isEmpty()) {
            txtTuNgay_Loc.requestFocus();
        } else if (denNgay.isEmpty()) {
            txtDenNgay_Loc.requestFocus();
        } else if(!(tuNgay.isEmpty() && denNgay.isEmpty())) {
            LocalDate startDate = validDate(tuNgay);
            LocalDate endDate = validDate(denNgay);

            if(startDate != null && endDate != null) {
                loadData(new ChiTietHD_DAO().getQuantityProduct_ByDate(startDate, endDate));
            }
        }
    }

    private void cbbTrangThaiSP_LocActionPerformed(ActionEvent e) {
        String trangThai = (String) cbbTrangThaiSP_Loc.getSelectedItem();
        boolean status = false;
        if(trangThai.equalsIgnoreCase("Còn")) {
            status = true;
        }
        ArrayList<ChiTietHD> orderList = new ChiTietHD_DAO().getProduct_ByStatus(status);

        loadData(orderList);
    }

    private void cbbLoaiSP_LocActionPerformed(ActionEvent e) {
        String tenLoai = (String) cbbLoaiSP_Loc.getSelectedItem();
        ArrayList<ChiTietHD> orderList;
        if(cbbLoaiSP_Loc.getSelectedIndex() == 0) {
            orderList = new ChiTietHD_DAO().getProduct_BestSeller();
        } else {
            orderList = new ChiTietHD_DAO().getProduct_ByType(tenLoai);
        }
        loadData(orderList);
    }

    private void txtTuNgay_TrongKhungThongKeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnXuatTKActionPerformed(java.awt.event.ActionEvent evt) {
        String started = txtTuNgay_TrongKhungThongKe.getText().trim();
        String ended = txtDenNgay_TrungKhungThongKe.getText().trim();
        if(started.isEmpty()) {
            txtTuNgay_TrongKhungThongKe.requestFocus();
        } else if(ended.isEmpty()) {
            txtDenNgay_TrungKhungThongKe.requestFocus();
        } else if(!(started.isEmpty() && ended.isEmpty())) {
            LocalDate startedDate = validDate(started);
            LocalDate endedDate = validDate(ended);

            if(startedDate != null && endedDate != null) {
                Double customizedRevenue = new HoaDon_DAO().getCustomizedRevenue(startedDate, endedDate);
                txtTongTC.setText(df.format(customizedRevenue));
            }
        }
    }

    private LocalDate validDate(String txtInput) {
        LocalDate date = null;
        if(txtInput.isEmpty()){
            return null;
        }
        try {
            date = LocalDate.parse(txtInput, DateTimeFormatter.ofPattern("d/M/yyyy"));
        } catch (DateTimeException e) {
            e.printStackTrace();
        }
        return date;
    }
    private void updateComboBoxData() {
        ArrayList<entity.LoaiSP> spList = loaiSP_dao.getAllProductType();
        String[] items = new String[spList.size() + 1];
        int i = 0;
        items[i] = "Tất cả";
        for(entity.LoaiSP sp : spList) {
            i++;
            items[i] = sp.getTenLoaiSP();
        }
        cbbLoaiSP_Loc.setModel(new DefaultComboBoxModel<String>(items));
    }

    private void loadData(ArrayList<ChiTietHD> list){
        modelSanPham.setRowCount(0);
        for(ChiTietHD cthd : list)
            modelSanPham.addRow(new Object[] {cthd.getSp().getMaSP(), cthd.getSp().getTenSP()
                    , String.format("%s", cthd.getSoLuong()), cthd.getSp().isTrangThai() ? "Còn":"Hết"});
    }

    // Variables declaration - do not modify
    private ui.MyButton btnLoc;
    private ui.MyButton btnXuatTK;
    private javax.swing.JComboBox<String> cbbLoaiSP_Loc ;
    private javax.swing.JComboBox<String> cbbTrangThaiSP_Loc;
    private javax.swing.JLabel lbl_LoaiSP;
    private javax.swing.JLabel lbl_TrangThai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Thang;
    private javax.swing.JPanel jPanelNam;
    private javax.swing.JPanel jPanelChonXTK;
    private javax.swing.JPanel jPanelDuoi;
    private javax.swing.JPanel jPanelHomNay;
    private javax.swing.JPanel jPanelTren;
    private javax.swing.JPanel jPanelTuy;
    private javax.swing.JPanel jPanelXuatTKDuoi;
    private javax.swing.JScrollPane jScrollPane_ThongTinSP;
    private javax.swing.JTable jtable_ThongTinSP;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblDen1;
    private javax.swing.JLabel lblDenNgay;
    private javax.swing.JLabel lblHN;
    private javax.swing.JLabel lblT;
    private javax.swing.JLabel lblTC;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JLabel lblTu1;
    private javax.swing.JLabel lblTuNgay;
    private javax.swing.JTextField txtDenNgay_Loc;
    private javax.swing.JTextField txtDenNgay_TrungKhungThongKe;
    private javax.swing.JTextField txtTongNam;
    private javax.swing.JTextField txtTongHN;
    private javax.swing.JTextField txtTongT;
    private javax.swing.JTextField txtTongTC;
    private javax.swing.JTextField txtTuNgay_Loc;
    private javax.swing.JTextField txtTuNgay_TrongKhungThongKe;
    // End of variables declaration                   
}