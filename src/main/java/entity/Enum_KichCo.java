package entity;

public enum Enum_KichCo {
	
	S("S"),M("M"),L("L");
	
	private String kichCo;

	Enum_KichCo(String kichCo) {
		this.kichCo = kichCo;
	}

	/**
	 * @return the kichCo
	 */
	public String getKichCo() {
		return kichCo;
	}

	/**
	 * @param kichCo the kichCo to set
	 */
	public void setKichCo(String kichCo) {
		this.kichCo = kichCo;
	}

	@Override
	public String toString() {
		return kichCo;
	}
}
