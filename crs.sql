/*
Navicat MySQL Data Transfer

Source Server         : handsome
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : crs

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-05-01 21:29:27
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `post` varchar(20) DEFAULT NULL,
  `tel` varchar(11) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for `admin_log`
-- ----------------------------
DROP TABLE IF EXISTS `admin_log`;
CREATE TABLE `admin_log` (
  `lid` int(11) NOT NULL,
  `aid` int(11) NOT NULL,
  `action` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  PRIMARY KEY (`lid`),
  KEY `log_admin` (`aid`),
  CONSTRAINT `log_admin` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin_log
-- ----------------------------

-- ----------------------------
-- Table structure for `bill`
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `bid` int(11) NOT NULL,
  `detail` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `addr` varchar(50) NOT NULL,
  `status` enum('已受理','正在受理','中断受理','等待受理') NOT NULL DEFAULT '等待受理',
  `app_time` datetime NOT NULL,
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`bid`),
  KEY `bill_stu` (`sid`),
  KEY `bid` (`bid`,`status`),
  CONSTRAINT `bill_stu` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `newsid` int(11) NOT NULL,
  `title` varchar(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `pub_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `aid` int(11) NOT NULL,
  PRIMARY KEY (`newsid`),
  KEY `news_admin` (`aid`),
  CONSTRAINT `news_admin` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `nid` int(11) NOT NULL,
  `title` varchar(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `pub_time` datetime NOT NULL,
  `aid` int(11) NOT NULL,
  PRIMARY KEY (`nid`),
  KEY `notices_admin` (`aid`),
  CONSTRAINT `notices_admin` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------

-- ----------------------------
-- Table structure for `repair`
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair` (
  `r_id` int(11) NOT NULL,
  `rtime` datetime NOT NULL,
  `worker` varchar(20) NOT NULL,
  `status` enum('') NOT NULL,
  `bid` int(11) NOT NULL,
  PRIMARY KEY (`r_id`),
  KEY `repair_bill` (`bid`,`status`),
  CONSTRAINT `repair_bill` FOREIGN KEY (`bid`, `status`) REFERENCES `bill` (`bid`, `status`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repair
-- ----------------------------

-- ----------------------------
-- Table structure for `review`
-- ----------------------------
DROP TABLE IF EXISTS `review`;
CREATE TABLE `review` (
  `id` int(11) NOT NULL,
  `bid` int(11) NOT NULL,
  `score` int(11) NOT NULL,
  `content` varchar(50) DEFAULT NULL,
  `wid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `reviews_bill` (`bid`),
  CONSTRAINT `reviews_bill` FOREIGN KEY (`bid`) REFERENCES `bill` (`bid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of review
-- ----------------------------

-- ----------------------------
-- Table structure for `student`
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `sid` int(11) NOT NULL DEFAULT '0',
  `name` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `sex` enum('男','女') DEFAULT '男',
  `age` int(11) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `specialty` varchar(20) DEFAULT NULL,
  `class_no` varchar(20) DEFAULT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `tel` varchar(11) NOT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for `worker`
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker` (
  `wid` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `sex` enum('') NOT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `tel` varchar(11) NOT NULL,
  `count` int(11) NOT NULL,
  `scroe` float NOT NULL,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worker
-- ----------------------------
