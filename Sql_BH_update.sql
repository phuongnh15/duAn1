use BanLapTopDell
-- Thay doi cua Cong


-- Thay doi cua Phuong
select mahoadon, kh.makhachhang, kh.ten, kh.sodienthoai, id_nhanvien, ngaythanhtoan, tongtienBanDau, tongkhuyenmai, maVoucher, tongtienSauKM, trangthai from HoaDon hd
join KhachHang kh on kh.makhachhang = hd.makhachhang where trangthai = ?

delete from HoaDonChiTiet where mahoadon = ?
delete from HoaDon where mahoadon = ?

-- Thay doi cua Long


-- Thay doi cua Hien


-- Thay doi cua Linh