package entity;

import java.util.Objects;

public class TaiKhoan {
	private String tenDangNhap;
	private String matKhau;

	public TaiKhoan(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public TaiKhoan(String tenDangNhap, String matKhau) {
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
	}

	public TaiKhoan() {
	}

	/**
	 * @return the tenDangNhap
	 */
	public String getTenDangNhap() {
		return tenDangNhap;
	}
	/**
	 * @param tenDangNhap the tenDangNhap to set
	 */
	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}
	/**
	 * @return the matKhau
	 */
	public String getMatKhau() {
		return matKhau;
	}
	/**
	 * @param matKhau the matKhau to set
	 */
	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof TaiKhoan taiKhoan)) return false;
		return Objects.equals(tenDangNhap, taiKhoan.tenDangNhap);
	}

	@Override
	public int hashCode() {
		return Objects.hash(tenDangNhap);
	}

	@Override
	public String toString() {
		return "TaiKhoan{" +
				"tenDangNhap='" + tenDangNhap + '\'' +
				", matKhau='" + matKhau + '\'' +
				'}';
	}
}
