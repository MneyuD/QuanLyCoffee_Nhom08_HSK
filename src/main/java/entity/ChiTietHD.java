package entity;

import java.util.Objects;

public class ChiTietHD {
	private HoaDon hd;
	private SanPham sp ;
	private int soLuong;
	private double donGia;
	private double thanhTien;
	public ChiTietHD(HoaDon hd, SanPham sp, int soLuong, double donGia, double thanhTien) {
		super();
		this.hd = hd;
		this.sp = sp;
		this.soLuong = soLuong;
		this.donGia = 0;
		this.thanhTien = 0;
	}
	public ChiTietHD(HoaDon hd, SanPham sp) {
		super();
		this.hd = hd;
		this.sp = sp;
	}
	/**
	 * @return the hd
	 */
	public HoaDon getHd() {
		return hd;
	}
	/**
	 * @param hd the hd to set
	 */
	public void setHd(HoaDon hd) {
		this.hd = hd;
	}
	/**
	 * @return the sp
	 */
	public SanPham getSp() {
		return sp;
	}
	/**
	 * @param sp the sp to set
	 */
	public void setSp(SanPham sp) {
		this.sp = sp;
	}
	/**
	 * @return the soLuong
	 */
	public int getSoLuong() {
		return soLuong;
	}
	/**
	 * @param soLuong the soLuong to set
	 */
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public int hashCode() {
		return Objects.hash(hd, sp);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChiTietHD other = (ChiTietHD) obj;
		return Objects.equals(hd, other.hd) && Objects.equals(sp, other.sp);
	}
	@Override
	public String toString() {
		return "ChiTietHD [hd=" + hd + ", sp=" + sp + ", soLuong=" + soLuong + "]";
	}


	public double getThanhTien() {
		return thanhTien;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
}
