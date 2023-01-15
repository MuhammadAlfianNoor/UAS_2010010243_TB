-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2023 at 11:06 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tb2010010243`
--

-- --------------------------------------------------------

--
-- Table structure for table `inputkrs`
--

CREATE TABLE `inputkrs` (
  `npm` int(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `teknologi_grafika` varchar(15) NOT NULL,
  `teknik_kompilasi` varchar(15) NOT NULL,
  `struktur_data` varchar(15) NOT NULL,
  `sistem_terdistribusi` varchar(15) NOT NULL,
  `jaringan_komputer` varchar(15) NOT NULL,
  `matematika_diskrit` varchar(15) NOT NULL,
  `interman` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `profilmahasiswa`
--

CREATE TABLE `profilmahasiswa` (
  `npm` int(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jurusan` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `email` varchar(30) NOT NULL,
  `no_telp` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `profilmahasiswa`
--

INSERT INTO `profilmahasiswa` (`npm`, `nama`, `jurusan`, `alamat`, `email`, `no_telp`) VALUES
(2010010101, 'udintapih', 'Sistem Informasi', 'banjarbaru', 'udian@', '086262727234'),
(2010010102, 'jannah', 'Sistem Informasi', 'banjarmasin', 'jannagh@', '08123763872');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `inputkrs`
--
ALTER TABLE `inputkrs`
  ADD PRIMARY KEY (`npm`);

--
-- Indexes for table `profilmahasiswa`
--
ALTER TABLE `profilmahasiswa`
  ADD PRIMARY KEY (`npm`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `inputkrs`
--
ALTER TABLE `inputkrs`
  MODIFY `npm` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=196312100;

--
-- AUTO_INCREMENT for table `profilmahasiswa`
--
ALTER TABLE `profilmahasiswa`
  MODIFY `npm` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2010010103;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
