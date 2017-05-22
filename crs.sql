/*
Navicat MySQL Data Transfer

Source Server         : handsome
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : crs

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-05-22 15:16:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `aid` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `password` varchar(255) NOT NULL,
  `addr` varchar(50) DEFAULT NULL,
  `post` varchar(20) DEFAULT NULL,
  `tel` varchar(11) NOT NULL,
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '1', '1', '1', '1', '1');
INSERT INTO `admin` VALUES ('12', '12', 'c20ad4d76fe97759aa27a0c99bff6710', null, null, '12345678901');
INSERT INTO `admin` VALUES ('123', '123', 'c20ad4d76fe97759aa27a0c99bff6710', '123', '123', '12345678901');

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
-- Table structure for `advise`
-- ----------------------------
DROP TABLE IF EXISTS `advise`;
CREATE TABLE `advise` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `sid` (`sid`),
  CONSTRAINT `sid` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of advise
-- ----------------------------
INSERT INTO `advise` VALUES ('1', '123', '2017-05-20 14:05:50', '123');
INSERT INTO `advise` VALUES ('2', '123', '2017-05-20 14:15:40', '123');
INSERT INTO `advise` VALUES ('3', 'qqq', '2017-05-22 14:20:30', '123');
INSERT INTO `advise` VALUES ('4', 'www', '2017-05-23 14:20:51', '123');
INSERT INTO `advise` VALUES ('5', 'eee', '2017-05-24 14:21:05', '123');
INSERT INTO `advise` VALUES ('6', 'rrr', '2017-05-25 14:21:19', '123');

-- ----------------------------
-- Table structure for `bill`
-- ----------------------------
DROP TABLE IF EXISTS `bill`;
CREATE TABLE `bill` (
  `bid` int(11) NOT NULL AUTO_INCREMENT,
  `detail` varchar(255) NOT NULL,
  `time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `addr` varchar(50) NOT NULL,
  `status` enum('已受理','正在受理','等待受理') NOT NULL DEFAULT '等待受理',
  `app_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `sid` int(11) NOT NULL,
  PRIMARY KEY (`bid`),
  KEY `bill_stu` (`sid`),
  KEY `bid` (`bid`,`status`),
  KEY `status` (`status`),
  CONSTRAINT `bill_stu` FOREIGN KEY (`sid`) REFERENCES `student` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bill
-- ----------------------------
INSERT INTO `bill` VALUES ('1', '1', '2017-05-20 03:18:12', '1', '等待受理', '2017-05-20 03:18:16', '1');
INSERT INTO `bill` VALUES ('2', '34', '2013-01-01 12:12:30', '121212', '等待受理', '2015-12-01 12:34:56', '123');
INSERT INTO `bill` VALUES ('3', '123', '2017-05-19 10:37:34', '123', '等待受理', '2017-05-20 10:45:48', '123');
INSERT INTO `bill` VALUES ('4', '宿舍门坏了', '2013-01-01 12:12:30', '西一526', '已受理', '2013-01-01 12:12:30', '123');
INSERT INTO `bill` VALUES ('5', '123123', '2013-01-01 12:12:30', '123123', '等待受理', '2013-01-01 12:12:30', '123');
INSERT INTO `bill` VALUES ('6', '11111', '2013-01-01 12:12:30', '11111', '等待受理', '2013-01-01 12:12:30', '123');
INSERT INTO `bill` VALUES ('7', '123123', '2013-01-01 12:12:30', '123123', '等待受理', '2013-01-01 12:12:30', '123');
INSERT INTO `bill` VALUES ('8', '111', '2013-01-01 12:12:30', '111', '等待受理', '2013-01-01 12:12:30', '123');

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `newsid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `pub_time` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `aid` int(11) NOT NULL,
  PRIMARY KEY (`newsid`),
  KEY `news_admin` (`aid`),
  CONSTRAINT `news_admin` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', '新闻1', '校内新闻一', '2017-05-15 13:02:40', '1');
INSERT INTO `news` VALUES ('2', '新闻2', '校内新闻二', '2017-05-16 13:03:10', '1');
INSERT INTO `news` VALUES ('3', '3', '3', '2017-05-17 13:03:20', '1');
INSERT INTO `news` VALUES ('4', '4', '4', '2017-05-18 13:03:41', '1');
INSERT INTO `news` VALUES ('5', '5', '5', '2017-05-19 13:03:52', '1');
INSERT INTO `news` VALUES ('6', '6', '6', '2017-05-20 13:04:06', '1');
INSERT INTO `news` VALUES ('7', '校内新闻', '小新闻。', '2017-05-21 22:13:10', '123');

-- ----------------------------
-- Table structure for `notice`
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice` (
  `nid` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(20) NOT NULL,
  `content` varchar(255) NOT NULL,
  `pub_time` datetime NOT NULL,
  `aid` int(11) NOT NULL,
  PRIMARY KEY (`nid`),
  KEY `notices_admin` (`aid`),
  CONSTRAINT `notices_admin` FOREIGN KEY (`aid`) REFERENCES `admin` (`aid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES ('1', '停水公告', '西区一栋将在5月19号停水一天。', '2017-05-21 21:16:05', '123');
INSERT INTO `notice` VALUES ('3', '停电公告', '明天西区一栋将停电一天。', '2017-05-21 21:41:37', '123');
INSERT INTO `notice` VALUES ('4', '4', '4', '2017-05-17 21:57:46', '1');
INSERT INTO `notice` VALUES ('5', '5', '5', '2017-05-16 21:57:59', '1');
INSERT INTO `notice` VALUES ('6', '6', '6', '2017-05-15 21:58:11', '1');

-- ----------------------------
-- Table structure for `repair`
-- ----------------------------
DROP TABLE IF EXISTS `repair`;
CREATE TABLE `repair` (
  `r_id` int(11) NOT NULL AUTO_INCREMENT,
  `rtime` datetime NOT NULL,
  `wid` int(20) NOT NULL,
  `bid` int(11) NOT NULL,
  PRIMARY KEY (`r_id`),
  KEY `repair_bill` (`bid`),
  CONSTRAINT `repair_bill` FOREIGN KEY (`bid`) REFERENCES `bill` (`bid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of repair
-- ----------------------------
INSERT INTO `repair` VALUES ('3', '2017-05-22 14:03:39', '2', '4');
INSERT INTO `repair` VALUES ('4', '2017-05-22 14:22:38', '2', '4');

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
  `password` varchar(255) NOT NULL,
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
INSERT INTO `student` VALUES ('1', '张三', '202cb962ac59075b964b07152d234b70', '女', '22', '计算机', '软件工程', '2班', '西一', '12345678901');
INSERT INTO `student` VALUES ('111', '111', '698d51a19d8a121ce581499d7b701668', '男', null, null, null, null, null, '111');
INSERT INTO `student` VALUES ('123', '123', 'c20ad4d76fe97759aa27a0c99bff6710', '女', '123', '123', '123', '123', '123', '12312312312');
INSERT INTO `student` VALUES ('1212', '1212', 'c4ca4238a0b923820dcc509a6f75849b', '男', null, null, null, null, null, '1');

-- ----------------------------
-- Table structure for `worker`
-- ----------------------------
DROP TABLE IF EXISTS `worker`;
CREATE TABLE `worker` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `sex` enum('男','女') DEFAULT '男',
  `addr` varchar(50) DEFAULT NULL,
  `tel` varchar(11) NOT NULL,
  `count` int(11) DEFAULT '0',
  `scroe` float DEFAULT '0',
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of worker
-- ----------------------------
INSERT INTO `worker` VALUES ('2', '王五', '男', '2', '12345678901', '2', '0');
INSERT INTO `worker` VALUES ('3', '孙六', '男', '3', '12345678901', '0', '0');
