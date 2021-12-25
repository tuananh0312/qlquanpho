-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 30, 2021 at 03:18 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `quanlyquanpho`
--

-- --------------------------------------------------------

--
-- Table structure for table `ban`
--

CREATE TABLE `ban` (
  `soban` int(2) NOT NULL,
  `loaiban` varchar(3) NOT NULL,
  `tinhtrang` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ban`
--

INSERT INTO `ban` (`soban`, `loaiban`, `tinhtrang`) VALUES
(1, 'Nhỏ', 'Trống'),
(2, 'Nhỏ', 'Trống'),
(3, 'Nhỏ', 'Trống'),
(4, 'Nhỏ', 'Trống'),
(5, 'Nhỏ', 'Trống'),
(6, 'Nhỏ', 'Trống'),
(7, 'Nhỏ', 'Trống'),
(8, 'Nhỏ', 'Trống'),
(9, 'Nhỏ', 'Trống'),
(10, 'Nhỏ', 'Trống'),
(11, 'Nhỏ', 'Trống'),
(12, 'Nhỏ', 'Trống'),
(13, 'Nhỏ', 'Trống'),
(14, 'Nhỏ', 'Trống'),
(15, 'Nhỏ', 'Trống'),
(16, 'Nhỏ', 'Trống'),
(17, 'Nhỏ', 'Trống'),
(18, 'Nhỏ', 'Trống'),
(19, 'Nhỏ', 'Trống'),
(20, 'Nhỏ', 'Trống'),
(21, 'Lớn', 'Trống'),
(22, 'Lớn', 'Trống'),
(23, 'Lớn', 'Trống'),
(24, 'Lớn', 'Trống'),
(25, 'Lớn', 'Trống'),
(26, 'Lớn', 'Trống'),
(27, 'Lớn', 'Trống'),
(28, 'Lớn', 'Trống'),
(29, 'Lớn', 'Trống'),
(30, 'Lớn', 'Trống');

-- --------------------------------------------------------

--
-- Table structure for table `chitiet`
--

CREATE TABLE `chitiet` (
  `sophieu` int(11) NOT NULL,
  `mato` int(11) NOT NULL,
  `soluong` int(11) NOT NULL,
  `thanhtien` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chitiet`
--

INSERT INTO `chitiet` (`sophieu`, `mato`, `soluong`, `thanhtien`) VALUES
(105387, 1, 1, 75000),
(105387, 2, 1, 60000),
(149039, 1, 1, 75000),
(149039, 2, 1, 60000),
(149039, 3, 1, 45000),
(190151, 1, 2, 150000),
(190151, 2, 1, 60000),
(190151, 3, 1, 45000),
(190151, 6, 2, 20000),
(190151, 7, 3, 30000),
(190151, 9, 1, 25000),
(214442, 1, 1, 75000),
(214442, 2, 1, 60000),
(214442, 3, 1, 45000),
(366315, 1, 1, 75000),
(426259, 1, 1, 75000),
(426259, 2, 1, 60000),
(426259, 3, 1, 45000),
(426259, 4, 1, 5000),
(426259, 5, 1, 5000),
(426259, 6, 1, 10000),
(426259, 7, 1, 10000),
(426259, 8, 1, 15000),
(426259, 9, 1, 25000),
(462136, 1, 2, 150000),
(462136, 3, 1, 45000),
(462136, 4, 1, 5000),
(462136, 6, 1, 10000),
(462136, 9, 1, 25000),
(556052, 1, 1, 75000),
(556052, 4, 1, 5000),
(556052, 5, 1, 5000),
(599032, 1, 1, 75000),
(599032, 3, 1, 45000),
(599032, 6, 2, 20000),
(599032, 9, 2, 50000),
(701003, 1, 1, 75000),
(701003, 2, 1, 60000),
(701003, 3, 1, 45000),
(701003, 4, 1, 5000),
(701003, 5, 1, 5000),
(701003, 6, 1, 10000),
(701003, 7, 1, 10000),
(701003, 8, 1, 15000),
(701003, 9, 1, 25000),
(710903, 1, 1, 75000),
(710903, 2, 1, 60000),
(710903, 4, 1, 5000),
(710903, 5, 1, 5000),
(710903, 8, 1, 15000),
(825516, 1, 1, 75000),
(825516, 2, 1, 60000),
(825516, 3, 1, 45000),
(825516, 4, 1, 5000),
(825516, 7, 1, 10000),
(980911, 1, 1, 75000),
(980911, 2, 1, 60000),
(980911, 3, 1, 45000),
(980911, 4, 1, 5000),
(980911, 5, 1, 5000),
(980911, 7, 1, 10000),
(980911, 8, 1, 15000),
(980911, 9, 1, 25000);

-- --------------------------------------------------------

--
-- Table structure for table `hoadon`
--

CREATE TABLE `hoadon` (
  `sophieu` int(11) NOT NULL,
  `soban` int(2) NOT NULL,
  `giogoimon` datetime DEFAULT current_timestamp(),
  `trangthai` int(1) DEFAULT 0,
  `giothanhtoan` datetime DEFAULT NULL,
  `tongtien` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `hoadon`
--

INSERT INTO `hoadon` (`sophieu`, `soban`, `giogoimon`, `trangthai`, `giothanhtoan`, `tongtien`) VALUES
(105387, 2, '2021-05-07 08:36:28', 1, NULL, 135000),
(149039, 1, '2021-05-11 14:45:33', 1, '2021-05-14 07:45:29', 250000),
(190151, 15, '2021-05-18 19:55:29', 1, '2021-05-18 19:55:55', 330000),
(214442, 12, '2021-05-07 08:14:29', 1, '2021-05-13 20:52:05', 180000),
(366315, 10, '2021-05-11 14:36:54', 1, '2021-05-18 21:04:56', 160000),
(426259, 1, '2021-05-14 07:44:53', 1, '2021-05-14 07:45:29', 250000),
(462136, 10, '2021-05-07 08:08:45', 1, '2021-05-18 21:04:56', 160000),
(556052, 1, '2021-05-13 22:00:20', 1, '2021-05-14 07:45:29', 250000),
(599032, 20, '2021-05-14 07:24:44', 1, '2021-05-14 07:25:53', 190000),
(701003, 19, '2021-05-07 08:17:28', 1, '2021-05-13 21:57:59', 250000),
(710903, 10, '2021-05-18 19:54:36', 1, '2021-05-18 21:04:56', 160000),
(980911, 1, '2021-05-07 08:35:58', 1, '2021-05-14 07:45:29', 250000);

-- --------------------------------------------------------

--
-- Table structure for table `loaito`
--

CREATE TABLE `loaito` (
  `mato` int(1) NOT NULL,
  `tento` varchar(50) NOT NULL,
  `giato` int(7) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `loaito`
--

INSERT INTO `loaito` (`mato`, `tento`, `giato`) VALUES
(1, 'Tô phở đặc biệt', 75000),
(2, 'Tô phở lớn', 60000),
(3, 'Tô phở nhỏ', 45000),
(4, 'Quẩy', 5000),
(5, 'Hột gà', 5000),
(6, 'Bánh phở', 10000),
(7, 'Tiết', 10000),
(8, 'Tiết hột gà', 15000),
(9, 'Thịt', 25000);

-- --------------------------------------------------------

--
-- Table structure for table `taikhoan`
--

CREATE TABLE `taikhoan` (
  `username` varchar(6) NOT NULL,
  `password` varchar(20) NOT NULL,
  `type` int(1) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `birthday` date NOT NULL,
  `address` varchar(50) NOT NULL,
  `phone` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `taikhoan`
--

INSERT INTO `taikhoan` (`username`, `password`, `type`, `fullname`, `birthday`, `address`, `phone`) VALUES
('admin', 'admin', 0, 'Huỳnh Hy Quí', '2021-04-24', 'TPHCM', '0898131873'),
('user', 'user', 1, 'Nguyễn Văn A', '2021-04-24', 'TPHCM', '0909131765'),
('user1', 'user1', 1, 'Huỳnh Hy Quí', '2001-03-22', 'TPHCM', '0898131873');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ban`
--
ALTER TABLE `ban`
  ADD PRIMARY KEY (`soban`);

--
-- Indexes for table `chitiet`
--
ALTER TABLE `chitiet`
  ADD PRIMARY KEY (`sophieu`,`mato`);

--
-- Indexes for table `hoadon`
--
ALTER TABLE `hoadon`
  ADD PRIMARY KEY (`sophieu`);

--
-- Indexes for table `loaito`
--
ALTER TABLE `loaito`
  ADD PRIMARY KEY (`mato`);

--
-- Indexes for table `taikhoan`
--
ALTER TABLE `taikhoan`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ban`
--
ALTER TABLE `ban`
  MODIFY `soban` int(2) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
