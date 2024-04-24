package entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class HoaDon {
	private String maHD;
	private LocalDate ngayLapHD;
	private Enum_PhuongThucTT pttt;
	private LocalDate gioVao;
	private LocalDate gioRa;
	private Ban ban;
	private NhanVien nhanVien;
	private KhachHang khachHang;
	private Double tongTien;

	public HoaDon() {
	}

	public HoaDon(String maHD) {
		this.maHD = maHD;
	}

	public HoaDon(String maHD, LocalDate ngayLapHD, Enum_PhuongThucTT pttt, LocalDate gioVao, LocalDate gioRa, Ban ban, NhanVien nhanVien, KhachHang khachHang) {
		this.maHD = maHD;
		this.ngayLapHD = ngayLapHD;
		this.pttt = pttt;
		this.gioVao = gioVao;
		this.gioRa = gioRa;
		this.ban = ban;
		this.nhanVien = nhanVien;
		this.khachHang = khachHang;
		this.tongTien = (double) 0;
	}

	/**
	 * @return the maHD
	 */
	public String getMaHD() {
		return maHD;
	}
	/**
	 * @param maHD the maHD to set
	 */
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	/**
	 * @return the ngayLapHD
	 */
	public LocalDate getNgayLapHD() {
		return ngayLapHD;
	}
	/**
	 * @param ngayLapHD the ngayLapHD to set
	 */
	public void setNgayLapHD(LocalDate ngayLapHD) {
		this.ngayLapHD = ngayLapHD;
	}
	/**
	 * @return the maBan
	 */
	public Ban getBan() {
		return ban;
	}
	/**
	 * @param ban the maBan to set
	 */
	public void setBan(Ban ban) {
		this.ban = ban;
	}
	/**
	 * @return the gioRa
	 */
	public LocalDate getGioRa() {
		return gioRa;
	}
	/**
	 * @param gioRa the gioRa to set
	 */
	public void setGioRa(LocalDate gioRa) {
		this.gioRa = gioRa;
	}
	/**
	 * @return the pttt
	 */
	public Enum_PhuongThucTT getPttt() {
		return pttt;
	}
	/**
	 * @param pttt the pttt to set
	 */
	public void setPttt(Enum_PhuongThucTT pttt) {
		this.pttt = pttt;
	}
	public LocalDate getGioVao() {
		return gioVao;
	}

	public void setGioVao(LocalDate gioVao) {
		this.gioVao = gioVao;
	}

	public NhanVien getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}

	public KhachHang getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}

	public Double getTongTien() {
		return tongTien;
	}
	public void setTongTien(Double tongTienb) {
		this.tongTien = tongTien;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD);
	}

	@Override
	public String toString() {
		return "HoaDon{" +
				"maHD='" + maHD + '\'' +
				", ngayLapHD=" + ngayLapHD +
				", pttt=" + pttt +
				", gioVao=" + gioVao +
				", gioRa=" + gioRa +
				", maBan='" + ban + '\'' +
				", nhanVien=" + nhanVien +
				", khachHang=" + khachHang +
				'}';
	}
}