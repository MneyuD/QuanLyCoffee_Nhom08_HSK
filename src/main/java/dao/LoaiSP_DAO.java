package dao;

import connect.ConnectDB;
import entity.LoaiSP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LoaiSP_DAO {
    public LoaiSP_DAO() {

    }

    public ArrayList<LoaiSP> getAllProductType() {
        ArrayList<LoaiSP> loaiList = new ArrayList<LoaiSP>();
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement("SELECT * FROM LoaiSP");
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                String maLoaiSP = rs.getString("maLoai");
                String tenLoai = rs.getString("tenLoai");

                LoaiSP lsp = new LoaiSP(maLoaiSP, tenLoai);
                loaiList.add(lsp);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return loaiList;
    }

    public String getProductType_ByName(String tenLoai) {
        String maLoai = null;
        ConnectDB.getInstance();
        Connection con = ConnectDB.getConnection();
        try {
            PreparedStatement sm = con.prepareStatement("SELECT maLoai FROM LoaiSP WHERE tenLoai = ?");
            sm.setString(1, tenLoai);
            ResultSet rs = sm.executeQuery();

            while(rs.next()) {
                maLoai = rs.getString("maLoai");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return maLoai;
    }

    /*public static void main(String[] args) {
        ConnectDB.getInstance().connect();
        System.out.println(new LoaiSP_DAO().getProductType_ByName("Trà sữa"));
    }*/
}