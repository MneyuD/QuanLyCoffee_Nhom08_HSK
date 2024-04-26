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

    public ArrayList<NhanVien> getAllEmployee() {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement("SELECT * FROM NhanVien");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maNV = rs.getString("maNV");
                String ten = rs.getString("tenNV");
                boolean phai = rs.getBoolean("gioiTinh");

                String kVuc = rs.getString("khuVuc");
                Enum_KhuVuc khuVuc = null;
                if(kVuc.equals("Khu vực trong nhà")) {
                    khuVuc = Enum_KhuVuc.TRONG_NHA;
                } else if (kVuc.equals("Khu vực ngoài trời")) {
                    khuVuc = Enum_KhuVuc.NGOAI_TROI;
                } else if (kVuc.equals("Khu vực quầy")) {
                    khuVuc = Enum_KhuVuc.QUAY;
                }

                Double luong = rs.getDouble("luong");
                Double tienThuong = rs.getDouble("tienThuong");
                String soTKNH = rs.getString("soTKNganHang");
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString("tenDangNhap"));

                NhanVien nv = new NhanVien(maNV, ten, phai, khuVuc, luong, tienThuong, soTKNH, taiKhoan);
                dsNV.add(nv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                sm.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
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
            stmt.setString(8, nv.getTaiKhoan().getTenDangNhap());
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
            stmt.setString(8, nv.getTaiKhoan().getTenDangNhap());
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

    public ArrayList<NhanVien> getEmployee_ByName(String tenNV) {
        ArrayList<NhanVien> dsNV = new ArrayList<NhanVien>();
        ConnectDB.getInstance();
        PreparedStatement stmt = null;
        Connection con = ConnectDB.getConnection();
        try {
            stmt = con.prepareStatement("SELECT * FROM NhanVien WHERE tenNV LIKE ?");
            stmt.setString(1, "%" + tenNV + "%");
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                String maNV = rs.getString("maNV");
                String ten = rs.getString("tenNV");
                boolean phai = rs.getBoolean("gioiTinh");

                String kVuc = rs.getString("khuVuc");
                Enum_KhuVuc khuVuc = null;
                if(kVuc.equals("Khu vực trong nhà")) {
                    khuVuc = Enum_KhuVuc.TRONG_NHA;
                } else if (kVuc.equals("Khu vực ngoài trời")) {
                    khuVuc = Enum_KhuVuc.NGOAI_TROI;
                } else if (kVuc.equals("Khu vực quầy")) {
                    khuVuc = Enum_KhuVuc.QUAY;
                }

                Double luong = rs.getDouble("luong");
                Double tienThuong = rs.getDouble("tienThuong");
                String soTKNH = rs.getString("soTKNganHang");
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString("tenDangNhap"));

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

    public NhanVien getEmployee_ByID(String maNV) {
        NhanVien nv = new NhanVien();
        ConnectDB.getInstance();
        PreparedStatement stmt = null;
        Connection con = ConnectDB.getConnection();
        try {
            stmt = con.prepareStatement("SELECT * FROM NhanVien WHERE maNV LIKE ?");
            stmt.setString(1, maNV);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()) {
                String ten = rs.getString("tenNV");
                boolean phai = rs.getBoolean("gioiTinh");

                String kVuc = rs.getString("khuVuc");
                Enum_KhuVuc khuVuc = null;
                if(kVuc.equals("Khu vực trong nhà")) {
                    khuVuc = Enum_KhuVuc.TRONG_NHA;
                } else if (kVuc.equals("Khu vực ngoài trời")) {
                    khuVuc = Enum_KhuVuc.NGOAI_TROI;
                } else if (kVuc.equals("Khu vực quầy")) {
                    khuVuc = Enum_KhuVuc.QUAY;
                }

                Double luong = rs.getDouble("luong");
                Double tienThuong = rs.getDouble("tienThuong");
                String soTKNH = rs.getString("soTKNganHang");
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString("tenDangNhap"));

                nv = new NhanVien(maNV, ten, phai, khuVuc, luong, tienThuong, soTKNH, taiKhoan);
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
        return nv;
    }

    public ArrayList<NhanVien> getEmployee_BySpace(String khuVuc) {
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        ArrayList<NhanVien> empList = new ArrayList<>();
        PreparedStatement sm = null;
        try {
            sm = con.prepareStatement(
                    "SELECT * FROM NhanVien " +
                            "WHERE khuVuc LIKE ?");
            sm.setString(1, khuVuc);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maNV = rs.getString("maNV");
                String ten = rs.getString("tenNV");
                boolean phai = rs.getBoolean("gioiTinh");

                Enum_KhuVuc khuVucS = null;
                if(khuVuc.equals("Khu vực trong nhà")) {
                    khuVucS = Enum_KhuVuc.TRONG_NHA;
                } else if (khuVuc.equals("Khu vực ngoài trời")) {
                    khuVucS = Enum_KhuVuc.NGOAI_TROI;
                } else if (khuVuc.equals("Khu vực quầy")) {
                    khuVucS = Enum_KhuVuc.QUAY;
                }

                Double luong = rs.getDouble("luong");
                Double tienThuong = rs.getDouble("tienThuong");
                String soTKNH = rs.getString("soTKNganHang");
                TaiKhoan taiKhoan = new TaiKhoan(rs.getString("tenDangNhap"));

                NhanVien nv = new NhanVien(maNV, ten, phai, khuVucS, luong, tienThuong, soTKNH, taiKhoan);
                empList.add(nv);
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
        return empList;
    }
}
