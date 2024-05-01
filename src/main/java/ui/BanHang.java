
package ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

import dao.SanPham_DAO;
import ui.BH;
import ui.HoaDon;
import ui.NhanVien;
import ui.SanPham;
import ui.ThongKe;
import ui.TrangChu;

/**
 *
 * @author chuon
 */
public class BanHang extends javax.swing.JFrame {

    BH bh = new BH();
    HoaDon hoadon = new HoaDon();
    NhanVien nhanvien = new NhanVien();
    SanPham sanpham = new SanPham();
    ThongKe thongke= new ThongKe();
    TrangChu trangchu = new TrangChu();
    public BanHang() {
        initComponents();
        Date();
        Time();
        jLayeredPaneMain.add(trangchu);
        jLayeredPaneMain.add(bh);
        jLayeredPaneMain.add(hoadon);
        jLayeredPaneMain.add(nhanvien);
        jLayeredPaneMain.add(sanpham);
        jLayeredPaneMain.add(thongke);
        bh.setVisible(false);
        hoadon.setVisible(false);
        nhanvien.setVisible(false);
        sanpham.setVisible(false);
        thongke.setVisible(false);
        trangchu.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        lblTenNhom = new javax.swing.JLabel();
        lblHinh = new javax.swing.JLabel();
        btnTrangChu = new MyButton();
        btnBanHang = new MyButton();
        btnHoaDon = new MyButton();
        btnSanPham = new MyButton();
        btnThongKe = new MyButton();
        btnNhanVien = new MyButton();
        jPanelControl = new javax.swing.JPanel();
        l_date = new javax.swing.JLabel();
        l_time = new javax.swing.JLabel();
        btnDMK = new MyButton();
        btnDXuat = new MyButton();
        btnGiaoCa = new MyButton();
        jLayeredPaneMain = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(250, 238, 232));
        setLocation(location());

        jPanel1.setBackground(new java.awt.Color(250, 238, 232));
        jPanel1.setPreferredSize(new java.awt.Dimension(1800, 1080));

        jPanelMenu.setBackground(new java.awt.Color(143, 108, 101));

        lblTenNhom.setBackground(new java.awt.Color(0, 0, 0));
        lblTenNhom.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTenNhom.setForeground(new java.awt.Color(255, 255, 204));
        lblTenNhom.setText("Nhóm 8");

//        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GD/img/baalBTL.png"))); // NOI18N

