/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import Model.Model_HoaDon;
import java.sql.*;
import java.util.ArrayList;

public class Repository_HoaDon {
    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    private String sql = null;
    
    public ArrayList<Model.Model_HoaDon> getAll(){
        ArrayList<Model.Model_HoaDon> list_HD = new ArrayList<>();
        sql = "select mahoadon, kh.makhachhang, kh.ten, kh.sodienthoai, id_nhanvien, ngaythanhtoan, tongtienBanDau, tongkhuyenmai, maVoucher, tongtienSauKM, trangthai from HoaDon hd\n" +
"join KhachHang kh on kh.makhachhang = hd.makhachhang";
        try {
            con = DBConnect.DBConnect_Phuong.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String tenKH = rs.getString(3);
                String sdt = rs.getString(4);
                String id_NV = rs.getString(5);
                String ngaythanhtoan = rs.getString(6);
                double tongtienBD = rs.getDouble(7);
                double tongKM = rs.getDouble(8);
                String maVoucher = rs.getString(9);
                double tongtiensauKM = rs.getDouble(10);
                boolean tt = rs.getBoolean(11);
                Model.Model_HoaDon hd = new Model_HoaDon(maHD, maKH, tenKH, sdt, id_NV, ngaythanhtoan, maVoucher, tongtienBD, tongKM, tongtiensauKM, tt);
                list_HD.add(hd);
            }
            return list_HD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Model.Model_HoaDon> loc(boolean trangthai){
        ArrayList<Model.Model_HoaDon> list_HD = new ArrayList<>();
        sql = "select mahoadon, kh.makhachhang, kh.ten, kh.sodienthoai, id_nhanvien, ngaythanhtoan, tongtienBanDau, tongkhuyenmai, maVoucher, tongtienSauKM, trangthai from HoaDon hd\n" +
"join KhachHang kh on kh.makhachhang = hd.makhachhang where trangthai = ?";
        try {
            con = DBConnect.DBConnect_Phuong.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, trangthai);
            rs = ps.executeQuery();
            while(rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String tenKH = rs.getString(3);
                String sdt = rs.getString(4);
                String id_NV = rs.getString(5);
                String ngaythanhtoan = rs.getString(6);
                double tongtienBD = rs.getDouble(7);
                double tongKM = rs.getDouble(8);
                String maVoucher = rs.getString(9);
                double tongtiensauKM = rs.getDouble(10);
                boolean tt = rs.getBoolean(11);
                Model.Model_HoaDon hd = new Model_HoaDon(maHD, maKH, tenKH, sdt, id_NV, ngaythanhtoan, maVoucher, tongtienBD, tongKM, tongtiensauKM, tt);
                list_HD.add(hd);
            }
            return list_HD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public int xoa(String ma_xoa, boolean tt) {
        try {
            sql = "delete from HoaDonChiTiet where mahoadon = ?\n" +
"delete from HoaDon where mahoadon = ?";
            con = DBConnect.DBConnect_Phuong.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, ma_xoa);
            ps.setObject(2, ma_xoa);
            return ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    
    public ArrayList<Model.Model_HoaDon> timkiemHD(String macantim){
        ArrayList<Model.Model_HoaDon> list_HD = new ArrayList<>();
        sql = "select mahoadon, kh.makhachhang, kh.ten, kh.sodienthoai, id_nhanvien, ngaythanhtoan, tongtienBanDau, tongkhuyenmai, maVoucher, tongtienSauKM, trangthai from HoaDon hd\n" +
"join KhachHang kh on kh.makhachhang = hd.makhachhang where mahoadon = ?";
        try {
            con = DBConnect.DBConnect_Phuong.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, macantim);
            rs = ps.executeQuery();
            while(rs.next()) {
                String maHD = rs.getString(1);
                String maKH = rs.getString(2);
                String tenKH = rs.getString(3);
                String sdt = rs.getString(4);
                String id_NV = rs.getString(5);
                String ngaythanhtoan = rs.getString(6);
                double tongtienBD = rs.getDouble(7);
                double tongKM = rs.getDouble(8);
                String maVoucher = rs.getString(9);
                double tongtiensauKM = rs.getDouble(10);
                boolean tt = rs.getBoolean(11);
                Model.Model_HoaDon hd = new Model_HoaDon(maHD, maKH, tenKH, sdt, id_NV, ngaythanhtoan, maVoucher, tongtienBD, tongKM, tongtiensauKM, tt);
                list_HD.add(hd);
            }
            return list_HD;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
