package entity;

public enum Enum_PhuongThucTT {
	TIENMAT("Tiền mặt"), CHUYENKHOAN("Chuyển khoản");
	
	private String pttt ;

	 Enum_PhuongThucTT(String pttt) {
		this.pttt = pttt;
	}

	/**
	 * @return the pttt
	 */
	public String getPttt() {
		return pttt;
	}

	/**
	 * @param pttt the pttt to set
	 */
	public void setPttt(String pttt) {
		this.pttt = pttt;
	}

	@Override
	public String toString() {
		return pttt;
	} 

}
