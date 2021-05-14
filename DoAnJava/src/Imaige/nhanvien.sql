-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 21, 2020 lúc 08:04 PM
-- Phiên bản máy phục vụ: 10.4.11-MariaDB
-- Phiên bản PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `banhang`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nhanvien`
--

CREATE TABLE `nhanvien` (
  `MaNV` varchar(3) COLLATE utf8_vietnamese_ci NOT NULL,
  `TenNV` varchar(30) COLLATE utf8_vietnamese_ci NOT NULL,
  `DiaChiNV` varchar(50) COLLATE utf8_vietnamese_ci NOT NULL,
  `NgaySinh` date NOT NULL,
  `MucLuong` int(12) NOT NULL,
  `NgayVaoLam` date NOT NULL,
  `SDT` varchar(10) COLLATE utf8_vietnamese_ci NOT NULL,
  `GioiTinh` enum('m','f') COLLATE utf8_vietnamese_ci NOT NULL,
  `CMND` varchar(12) COLLATE utf8_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `nhanvien`
--

INSERT INTO `nhanvien` (`MaNV`, `TenNV`, `DiaChiNV`, `NgaySinh`, `MucLuong`, `NgayVaoLam`, `SDT`, `GioiTinh`, `CMND`) VALUES
('001', 'Nguyễn Văn Chinh', '90 CMT8,P.15,Q.3,TP.HCM', '2000-04-10', 1, '2020-03-18', '0909477738', 'm', '068463792746'),
('002', 'Nguyễn Văn Thành', '120 Tô Hiến Thành,P.12,Q.5,TP.HCM', '2000-04-15', 5, '2017-05-18', '0909876756', 'f', '098765435689'),
('003', 'Lương Vĩ Lâm', '229 Tân Kỳ Tân Quý,P.Tân Sơn Nhì,Q.Tân Phú,TP.HCM', '2000-08-17', 4, '2020-07-16', '0909822271', 'm', '123456789011'),
('004', 'Nguyễn Thế Phong', '91 CMT8,P.15,Q.3,TP.HCM', '1990-06-18', 2, '2005-08-29', '0909455538', 'm', '123456789012'),
('005', 'Nguyễn Văn Trỗi', '92 CMT8,P.15,Q.3,TP.HCM', '1989-09-17', 10, '2006-08-18', '0909755529', 'm', '123456789013'),
('006', 'Trần Hưng Đạo', '93 CMT8,P.15,Q.3,TP.HCM', '1987-06-29', 5, '2016-07-18', '0947833327', 'm', '123456789014'),
('007', 'Hồ Hảo Hớn', '94 CMT8,P.15,Q.3,TP.HCM', '1969-09-14', 10, '2005-02-18', '0909711128', 'm', '123456789015'),
('008', 'Ngô Bá Khá', '95 CMT8,P.15,Q.3,TP.HCM', '1998-08-12', 15, '2017-08-28', '0906766617', 'm', '123456789016'),
('009', 'Lý Thường Kiệt', '96 CMT8,P.15,Q.3,TP.HCM', '1969-02-15', 18, '2002-04-18', '0909511134', 'm', '123456789017'),
('010', 'Võ Nguyên Giáp', '97 CMT8,P.15,Q.3,TP.HCM', '1982-03-18', 15, '2004-08-19', '0909855547', 'm', '123456789018'),
('011', 'Nhữ Quốc Huy', '98 CMT8,P.15,Q.3,TP.HCM', '2001-09-28', 2, '2020-07-10', '0909574728', 'm', '123456789019'),
('012', 'Thái Phụng Nghi', '99 CMT8,P.15,Q.3,TP.HCM', '2000-02-17', 5, '2017-03-10', '0909911127', 'f', '123456789020'),
('013', 'Võ Chiêu Vương', '21 CMT8,P.15,Q.3,TP.HCM', '2000-12-24', 500000, '2018-12-05', '0909967457', 'f', '123459020'),
('014', 'Thái Phụng Nghi', '99 CMT8,P.15,Q.3,TP.HCM', '2000-02-17', 5, '2017-03-10', '0909911127', 'f', '123456789020'),
('015', 'Giang The Phong', '14D/30 Nguyễn duy ', '2000-03-27', 70000, '2020-06-12', '0909033217', 'm', '312447995'),
('016', 'Đinh Phong Bảo', '100 CMT8,P.15,Q.3,TP.HCM', '2000-03-28', 50000, '2020-06-09', '0909033218', 'm', '71805144'),
('017', 'Đinh Thị Quỳnh Dao', '101 CMT8,P.15,Q.3,TP.HCM', '2000-09-21', 700, '2020-06-28', '0909033219', 'f', '567123895'),
('018', 'Đinh Phong', '102 CMT8,P.15,Q.3,TP.HCM', '2000-10-27', 60000, '2020-06-19', '0909033220', 'm', '673451238'),
('019', 'Đinh Phong Bảo', '103 CMT8,P.15,Q.3,TP.HCM', '2000-08-27', 70000, '2020-06-09', '0909033230', 'm', '312456127'),
('020', 'Đinh kiên', '104 CMT8,P.15,Q.3,TP.HCM', '2000-12-27', 70000, '2019-10-09', '0909033265', 'm', '622009875'),
('021', 'Đinh Kiên Định', '120 CMT8,P.15,Q.3,TP.HCM', '2000-03-30', 60000, '2018-06-13', '0989033217', 'm', '712565936'),
('022', 'Lê Phạm Kim Ngân', '1199/64 PTH,P.5,Q.8,TP.HCM', '2000-10-18', 12000000, '2020-09-18', '0982170097', 'm', '26007169'),
('023', 'Lê Kim Ngân', '100 PTH,P.5,Q.8,TP.HCM', '2000-02-26', 700000, '2020-12-09', '0909033245', 'f', '567843987'),
('024', 'Kim Nga', '105 BMT,P.5,Q.8,TP.HCM', '2000-01-31', 80000, '2019-06-09', '0956733217', 'f', '567348902'),
('025', 'Thiên Lý', '67 CMT8,P.15,Q.3,TP.HCM', '1974-03-27', 800000, '2003-05-13', '0895467878', 'f', '009856783'),
('026', 'Thanh Sơn', '62 CMT8,P.15,Q.3,TP.HCM', '2000-07-19', 300000, '2018-08-08', '0900967845', 'm', '556674235'),
('027', 'Viết Phú', '65a CMT8,P.15,Q.3,TP.HCM', '1999-09-06', 80000, '2015-11-17', '0983567366', 'm', '453567286'),
('028', 'Phúc Vũ', '55 CMT8,P.15,Q.3,TP.HCM', '1998-11-26', 700000, '2015-08-07', '0909035643', 'm', '764537289'),
('029', 'Minh Châu', '46 CMT8,P.15,Q.3,TP.HCM', '2000-11-19', 300000, '2018-12-08', '0909033678', 'f', '234561734'),
('030', 'Thế Loan', '60 CMT8,P.15,Q.3,TP.HCM', '2000-10-29', 70000, '2018-11-27', '0909033543', 'f', '423618745');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `nhanvien`
--
ALTER TABLE `nhanvien`
  ADD PRIMARY KEY (`MaNV`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
