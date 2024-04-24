package ui.main;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import connect.ConnectDB;
import ui.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DangNhap_GUI extends JFrame implements ActionListener {
    private Home home;

    Login loginPanel = new Login();

    public DangNhap_GUI(){
        init();
        ConnectDB.getInstance().connect();
        getRootPane().setDefaultButton(loginPanel.cmdLogin);
    }
    private void init(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new Dimension(1560,860));
        setLocationRelativeTo(null);
        home = new Home();
        setContentPane(home);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                home.initOverlay(DangNhap_GUI.this);
                home.play(0);

            }

            @Override
            public void windowClosing(WindowEvent e) {
                home.stop();
            }
        });

    }

    public static void main(String[] args) {
        FlatRobotoFont.install();
        FlatLaf.registerCustomDefaultsSource("ui.themes");
        FlatMacDarkLaf.setup();
        UIManager.put("deflauFont", new Font(FlatRobotoFont.FAMILY, Font.PLAIN, 13));
        EventQueue.invokeLater(() -> new DangNhap_GUI().setVisible(true));
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
