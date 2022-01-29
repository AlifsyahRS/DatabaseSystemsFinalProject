/*!40101 SET NAMES utf8 */;
/*!40014 SET FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/ finalproject /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE finalproject;

DROP TABLE IF EXISTS department;
CREATE TABLE `department` (
  `departmentID` varchar(10) NOT NULL,
  `departmentName` varchar(255) NOT NULL,
  PRIMARY KEY (`departmentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS job;
CREATE TABLE `job` (
  `jobID` varchar(10) NOT NULL,
  `jobName` varchar(255) NOT NULL,
  `departmentID` varchar(10) NOT NULL,
  PRIMARY KEY (`jobID`),
  KEY `departmentID` (`departmentID`),
  CONSTRAINT `job_ibfk_1` FOREIGN KEY (`departmentID`) REFERENCES `department` (`departmentID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS product;
CREATE TABLE `product` (
  `productID` varchar(10) NOT NULL,
  `productName` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `price` decimal(20,3) NOT NULL,
  `stock` int(11) NOT NULL,
  `vendorID` varchar(10) NOT NULL,
  PRIMARY KEY (`productID`),
  KEY `vendorID` (`vendorID`),
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`vendorID`) REFERENCES `vendor` (`vendorID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `product_ibfk_2` FOREIGN KEY (`vendorID`) REFERENCES `vendor` (`vendorID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS staff;
CREATE TABLE `staff` (
  `staffID` varchar(10) NOT NULL,
  `staffName` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `salary` float NOT NULL,
  `jobID` varchar(10) NOT NULL,
  PRIMARY KEY (`staffID`),
  KEY `jobID` (`jobID`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`jobID`) REFERENCES `job` (`jobID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS transaction;
CREATE TABLE `transaction` (
  `transactionID` varchar(10) NOT NULL,
  `customerName` varchar(255) NOT NULL,
  `staffID` varchar(10) NOT NULL,
  `productID` varchar(10) NOT NULL,
  `amount` int(11) NOT NULL,
  `total` decimal(20,3) NOT NULL,
  `date` datetime NOT NULL,
  PRIMARY KEY (`transactionID`),
  KEY `staffID` (`staffID`),
  KEY `productID` (`productID`),
  CONSTRAINT `transaction_ibfk_1` FOREIGN KEY (`staffID`) REFERENCES `staff` (`staffID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `transaction_ibfk_2` FOREIGN KEY (`productID`) REFERENCES `product` (`productID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS vendor;
CREATE TABLE `vendor` (
  `vendorID` varchar(10) NOT NULL,
  `vendorName` varchar(255) NOT NULL,
  PRIMARY KEY (`vendorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO department(departmentID,departmentName) VALUES('D001','Operations'),('D002','Finance'),('D003','Marketing'),('D004','Shipping'),('D005','Human Resources');

INSERT INTO job(jobID,jobName,departmentID) VALUES('J001','Cashier','D001'),('J002','Accountant','D002'),('J003','Store Manager','D001'),('J004','Marketing Manager','D003'),('J005','HR Manager','D005'),('J006','Database Administrator','D001');

INSERT INTO product(productID,productName,type,price,stock,vendorID) VALUES('P001','Corsair K60','Keyboard',1345999.200,5,'V004'),('P002','Hyper X Alloy Origins Core','Keyboard',1350200.230,1,'V003'),('P003','Logitech G Pro X Superlight (White)','Mouse',1912000.000,14,'V001'),('P004','Qck EDGE Cloth','Mouse Pad',644999.542,1,'V005'),('P005','Corsair Katar Pro','Mouse',235000.000,4,'V004');

INSERT INTO staff(staffID,staffName,gender,salary,jobID) VALUES('S001','Janet Jenkins','Female',5000000,'J001'),('S002','Davey Jones','Male',40000000,'J005'),('S003','Alifsyah Rizky Sutarjadi','Male',69000000,'J006'),('S004','Michael Joseph','Male',69000000,'J003'),('S005','Rafian Athallah Marchansyah','Male',69000000,'J005');

INSERT INTO transaction(transactionID,customerName,staffID,productID,amount,total,date) VALUES('T001','John Doe','S001','P002',1,644999.542,'2022-01-05 00:00:00'),('T002','Sarah Hall','S001','P003',2,3824000.000,'2022-01-04 22:34:42'),('T003','Linus Sebastian','S001','P003',2,3824000.000,'2021-12-28 12:00:34'),('T004','Michelle Jones','S001','P003',1,1912000.000,'2022-01-03 09:01:23'),('T005','Jane Doe','S001','P003',1,1912000.000,'2022-01-07 10:22:34');
INSERT INTO vendor(vendorID,vendorName) VALUES('V001','Logitech'),('V002','Razer'),('V003','HyperX'),('V004','Corsair'),('V005','Steelseries');