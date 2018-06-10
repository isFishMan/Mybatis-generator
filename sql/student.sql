/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.6.28 : Database - school
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`school` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `school`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `studentNo` char(5) NOT NULL,
  `loginPwd` char(3) NOT NULL,
  `studentName` varchar(5) NOT NULL,
  `sex` char(1) DEFAULT '男',
  `gradeID` int(1) NOT NULL,
  `phone` char(11) DEFAULT NULL,
  `address` varchar(20) DEFAULT '地址不详',
  PRIMARY KEY (`studentNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`studentNo`,`loginPwd`,`studentName`,`sex`,`gradeID`,`phone`,`address`) values ('10000','123','郭靖','男',1,'13698979643','天津市河西区'),('10001','123','李文才','男',1,'13698339643','地址不详'),('10002','123','李斯文','男',1,'13628979643','河南洛阳'),('10003','123','张萍','女',1,'13622979643','地址不详'),('10005','123','张秋丽','女',1,'13448979643','北京市东城区'),('10006','123','晓梅','女',1,'13698669643','河北省石家庄'),('10007','123','秦杨','男',1,'13687679643','上海市卢湾区'),('10008','123','何晴晴','女',1,'13698659643','广州市天河区'),('20000','123','王宝宝','男',2,'13448979643','地址不详'),('20010','123','何小华','女',2,'13698999643','地址不详'),('30011','123','程志强','女',3,'13698939643','地址不详'),('30012','123','李露露','女',3,'13639979643','地址不详');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
