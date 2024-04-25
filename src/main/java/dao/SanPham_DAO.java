package dao;

import connect.ConnectDB;
import entity.Enum_KichCo;
import entity.LoaiSP;
import entity.SanPham;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class SanPham_DAO {
    public SanPham_DAO() {

    }

    public ArrayList<SanPham> getAllProduct() {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement("SELECT * FROM SanPham SP JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                LocalDate ngayHetHan = null;
                Date dateTime = rs.getDate("ngayHetHan");
                if(dateTime != null) {
                    ngayHetHan = dateTime.toLocalDate();
                }
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"), rs.getString("tenLoai"));

                SanPham sp = new SanPham(rs.getString("maSP"), rs.getString("tenSP"), rs.getDouble("donGia")
                        , rs.getDouble("thue"), kichCo, ngayHetHan, rs.getBoolean("trangThai"), loaiSp);
                dsSP.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }

    public ArrayList<SanPham> getProductByType(String tenLoai) {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT * FROM SanPham SP " +
                            "JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai " +
                            "WHERE tenLoai LIKE ?");
            sm.setString(1, "%" + tenLoai + "%");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                Double donGia = rs.getDouble("donGia");
                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                LocalDate ngayHetHan = null;
                Date dateTime = rs.getDate("ngayHetHan");
                if(dateTime != null) {
                    ngayHetHan = dateTime.toLocalDate();
                }
                Double thue = rs.getDouble("thue");
                boolean trangThai = rs.getBoolean("trangThai");
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"), rs.getString("tenLoai"));

                SanPham sp = new SanPham(maSP, tenSP, donGia, thue, kichCo, ngayHetHan, trangThai, loaiSp);
                dsSP.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }

    public ArrayList<SanPham> getProduct_ByName(String tenSP) {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT * FROM SanPham SP " +
                            "JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai " +
                            "WHERE tenSP LIKE ?");
            sm.setString(1, "%" + tenSP + "%");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSanPham = rs.getString("tenSP");
                Double donGia = rs.getDouble("donGia");
                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                LocalDate ngayHetHan = null;
                Date dateTime = rs.getDate("ngayHetHan");
                if(dateTime != null) {
                    ngayHetHan = dateTime.toLocalDate();
                }
                Double thue = rs.getDouble("thue");
                boolean trangThai = rs.getBoolean("trangThai");
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"), rs.getString("tenLoai"));

                SanPham sp = new SanPham(maSP, tenSanPham, donGia, thue, kichCo, ngayHetHan, trangThai, loaiSp);
                dsSP.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }

    public SanPham getProduct_ByID(String maSP) {
        SanPham sp = null;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT * FROM SanPham SP " +
                            "JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai " +
                            "WHERE maSP LIKE ?");
            sm.setString(1, maSP + "");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String tenSanPham = rs.getString("tenSP");
                Double donGia = rs.getDouble("donGia");
                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                LocalDate ngayHetHan = null;
                Date dateTime = rs.getDate("ngayHetHan");
                if(dateTime != null) {
                    ngayHetHan = dateTime.toLocalDate();
                }
                Double thue = rs.getDouble("thue");
                boolean trangThai = rs.getBoolean("trangThai");
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"), rs.getString("tenLoai"));

                sp = new SanPham(maSP, tenSanPham, donGia, thue, kichCo, ngayHetHan, trangThai, loaiSp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sp;
    }

    public ArrayList<SanPham> getProduct_ByStatus(boolean status) {
        ArrayList<SanPham> dsSP = new ArrayList<SanPham>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT * FROM SanPham SP " +
                            "JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai " +
                            "WHERE trangThai = ?");
            sm.setBoolean(1, status);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                Double donGia = rs.getDouble("donGia");
                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                LocalDate ngayHetHan = null;
                Date dateTime = rs.getDate("ngayHetHan");
                if(dateTime != null) {
                    ngayHetHan = dateTime.toLocalDate();
                }
                Double thue = rs.getDouble("thue");
                boolean trangThai = rs.getBoolean("trangThai");
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"), rs.getString("tenLoai"));

                SanPham sp = new SanPham(maSP, tenSP, donGia, thue, kichCo, ngayHetHan, trangThai, loaiSp);
                dsSP.add(sp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dsSP;
    }

    public boolean createSanPham(SanPham sp) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement("INSERT SanPham VALUES (?, ?, ?, ?, ?, CONVERT(DATE, ?, 103), ?, ?)");
            stmt.setString(1, "Random");
            stmt.setString(2, sp.getTenSP());
            stmt.setString(3, String.valueOf(sp.getKickCo()));
            stmt.setDouble(4, sp.getDonGia());
            stmt.setDouble(5, sp.getThue());
            if (sp.getNgayHetHan() == null) {
                stmt.setDate(6, null);
            } else {
                stmt.setDate(6, Date.valueOf(sp.getNgayHetHan()));
            }
            stmt.setBoolean(7, sp.isTrangThai());
            stmt.setString(8, sp.getLoaiSP().getMaLoaiSP());
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

    public boolean updateSanPham(SanPham sp) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        int n = 0;
        try {
            stmt = con.prepareStatement(
                    "UPDATE SanPham " +
                            "SET tenSP = ?, kichCo = ?, donGia = ?" +
                            ", thue = ?, ngayHetHan = ?, trangThai = ?, maLoai = ? " +
                            "WHERE maSP LIKE ?");
            stmt.setString(1, sp.getTenSP());
            stmt.setString(2, sp.getKickCo().getKichCo());
            stmt.setDouble(3, sp.getDonGia());
            stmt.setDouble(4, sp.getThue());
            if (sp.getNgayHetHan() == null) {
                stmt.setDate(5, null);
            } else {
                stmt.setDate(5, Date.valueOf(sp.getNgayHetHan()));
            }
            stmt.setBoolean(6, sp.isTrangThai());
            stmt.setString(7, sp.getLoaiSP().getMaLoaiSP());
            stmt.setString(8, sp.getMaSP());
            n = stmt.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return n > 0;
    }

    public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        SanPham sp = new SanPham_DAO().getProduct_ByID("20240419SP000005");
        System.out.println("Chưa sửa 1: " + sp);
        sp.setDonGia(Double.valueOf(30000));
        System.out.println("Chưa sửa 2: " + sp);
        if(new SanPham_DAO().updateSanPham(sp)) {
            System.out.println("Đã sửa: " + sp);
        } else {
            System.out.println("Buyến");
        }
    }
}
