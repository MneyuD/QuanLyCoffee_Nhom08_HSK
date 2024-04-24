package entity;

import java.util.Objects;

public class TaiKhoan {
	private String maTK;
	private String tenTK;
	public TaiKhoan(String maTK, String tenTK) {
		super();
		this.maTK = maTK;
		this.tenTK = tenTK;
	}
	public TaiKhoan(String maTK) {
		super();
		this.maTK = maTK;
	}
	/**
	 * @return the maTK
	 */
	public String getMaTK() {
		return maTK;
	}
	/**
	 * @param maTK the maTK to set
	 */
	public void setMaTK(String maTK) {
		this.maTK = maTK;
	}
	/**
	 * @return the tenTK
	 */
	public String getTenTK() {
		return tenTK;
	}
	/**
	 * @param tenTK the tenTK to set
	 */
	public void setTenTK(String tenTK) {
		this.tenTK = tenTK;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maTK);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiKhoan other = (TaiKhoan) obj;
		return Objects.equals(maTK, other.maTK);
	}
	@Override
	public String toString() {
		return "TaiKhoan [maTK=" + maTK + ", tenTK=" + tenTK + "]";
	}
	
	
	

}
