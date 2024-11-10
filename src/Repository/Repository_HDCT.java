/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Model_HDCT;
import java.sql.*;
import java.util.ArrayList;

public class Repository_HDCT {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model.Model_HDCT> getAll(){
        ArrayList<Model.Model_HDCT> list_HDCT = new ArrayList<>();
        sql = "select mahoadonct, mahoadon, masanpham, imei, dongia, soluong from HoaDonChiTiet";
        try {
            con = DBConnect.DBConnect_Phuong.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                int maHDCT = rs.getInt(1);
                String maHD = rs.getString(2);
                String maSP = rs.getString(3);
                String imei = rs.getString(4);
                double dongia = rs.getDouble(5);
                int solg = rs.getInt(6);
                Model.Model_HDCT hdct = new Model_HDCT(maHDCT, maHD, maSP, imei, solg, dongia);
                list_HDCT.add(hdct);
            }
            return list_HDCT;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Model.Model_HDCT> timkiemHDCT(String maHDcantim){
        ArrayList<Model.Model_HDCT> list_HDCT = new ArrayList<>();
        sql = "select mahoadonct, mahoadon, masanpham, imei, dongia, soluong from HoaDonChiTiet where mahoadon = ?";
        try {
            con = DBConnect.DBConnect_Phuong.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, maHDcantim);
            rs = ps.executeQuery();
            while(rs.next()) {
                int maHDCT = rs.getInt(1);
                String maHD = rs.getString(2);
                String maSP = rs.getString(3);
                String imei = rs.getString(4);
                double dongia = rs.getDouble(5);
                int solg = rs.getInt(6);
                Model.Model_HDCT hdct = new Model_HDCT(maHDCT, maHD, maSP, imei, solg, dongia);
                list_HDCT.add(hdct);
            }
            return list_HDCT;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
