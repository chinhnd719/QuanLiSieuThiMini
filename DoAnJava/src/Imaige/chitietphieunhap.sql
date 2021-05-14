-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th6 21, 2020 lúc 08:05 PM
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
-- Cấu trúc bảng cho bảng `chitietphieunhap`
--

CREATE TABLE `chitietphieunhap` (
  `MaPN` varchar(3) COLLATE utf8_vietnamese_ci NOT NULL,
  `MaMatHang` varchar(3) COLLATE utf8_vietnamese_ci NOT NULL,
  `SoLuong` int(5) NOT NULL,
  `GiaNhap` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `chitietphieunhap`
--

INSERT INTO `chitietphieunhap` (`MaPN`, `MaMatHang`, `SoLuong`, `GiaNhap`) VALUES
('101', '301', 20, 100000),
('102', '302', 40, 200000),
('103', '302', 40, 200000),
('104', '303', 40, 200000),
('105', '301', 400, 99999),
('106', '302', 499, 88888),
('107', '301', 499, 2345),
('108', '302', 512, 234512),
('109', '301', 123, 354352),
('110', '301', 123, 354352),
('111', '303', 156, 181000),
('112', '303', 152, 181001),
('113', '301', 158, 181002),
('114', '302', 159, 181005),
('115', '303', 156, 181007),
('116', '302', 150, 181009),
('117', '303', 154, 181003),
('118', '301', 155, 181004),
('119', '303', 157, 181006),
('120', '302', 158, 181008),
('121', '303', 151, 181008),
('122', '301', 153, 181010),
('123', '303', 150, 1018),
('127', '301', 164, 221003),
('128', '302', 165, 221004),
('129', '303', 166, 221005),
('130', '301', 167, 221006);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD KEY `FK_MaPN1` (`MaPN`),
  ADD KEY `FK_MaMatHang` (`MaMatHang`);

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `chitietphieunhap`
--
ALTER TABLE `chitietphieunhap`
  ADD CONSTRAINT `FK_MaMatHang` FOREIGN KEY (`MaMatHang`) REFERENCES `mathang` (`MaMatHang`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `FK_MaPN1` FOREIGN KEY (`MaPN`) REFERENCES `phieunhaphang` (`MaPN`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
