--ALTER DATABASE QuanLyCoffee SET ONLINE
----Nếu bị lỗi (Recover-Peding) thì set database về online
--GO
--DROP DATABASE QuanLyCoffee
--sp_who 
--KILL 53

--CONTENTS PAGE.
--1.CREATE DATABASE, TABLE
--2.INSERT TABLE
--3.TRIGGER
	--TRIGGER Ktra TaiKhoan theo đúng định dạng
	--TRIGGER Tạo auto tạo ID cho sản phẩm (*Chú ý: Chèn một ID random để 
										--sau đó trigger sẽ cập nhật lại ID tự dộng)

--SCRIPT
--1.CREATE DATABASE
CREATE DATABASE QuanLyCoffee

USE QuanLyCoffee

--CREATE TABLE
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


--2. INSERT TABLE
INSERT TaiKhoan VALUES ('22716371', 'Giang188@'), ('22721461', 'Duyen123@'), ('22674951', 'Chuong123@'), ('22728821', 'NAnh123@')

INSERT NhanVien VALUES 
('07042024NV0001', N'Huỳnh Thanh Giang', 1, N'Khu vực trong nhà', 5000000, 1000000, '12345678', '22716371'),
('07042024NV0002', N'Nguyễn Thị Mỹ Duyên', 0, N'Khu vực ngoài trời', 4800000, 900000, '87654321', '22721461'),
('07042024NV0003', N'Phan Khánh Chương', 1, N'Khu quầy', 5500000, 1200000, '13579246', '22674951'),
('07042024NV0004', N'Dương Nhật Anh', 1, N'Khu vực trong nhà', 5200000, 1100000, '98765432', '22728821')

INSERT LoaiSP VALUES 
('LSP0001', N'Cà phê'),
('LSP0002', N'Trà trái cây'),
('LSP0003', N'Trà sữa'),
('LSP0004', N'Sinh tố'),
('LSP0005', N'Thức uống có ga')

INSERT KhachHang VALUES
('2004KH0001', N'Huỳnh Thanh Giang', '2004-08-18', 1, '123456789', 0),
('2004KH0002', N'Nguyễn Thị Mỹ Duyên', '2004-08-18', 0, '123456789', 10),
('2004KH0003', N'Phan Khánh Chương', '2004-08-18', 1, '123456789', 20),
('2004KH0004', N'Dương Nhật Anh', '2004-08-18', 1, '123456789', 0)

INSERT SanPham VALUES 
('20240419SP000001', N'Cà phê sữa đá', 'S', 20000, 0.1, GETDATE() , 1, 'LSP0001'),
('20240419SP000002', N'Trà sữa truyền thống', 'M', 25000, 0.1, GETDATE() , 1, 'LSP0003'),
('20240419SP000003', N'Sinh tố bơ', 'M', 40000, 0.1, GETDATE() , 0, 'LSP0004'),
('20240419SP000004', N'Trà dâu', 'M', 30000, 0.1, GETDATE() , 1, 'LSP0002'),
('20240419SP000005', N'Trà ổi', 'M', 30000, 0.1, GETDATE() , 0, 'LSP0002'),
('20240419SP000006', N'Bạc xỉu', 'S', 20000, 0.1, GETDATE() , 1, 'LSP0001'),
('20240419SP000007', N'Cà phê đen', 'S', 20000, 0.1, NULL, 1, 'LSP0001')

INSERT Ban VALUES
('B00001', 6, 1),
('B00002', 4, 1),
('B00003', 2, 0),
('B00004', 4, 1)

INSERT HoaDon VALUES 
('20040420HD000001', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 100, 'B00002', '07042024NV0001', '2004KH0002')
,('20040420HD000002', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 200, 'B00001', '07042024NV0002', '2004KH0001')
,('20040420HD000003', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 300,  'B00002', '0704240001', '20040002'),
('20040420HD000003', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 300,  'B00002', '07042024NV0001', '2004KH0002')
,('20040420HD000004', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 200, 'B00002', '07042024NV0004', '2004KH0002')
,('20040420HD000005', GETDATE(), N'Chuyển khoản', GETDATE(), GETDATE(), 500, 'B00001', '07042024NV0003', '2004KH0003')
GO

INSERT ChiTietHD VALUES
('20240426HD000001', '20240419SP000001', 1, 0, 0),
('20240426HD000001', '20240419SP000002', 1, 0, 0),
('20240426HD000001', '20240419SP000003', 1, 0, 0),
('20240426HD000002', '20240419SP000006', 2, 0, 0),
('20240426HD000002', '20240419SP000005', 1, 0 ,0),
('20240426HD000003', '20240419SP000005', 3, 0, 0),
('20240426HD000003', '20240419SP000002', 4, 0, 0),
('20240426HD000004', '20240419SP000007', 2, 0, 0),
('20240426HD000005', '20240419SP000001', 1, 0, 0)
GO


