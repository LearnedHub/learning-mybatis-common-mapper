/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MariaDB
 Source Server Version : 100410
 Source Host           : localhost:3306
 Source Schema         : jobsz

 Target Server Type    : MariaDB
 Target Server Version : 100410
 File Encoding         : 65001

 Date: 10/12/2019 19:45:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for mallorder
-- ----------------------------
DROP TABLE IF EXISTS `mallorder`;
CREATE TABLE `mallorder` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `uid` int(10) unsigned DEFAULT NULL,
  `date` date DEFAULT NULL,
  `descr` varchar(20) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of mallorder
-- ----------------------------
BEGIN;
INSERT INTO `mallorder` VALUES (1, 1, '2019-12-09', '1');
INSERT INTO `mallorder` VALUES (2, 1, '2019-12-18', '2');
INSERT INTO `mallorder` VALUES (3, 1, '2019-12-09', '1575864798784');
INSERT INTO `mallorder` VALUES (4, 1, '2019-12-09', '1575864799234');
INSERT INTO `mallorder` VALUES (5, 1, '2019-12-09', '1575864799236');
INSERT INTO `mallorder` VALUES (6, 1, '2019-12-09', '1575864799244');
INSERT INTO `mallorder` VALUES (7, 1, '2019-12-09', '1575864799247');
INSERT INTO `mallorder` VALUES (8, 1, '2019-12-09', '1575864799248');
INSERT INTO `mallorder` VALUES (9, 1, '2019-12-09', '1575864799249');
INSERT INTO `mallorder` VALUES (10, 1, '2019-12-09', '1575864799251');
INSERT INTO `mallorder` VALUES (11, 1, '2019-12-09', '1575864799254');
INSERT INTO `mallorder` VALUES (12, 1, '2019-12-09', '1575864799255');
INSERT INTO `mallorder` VALUES (13, 11, '2019-12-09', '1575868726936');
INSERT INTO `mallorder` VALUES (14, 11, '2019-12-09', '1575868727368');
INSERT INTO `mallorder` VALUES (15, 11, '2019-12-09', '1575868727369');
INSERT INTO `mallorder` VALUES (16, 11, '2019-12-09', '1575868727370');
INSERT INTO `mallorder` VALUES (17, 11, '2019-12-09', '1575868727372');
INSERT INTO `mallorder` VALUES (18, 11, '2019-12-09', '1575868727373');
INSERT INTO `mallorder` VALUES (19, 11, '2019-12-09', '1575868727374');
INSERT INTO `mallorder` VALUES (20, 11, '2019-12-09', '1575868727376');
INSERT INTO `mallorder` VALUES (21, 11, '2019-12-09', '1575868727378');
INSERT INTO `mallorder` VALUES (22, 11, '2019-12-09', '1575868727379');
INSERT INTO `mallorder` VALUES (23, 11, '2019-12-09', '1575869016151');
INSERT INTO `mallorder` VALUES (24, 11, '2019-12-09', '1575869016582');
INSERT INTO `mallorder` VALUES (25, 11, '2019-12-09', '1575869016583');
INSERT INTO `mallorder` VALUES (26, 11, '2019-12-09', '1575869016583');
INSERT INTO `mallorder` VALUES (27, 11, '2019-12-09', '1575869016583');
INSERT INTO `mallorder` VALUES (28, 11, '2019-12-09', '1575869016583');
INSERT INTO `mallorder` VALUES (29, 11, '2019-12-09', '1575869016584');
INSERT INTO `mallorder` VALUES (30, 11, '2019-12-09', '1575869016584');
INSERT INTO `mallorder` VALUES (31, 11, '2019-12-09', '1575869016585');
INSERT INTO `mallorder` VALUES (32, 11, '2019-12-09', '1575869016585');
COMMIT;

-- ----------------------------
-- Table structure for tbl_dept
-- ----------------------------
DROP TABLE IF EXISTS `tbl_dept`;
CREATE TABLE `tbl_dept` (
  `dept_id` int(16) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(128) DEFAULT NULL,
  PRIMARY KEY (`dept_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tbl_emp
-- ----------------------------
DROP TABLE IF EXISTS `tbl_emp`;
CREATE TABLE `tbl_emp` (
  `emp_id` int(16) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(64) DEFAULT NULL,
  `gender` varchar(1) DEFAULT NULL,
  `email` varchar(128) DEFAULT NULL,
  `d_id` int(16) DEFAULT NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=167016 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_emp
-- ----------------------------
BEGIN;
INSERT INTO `tbl_emp` VALUES (1, '王路', 'M', 'a@b.com', 2);
INSERT INTO `tbl_emp` VALUES (2, '李心', 'F', 'a@b.com', 2);
INSERT INTO `tbl_emp` VALUES (3, '杨杰', 'F', 'a@b.com', 1);
INSERT INTO `tbl_emp` VALUES (4, '候诚', 'F', 'a@b.com', 2);
INSERT INTO `tbl_emp` VALUES (5, '张严', 'M', 'a@b.com', 1);
INSERT INTO `tbl_emp` VALUES (6, '何宽', 'F', 'a@b.com', 2);
INSERT INTO `tbl_emp` VALUES (7, '李微', 'M', 'a@b.com', 1);
INSERT INTO `tbl_emp` VALUES (8, '刘虹', 'M', 'a@b.com', 1);
INSERT INTO `tbl_emp` VALUES (9, '黄羽', 'F', 'a@b.com', 2);
INSERT INTO `tbl_emp` VALUES (10, '吴莉', 'F', 'a@b.com', 3);
INSERT INTO `tbl_emp` VALUES (11, '阿里', 'M', 'a@b.com', 3);
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(10) COLLATE utf8mb4_bin DEFAULT NULL,
  `addr` varchar(10) COLLATE utf8mb4_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES (1, '中国🇨🇳 ', '中国大中国');
INSERT INTO `user` VALUES (2, 'username', 'Addr');
INSERT INTO `user` VALUES (3, 'username', 'Addr');
INSERT INTO `user` VALUES (5, 'username', 'Addr');
INSERT INTO `user` VALUES (8, 'username', 'Addr');
INSERT INTO `user` VALUES (9, 'username', 'Addr');
INSERT INTO `user` VALUES (10, 'username', 'Addr');
INSERT INTO `user` VALUES (11, 'Jobsz', 'china');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
