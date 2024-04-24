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
}