--3. TRIGGER
--TRIGGER KIỂM TRA ĐĂNG KÝ (CHÈN VÀO BẢNG TaiKhoan)
CREATE TRIGGER RegisterAccount 
ON TaiKhoan
INSTEAD OF INSERT
AS
BEGIN
	SET NOCOUNT ON

	DECLARE @UserName NVARCHAR(20), @Password NVARCHAR(10)

	SELECT @UserName = tenDangNhap, @Password = matKhau
	FROM inserted
	
	--Kiểm tra tài khoản 8 chữ số
	IF @UserName NOT LIKE '[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]'
	BEGIN
		RAISERROR (N'Tên đăng nhập phải 8 số', 11, 1)
		ROLLBACK TRANSACTION
		RETURN
	END

	--Độ dài mật khẩu hơn 8
	IF LEN(@Password) < 8
	BEGIN
		RAISERROR (N'Mật khẩu có ít nhất 8 kí tự', 11,2)
		ROLLBACK TRANSACTION
		RETURN
	END

	--Mật khẩu 1 kí tự in hoa, số, đặt biệt
	IF NOT (@Password LIKE '%[0-9]%' AND @Password LIKE '%[A-Z]%' AND @Password LIKE '%[!@#$%^&*()_-]%')
	BEGIN
		RAISERROR (N'Mật khẩu ít nhất 1 kí tự in hoa, số, đặt biệt', 11, 3)
		ROLLBACK TRANSACTION
		RETURN
	END

	INSERT TaiKhoan
	SELECT @UserName , @Password
	FROM inserted
END
GO

--TRIGGER AUTO CREATE PRODUCT_ID 
CREATE TRIGGER auotoGenerateID_SanPham ON SanPham
AFTER INSERT
AS
BEGIN
	IF EXISTS (SELECT * FROM inserted)
		BEGIN
			DECLARE @NgayHienTai NVARCHAR(8), @SoCuoi NVARCHAR(6), @MaSP NVARCHAR(40)

			SET @NgayHienTai = CONVERT(NVARCHAR(8), GETDATE(), 112)
			
			SELECT @SoCuoi = ISNULL(MAX(CAST(RIGHT(maSP, 6) AS INT)), 0)
			FROM SanPham
			WHERE maSP <> (SELECT maSP FROM inserted)

			DECLARE @ChuoiSo VARCHAR(6)
			SET @ChuoiSo = RIGHT('000000' + CAST(@SoCuoi + 1 AS VARCHAR(6)), 6)

			SET @MaSP = @NgayHienTai + 'SP' + @ChuoiSo

			UPDATE SanPham
			SET maSP = @MaSP
			WHERE maSP = (SELECT maSP FROM inserted)
		END
END
GO

--TRIGGER AUTO CREATE ORDER_ID 
CREATE TRIGGER auotoGenerateID_HoaDon ON HoaDon
AFTER INSERT
AS
BEGIN
	IF EXISTS (SELECT * FROM inserted)
		BEGIN
			DECLARE @NgayHienTai NVARCHAR(8), @SoCuoi NVARCHAR(6), @MaHD NVARCHAR(40)

			SET @NgayHienTai = CONVERT(NVARCHAR(8), GETDATE(), 112)
			
			SELECT @SoCuoi = ISNULL(MAX(CAST(RIGHT(maHD, 6) AS INT)), 0)
			FROM HoaDon
			WHERE maHD <> (SELECT maHD FROM inserted)

			DECLARE @ChuoiSo VARCHAR(6)
			SET @ChuoiSo = RIGHT('000000' + CAST(@SoCuoi + 1 AS VARCHAR(6)), 6)

			SET @MaHD = @NgayHienTai + 'HD' + @ChuoiSo

			UPDATE HoaDon
			SET maHD = @MaHD
			WHERE maHD = (SELECT maHD FROM inserted)
		END
END
GO

--TRIGGER AUTO CREATE EMPLOYEE_ID 
CREATE TRIGGER auotoGenerateID_NhanVien ON NhanVien
AFTER INSERT
AS
BEGIN
	IF EXISTS (SELECT * FROM inserted)
		BEGIN
			DECLARE @NgayHienTai NVARCHAR(8), @SoCuoi NVARCHAR(6), @MaNV NVARCHAR(40)

			SET @NgayHienTai = CONVERT(NVARCHAR(8), GETDATE(), 112)
			
			SELECT @SoCuoi = ISNULL(MAX(CAST(RIGHT(maNV, 6) AS INT)), 0)
			FROM HoaDon
			WHERE maNV <> (SELECT maNV FROM inserted)

			DECLARE @ChuoiSo VARCHAR(6)
			SET @ChuoiSo = RIGHT('000000' + CAST(@SoCuoi + 1 AS VARCHAR(6)), 6)

			SET @MaNV = @NgayHienTai + 'NV' + @ChuoiSo

			UPDATE NhanVien
			SET maNV = @MaNV
			WHERE maNV = (SELECT maNV FROM inserted)
		END
END
GO