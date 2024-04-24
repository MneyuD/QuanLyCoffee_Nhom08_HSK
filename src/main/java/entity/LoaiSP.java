package entity;

import java.util.Objects;

public class LoaiSP {
	private String maLoaiSP;
	private String tenLoaiSP;
	public LoaiSP(String maLoaiSP, String tenLoaiSP) {
		super();
		this.maLoaiSP = maLoaiSP;
		this.tenLoaiSP = tenLoaiSP;
	}
	public LoaiSP(String maLoaiSP) {
		super();
		this.maLoaiSP = maLoaiSP;
	}
	/**
	 * @return the maLoaiSP
	 */
	public String getMaLoaiSP() {
		return maLoaiSP;
	}
	/**
	 * @param maLoaiSP the maLoaiSP to set
	 */
	public void setMaLoaiSP(String maLoaiSP) {
		this.maLoaiSP = maLoaiSP;
	}
	/**
	 * @return the tenLoaiSP
	 */
	public String getTenLoaiSP() {
		return tenLoaiSP;
	}
	/**
	 * @param tenLoaiSP the tenLoaiSP to set
	 */
	public void setTenLoaiSP(String tenLoaiSP) {
		this.tenLoaiSP = tenLoaiSP;
	}
	@Override
	public int hashCode() {
		return Objects.hash(maLoaiSP);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LoaiSP other = (LoaiSP) obj;
		return Objects.equals(maLoaiSP, other.maLoaiSP);
	}
	@Override
	public String toString() {
		return "LoaiSP [maLoaiSP=" + maLoaiSP + ", tenLoaiSP=" + tenLoaiSP + "]";
	}
	
	

}
