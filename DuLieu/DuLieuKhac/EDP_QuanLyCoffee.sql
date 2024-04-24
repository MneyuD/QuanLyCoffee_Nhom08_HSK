
CREATE DATABASE QuanLyCoffee
----drop database QuanLyCoffee
--ALTER DATABASE QuanLyCoffe MODIFY NAME = QuanLyCoffee
----Đổi tên database nha thành QuanLyCoffee

--ALTER DATABASE QuanLyCoffee SET ONLINE
----Nếu bị lỗi (Recover-Peding) thì set database về online
--GO
DROP DATABASE QuanLyCoffee

USE QuanLyCoffee

CREATE TABLE TaiKhoan
	(tenDangNhap CHAR(8) NOT NULL PRIMARY KEY,
	--tenDangNhap phải nhập 8 kí tự
	matKhau NVARCHAR(30) NOT NULL)

CREATE TABLE NhanVien
	(maNV NVARCHAR(20) PRIMARY KEY NOT NULL,
	tenNV NVARCHAR(100) NOT NULL,
	gioiTinh BIT,
	khuVuc NVARCHAR(100),
	luong MONEY,
	tienThuong MONEY,
	soTKNganHang NVARCHAR(20),
	tenDangNhap CHAR(8) REFERENCES TaiKhoan(tenDangNhap))

CREATE TABLE KhachHang
	(maKH NVARCHAR(20) PRIMARY KEY NOT NULL,
	tenKH NVARCHAR(100) NOT NULL,
	ngaySinh DATE,
	gioiTinh BIT,
	sdt VARCHAR(15) NOT NULL,
	diemTichLuy FLOAT)

CREATE TABLE LoaiSP
	(maLoai NVARCHAR(20) PRIMARY KEY NOT NULL,
	tenLoai NVARCHAR(50) NOT NULL)

SELECT * FROM SanPham SP JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai

SELECT * FROM SanPham SP JOIN LoaiSP LSP ON SP.maLoai = LSP.maLoai WHERE tenLoai LIKE N'Cà phê'

CREATE TABLE SanPham
	(maSP NVARCHAR(20) PRIMARY KEY NOT NULL,
	tenSP NVARCHAR(50) NOT NULL,
	kichCo NVARCHAR NOT NULL CONSTRAINT Check_KichCo CHECK (kichCo IN ('S', 'M', 'L')),
	donGia MONEY,
	thue MONEY NOT NULL,
	ngayHetHan DATETIME,
	trangThai BIT NOT NULL,
	maLoai NVARCHAR(20) REFERENCES LoaiSP(maLoai))

CREATE TABLE Ban
	(maBan NVARCHAR(10) PRIMARY KEY NOT NULL,
	soLuongKhach INT,
	trangThai BIT NOT NULL)
	--trangThai: Đã có người khách dùng = 1, còn trống = 0

CREATE TABLE HoaDon
	(maHD NVARCHAR(20) PRIMARY KEY NOT NULL,
	ngayLap DATETIME NOT NULL,
	phuongThucThanhToan NVARCHAR(30) NOT NULL,
	gioVao DATETIME,
	gioRa DATETIME,
	tongTien MONEY,
	maBan NVARCHAR(10) REFERENCES Ban(maBan),
	maNV NVARCHAR(20) REFERENCES NhanVien(maNV),
	maKH NVARCHAR(20) REFERENCES KhachHang(maKH))

CREATE TABLE ChiTietHD
	(maHD NVARCHAR(20) NOT NULL REFERENCES HoaDon(maHD),
	maSP NVARCHAR(20) NOT NULL REFERENCES SanPham(maSP),
	soLuong INT,
	donGia MONEY,
	thanhTien MONEY,
	PRIMARY KEY (maHD, maSP))
GO

--TRIGGER KIỂM TRA ĐĂNG KÝ (CHÈN VÀO BẢNG TaiKhoan)
--CREATE TRIGGER RegisterAccount 
--ON TaiKhoan
--INSTEAD OF INSERT
--AS
--BEGIN
--	SET NOCOUNT ON

--	DECLARE @UserName NVARCHAR(20), @Password NVARCHAR(10)

--	SELECT @UserName = tenDangNhap, @Password = matKhau
--	FROM inserted
	
