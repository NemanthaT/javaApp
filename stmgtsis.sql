-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 11, 2024 at 10:44 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stmgtsis`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `CourseID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Instructor` varchar(100) DEFAULT NULL,
  `Description` text DEFAULT NULL,
  `Hours` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`CourseID`, `Name`, `Instructor`, `Description`, `Hours`) VALUES
(1, 'Mathematics', 'Dr. John Doe', 'An introductory course on Algebra and Geometry', 60),
(2, 'Physics', 'Dr. Jane Smith', 'Fundamentals of Physics including mechanics and waves', 50),
(3, 'Chemistry', 'Dr. Emily White', 'Basic principles of chemistry', 55),
(4, 'Biology', 'Dr. Alan Brown', 'Introduction to cell biology and genetics', 60),
(5, 'English Literature', 'Ms. Laura Green', 'Study of classic and modern literature', 45),
(6, 'History', 'Mr. Robert Black', 'World History from ancient to modern times', 50),
(7, 'Geography', 'Ms. Lisa White', 'Physical and human geography', 40),
(8, 'Computer Science', 'Mr. Paul Grey', 'Basics of programming and algorithms', 65),
(9, 'Art', 'Ms. Anna Blue', 'Art history and techniques', 35),
(10, 'Music', 'Mr. David Brown', 'Introduction to music theory and practice', 30),
(11, 'Economics', 'Dr. Sarah Green', 'Principles of microeconomics and macroeconomics', 50),
(12, 'Philosophy', 'Dr. Henry Black', 'Philosophical concepts and schools of thought', 45),
(13, 'Sociology', 'Dr. Emily White', 'Introduction to social structures and institutions', 40),
(14, 'Psychology', 'Dr. Laura Green', 'Study of the human mind and behavior', 55),
(15, 'Political Science', 'Dr. Robert Grey', 'Theory and practice of government', 60),
(18, 'Information Sytem', NULL, 'Info dete', 65),
(19, 'Maths', NULL, 'Maths dete', 60);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `StudentID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Age` int(11) DEFAULT NULL,
  `Gender` enum('Male','Female') DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`StudentID`, `Name`, `Age`, `Gender`, `Address`) VALUES
(1, 'Alice Brown', 16, 'Female', '123 Maple Street'),
(2, 'Bob Green', 17, 'Male', '456 Oak Avenue'),
(3, 'Charlie Black', 16, 'Male', '789 Pine Road'),
(4, 'Daisy White', 15, 'Female', '101 Birch Lane'),
(5, 'Evan Grey', 17, 'Male', '202 Cedar Street'),
(6, 'Fiona Blue', 16, 'Female', '303 Spruce Avenue'),
(7, 'George Red', 15, 'Male', '404 Walnut Blvd'),
(8, 'Hannah Yellow', 16, 'Female', '505 Cherry Lane'),
(9, 'Ivy Orange', 17, 'Female', '606 Chestnut Drive'),
(10, 'Jack Purple', 16, 'Male', '707 Ash Street'),
(11, 'Kara Silver', 15, 'Female', '808 Pineapple Ave'),
(12, 'Leo Gold', 16, 'Male', '909 Apple Blvd'),
(13, 'Mona Bronze', 17, 'Female', '1010 Oakwood St'),
(14, 'Nina Copper', 15, 'Female', '1111 Maple Lane'),
(15, 'Omar Green', 17, 'Male', '1212 Cedar Drive');

-- --------------------------------------------------------

--
-- Table structure for table `studentcourse`
--

CREATE TABLE `studentcourse` (
  `student_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `studentcourse`
--

INSERT INTO `studentcourse` (`student_id`, `course_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(1, 2),
(2, 3),
(3, 4),
(4, 5),
(5, 6),
(15, 12),
(5, 19);

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `TeacherID` int(11) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Subject` varchar(100) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Contact` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`TeacherID`, `Name`, `Subject`, `Age`, `Contact`) VALUES
(1, 'Dr. John Doe', 'Mathematics', 45, '555-1234'),
(2, 'Dr. Jane Smith', 'Physics', 40, '555-5678'),
(3, 'Dr. Emily White', 'Chemistry', 38, '555-9012'),
(4, 'Dr. Alan Brown', 'Biology', 42, '555-3456'),
(5, 'Ms. Laura Green', 'English Literature', 37, '555-7890'),
(6, 'Mr. Robert Black', 'History', 50, '555-2345'),
(7, 'Ms. Lisa White', 'Geography', 33, '555-6789'),
(8, 'Mr. Paul Grey', 'Computer Science', 36, '555-1111'),
(9, 'Ms. Anna Blue', 'Art', 29, '555-2222'),
(10, 'Mr. David Brown', 'Music', 44, '555-3333'),
(11, 'Dr. Sarah Green', 'Economics', 41, '555-4444'),
(12, 'Dr. Henry Black', 'Philosophy', 53, '555-5555'),
(13, 'Dr. Emily White', 'Sociology', 39, '555-6666'),
(14, 'Dr. Laura Green', 'Psychology', 48, '555-7777'),
(15, 'Dr. Robert Grey', 'Political Science', 46, '555-8888');

-- --------------------------------------------------------

--
-- Table structure for table `teachercourse`
--

CREATE TABLE `teachercourse` (
  `teacher_id` int(11) NOT NULL,
  `course_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `teachercourse`
--

INSERT INTO `teachercourse` (`teacher_id`, `course_id`) VALUES
(1, 1),
(2, 2),
(3, 3),
(4, 4),
(5, 5),
(6, 6),
(7, 7),
(8, 8),
(9, 9),
(10, 10),
(11, 11),
(12, 12),
(13, 13),
(14, 14),
(15, 15),
(1, 3),
(2, 4),
(3, 5);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`CourseID`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`StudentID`);

--
-- Indexes for table `studentcourse`
--
ALTER TABLE `studentcourse`
  ADD KEY `course_id` (`course_id`),
  ADD KEY `student_id` (`student_id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`TeacherID`);

--
-- Indexes for table `teachercourse`
--
ALTER TABLE `teachercourse`
  ADD KEY `course_id` (`course_id`),
  ADD KEY `teacher_id` (`teacher_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `course`
--
ALTER TABLE `course`
  MODIFY `CourseID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `StudentID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `TeacherID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `studentcourse`
--
ALTER TABLE `studentcourse`
  ADD CONSTRAINT `studentcourse_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`CourseID`),
  ADD CONSTRAINT `studentcourse_ibfk_2` FOREIGN KEY (`student_id`) REFERENCES `student` (`StudentID`);

--
-- Constraints for table `teachercourse`
--
ALTER TABLE `teachercourse`
  ADD CONSTRAINT `teachercourse_ibfk_1` FOREIGN KEY (`course_id`) REFERENCES `course` (`CourseID`),
  ADD CONSTRAINT `teachercourse_ibfk_2` FOREIGN KEY (`teacher_id`) REFERENCES `teacher` (`TeacherID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
