package dao;

import connect.ConnectDB;
import entity.*;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class HoaDon_DAO {
    public HoaDon_DAO() {

    }

    public ArrayList<HoaDon> getAllOrder() {
        ArrayList<HoaDon> orderList = new ArrayList<>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement("SELECT * FROM HoaDon");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maHD = rs.getString("maHD");

                LocalDate ngayLap = null;
                Date date = rs.getDate("ngayLap");
                if(date != null) {
                    ngayLap = date.toLocalDate();
                } else ngayLap = null;

                String maBan = rs.getString("maBan");

                Enum_PhuongThucTT pttt;
                String pThuc = rs.getString("phuongThucThanhToan");
                if(pThuc.equalsIgnoreCase("Chuyển khoản")) {
                    pttt = Enum_PhuongThucTT.CHUYENKHOAN;
                } else {
                    pttt = Enum_PhuongThucTT.TIENMAT;
                }

                LocalDate gioVao = null;
                Date dateVao = rs.getDate("gioVao");
                if(dateVao != null) {
                    gioVao = dateVao.toLocalDate();
                } else gioVao = null;

                LocalDate gioRa = null;
                Date dateRa = rs.getDate("gioRa");
                if(dateRa != null) {
                    gioRa = dateRa.toLocalDate();
                } else gioRa = null;

                Double tongTien = rs.getDouble("tongTien");
                NhanVien nhanVien = new NhanVien(rs.getString("maNV"));
                KhachHang khachHang = new KhachHang(rs.getString("maKH"));

                HoaDon hd = new HoaDon(maHD, ngayLap, pttt, gioVao, gioRa, maBan, nhanVien, khachHang);
                orderList.add(hd);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return orderList;
    }

    public Double getDailyRevenue() {
        Double revenue = (double) 0;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(
                    "SELECT SUM([tongTien]) AS TongTien " +
                            "FROM HoaDon " +
                            "WHERE CONVERT(DATE, ngayLap, 103) = CONVERT(DATE, GETDATE(), 103) " +
                            "GROUP BY CONVERT(DATE, ngayLap, 103)");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                revenue = rs.getDouble("TongTien");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return revenue;
    }

    public Double getMonthlyRevenue() {
        Double revenue = (double) 0;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(
                    "SELECT SUM([tongTien]) AS TongTien " +
                            "FROM HoaDon " +
                            "WHERE YEAR(ngayLap) = YEAR(GETDATE()) AND MONTH(ngayLap) = MONTH(GETDATE()) " +
                            "GROUP BY YEAR(ngayLap), MONTH(ngayLap)");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                revenue = rs.getDouble("TongTien");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return revenue;
    }

    public Double getCustomizedRevenue(LocalDate startedDate, LocalDate endedDate) {
        Double revenue = (double) 0;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(
                    "SELECT SUM([tongTien]) AS TongTien " +
                            "FROM HoaDon " +
                            "WHERE CONVERT(DATE, ngayLap, 103) >= CONVERT(DATE, ?, 103) " +
                            "AND CONVERT(DATE, ngayLap, 103) <= CONVERT(DATE, ?, 103)");
            stmt.setDate(1, Date.valueOf(startedDate));
            stmt.setDate(2, Date.valueOf(endedDate));
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                revenue = rs.getDouble("TongTien");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return revenue;
    }

    public Double getdRevenueForYear() {
        Double revenue = (double) 0;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(
                    "SELECT SUM([tongTien]) AS TongTien " +
                            "FROM HoaDon " +
                            "WHERE YEAR(ngayLap) = YEAR(GETDATE()) " +
                            "GROUP BY YEAR(ngayLap)");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                revenue = rs.getDouble("TongTien");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return revenue;
    }

    public HoaDon getOrder_ByID(String maHD) {
        HoaDon hd = null;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement(
                    "SELECT * FROM HoaDon " +
                            "WHERE maHD LIKE ?");
            sm.setString(1, maHD);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                LocalDate ngayLap = null;
                Date date = rs.getDate("ngayLap");
                if(date != null) {
                    ngayLap = date.toLocalDate();
                } else ngayLap = null;

                Enum_PhuongThucTT pttt;
                String pThuc = rs.getString("phuongThucThanhToan");
                if(pThuc.equalsIgnoreCase("Chuyển khoản")) {
                    pttt = Enum_PhuongThucTT.CHUYENKHOAN;
                } else {
                    pttt = Enum_PhuongThucTT.TIENMAT;
                }

                LocalDate gioVao = null;
                Date dateVao = rs.getDate("gioVao");
                if(dateVao != null) {
                    gioVao = dateVao.toLocalDate();
                } else gioVao = null;

                LocalDate gioRa = null;
                Date dateRa = rs.getDate("gioRa");
                if(dateRa != null) {
                    gioRa = dateRa.toLocalDate();
                } else gioRa = null;

                Double tongTien = rs.getDouble("tongTien");
                String maBan = rs.getString("maBan");
                NhanVien nhanVien = new NhanVien(rs.getString("maNV"));
                KhachHang khachHang = new KhachHang(rs.getString("maKH"));

                hd = new HoaDon(maHD, ngayLap, pttt, gioVao, gioRa, maBan, nhanVien, khachHang);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                sm.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return hd;
    }
}