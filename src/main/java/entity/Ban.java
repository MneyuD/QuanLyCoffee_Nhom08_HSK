package entity;

import java.util.Objects;

public class Ban {
    private String maBan;
    private int soLuongKhach;
    private boolean trangThaiBan;

    public Ban(String maBan) {
        this.maBan = maBan;
    }
    public Ban(String maBan, int soLuongKhach, boolean trangThaiBan) {
        this.maBan = maBan;
        this.soLuongKhach = soLuongKhach;
        this.trangThaiBan = trangThaiBan;
    }

    public Ban() {

    }

    public String getMaBan() {
        return maBan;
    }

    public void setMaBan(String maBan) {
        this.maBan = maBan;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public boolean isTrangThaiBan() {
        return trangThaiBan;
    }

    public void setTrangThaiBan(boolean trangThaiBan) {
        this.trangThaiBan = trangThaiBan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ban ban)) return false;
        return Objects.equals(maBan, ban.maBan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maBan);
    }

    @Override
    public String toString() {
        return "Ban{" +
                "maBan='" + maBan + '\'' +
                ", soLuongKhach=" + soLuongKhach +
                ", trangThaiBan=" + trangThaiBan +
                '}';
    }
}
