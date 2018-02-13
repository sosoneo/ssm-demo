/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50720
 Source Host           : localhost:3306
 Source Schema         : db_future

 Target Server Type    : MySQL
 Target Server Version : 50720
 File Encoding         : 65001

 Date: 13/02/2018 09:57:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_letter
-- ----------------------------
DROP TABLE IF EXISTS `t_letter`;
CREATE TABLE `t_letter` (
  `letter_id` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(20000) NOT NULL,
  `email` varchar(100) NOT NULL,
  `delivery_time` date NOT NULL,
  `create_time` date NOT NULL,
  PRIMARY KEY (`letter_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;;

SET FOREIGN_KEY_CHECKS = 1;