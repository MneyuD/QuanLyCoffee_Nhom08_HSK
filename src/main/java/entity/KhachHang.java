/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author nguye
 */
public class KhachHang {

    private String tenKH;
    private LocalDate ngaySinh;
    private boolean gioiTinh;
    private String sdt;
    private int diemTichLuy;

    public KhachHang(String tenKH, LocalDate ngaySinh, boolean gioiTinh, String sdt, int diemTichLuy) {
        this.tenKH = tenKH;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.diemTichLuy = diemTichLuy;
    }

    public KhachHang(String tenKH, int diemTichLuy) {
        this.tenKH = tenKH;
        this.diemTichLuy = diemTichLuy;
    }

    /*
     * ĐIỂM TÍCH LŨY LÀ THUOJC TÍNH DẪN XUẤT => VIẾT PHƯƠNG THỨC => CÁCH TÍNH ĐIỂM TÍCH LŨY NHƯ NÀO ?
     */

    public KhachHang(String sdt) {
        this.sdt = sdt;
    }

    public String getTenKH() {
        return tenKH;
    }

    /**
     * @param tenKH the tenKH to set
     */
    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
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
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof KhachHang khachHang)) return false;
        return Objects.equals(sdt, khachHang.sdt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sdt);
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                ", tenKH='" + tenKH + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", gioiTinh=" + gioiTinh +
                ", sdt='" + sdt + '\'' +
                ", diemTichLuy=" + diemTichLuy +
                '}';
    }

    public int getDiemTichLuy() {
        return diemTichLuy;
    }
}
