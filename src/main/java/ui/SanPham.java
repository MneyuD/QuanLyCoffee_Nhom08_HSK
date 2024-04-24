/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import connect.ConnectDB;
import dao.LoaiSP_DAO;
import dao.SanPham_DAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class SanPham extends JPanel{

    private LoaiSP_DAO loaiSP_dao;
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


        jPanel1 = new JPanel();
        lblHinhSp = new JLabel();
        lblTenSP = new JLabel();
        lblLoaiSP = new JLabel();
        lblDonGia = new JLabel();
        lblMoTa = new JLabel();
        lblKichCo = new JLabel();
        lblTrangThai = new JLabel();
        txtTenSP = new JTextField();
        cbbLoaiSP = new JComboBox<>();
        txtDonGia = new JTextField();
        txtMoTa = new JTextField();
        cbbTrangThai = new JComboBox<>();
        lblNgayHetHan = new JLabel();
        txtNgayHetHan = new JTextField();
        lblThue = new JLabel();
        txtThue = new JTextField();
        btnThemSP = new MyButton();
        btnChinhSuaSP = new MyButton();
        btnThemLoaiSP = new MyButton();
        cbbKichCoSP = new JComboBox<>();
        jPanel2 = new JPanel();
        lblTenSp = new JLabel();
        txtTimSP = new JTextField();
        lblLoaiSP_TimKiem = new JLabel();
        cbbLoaiSP_TimKiem = new JComboBox<>();
        lblTrangThai_TimKiem = new JLabel();
        cbbTrangThai_TimKiem = new JComboBox<>();
        jScrollPaneTTSP = new JScrollPane();
        jTableThongTinSP = new JTable();
        btnTimSP = new MyButton();

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

        txtTenSP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtTenSPActionPerformed(evt);
            }
        });

        cbbLoaiSP.setModel(new DefaultComboBoxModel<>(new String[] { "Nước", "Đồ ăn", "cái gì đó", "cái gì đó nữa" }));
        cbbLoaiSP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cbbLoaiSPActionPerformed(evt);
            }
        });

        txtMoTa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtMoTaActionPerformed(evt);
            }
        });

        cbbTrangThai.setModel(new DefaultComboBoxModel<>(new String[] { "Còn", "Hết" }));
        cbbTrangThai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cbbTrangThaiActionPerformed(evt);
            }
        });

        lblNgayHetHan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNgayHetHan.setText("Ngày hết hạn:");

        lblThue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblThue.setText("Thuế:");

        txtThue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                txtThueActionPerformed(evt);
            }
        });

        btnThemSP.setText("Thêm");
        btnThemSP.setBorderColor(new java.awt.Color(0, 0, 0));
        btnThemSP.setBorderPainted(false);
        btnThemSP.setFocusPainted(false);
        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSP.setRadius(30);
        btnThemSP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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

        cbbKichCoSP.setModel(new DefaultComboBoxModel<>(new String[] { "S", "M", "L" }));

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(lblHinhSp, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenSP)
                            .addComponent(lblLoaiSP)
                            .addComponent(lblDonGia)
                            .addComponent(lblTrangThai)
                            .addComponent(lblNgayHetHan)
                            .addComponent(lblThue)
                            .addComponent(lblKichCo)
                            .addComponent(lblMoTa))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThemSP, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(btnChinhSuaSP, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMoTa, GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbTrangThai, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbKichCoSP, GroupLayout.Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbbLoaiSP, GroupLayout.Alignment.LEADING, 0, 340, Short.MAX_VALUE)
                                    .addComponent(txtThue, GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDonGia, GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNgayHetHan, GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSP, GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addComponent(btnThemLoaiSP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblHinhSp, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenSP)
                    .addComponent(txtTenSP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayHetHan)
                    .addComponent(txtNgayHetHan, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonGia)
                    .addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtThue, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblThue))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoaiSP)
                    .addComponent(cbbLoaiSP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemLoaiSP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbKichCoSP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKichCo))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbTrangThai, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrangThai))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(lblMoTa)
                    .addComponent(txtMoTa, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemSP, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChinhSuaSP, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(250, 238, 232));

        lblTenSp.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTenSp.setText("Tên sản phẩm");

        lblLoaiSP_TimKiem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLoaiSP_TimKiem.setText("Loại sản phẩm");

        cbbLoaiSP_TimKiem.setModel(new DefaultComboBoxModel<>(new String[] { "Nước", "Đồ ăn", " " }));
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

        cbbTrangThai_TimKiem.setModel(new DefaultComboBoxModel<>(new String[] { "Còn", "Hết" +
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
        jScrollPaneTTSP.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTableThongTinSP.setModel(modelSanPham = new DefaultTableModel(
                new String [] {"Mã SP", "Tên SP", "Loại SP", "Kích cỡ", "Đơn giá", "Trạng Thái"},
            0
        ) {
            Class[] types = new Class [] {
                String.class, String.class, String.class, String.class, String.class, String.class
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
                txtNgayHetHan.setText(String.valueOf(sp.getNgayHetHan()));
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

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenSp)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtTimSP, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cbbLoaiSP_TimKiem, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLoaiSP_TimKiem))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(cbbTrangThai_TimKiem, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTrangThai_TimKiem)))
                    .addComponent(jScrollPaneTTSP, GroupLayout.PREFERRED_SIZE, 631, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTenSp)
                    .addComponent(lblLoaiSP_TimKiem)
                    .addComponent(lblTrangThai_TimKiem))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimSP, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbLoaiSP_TimKiem, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbbTrangThai_TimKiem, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimSP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPaneTTSP, GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)
                .addContainerGap())
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void txtTenSPActionPerformed(ActionEvent evt) {//GEN-FIRST:event_txtTenSPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSPActionPerformed

    private void cbbLoaiSPActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cbbLoaiSPActionPerformed

    }//GEN-LAST:event_cbbLoaiSPActionPerformed
    private void txtMoTaActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }                                       

    private void cbbTrangThaiActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }                                            

    private void txtThueActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
    }                                       

    private void btnThemSPActionPerformed(ActionEvent evt) {
        // TODO add your handling code here:
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
        cbbLoaiSP.setModel(new DefaultComboBoxModel<String>(items));
    }

    private void loadData(ArrayList<entity.SanPham> list){
        modelSanPham.setRowCount(0);
        for(entity.SanPham sp : list)
            modelSanPham.addRow(new Object[] {sp.getMaSP(), sp.getTenSP(), sp.getLoaiSP().getTenLoaiSP()
                    , sp.getKickCo().getKichCo(), sp.getDonGia(), sp.isTrangThai() ? "Còn":"Hết"});
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private MyButton btnChinhSuaSP;
    private MyButton btnThemLoaiSP;
    private MyButton btnThemSP;
    private MyButton btnTimSP;
    private JComboBox<String> cbbKichCoSP;
    private JComboBox<String> cbbLoaiSP;
    private JComboBox<String> cbbLoaiSP_TimKiem;
    private JComboBox<String> cbbTrangThai;
    private JComboBox<String> cbbTrangThai_TimKiem;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPaneTTSP;
    private DefaultTableModel modelSanPham;
    private JTable jTableThongTinSP;
    private JLabel lblDonGia;
    private JLabel lblHinhSp;
    private JLabel lblKichCo;
    private JLabel lblLoaiSP;
    private JLabel lblLoaiSP_TimKiem;
    private JLabel lblMoTa;
    private JLabel lblNgayHetHan;
    private JLabel lblTenSP;
    private JLabel lblTenSp;
    private JLabel lblThue;
    private JLabel lblTrangThai;
    private JLabel lblTrangThai_TimKiem;
    private JTextField txtDonGia;
    private JTextField txtMoTa;
    private JTextField txtNgayHetHan;
    private JTextField txtTenSP;
    private JTextField txtThue;
    private JTextField txtTimSP;
    // End of variables declaration//GEN-END:variables
}
