-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 13, 2016 at 10:20 AM
-- Server version: 10.1.10-MariaDB
-- PHP Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlsv_ps04107`
--

-- --------------------------------------------------------

--
-- Table structure for table `bangdiem`
--

CREATE TABLE `bangdiem` (
  `MaSV` varchar(10) COLLATE ucs2_vietnamese_ci NOT NULL,
  `Lop` varchar(10) COLLATE ucs2_vietnamese_ci DEFAULT NULL,
  `MonHoc` varchar(50) COLLATE ucs2_vietnamese_ci DEFAULT NULL,
  `MaMon` varchar(10) COLLATE ucs2_vietnamese_ci DEFAULT NULL,
  `GVHD` varchar(50) COLLATE ucs2_vietnamese_ci DEFAULT NULL,
  `DiemLT` double DEFAULT NULL,
  `DiemTH` double DEFAULT NULL,
  `Ass1` double DEFAULT NULL,
  `Ass2` double DEFAULT NULL,
  `DiemBV` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=ucs2 COLLATE=ucs2_vietnamese_ci;

--
-- Dumping data for table `bangdiem`
--

INSERT INTO `bangdiem` (`MaSV`, `Lop`, `MonHoc`, `MaMon`, `GVHD`, `DiemLT`, `DiemTH`, `Ass1`, `Ass2`, `DiemBV`) VALUES
('PS04107', 'PT11302', 'Lap Trinh JAVA 3', 'SOF203', 'Bui Minh Nhut', 10, 10, 9, 10, 10),
('PS04119', 'PT11302', 'Java 3', 'SOF203', 'Nhut', 10, 9, 9.5, 9, 9);

-- --------------------------------------------------------

--
-- Table structure for table `nguoidung`
--

CREATE TABLE `nguoidung` (
  `Username` varchar(50) COLLATE ucs2_vietnamese_ci NOT NULL,
  `Password` varchar(50) COLLATE ucs2_vietnamese_ci DEFAULT NULL,
  `ChucVu` varchar(50) COLLATE ucs2_vietnamese_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=ucs2 COLLATE=ucs2_vietnamese_ci;

--
-- Dumping data for table `nguoidung`
--

INSERT INTO `nguoidung` (`Username`, `Password`, `ChucVu`) VALUES
('admin', '123456', 'admin'),
('daotao', '123456', 'Dao Tao'),
('giaovien', '123456', 'Giao Vien');

-- --------------------------------------------------------

--
-- Table structure for table `sinhvien`
--

CREATE TABLE `sinhvien` (
  `MaSV` varchar(11) COLLATE ucs2_vietnamese_ci NOT NULL,
  `TenSV` varchar(50) COLLATE ucs2_vietnamese_ci NOT NULL,
  `NgaySinh` varchar(2) COLLATE ucs2_vietnamese_ci NOT NULL,
  `ThangSinh` varchar(2) COLLATE ucs2_vietnamese_ci NOT NULL,
  `NamSinh` varchar(4) COLLATE ucs2_vietnamese_ci NOT NULL,
  `GioiTinh` varchar(10) COLLATE ucs2_vietnamese_ci NOT NULL,
  `SDT` varchar(11) COLLATE ucs2_vietnamese_ci NOT NULL,
  `DiaChi` varchar(100) COLLATE ucs2_vietnamese_ci NOT NULL,
  `Khoa` varchar(11) COLLATE ucs2_vietnamese_ci NOT NULL,
  `ChuyenNganh` varchar(50) COLLATE ucs2_vietnamese_ci NOT NULL,
  `CMT` varchar(12) COLLATE ucs2_vietnamese_ci NOT NULL,
  `NgayCap` varchar(4) COLLATE ucs2_vietnamese_ci NOT NULL,
  `NoiCap` varchar(50) COLLATE ucs2_vietnamese_ci NOT NULL,
  `NgayNhapHoc` varchar(4) COLLATE ucs2_vietnamese_ci NOT NULL,
  `TrangThai` varchar(10) COLLATE ucs2_vietnamese_ci NOT NULL,
  `HocKi` int(11) NOT NULL,
  `HinhAnh` varchar(500) CHARACTER SET utf32 COLLATE utf32_vietnamese_ci NOT NULL,
  `Email` varchar(50) COLLATE ucs2_vietnamese_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=ucs2 COLLATE=ucs2_vietnamese_ci;

--
-- Dumping data for table `sinhvien`
--

INSERT INTO `sinhvien` (`MaSV`, `TenSV`, `NgaySinh`, `ThangSinh`, `NamSinh`, `GioiTinh`, `SDT`, `DiaChi`, `Khoa`, `ChuyenNganh`, `CMT`, `NgayCap`, `NoiCap`, `NgayNhapHoc`, `TrangThai`, `HocKi`, `HinhAnh`, `Email`) VALUES
('PS04107', 'Le Cong Hau', '26', '8', '1994', 'Nam ', '0946627374', 'Vinh Thuan-Kien Giang', '11.3v1', 'Ung Dung Phan Mem', '371683654', '2011', 'CA Kien Giang', '2015', 'HDI', 3, 'E:\\JAVA-3\\Assignment1\\src\\jframe.image\\hau.jpg', 'haulcps04107@fpt.edu.vn'),
('PS04112', 'Luong Nhat Linh', '3', '4', '1996', 'Nam ', '012345689', 'Nha Trang - Khanh Hoa', '11.3v2', 'Lap Trinh Web', '26308346', '2011', 'CA Khanh Hoa', '2015', 'Tam Ngung', 2, 'E:\\JAVA-3\\Assignment1\\src\\jframe.image\\linh.jpg', 'linhlnps04112@fpt.edu.vn'),
('PS04119', 'Tran Hai Yen', '25', '6', '1990', 'Nu', '', 'Q3-TP.HCM', '11.3v1', 'Lap Trinh Android', '', '2010', 'CA TP.HCM', '2015', 'HDI', 3, 'E:\\JAVA-3\\Assignment1\\src\\jframe.image\\yen.jpg', 'yenthps04119@fpt.edu.vn'),
('PS04772', 'Le Hoang Nam', '17', '4', '1997', 'Nam ', '', 'Tan Binh - TP.HCM', '11.3v2', 'Lap Trinh Android', '', '1990', 'CA TP.HCM', '2015', 'HDI', 3, 'E:\\JAVA-3\\Assignment1\\src\\jframe.image\\nam.jpg', 'namlhps04772@fpt.edu.vn');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bangdiem`
--
ALTER TABLE `bangdiem`
  ADD PRIMARY KEY (`MaSV`),
  ADD UNIQUE KEY `MaSV` (`MaSV`);

--
-- Indexes for table `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`Username`);

--
-- Indexes for table `sinhvien`
--
ALTER TABLE `sinhvien`
  ADD PRIMARY KEY (`MaSV`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
