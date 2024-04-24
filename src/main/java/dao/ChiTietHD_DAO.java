package dao;

import connect.ConnectDB;
import entity.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
//                            "JOIN Ban B ON B.maBan = HD.maBan " +
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

                Ban ban = new Ban(rs.getString("maBan"), rs.getInt("soLuongKhach"), rs.getBoolean("trangThai"));

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
                Double tongTien = (double) 0;
                HoaDon hoaDon = new HoaDon( maHD, ngayLap, pTTT, gioVao, gioRa, ban, nhanVien, khachHang, tongTien) ;

                Double thanhTien = (double) 0;
                ChiTietHD chiTietHD = new ChiTietHD(hoaDon, sanPham, soLuong, thanhTien);
                orderList.add(chiTietHD);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return orderList;
    }
}
