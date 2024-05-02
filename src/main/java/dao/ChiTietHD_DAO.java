package dao;

import connect.ConnectDB;
import entity.*;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ChiTietHD_DAO {
    public ChiTietHD_DAO() {

    }
    public ArrayList<ChiTietHD> getAllOrder() {
        ArrayList<ChiTietHD> orderList = new ArrayList<ChiTietHD>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT * FROM HoaDon HD " +
                            "JOIN ChiTietHD CTHD ON HD.maHD = CTHD.maHD " +
                            "JOIN SanPham SP ON SP.maSP = CTHD.maSP " +
                            "JOIN KhachHang KH ON KH.maKH = HD.maKH " +
                            "JOIN NhanVien NV ON NV.maNV = HD.maNV " +
                            "JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maHD = rs.getString("maHD");

                LocalDate ngayLap = null;
                Date dateTime = rs.getDate("ngayLap");
                if(dateTime != null) {
                    ngayLap = dateTime.toLocalDate();
                }

                Enum_PhuongThucTT pTTT;
                String pThuc = rs.getString("phuongThucThanhToan");
                if(pThuc.equalsIgnoreCase("Chuyển khoản")) {
                    pTTT = Enum_PhuongThucTT.CHUYENKHOAN;
                } else {
                    pTTT = Enum_PhuongThucTT.TIENMAT;
                }

                LocalDate gioVao = null;
                Date dateTimeGV = rs.getDate("gioVao");
                if(dateTimeGV != null) {
                    gioVao = dateTimeGV.toLocalDate();
                }

                LocalDate gioRa = null;
                Date dateTimeGR = rs.getDate("gioRa");
                if(dateTimeGR != null) {
                    gioRa = dateTimeGR.toLocalDate();
                }

                String maBan = rs.getString("maBan");

                Enum_KhuVuc khuVuc;
                String khuVucString = rs.getString("khuVuc");
                if(khuVucString.equals("Khu vực trong nhà")) {
                    khuVuc = Enum_KhuVuc.TRONG_NHA;
                } else if(khuVucString.equalsIgnoreCase("Khu vực ngoài trời")) {
                    khuVuc = Enum_KhuVuc.TRONG_NHA;
                } else {
                    khuVuc = Enum_KhuVuc.QUAY;
                }

                TaiKhoan taiKhoan = new TaiKhoan(rs.getString("tenDangNhap"));

                NhanVien nhanVien = new NhanVien(rs.getString("maNV"), rs.getString("tenNV"), rs.getBoolean("gioiTinh")
                        , khuVuc, rs.getDouble("luong"), rs.getDouble("tienThuong"), rs.getString("soTKNganHang"), taiKhoan);

                LocalDate ngaySinh = null;
                Date dateTimeNS = rs.getDate("ngaySinh");
                if(dateTimeNS != null) {
                    ngaySinh = dateTimeNS.toLocalDate();
                }
                KhachHang khachHang = new KhachHang(rs.getString("maKH"), rs.getString("tenKH"), ngaySinh
                        , rs.getBoolean("gioiTinh"), rs.getString("sdt"), 0);

                Enum_KichCo kichCo = Enum_KichCo.valueOf(rs.getString("kichCo"));
                LocalDate ngayHetHan = null;
                Date dateTimeHH = rs.getDate("ngayHetHan");
                if(dateTimeHH != null) {
                    ngayHetHan = dateTimeHH.toLocalDate();
                }
                LoaiSP loaiSp = new LoaiSP(rs.getString("maLoai"), rs.getString("tenLoai"));

                SanPham sanPham = new SanPham(rs.getString("maSP"), rs.getString("tenSP"), rs.getDouble("donGia")
                        , rs.getDouble("thue"), kichCo, ngayHetHan, rs.getBoolean("trangThai"), loaiSp);

                int soLuong = rs.getInt("soLuong");
                HoaDon hoaDon = new HoaDon( maHD, ngayLap, pTTT, gioVao, gioRa, maBan, nhanVien, khachHang) ;

                Double donGia = 0.0;
                Double thanhTien = (double) 0;
                ChiTietHD chiTietHD = new ChiTietHD(hoaDon, sanPham, soLuong, donGia, thanhTien);
                orderList.add(chiTietHD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public ArrayList<ChiTietHD> getProduct_BestSeller() {
        ArrayList<ChiTietHD> orderList = new ArrayList<ChiTietHD>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT SP.maSP, SP.tenSP, SUM(soLuong) AS SoLuong, trangThai " +
                            "FROM ChiTietHD CT JOIN SanPham SP ON CT.maSP = SP.maSP " +
                            "GROUP BY SP.[maSP], SP.tenSP, trangThai " +
                            "ORDER BY SUM(soLuong) DESC");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maHD = rs.getString("maSP");
                HoaDon hd = new HoaDon(maHD);

                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                boolean trangThai = rs.getBoolean("trangThai");
                int soLuong = rs.getInt("SoLuong");

                SanPham sp = new SanPham(maSP, tenSP, trangThai);

                ChiTietHD cthd = new ChiTietHD(hd, sp, soLuong, 0, 0);
                orderList.add(cthd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public ArrayList<ChiTietHD> getQuantityProduct_ByDate(LocalDate startDate, LocalDate endDate) {
        ArrayList<ChiTietHD> orderList = new ArrayList<ChiTietHD>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT SP.maSP, SP.tenSP, SUM(soLuong) AS SoLuong, trangThai " +
                            "FROM ChiTietHD CT JOIN SanPham SP ON CT.maSP = SP.maSP " +
                            "   JOIN HoaDon HD ON HD.maHD = CT.maHD " +
                            "WHERE CONVERT(DATE, ngayLap, 103) >= CONVERT(DATE, ?, 103) " +
                            "   AND CONVERT(DATE, ngayLap, 103) <= CONVERT(DATE, ?, 103) " +
                            "GROUP BY SP.[maSP], SP.tenSP, trangThai " +
                            "ORDER BY SUM(soLuong) DESC");
            sm.setDate(1, Date.valueOf(startDate));
            sm.setDate(2, Date.valueOf(endDate));
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maHD = rs.getString("maSP");
                HoaDon hd = new HoaDon(maHD);

                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                boolean trangThai = rs.getBoolean("trangThai");
                int soLuong = rs.getInt("SoLuong");

                SanPham sp = new SanPham(maSP, tenSP, trangThai);

                ChiTietHD cthd = new ChiTietHD(hd, sp, soLuong, 0, 0);
                orderList.add(cthd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public ArrayList<ChiTietHD> getProduct_ByType(String tenLoai) {
        ArrayList<ChiTietHD> orderList = new ArrayList<ChiTietHD>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT SP.maSP, SP.tenSP, SUM(soLuong) AS SoLuong, trangThai " +
                            "FROM ChiTietHD CT JOIN SanPham SP ON CT.maSP = SP.maSP " +
                            "JOIN LoaiSP LSP ON LSP.maLoai = SP.maLoai " +
                            "WHERE SP.maSP  IN " +
                            "(SELECT SP2.maSP FROM SanPham SP2 " +
                            "JOIN LoaiSP LSP ON LSP.maLoai = SP2.maLoai " +
                            "WHERE tenLoai LIKE ?) " +
                            "GROUP BY SP.[maSP], SP.tenSP, trangThai " +
                            "ORDER BY SUM(soLuong) DESC");
            sm.setString(1, tenLoai);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maHD = rs.getString("maSP");
                HoaDon hd = new HoaDon(maHD);

                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                boolean trangThai = rs.getBoolean("trangThai");
                int soLuong = rs.getInt("SoLuong");

                SanPham sp = new SanPham(maSP, tenSP, trangThai);

                ChiTietHD cthd = new ChiTietHD(hd, sp, soLuong, 0, 0);
                orderList.add(cthd);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public ArrayList<ChiTietHD> getProduct_ByStatus(boolean status) {
        ArrayList<ChiTietHD> orderList = new ArrayList<ChiTietHD>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement(
                    "SELECT SP.maSP, SP.tenSP, SUM(soLuong) AS SoLuong, trangThai " +
                            "FROM ChiTietHD CT JOIN SanPham SP ON CT.maSP = SP.maSP " +
                            "JOIN LoaiSP LSP ON LSP.maLoai = SP.maLoai " +
                            "WHERE trangThai = ? " +
                            "GROUP BY SP.[maSP], SP.tenSP, trangThai " +
                            "ORDER BY SUM(soLuong) DESC");
            sm.setBoolean(1, status);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maHD = rs.getString("maSP");
                HoaDon hd = new HoaDon(maHD);

                String maSP = rs.getString("maSP");
                String tenSP = rs.getString("tenSP");
                boolean trangThai = rs.getBoolean("trangThai");
                int soLuong = rs.getInt("SoLuong");

                SanPham sp = new SanPham(maSP, tenSP, trangThai);

                ChiTietHD cthd = new ChiTietHD(hd, sp, soLuong, 0, 0);
                orderList.add(cthd);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }

    public ArrayList<ChiTietHD> getOrderDetail_ByID(String maHD) {
        ArrayList<ChiTietHD> cthdList = new ArrayList<>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement(
                    "SELECT * FROM ChiTietHD CT " +
                            "JOIN HoaDon HD ON CT.maHD = HD.maHD " +
                            "WHERE HD.maHD LIKE ?");
            sm.setString(1, maHD);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                HoaDon hd = new HoaDon_DAO().getOrder_ByID(maHD);

                SanPham sp = new SanPham_DAO().getProduct_ByID(rs.getString("maSP"));

                int soLuong = rs.getInt("soLuong");
                Double donGia = rs.getDouble("donGia");
                Double thanhTien = rs.getDouble("thanhTien");

                ChiTietHD cthd = new ChiTietHD(hd, sp, soLuong, donGia, thanhTien);
                cthdList.add(cthd);
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
        return cthdList;
    }

    /*public static void main(String[] args) {
        ConnectDB.getInstance().connect();

        for (ChiTietHD cthd : new ChiTietHD_DAO().getOrderDetail_ByID("20040420HD000003")) {
            System.out.println(cthd);
        }
    }*/
}
