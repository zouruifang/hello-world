/*
 Navicat Premium Data Transfer

 Source Server         : db_ZB1018148
 Source Server Type    : MySQL
 Source Server Version : 50527
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50527
 File Encoding         : 65001

 Date: 11/12/2019 22:42:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for stuinfo
-- ----------------------------
DROP TABLE IF EXISTS `stuinfo`;
CREATE TABLE `stuinfo`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int(5) NULL DEFAULT NULL,
  `weight` float(10, 0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = 'sex' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of stuinfo
-- ----------------------------
INSERT INTO `stuinfo` VALUES ('100011', '邹瑞芳', '女', 22, 55);
INSERT INTO `stuinfo` VALUES ('2018010001', '??', '?', 23, 90);
INSERT INTO `stuinfo` VALUES ('2018010002', '梦想', '女', 18, 85);
INSERT INTO `stuinfo` VALUES ('333', 'dd', '?', 22, 44);

SET FOREIGN_KEY_CHECKS = 1;
