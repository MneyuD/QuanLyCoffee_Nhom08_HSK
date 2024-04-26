package entity;

import java.util.Objects;

public class NhanVien {
	private String maNV;
	private String tenNV;
	private boolean gioiTinh;
	private Enum_KhuVuc khuVuc;
	private Double luong;
	private Double tienThuong;
	private String soTKNH;
	private TaiKhoan taiKhoan;

	public NhanVien(String maNV, String tenNV, boolean gioiTinh, Enum_KhuVuc khuVuc, Double luong, Double tienThuong,
			String soTKNH, TaiKhoan taiKhoan) {
		super();
		this.maNV = maNV;
		this.tenNV = tenNV;
		this.gioiTinh = gioiTinh;
		this.khuVuc = khuVuc;
		this.luong = luong;
		this.tienThuong = tienThuong;
		this.soTKNH = soTKNH;
		this.taiKhoan = taiKhoan;
	}
	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}

    public NhanVien() {
    }

    /**
	 * @return the maNV
	 */
	public String getMaNV() {
		return maNV;
	}
	/**
	 * @param maNV the maNV to set
	 */
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	/**
	 * @return the tenNV
	 */
	public String getTenNV() {
		return tenNV;
	}
	/**
	 * @param tenNV the tenNV to set
	 */
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	/**
	 * @return the gioiTinh
	 */
	public boolean isGioiTinh() {
		return gioiTinh;
	}
	/**
	 * @param gioiTinh the gioiTinh to set
	 */
	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	/**
	 * @return the khuVuc
	 */
	public Enum_KhuVuc getKhuVuc() {
		return khuVuc;
	}
	/**
	 * @param khuVuc the khuVuc to set
	 */
	public void setKhuVuc(Enum_KhuVuc khuVuc) {
		this.khuVuc = khuVuc;
	}
	/**
	 * @return the luong
	 */
	public Double getLuong() {
		return luong;
	}
	/**
	 * @param luong the luong to set
	 */
	public void setLuong(Double luong) {
		this.luong = luong;
	}
	/**
	 * @return the tienThuong
	 */
	public Double getTienThuong() {
		return tienThuong;
	}
	/**
	 * @param tienThuong the tienThuong to set
	 */
	public void setTienThuong(Double tienThuong) {
		this.tienThuong = tienThuong;
	}
	/**
	 * @return the soTKNH
	 */
	public String getSoTKNH() {
		return soTKNH;
	}
	/**
	 * @param soTKNH the soTKNH to set
	 */
	public void setSoTKNH(String soTKNH) {
		this.soTKNH = soTKNH;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	@Override
	public int hashCode() {
		return Objects.hash(maNV);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Objects.equals(maNV, other.maNV);
	}
	@Override
	public String toString() {
		return "NhanVien [maNV=" + maNV + ", tenNV=" + tenNV + ", gioiTinh=" + gioiTinh + ", khuVuc=" + khuVuc
				+ ", luong=" + luong + ", tienThuong=" + tienThuong + ", soTKNH=" + soTKNH + "]";
	}
	
	
	
	
	
}
