/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import connect.ConnectDB;
import dao.LoaiSP_DAO;
import dao.SanPham_DAO;
import entity.Enum_KichCo;
import entity.LoaiSP;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SanPham extends javax.swing.JPanel{

    private static LoaiSP_DAO loaiSP_dao;
    private SanPham_DAO sp_dao;



    public SanPham() {
        ConnectDB.getInstance().connect();
        initComponents();

        sp_dao = new SanPham_DAO();
        loaiSP_dao = new LoaiSP_DAO();

        updateComboBoxData();
        loadData(sp_dao.getAllProduct());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {


        jPanel1 = new javax.swing.JPanel();
        lblHinhSp = new javax.swing.JLabel();
        lblTenSP = new javax.swing.JLabel();
        lblLoaiSP = new javax.swing.JLabel();
        lblDonGia = new javax.swing.JLabel();
        lblMoTa = new javax.swing.JLabel();
        lblKichCo = new javax.swing.JLabel();
        lblTrangThai = new javax.swing.JLabel();
        txtTenSP = new javax.swing.JTextField();
        cbbLoaiSP = new javax.swing.JComboBox<>();
        txtDonGia = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        cbbTrangThai = new javax.swing.JComboBox<>();
        lblNgayHetHan = new javax.swing.JLabel();
        txtNgayHetHan = new javax.swing.JTextField();
        lblThue = new javax.swing.JLabel();
        txtThue = new javax.swing.JTextField();
        btnThemSP = new ui.MyButton();
        btnChinhSuaSP = new ui.MyButton();
        btnThemLoaiSP = new ui.MyButton();
        cbbKichCoSP = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        lblTenSp = new javax.swing.JLabel();
        txtTimSP = new javax.swing.JTextField();
        lblLoaiSP_TimKiem = new javax.swing.JLabel();
        cbbLoaiSP_TimKiem = new javax.swing.JComboBox<>();
        lblTrangThai_TimKiem = new javax.swing.JLabel();
        cbbTrangThai_TimKiem = new javax.swing.JComboBox<>();
        jScrollPaneTTSP = new javax.swing.JScrollPane();
        jTableThongTinSP = new javax.swing.JTable();
        btnTimSP = new ui.MyButton();

        setBackground(new java.awt.Color(250, 238, 232));
        setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jPanel1.setBackground(new java.awt.Color(250, 238, 232));

        lblHinhSp.setText("Hình SP");

        lblTenSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenSP.setText("Tên sản phẩm:");

        lblLoaiSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoaiSP.setText("Loại sản phẩm:");

        lblDonGia.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDonGia.setText("Đơn giá:");

        lblMoTa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMoTa.setText("Mô tả:");

        lblKichCo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKichCo.setText("Kích cỡ:");

        lblTrangThai.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrangThai.setText("Trạng thái:");

        txtTenSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        cbbLoaiSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nước", "Đồ ăn", "cái gì đó", "cái gì đó nữa" }));
        cbbLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLoaiSPActionPerformed(evt);
            }
        });

        txtMoTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });

        cbbTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        cbbTrangThai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTrangThaiActionPerformed(evt);
            }
        });

        lblNgayHetHan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgayHetHan.setText("Ngày hết hạn:");

        lblThue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThue.setText("Thuế:");

        txtThue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtThueActionPerformed(evt);
            }
        });

        btnThemSP.setText("Thêm");
        btnThemSP.setBorderColor(new java.awt.Color(0, 0, 0));
        btnThemSP.setBorderPainted(false);
        btnThemSP.setFocusPainted(false);
        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSP.setRadius(30);
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnChinhSuaSP.setText("Cập nhật");
        btnChinhSuaSP.setBorderColor(new java.awt.Color(0, 0, 0));
        btnChinhSuaSP.setBorderPainted(false);
        btnChinhSuaSP.setFocusPainted(false);
        btnChinhSuaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChinhSuaSP.setRadius(30);

        btnThemLoaiSP.setText("+");
        btnThemLoaiSP.setBorderPainted(false);
        btnThemLoaiSP.setFocusPainted(false);
        btnThemLoaiSP.setRadius(10);

        cbbKichCoSP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S", "M", "L" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(211, 211, 211)
                                                .addComponent(lblHinhSp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTenSP)
                                                        .addComponent(lblLoaiSP)
                                                        .addComponent(lblDonGia)
                                                        .addComponent(lblTrangThai)
                                                        .addComponent(lblNgayHetHan)
                                                        .addComponent(lblThue)
                                                        .addComponent(lblKichCo)
                                                        .addComponent(lblMoTa))
                                                .addGap(28, 28, 28)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(61, 61, 61)
                                                                .addComponent(btnChinhSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txtMoTa, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cbbTrangThai, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cbbKichCoSP, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(cbbLoaiSP, javax.swing.GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE)
                                                                        .addComponent(txtThue, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtDonGia, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtNgayHetHan, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtTenSP, javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnThemLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblHinhSp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTenSP)
                                        .addComponent(txtTenSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblNgayHetHan)
                                        .addComponent(txtNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblDonGia)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtThue, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblThue))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblLoaiSP)
                                        .addComponent(cbbLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThemLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbbKichCoSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblKichCo))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cbbTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTrangThai))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblMoTa)
                                        .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnChinhSuaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 238, 232));

        lblTenSp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenSp.setText("Tên sản phẩm");

        lblLoaiSP_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoaiSP_TimKiem.setText("Loại sản phẩm");

        cbbLoaiSP_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nước", "Đồ ăn", " " }));
        cbbLoaiSP_TimKiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tenLoai = (String) cbbLoaiSP_TimKiem.getSelectedItem();
                ArrayList<entity.SanPham> spList;
                if(cbbLoaiSP_TimKiem.getSelectedIndex() == 0) {
                    spList = sp_dao.getAllProduct();
                } else {
                    spList = sp_dao.getProductByType(tenLoai);
                }
                loadData(spList);
            }
        });

        lblTrangThai_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTrangThai_TimKiem.setText("Trạng thái");

        cbbTrangThai_TimKiem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còn", "Hết" +
                "" }));
        cbbTrangThai_TimKiem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String trangThai = (String) cbbTrangThai_TimKiem.getSelectedItem();
                boolean status = false;
                if(trangThai.equalsIgnoreCase("Còn")) {
                    status = true;
                }
                ArrayList<entity.SanPham> spList = sp_dao.getProduct_ByStatus(status);

                loadData(spList);
            }
        });
        jScrollPaneTTSP.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTableThongTinSP.setModel(modelSanPham = new javax.swing.table.DefaultTableModel(
                new String [] {"Mã SP", "Tên SP", "Loại SP", "Kích cỡ", "Đơn giá", "Trạng Thái"},
                0
        ) {
            Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };


            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableThongTinSP.setRowHeight(25);
        jTableThongTinSP.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = jTableThongTinSP.getSelectedRow();
                String maSP = modelSanPham.getValueAt(row,0).toString();
                entity.SanPham sp = sp_dao.getProduct_ByID(maSP);
                txtTenSP.setText(sp.getTenSP());

                String ngayHetHan = String.valueOf(sp.getNgayHetHan());
                if(ngayHetHan.equals("null")){
                    txtNgayHetHan.setText("");
                } else {
                    txtNgayHetHan.setText(ngayHetHan);
                }
                txtDonGia.setText(String.valueOf(sp.getDonGia()));
                txtThue.setText(String.valueOf(sp.getThue()));
                cbbLoaiSP.setSelectedItem(sp.getLoaiSP().getTenLoaiSP());
                cbbKichCoSP.setSelectedItem(sp.getKickCo().getKichCo());
                cbbTrangThai.setSelectedItem(sp.isTrangThai() ? "Còn" : "Hết");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        jScrollPaneTTSP.setViewportView(jTableThongTinSP);

        btnTimSP.setText("Tìm");
        btnTimSP.setBorderColor(new java.awt.Color(0, 0, 0));
        btnTimSP.setBorderPainted(false);
        btnTimSP.setFocusPainted(false);
        btnTimSP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnTimSP.setRadius(10);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lblTenSp)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(txtTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(btnTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbbLoaiSP_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblLoaiSP_TimKiem))
                                                .addGap(26, 26, 26)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cbbTrangThai_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lblTrangThai_TimKiem)))
                                        .addComponent(jScrollPaneTTSP, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lblTenSp)
                                        .addComponent(lblLoaiSP_TimKiem)
                                        .addComponent(lblTrangThai_TimKiem))
                                .addGap(2, 2, 2)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbLoaiSP_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbTrangThai_TimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnTimSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addComponent(jScrollPaneTTSP, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        txtTimSP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelSanPham.setRowCount(0);
                ArrayList<entity.SanPham> list = sp_dao.getProduct_ByName(txtTimSP.getText().trim());

                loadData(list);
            }
        });

        btnTimSP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modelSanPham.setRowCount(0);
                ArrayList<entity.SanPham> list = sp_dao.getProduct_ByName(txtTimSP.getText().trim());

                loadData(list);
            }
        });
    }// </editor-fold>

    private void txtTenSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void cbbLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLoaiSPActionPerformed

    }//GEN-LAST:event_cbbLoaiSPActionPerformed
    private void txtMoTaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cbbTrangThaiActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void txtThueActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {
        String maSP = "Random";
        String tenSP = txtTenSP.getText().trim();

        String date = txtNgayHetHan.getText().trim();
        LocalDate ngayHetHan;
        if(date.isEmpty()){
            ngayHetHan = null;
        } else {
            ngayHetHan = LocalDate.parse(txtNgayHetHan.getText().trim());
        }

        Double donGia = Double.valueOf(txtDonGia.getText().trim());
        Double thue = Double.valueOf(txtThue.getText().trim());

        String tenLoai = String.valueOf(cbbLoaiSP.getSelectedItem());
        String maLoai = new LoaiSP_DAO().getProductType_ByName(tenLoai);
        LoaiSP loaiSP = new LoaiSP(maLoai, tenLoai);

        Enum_KichCo kichCo = Enum_KichCo.valueOf(String.valueOf(cbbKichCoSP.getSelectedItem()));

        String trangThai = String.valueOf(cbbTrangThai.getSelectedIndex());
        boolean status = false;
        if(trangThai.equalsIgnoreCase("Còn"))
            status = true;
        entity.SanPham sp = new entity.SanPham(maSP,tenSP, donGia, thue, kichCo, ngayHetHan, status, loaiSP);

        if(new SanPham_DAO().createSanPham(sp)){
            loadData(new SanPham_DAO().getAllProduct());
            clearText();
        }
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
        cbbLoaiSP_TimKiem.setModel(new DefaultComboBoxModel<String>(items));

        String[] items2 = new String[spList.size()];
        int y = 0;
        for(entity.LoaiSP sp : spList) {
            items2[y] = sp.getTenLoaiSP();
            y++;
        }
        cbbLoaiSP.setModel(new DefaultComboBoxModel<String>(items2));
    }

    private void loadData(ArrayList<entity.SanPham> list){
        modelSanPham.setRowCount(0);
        for(entity.SanPham sp : list)
            modelSanPham.addRow(new Object[] {sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP().getTenLoaiSP()
                    , sp.getKickCo().getKichCo(), sp.getDonGia(), sp.isTrangThai() ? "Còn":"Hết"});
    }

    private void clearText() {
        txtTenSP.setText("");
        txtNgayHetHan.setText("");
        txtDonGia.setText("");
        txtThue.setText("");
        cbbLoaiSP.setSelectedItem(0);
        cbbKichCoSP.setSelectedItem(0);
        cbbTrangThai.setSelectedItem(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ui.MyButton btnChinhSuaSP;
    private ui.MyButton btnThemLoaiSP;
    private ui.MyButton btnThemSP;
    private ui.MyButton btnTimSP;
    private javax.swing.JComboBox<String> cbbKichCoSP;
    private javax.swing.JComboBox<String> cbbLoaiSP;
    private javax.swing.JComboBox<String> cbbLoaiSP_TimKiem;
    private javax.swing.JComboBox<String> cbbTrangThai;
    private javax.swing.JComboBox<String> cbbTrangThai_TimKiem;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPaneTTSP;
    private javax.swing.table.DefaultTableModel modelSanPham;
    private javax.swing.JTable jTableThongTinSP;
    private javax.swing.JLabel lblDonGia;
    private javax.swing.JLabel lblHinhSp;
    private javax.swing.JLabel lblKichCo;
    private javax.swing.JLabel lblLoaiSP;
    private javax.swing.JLabel lblLoaiSP_TimKiem;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblNgayHetHan;
    private javax.swing.JLabel lblTenSP;
    private javax.swing.JLabel lblTenSp;
    private javax.swing.JLabel lblThue;
    private javax.swing.JLabel lblTrangThai;
    private javax.swing.JLabel lblTrangThai_TimKiem;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtNgayHetHan;
    private javax.swing.JTextField txtTenSP;
    private javax.swing.JTextField txtThue;
    private javax.swing.JTextField txtTimSP;
    // End of variables declaration//GEN-END:variables
}