        btnTrangChu.setForeground(new java.awt.Color(255, 255, 255));
        btnTrangChu.setText("Trang chủ");
        btnTrangChu.setBorderColor(new java.awt.Color(210, 207, 206));
        btnTrangChu.setBorderPainted(false);
        btnTrangChu.setColor(new java.awt.Color(143, 108, 101));
        btnTrangChu.setColorClick(new java.awt.Color(161, 137, 132));
        btnTrangChu.setColorOver(new java.awt.Color(161, 137, 132));
        btnTrangChu.setFocusPainted(false);
        btnTrangChu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTrangChu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnTrangChuActionPerformed(evt);
            }
        });

        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setText("Bán hàng");
        btnBanHang.setBorderColor(new java.awt.Color(210, 207, 206));
        btnBanHang.setBorderPainted(false);
        btnBanHang.setColor(new java.awt.Color(143, 108, 101));
        btnBanHang.setColorClick(new java.awt.Color(161, 137, 132));
        btnBanHang.setColorOver(new java.awt.Color(161, 137, 132));
        btnBanHang.setFocusPainted(false);
        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBanHang.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setBorderColor(new java.awt.Color(210, 207, 206));
        btnHoaDon.setBorderPainted(false);
        btnHoaDon.setColor(new java.awt.Color(143, 108, 101));
        btnHoaDon.setColorClick(new java.awt.Color(161, 137, 132));
        btnHoaDon.setColorOver(new java.awt.Color(161, 137, 132));
        btnHoaDon.setFocusPainted(false);
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHoaDon.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setBorderColor(new java.awt.Color(210, 207, 206));
        btnSanPham.setBorderPainted(false);
        btnSanPham.setColor(new java.awt.Color(143, 108, 101));
        btnSanPham.setColorClick(new java.awt.Color(161, 137, 132));
        btnSanPham.setColorOver(new java.awt.Color(161, 137, 132));
        btnSanPham.setFocusPainted(false);
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSanPham.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Thống kê");
        btnThongKe.setBorderColor(new java.awt.Color(210, 207, 206));
        btnThongKe.setBorderPainted(false);
        btnThongKe.setColor(new java.awt.Color(143, 108, 101));
        btnThongKe.setColorClick(new java.awt.Color(161, 137, 132));
        btnThongKe.setColorOver(new java.awt.Color(161, 137, 132));
        btnThongKe.setFocusPainted(false);
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThongKe.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setBorderColor(new java.awt.Color(210, 207, 206));
        btnNhanVien.setBorderPainted(false);
        btnNhanVien.setColor(new java.awt.Color(143, 108, 101));
        btnNhanVien.setColorClick(new java.awt.Color(161, 137, 132));
        btnNhanVien.setColorOver(new java.awt.Color(161, 137, 132));
        btnNhanVien.setFocusPainted(false);
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNhanVien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMenuLayout = new javax.swing.GroupLayout(jPanelMenu);
        jPanelMenu.setLayout(jPanelMenuLayout);
        jPanelMenuLayout.setHorizontalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE))
            .addComponent(btnTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBanHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHoaDon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblTenNhom)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelMenuLayout.setVerticalGroup(
            jPanelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuLayout.createSequentialGroup()
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblTenNhom, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelControl.setBackground(new java.awt.Color(143, 108, 101));

        l_date.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l_date.setForeground(new java.awt.Color(255, 255, 255));
        l_date.setText("l_date");

        l_time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        l_time.setForeground(new java.awt.Color(255, 255, 255));
        l_time.setText("l_time");

        btnDMK.setText("Đổi mật khẩu");
        btnDMK.setBorderPainted(false);
        btnDMK.setForeground(Color.black);
        btnDMK.setBackground(Color.white);
        btnDMK.setColorClick(new java.awt.Color(209, 236, 240));
        btnDMK.setColorOver(new java.awt.Color(143, 108, 101));
        btnDMK.setFocusPainted(false);
        btnDMK.setRadius(20);

        btnDXuat.setText("Đăng Xuất");
        btnDXuat.setBorderPainted(false);
        btnDXuat.setForeground(Color.black);
        btnDXuat.setBackground(Color.white);
        btnDXuat.setColorClick(new java.awt.Color(209, 236, 240));
        btnDXuat.setColorOver(new java.awt.Color(143, 108, 101));
        btnDXuat.setFocusPainted(false);
        btnDXuat.setRadius(20);

        btnGiaoCa.setText("Giao ca");
        btnGiaoCa.setBorderPainted(false);
        btnGiaoCa.setForeground(Color.black);
        btnGiaoCa.setBackground(Color.white);
        btnGiaoCa.setColorClick(new java.awt.Color(209, 236, 240));
        btnGiaoCa.setColorOver(new java.awt.Color(143, 108, 101));
        btnGiaoCa.setFocusPainted(false);
        btnGiaoCa.setRadius(20);

        javax.swing.GroupLayout jPanelControlLayout = new javax.swing.GroupLayout(jPanelControl);
        jPanelControl.setLayout(jPanelControlLayout);
        jPanelControlLayout.setHorizontalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnGiaoCa, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnDXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 685, Short.MAX_VALUE)
                .addComponent(l_time, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l_date, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166))
        );
        jPanelControlLayout.setVerticalGroup(
            jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelControlLayout.createSequentialGroup()
                        .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDMK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGiaoCa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlLayout.createSequentialGroup()
                        .addGroup(jPanelControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l_time, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(l_date))
                        .addContainerGap())))
        );

        jLayeredPaneMain.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLayeredPaneMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1340, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanelControl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPaneMain))
            .addComponent(jPanelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void btnTrangChuActionPerformed(ActionEvent evt) {
        bh.setVisible(false);
        hoadon.setVisible(false);
        nhanvien.setVisible(false);
        sanpham.setVisible(false);
        thongke.setVisible(false);
        trangchu.setVisible(true);
    }                                           

    private void btnBanHangActionPerformed(ActionEvent evt) {
        bh.setVisible(true);
        hoadon.setVisible(false);
        nhanvien.setVisible(false);
        sanpham.setVisible(false);
        thongke.setVisible(false);
        trangchu.setVisible(false);
    }                                          

    private void btnHoaDonActionPerformed(ActionEvent evt) {
        bh.setVisible(false);
        hoadon.setVisible(true);
        nhanvien.setVisible(false);
        sanpham.setVisible(false);
        thongke.setVisible(false);
        trangchu.setVisible(false);
    }                                         

    private void btnSanPhamActionPerformed(ActionEvent evt) {
        bh.setVisible(false);
        hoadon.setVisible(false);
        nhanvien.setVisible(false);
        sanpham.setVisible(true);
        thongke.setVisible(false);
        trangchu.setVisible(false);
    }                                          

    private void btnThongKeActionPerformed(ActionEvent evt) {
        bh.setVisible(false);
        hoadon.setVisible(false);
        nhanvien.setVisible(false);
        sanpham.setVisible(false);
        thongke.setVisible(true);
        trangchu.setVisible(false);
    }                                          

    private void btnNhanVienActionPerformed(ActionEvent evt) {
        bh.setVisible(false);
        hoadon.setVisible(false);
        nhanvien.setVisible(true);
        sanpham.setVisible(false);
        thongke.setVisible(false);
        trangchu.setVisible(false);
    }                                           

    public void Date(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String dd = sdf.format(d);
        l_date.setText(dd);
    }
    
    Timer t;
    SimpleDateFormat st;

    public void Time(){
        t = new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss");
                String tt = st.format(dt);
                l_time.setText(tt);
            }
        });
        
        t.start();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanHang().setVisible(true);
            }
        });    
    }

    // Variables declaration - do not modify                     
    private MyButton btnBanHang;
    private MyButton btnDMK;
    private MyButton btnDXuat;
    private MyButton btnGiaoCa;
    private MyButton btnHoaDon;
    private MyButton btnNhanVien;
    private MyButton btnSanPham;
    private MyButton btnThongKe;
    private MyButton btnTrangChu;
    private javax.swing.JLayeredPane jLayeredPaneMain;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelControl;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JLabel l_date;
    private javax.swing.JLabel l_time;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblTenNhom;
    // End of variables declaration


}
