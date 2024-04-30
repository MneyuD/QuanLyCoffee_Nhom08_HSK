package ui.main;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import dao.DangNhap_DAO;
import net.miginfocom.swing.MigLayout;
import ui.BanHang;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

public class Login extends JPanel implements ActionListener , KeyListener {
    Font f = new Font("Times New Romam", Font.PLAIN, 15);
    Font f1 = new Font("Times New Romam", Font.ITALIC, 12);
    public JButton cmdLogin;
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JLabel lblErrorUser;
    private JLabel lblErrorPass;
    private String tenDN;
    private DangNhap_DAO dn_DAO =new DangNhap_DAO();

    public Login() {
        init();

        txtUsername.addKeyListener(this);
        txtPassword.addKeyListener(this);
        cmdLogin.addKeyListener(this);

    }

    private void init() {
        setOpaque(false);
        addMouseListener(new MouseAdapter() {

        });
        setLayout(new MigLayout("wrap,fillx,insets 80 80 80 80", "[fill]"));

        JLabel title = new JLabel("Login to your account", SwingConstants.CENTER);
        lblErrorUser = new JLabel("", SwingConstants.LEFT);
        lblErrorUser.setFont(f1);
        lblErrorUser.setForeground(Color.red);
        lblErrorPass = new JLabel("", SwingConstants.LEFT);
        lblErrorPass.setFont(f1);
        lblErrorPass.setForeground(Color.red);
        txtUsername = new JTextField();
        txtPassword = new JPasswordField();

        cmdLogin = new JButton("Login");
        cmdLogin.setFont(f);
        title.putClientProperty(FlatClientProperties.STYLE, "" +
                "font:bold +18");
        txtUsername.putClientProperty(FlatClientProperties.STYLE, "" +
                "margin:10,20,10,20;" +
                "focusWidth:1;" +
                "innerFocusWidth:0" );
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "" +
                "margin:10,20,10,20;" +
                "focusWidth:1;" +
                "innerFocusWidth:0;" +
                "showRevealButton:true");
        cmdLogin.putClientProperty(FlatClientProperties.STYLE, "" +
                "background:$Component.accentColor;" +
                "margin:10,15,10,15;" +
                "borderWidth:0;" +
                "focusWidth:0;" +
                "innerFocusWidth:0");
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your username");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Enter your password");

        add(title);
        JLabel lblUsername = new JLabel("Username");

        lblUsername.setFont(f);
        add(lblUsername, "gapy 30");
        add(txtUsername, "gapy 10");
        add(lblErrorUser, "gapy 5");

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(f);
        add(lblPassword, "gapy 10");
        add(txtPassword, "gapy 10");
        add(lblErrorPass, "gapy 5");
        add(cmdLogin, "gapy 10");

        cmdLogin.addActionListener(this);

    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int arc = UIScale.scale(10);
        g2.setColor(getBackground());
        g2.setComposite(AlphaComposite.SrcOver.derive(0.5f));
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), arc, arc));
        g2.dispose();
        super.paintComponent(g);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();
        if(o.equals(cmdLogin)){
            boolean kqCheck = false;
            String username = txtUsername.getText().trim();
            String password = txtPassword.getText().trim();

            if (username.isEmpty() && password.isEmpty()) {
                txtUsername.requestFocus();
                JOptionPane.showMessageDialog(this, "Vui lòng điền thông tin");
                lblErrorUser.setText("Vui lòng nhập tên tài khoản");

            } else {
                tenDN = dn_DAO.containTen(username);
                ArrayList<String> duLieu = dn_DAO.dangNhap(username, password);

                if (!(duLieu.get(0) == null)) {

                    if (txtUsername.getText().equals(duLieu.get(0))) {
                        if (txtPassword.getText().equals(duLieu.get(1))) {
                            kqCheck = true;
                        } else {
                            kqCheck = false;
                            txtPassword.requestFocus();
                            lblErrorPass.setText("Mật khẩu không đúng");
                        }
                    } else {
                        kqCheck = false;
                        JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại");
                    }

                    if (kqCheck == true) {
                        //TODO: mở trang chủ
                        lblErrorUser.setText("");
                        lblErrorPass.setText("");
//                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                        new BanHang().setVisible(true);
                    }
                } else {

                    if (tenDN != null) {
                        if (tenDN.equals(txtUsername.getText()) == true) {
                            txtPassword.requestFocus();
                            lblErrorPass.setText("Mật khẩu không đúng");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Tài khoản không tồn tại");

                    }
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(e.getSource() == txtUsername){
                txtPassword.requestFocus();
            } else if (e.getSource() == txtPassword) {
                cmdLogin.doClick();
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
