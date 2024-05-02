package dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import connect.ConnectDB;
import entity.KhachHang;
import entity.NhanVien;

public class KhachHang_DAO {
	ArrayList<KhachHang> listKH = new ArrayList<>();

	public ArrayList<KhachHang> getListKH() {
		return listKH;
	}

	public KhachHang getKhachHangTheoSDT(String sdt){
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n =0;

		try {
			stmt = con.prepareStatement("SELECT * FROM KhachHang WHERE sdt = ?");
			stmt.setString(1, sdt);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()){
				String tenKH = rs.getString("tenKH");
				int diemTichLuy = rs.getInt("diemTichLuy");

				KhachHang kh = new KhachHang(tenKH, diemTichLuy);
				return kh;
			}

		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		return null;
	}

	public boolean cretaKhachHang(KhachHang kh) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		int n = 0;
		try {
			stmt = con.prepareStatement("insert into KhachHang values (?, ?, ?, ?, ?)");
			stmt.setString(1,kh.getTenKH());
			stmt.setDate(2, Date.valueOf(kh.getNgaySinh()));
			stmt.setBoolean(3, kh.isGioiTinh());
			stmt.setString(4, kh.getSdt());
			stmt.setInt(5, kh.getDiemTichLuy());

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

	public static void main(String[] args) {
		ConnectDB.getInstance().connect();
		KhachHang_DAO kh_dao = new KhachHang_DAO();
		System.out.println(kh_dao.getKhachHangTheoSDT("0222222222"));
		KhachHang khnew = new KhachHang("Nguyễn Văn A", LocalDate.of(2000,5,12), true, "0555555555", 10);
		kh_dao.cretaKhachHang(khnew);
	}
}
