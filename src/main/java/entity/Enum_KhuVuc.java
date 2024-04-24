package entity;

public enum Enum_KhuVuc {
	
	TRONG_NHA("Khu vực trong nhà"),
	NGOAI_TROI("Khu vực ngoài trời"),
	QUAY("Khu vực quầy");
	
	
	private String khuVuc;

	 Enum_KhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}

	/**
	 * @return the khuVuc
	 */
	public String getKhuVuc() {
		return khuVuc;
	}

	/**
	 * @param khuVuc the khuVuc to set
	 */
	public void setKhuVuc(String khuVuc) {
		this.khuVuc = khuVuc;
	}

	@Override
	public String toString() {
		return khuVuc;
	}
	
	

}
