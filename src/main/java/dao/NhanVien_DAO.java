package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import connect.ConnectDB;
import entity.Enum_KhuVuc;
import entity.NhanVien;
import entity.TaiKhoan;

public class NhanVien_DAO {
    public NhanVien_DAO() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ArrayList<NhanVien> getAllNhanVien() {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement("SELECT * FROM NhanVien");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maNV = rs.getString("maNV");
                String ten = rs.getString("tenNV");
                boolean phai = rs.getBoolean("gioiTinh");
                Enum_KhuVuc khuVuc = Enum_KhuVuc.valueOf(rs.getString("khuVuc"));
                Double luong = rs.getDouble("luong");
                Double tienThuong = rs.getDouble("tienLuong");
                String soTKNH = rs.getString("soTKNganHang");
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString("maTK"));

                NhanVien nv = new NhanVien(maNV, ten, phai, khuVuc, luong, tienThuong, soTKNH, taiKhoan);
                dsNV.add(nv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsNV;
    }

    public boolean create(NhanVien nv) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("insert into NhanVien values (?, ?, ?, ?, ?, ?, ?)");
            stmt.setString(1, nv.getMaNV());
            stmt.setString(2, nv.getTenNV());
            stmt.setBoolean(3, nv.isGioiTinh());
            stmt.setString(4, nv.getKhuVuc().toString());
            stmt.setDouble(5, nv.getLuong());
            stmt.setDouble(6, nv.getTienThuong());
            stmt.setString(7, nv.getSoTKNH());
            stmt.setString(8, nv.getTaiKhoan().getMaTK());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n > 0;
    }

    public boolean update(NhanVien nv) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("update NhanVien set ho = ?, ten = ?, tuoi = ?, phai = ?, tienLuong = ?, maPhong = ? where maNV = ?");
            stmt.setString(1, nv.getMaNV());
            stmt.setString(2, nv.getTenNV());
            stmt.setBoolean(3, nv.isGioiTinh());
            stmt.setString(4, nv.getKhuVuc().toString());
            stmt.setDouble(5, nv.getLuong());
            stmt.setDouble(6, nv.getTienThuong());
            stmt.setString(7, nv.getSoTKNH());
            stmt.setString(8, nv.getTaiKhoan().getMaTK());
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n > 0;
    }

    public ArrayList<NhanVien> getNhanVienByMaNV(String maNV) {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        ConnectDB.getInstance();
        PreparedStatement stmt = null;
        Connection con = ConnectDB.getConnection();
        try {
            stmt = con.prepareStatement("select * from NhanVien where maNV = ?");
            stmt.setString(1, maNV);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                String ma = rs.getString(1);
                String ten = rs.getString(2);
                boolean phai = rs.getBoolean(3);
                Enum_KhuVuc khuVuc = Enum_KhuVuc.valueOf(rs.getString(4));
                Double luong = rs.getDouble(5);
                Double tienThuong = rs.getDouble(6);
                String soTKNH = rs.getString(7);
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString(8));

                NhanVien nv = new NhanVien(maNV, ten, phai, khuVuc, luong, tienThuong, soTKNH, taiKhoan);
                dsNV.add(nv);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return dsNV;
    }
    public boolean deleteNV(String maNV) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("delete NhanVien where maNV = ?");
            stmt.setString(1, maNV);
            n = stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return n > 0;
    }}