--	--Kiểm tra tài khoản 8 chữ số
--	IF @UserName NOT LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'
--	BEGIN
--		RAISERROR (N'Tên đăng nhập phải 8 số', 11, 1)
--		ROLLBACK TRANSACTION
--		RETURN
--	END

--	--Độ dài mật khẩu hơn 8
--	IF LEN(@Password) < 8
--	BEGIN
--		RAISERROR (N'Mật khẩu có ít nhất 8 kí tự', 11,2)
--		ROLLBACK TRANSACTION
--		RETURN
--	END

--	--Mật khẩu 1 kí tự in hoa, số, đặt biệt
--	IF NOT (@Password LIKE '%[0-9]%' AND @Password LIKE '%[A-Z]%' AND @Password LIKE '%[!@#$%^&*()_-]%')
--	BEGIN
--		RAISERROR (N'Mật khẩu ít nhất 1 kí tự in hoa, số, đặt biệt', 11, 3)
--		ROLLBACK TRANSACTION
--		RETURN
--	END

--	INSERT TaiKhoan
--	SELECT @UserName , @Password
--	FROM inserted
--END
--GO

INSERT TaiKhoan VALUES ('22716371', 'Giang188@'), ('22721461', 'Duyen123@'), ('22674951', 'Chuong123@'), ('22728821', 'NAnh123@')

INSERT NhanVien VALUES 
('0704240001', N'Huỳnh Thanh Giang', 1, 'Khu vực trong nhà', 5000000, 1000000, '12345678', '22716371'),
('0704240002', N'Nguyễn Thị Mỹ Duyên', 0, 'Khu vực ngoài trời', 4800000, 900000, '87654321', '22721461'),
('0704240003', N'Phan Khánh Chương', 1, 'Khu quầy', 5500000, 1200000, '13579246', '22674951'),
('0704240004', N'Dương Nhật Anh', 1, 'Khu vực trong nhà', 5200000, 1100000, '98765432', '22728821')

DELETE FROM NhanVien
DELETE FROM HoaDon
DELETE FROM ChiTietHD

INSERT LoaiSP VALUES 
('LSP0001', N'Cà phê'),
('LSP0002', N'Trà trái cây'),
('LSP0003', N'Trà sữa'),
('LSP0004', N'Sinh tố'),
('LSP0005', N'Thức uống có ga')

INSERT KhachHang VALUES
('20040001', N'Huỳnh Thanh Giang', '2004-08-18', 1, '123456789', 0),
('20040002', N'Nguyễn Thị Mỹ Duyên', '2004-08-18', 0, '123456789', 10),
('20040003', N'Phan Khánh Chương', '2004-08-18', 1, '123456789', 20),
('20040004', N'Dương Nhật Anh', '2004-08-18', 1, '123456789', 0)

INSERT SanPham VALUES 
('20240419SP000001', N'Cà phê sữa đá', 'S', 20000, 0.1, GETDATE() , 1, 'LSP0001'),
('20240419SP000002', N'Trà sữa truyền thống', 'M', 25000, 0.1, GETDATE() , 1, 'LSP0003'),
('20240419SP000003', N'Sinh tố bơ', 'M', 40000, 0.1, GETDATE() , 0, 'LSP0004'),
('20240419SP000004', N'Trà dâu', 'M', 30000, 0.1, GETDATE() , 1, 'LSP0002'),
('20240419SP000005', N'Trà ổi', 'M', 30000, 0.1, GETDATE() , 0, 'LSP0002'),
('20240419SP000006', N'Bạc xỉu', 'S', 20000, 0.1, GETDATE() , 1, 'LSP0001'),
('20240419SP000007', N'Cà phê đen', 'S', 20000, 0.1, NULL, 1, 'LSP0001')

DELETE
FROM SanPham
WHERE [maSP] LIKE '20240419SP000007'

INSERT Ban VALUES
('B00001', 6, 1),
('B00002', 4, 1),
('B00003', 2, 0),
('B00004', 4, 1)

SELECT * FROM HoaDon
INSERT HoaDon VALUES 
('20040420HD000001', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 'B00002', '0704240001', '20040002'),
('20040420HD000002', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 'B00001', '0704240002', '20040001')

