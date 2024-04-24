package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connect.ConnectDB;

public class DangNhap_DAO {
    private Connection con; // Removed static modifier
    private String username;
    private String password;
    private String ten;

    public DangNhap_DAO() {
        // Initialize con in the constructor
        con = ConnectDB.getInstance().getConnection();
    }

    public String containTen(String tenDN) {

        try {
            String sql = "SELECT * FROM dbo.TaiKhoan WHERE TenDangNhap = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, tenDN);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                username = rs.getString("TenDangNhap");

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return username;
    }

    public ArrayList<String> dangNhap(String TenDN, String MK) {
        ArrayList<String> list = new ArrayList<>();
        try {

            PreparedStatement pstmt = null;
            pstmt = con.prepareStatement("SELECT * FROM TaiKhoan WHERE TenDangNhap = ? AND MatKhau = ?");
            pstmt.setString(1, TenDN);
            pstmt.setString(2, MK);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                ten = rs.getString("TenDangNhap");
                password = rs.getString("MatKhau");

            }
//			System.out.println(ten);
//			System.out.println(password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        list.add(ten);
        list.add(password);
        return list;

    }

    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        DangNhap_DAO test = new DangNhap_DAO(); // Create an instance of Test
//        System.out.println(test.dangNhapTen("MyDUYEN"));
        String tenDN = "22716371";
        String MKDN = "Giang188@";
        ArrayList<String> kq =  test.dangNhap(tenDN, MKDN);
        System.out.println(kq);
        System.out.println(test.containTen(tenDN));

    }
}
