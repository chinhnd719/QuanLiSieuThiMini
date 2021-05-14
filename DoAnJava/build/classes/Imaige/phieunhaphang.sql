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
-- Cấu trúc bảng cho bảng `phieunhaphang`
--

CREATE TABLE `phieunhaphang` (
  `MaPN` varchar(3) COLLATE utf8_vietnamese_ci NOT NULL,
  `MaNCC` varchar(3) COLLATE utf8_vietnamese_ci NOT NULL,
  `MaNV` varchar(3) COLLATE utf8_vietnamese_ci NOT NULL,
  `NgayNhap` date NOT NULL,
  `TongTien` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_vietnamese_ci;

--
-- Đang đổ dữ liệu cho bảng `phieunhaphang`
--

INSERT INTO `phieunhaphang` (`MaPN`, `MaNCC`, `MaNV`, `NgayNhap`, `TongTien`) VALUES
('101', '201', '001', '2020-02-28', 1000),
('102', '201', '001', '2019-06-17', 5888888),
('103', '202', '001', '2018-04-28', 79999),
('104', '203', '001', '2018-05-18', 10667535),
('105', '204', '002', '2017-06-12', 32345678),
('106', '203', '002', '2017-06-12', 54567),
('107', '202', '002', '2017-01-23', 4876543),
('108', '203', '002', '2017-08-15', 234567),
('109', '202', '003', '2018-01-27', 93645467),
('110', '203', '003', '2018-07-01', 457634245),
('111', '205', '003', '2019-02-28', 25343467),
('112', '204', '003', '2018-05-23', 3786),
('113', '205', '004', '2016-03-17', 10),
('114', '206', '004', '2016-03-27', 3),
('115', '205', '006', '2015-09-15', 4),
('116', '204', '007', '2015-12-30', 5),
('117', '208', '009', '2017-10-23', 10),
('118', '209', '010', '2018-11-25', 15),
('119', '207', '012', '2016-03-16', 73456),
('120', '206', '011', '2016-12-27', 48765),
('121', '210', '008', '2017-06-12', 98767),
('122', '210', '009', '2016-02-10', 287654),
('123', '208', '005', '2017-06-12', 9994),
('127', '204', '007', '2015-12-30', 50000),
('128', '208', '009', '2015-12-22', 99999),
('129', '203', '002', '2017-08-15', 2000000),
('130', '203', '002', '2017-08-15', 20000);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `phieunhaphang`
--
ALTER TABLE `phieunhaphang`
  ADD PRIMARY KEY (`MaPN`),
  ADD KEY `FK_MaNCC1` (`MaNCC`) USING BTREE,
  ADD KEY `FK_MaNV2` (`MaNV`) USING BTREE;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `phieunhaphang`
--
ALTER TABLE `phieunhaphang`
  ADD CONSTRAINT `MaNCC` FOREIGN KEY (`MaNCC`) REFERENCES `nhacungcap` (`MaNCC`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `MaNV` FOREIGN KEY (`MaNV`) REFERENCES `nhanvien` (`MaNV`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