SELECT * FROM SanPham
SELECT * FROM ChiTietHD
INSERT ChiTietHD VALUES
('20040420HD000001', '20240419SP000001', 1),
('20040420HD000001', '20240419SP000002', 1),
('20040420HD000001', '20240419SP000003', 1),
('20040420HD000002', '20240419SP000006', 2),
('20040420HD000002', '20240419SP000005', 1)

sp_helpconstraint ChiTietHD

--SELECT * FROM HoaDon HD 
--	JOIN ChiTietHD CTHD ON HD.maHD = CTHD.maHD
--	JOIN SanPham SP ON SP.maSP = CTHD.maSP
--	JOIN KhachHang KH ON KH.maKH = HD.maKH
--	JOIN NhanVien NV ON NV.maNV = HD.maNV
--	JOIN Ban B ON B.maBan = HD.maBan

--SELECT * FROM SanPham
--SELECT * FROM NhanVien
--DELETE FROM SanPham

--SELECT * FROM LoaiSP

--ALTER TABLE HoaDon
--ADD tongTien MONEY

--ALTER TABLE ChiTietHD
--ADD donGia MONEY, thanhTien MONEY
--SELECT * FROM HoaDon

--SELECT SUM([tongTien]) AS TongTien
--FROM HoaDon
--WHERE YEAR(ngayLap) = YEAR(GETDATE()) AND MONTH(ngayLap) = MONTH(GETDATE())
--GROUP BY YEAR(ngayLap), MONTH(ngayLap)

--DECLARE @ngayLap DATETIME
--SELECT @ngayLap = ngayLap FROM HoaDon WHERE maHD = '20040420HD000001'
--PRINT CONVERT(DATE, GETDATE())

INSERT HoaDon VALUES 
('20040420HD000003', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 'B00002', '0704240001', '20040002', 300),
('20040420HD000004', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 'B00002', '0704240001', '20040002', 200),
('20040420HD000005', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 'B00001', '0704240001', '20040003', 500)

GO

--DECLARE @NgayHienTai NVARCHAR(8), @MaNhanVien NVARCHAR(20), @SoNgauNhien NVARCHAR(6), @MaHoaDon NVARCHAR(40)

--SET @NgayHienTai = CONVERT(NVARCHAR(8), GETDATE(), 112)

--SELECT @MaNhanVien = '0704240001'

--SET @SoNgauNhien = CAST(ROUND(RAND() * 999999, 0) AS NVARCHAR(6))
--SET @SoNgauNhien = RIGHT('000000' + @SoNgauNhien, 6)

--SET @MaHoaDon = @NgayHienTai + @MaNhanVien + @SoNgauNhien

--PRINT @MaHoaDon
--GO

--DECLARE @NgayHienTai NVARCHAR(8), @SoCuoi NVARCHAR(6), @MaHoaDon NVARCHAR(40)

--SET @NgayHienTai = CONVERT(NVARCHAR(8), GETDATE(), 112)

--SELECT @SoCuoi = ISNULL(MAX(CAST(RIGHT(maHD, 6) AS INT)), 0)
--FROM HoaDon 

--PRINT @SoCuoi

--SET @MaHoaDon = @NgayHienTai + @SoCuoi

--PRINT @MaHoaDon
--GO

--DECLARE @TuNgay NVARCHAR(10), @DenNgay NVARCHAR(10)
--SET @TuNgay = '24/3/2024'
--SET @DenNgay = '24/4/2024'

--PRINT CONVERT(NVARCHAR(10), CONVERT(DATE, @TuNgay, 103), 103) + ' - ' + CONVERT(NVARCHAR(10), CONVERT(DATE, @DenNgay, 103), 103)

--PRINT CONVERT(DATE, @TuNgay) + CONVERT(DATE, @DenNgay)
--GO

--DECLARE @TuNgay NVARCHAR(10), @DenNgay NVARCHAR(10)
--SET @TuNgay = '22/3/2024'
--SET @DenNgay = '24/4/2024'

--SELECT SUM([tongTien]) AS TongTien 
--FROM HoaDon 
--WHERE CONVERT(DATE, ngayLap, 103) >= CONVERT(DATE, @TuNgay, 103) 
--	AND CONVERT(DATE, ngayLap, 103) <= CONVERT(DATE, @DenNgay, 103)
----GROUP BY CONVERT(DATE, ngayLap, 103)
--GO


