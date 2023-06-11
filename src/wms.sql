/*
 Navicat MySQL Data Transfer

 Source Server         : 本机
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : 127.0.0.1:3306
 Source Schema         : wms

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 10/06/2023 15:24:43
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for carrier
-- ----------------------------
DROP TABLE IF EXISTS `carrier`;
CREATE TABLE `carrier`  (
  `CARRIER_ID` int NOT NULL AUTO_INCREMENT COMMENT '承运商ID,主键自增',
  `CARRIER_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '承运商名称',
  `CARRIER_LEADER` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '承运商负责人',
  `CARRIER_TEL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '联系电话',
  `CARRIER_EMAIL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系邮箱',
  `CARRIER_ADDRESS` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系地址',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`CARRIER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '承运商表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of carrier
-- ----------------------------
INSERT INTO `carrier` VALUES (1, '顺丰物流科技', 'jd管理001', '199999999999', 'bjcp@163.com', '北京市昌平区,北七家', '2021-12-12 00:00:00', '2023-06-07 14:46:16', 1);
INSERT INTO `carrier` VALUES (2, '申通科技', 'ST180', '18002222222', 'ST@163.COM', '上海市闸北区', '2022-11-13 00:00:00', '2023-06-07 14:46:20', 1);
INSERT INTO `carrier` VALUES (3, '2', '2', '2', '2', '2', '2023-06-02 00:00:00', '2023-06-07 14:49:18', 0);

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `CATEGORY_ID` int NOT NULL AUTO_INCREMENT COMMENT '类目ID,主键自增',
  `CATEGORY_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '类目名称',
  `LEVEL` int NULL DEFAULT 1 COMMENT '层级',
  `PARENT_ID` int NULL DEFAULT 0 COMMENT '父ID,关联主键(自关联),顶层父ID为0',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`CATEGORY_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '商品类目表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '服装', 1, 0, '2022-01-15 00:00:00', '2023-06-08 17:18:05', 1);
INSERT INTO `category` VALUES (2, '男装', 2, 1, '2022-01-01 19:11:11', '2022-11-09 21:30:12', 1);
INSERT INTO `category` VALUES (3, '夹克', 3, 2, '2022-01-01 19:11:11', '2022-11-09 22:27:55', 1);
INSERT INTO `category` VALUES (4, '家用电器', 1, 0, '2022-11-10 05:37:17', '2022-11-09 21:37:18', 1);
INSERT INTO `category` VALUES (5, '大家电', 2, 4, '2022-11-10 05:39:02', '2022-11-09 21:39:03', 1);
INSERT INTO `category` VALUES (6, '小家电', 2, 4, '2022-11-10 05:39:46', '2022-11-09 21:39:47', 1);
INSERT INTO `category` VALUES (7, '女装', 2, 1, '2022-11-10 05:39:57', '2023-06-05 14:12:03', 0);
INSERT INTO `category` VALUES (8, '连衣裙', 3, 7, '2022-11-03 05:40:10', '2023-06-05 14:12:00', 0);
INSERT INTO `category` VALUES (9, '洗衣机', 3, 5, '2022-11-10 05:40:32', '2022-11-09 21:40:33', 1);
INSERT INTO `category` VALUES (10, '摩托', 3, 6, '2023-06-05 10:35:20', '2023-06-05 19:32:49', 0);
INSERT INTO `category` VALUES (11, '摩托', 1, 0, '2023-06-05 10:33:27', '2023-06-08 17:18:15', 1);
INSERT INTO `category` VALUES (12, '大奖', 1, 0, '2023-06-05 00:00:00', '2023-06-08 17:18:17', 1);
INSERT INTO `category` VALUES (13, '大河', 1, 0, '2023-06-20 00:00:00', '2023-06-08 17:18:17', 1);
INSERT INTO `category` VALUES (14, '直升飞机', 1, 0, '2023-06-28 00:00:00', '2023-06-08 17:18:24', 1);
INSERT INTO `category` VALUES (17, '童装', 2, 1, '2023-06-02 00:00:00', '2023-06-07 16:22:16', 1);
INSERT INTO `category` VALUES (18, '牛仔裤', 3, 2, '2023-06-06 00:00:00', '2023-06-07 16:25:42', 0);
INSERT INTO `category` VALUES (19, '潮流', 2, 1, '2023-06-06 00:00:00', '2023-06-08 16:01:37', 1);
INSERT INTO `category` VALUES (20, '牛仔', 3, 19, '2023-06-06 00:00:00', '2023-06-08 16:01:51', 1);
INSERT INTO `category` VALUES (21, '赛车', 2, 11, '2023-06-26 00:00:00', '2023-06-08 16:03:28', 1);
INSERT INTO `category` VALUES (22, '儿童上衣', 3, 17, '2023-06-01 00:00:00', '2023-06-08 16:04:50', 1);

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer`  (
  `CUSTOMER_ID` int NOT NULL AUTO_INCREMENT COMMENT '客户ID,主键自增',
  `CUSTOMER_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '客户名称,如果为公司,那么是公司名,如果为个人,那么填写个人名称',
  `CUSTOMER_LEADER` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '客户负责人,如果公司为个人,那么和CUSTOMER_NAME内容相同',
  `CUSTOMER_TEL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '联系电话',
  `CUSTOMER_EMAIL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系邮箱',
  `CUSTOMER_ADDRESS` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '联系地址',
  `LEVEL_ID` int NOT NULL COMMENT '客户级别,关联级别表主键',
  `SOURCE_ID` int NOT NULL COMMENT '客户来源,关联来源表主键',
  `INDUSTRY_ID` int NOT NULL COMMENT '客户行业,关联行业表主键',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`CUSTOMER_ID`) USING BTREE,
  INDEX `LEVEL_ID`(`LEVEL_ID`) USING BTREE,
  INDEX `SOURCE_ID`(`SOURCE_ID`) USING BTREE,
  INDEX `INDUSTRY_ID`(`INDUSTRY_ID`) USING BTREE,
  CONSTRAINT `customer_ibfk_1` FOREIGN KEY (`LEVEL_ID`) REFERENCES `level` (`LEVEL_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `customer_ibfk_2` FOREIGN KEY (`SOURCE_ID`) REFERENCES `source` (`SOURCE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `customer_ibfk_3` FOREIGN KEY (`INDUSTRY_ID`) REFERENCES `industry` (`INDUSTRY_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '客户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES (1, 's名字10', 's领导10', '12333333338', 's@163.com', '南京市建邺区10', 3, 3, 2, '2022-12-02 00:00:00', '2023-06-09 10:30:42', 1);
INSERT INTO `customer` VALUES (2, '客户名001', '联系人001', '33333333333', '233@163.com', '地址', 2, 6, 4, '2022-11-15 00:00:00', '2023-06-07 11:32:07', 1);
INSERT INTO `customer` VALUES (3, '客户名002', '联系人002', '22222222222', '222@163.com', '地址002', 3, 5, 5, '2022-11-15 00:00:00', '2023-06-09 10:30:44', 1);
INSERT INTO `customer` VALUES (4, '3', '3', '3', '3', '3', 6, 7, 6, '2023-06-05 00:00:00', '2023-06-07 11:22:41', 1);

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `DEPT_ID` int NOT NULL AUTO_INCREMENT COMMENT '部门ID',
  `DEPT_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '部门名称',
  `LEVEL` int NULL DEFAULT 1 COMMENT '层级',
  `PARENT_ID` int NULL DEFAULT 0 COMMENT '父ID,自关联DEPT_ID',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`DEPT_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '部门表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, '北京千锋互联科技有限公司', 1, 0, '2022-11-03 05:08:35', '2022-11-19 20:14:28', 1);
INSERT INTO `department` VALUES (2, '千锋互联科技有限公司(北京分公司)', 2, 1, '2022-11-03 05:08:59', '2022-11-19 20:15:08', 1);
INSERT INTO `department` VALUES (3, '产品研发部', 3, 2, '2022-11-03 05:09:16', '2022-11-02 21:09:17', 1);
INSERT INTO `department` VALUES (4, '千锋互联科技有限公司(南京分公司)', 2, 1, '2022-11-03 05:09:43', '2022-11-19 20:15:13', 1);
INSERT INTO `department` VALUES (5, '市场部', 3, 4, '2022-11-03 05:10:52', '2022-11-02 21:10:53', 1);
INSERT INTO `department` VALUES (6, '技术科研部', 3, 2, '2022-11-03 05:11:15', '2022-11-02 21:11:16', 1);
INSERT INTO `department` VALUES (7, '公关部', 3, 4, '2022-11-03 05:11:27', '2022-11-02 21:11:28', 1);
INSERT INTO `department` VALUES (8, '大虾68', 1, 0, '2023-06-02 00:00:00', '2023-06-05 21:34:43', 0);
INSERT INTO `department` VALUES (9, '飞鱼', 1, 0, '2023-06-01 00:00:00', '2023-06-05 21:33:15', 0);
INSERT INTO `department` VALUES (10, '一部', 3, 8, '2023-06-06 00:00:00', '2023-06-07 16:37:31', 0);
INSERT INTO `department` VALUES (11, '小鱼', 2, 9, '2023-06-03 00:00:00', '2023-06-07 16:37:45', 1);
INSERT INTO `department` VALUES (12, '虾米', 3, 11, '2023-06-01 00:00:00', '2023-06-07 16:38:01', 1);

-- ----------------------------
-- Table structure for industry
-- ----------------------------
DROP TABLE IF EXISTS `industry`;
CREATE TABLE `industry`  (
  `INDUSTRY_ID` int NOT NULL AUTO_INCREMENT COMMENT '行业ID,主键自增',
  `INDUSTRY_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '行业名称',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`INDUSTRY_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '客户行业表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of industry
-- ----------------------------
INSERT INTO `industry` VALUES (1, '教育', '2012-12-12 00:00:00', '2023-06-07 15:34:02', 1);
INSERT INTO `industry` VALUES (2, '化学', '2022-11-15 00:00:00', '2023-06-07 15:33:59', 1);
INSERT INTO `industry` VALUES (3, '金融', '2022-11-09 00:00:00', '2023-06-07 15:33:56', 1);
INSERT INTO `industry` VALUES (4, '食品', '2022-11-09 00:00:00', '2023-06-05 19:10:14', 0);
INSERT INTO `industry` VALUES (5, '互联网', '2022-11-09 00:00:00', '2023-06-07 15:34:04', 1);
INSERT INTO `industry` VALUES (6, '科技', '2023-06-01 00:00:00', '2023-06-05 18:59:30', 1);
INSERT INTO `industry` VALUES (7, '军事', '2023-06-02 00:00:00', '2023-06-05 19:00:15', 1);

-- ----------------------------
-- Table structure for level
-- ----------------------------
DROP TABLE IF EXISTS `level`;
CREATE TABLE `level`  (
  `LEVEL_ID` int NOT NULL AUTO_INCREMENT COMMENT '客户级别ID,主键自增',
  `LEVEL_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '客户级别名称',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`LEVEL_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '客户级别表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of level
-- ----------------------------
INSERT INTO `level` VALUES (1, '青铜', '2022-11-22 00:00:00', '2023-06-06 09:26:38', 1);
INSERT INTO `level` VALUES (2, '白银', '2022-11-22 00:00:00', '2023-06-06 09:26:18', 1);
INSERT INTO `level` VALUES (3, '黄金', '2022-11-08 00:00:00', '2023-06-06 09:26:35', 1);
INSERT INTO `level` VALUES (4, '钻石', '2022-11-06 00:00:00', '2023-06-06 09:26:28', 1);
INSERT INTO `level` VALUES (5, '王者', '2023-06-15 00:00:00', '2023-06-05 16:39:15', 1);
INSERT INTO `level` VALUES (6, '荣耀', '2023-06-30 00:00:00', '2023-06-05 16:40:39', 1);

-- ----------------------------
-- Table structure for menus
-- ----------------------------
DROP TABLE IF EXISTS `menus`;
CREATE TABLE `menus`  (
  `MENU_ID` int NOT NULL AUTO_INCREMENT COMMENT '菜单ID,主键自增',
  `MENU_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '菜单名称',
  `MENU_URL` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '菜单地址',
  `LEVEL` int NULL DEFAULT 1 COMMENT '层级',
  `PARENT_ID` int NULL DEFAULT NULL COMMENT '父ID,关联menus表主键,默认值为0,表示菜单第一级',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '菜单状态 0:删除 1:未删除',
  PRIMARY KEY (`MENU_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '菜单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of menus
-- ----------------------------
INSERT INTO `menus` VALUES (1, '导航', '', 1, 0, '2022-11-02 00:00:00', '2023-06-06 11:08:53', 1);
INSERT INTO `menus` VALUES (2, '系统设置', '', 1, 0, '2022-11-02 05:09:19', '2022-11-01 21:09:20', 1);
INSERT INTO `menus` VALUES (3, '用户管理', '', 2, 2, '2022-11-02 05:09:29', '2022-11-01 21:09:30', 1);
INSERT INTO `menus` VALUES (4, '角色管理', '', 2, 2, '2022-11-02 05:09:44', '2022-11-01 21:09:45', 1);
INSERT INTO `menus` VALUES (5, '部门管理', '', 2, 2, '2022-11-02 05:09:54', '2022-11-01 21:09:55', 1);
INSERT INTO `menus` VALUES (6, '菜单管理', '', 2, 2, '2022-11-02 05:10:04', '2022-11-01 21:10:05', 1);
INSERT INTO `menus` VALUES (7, '基础数据', '', 1, 0, '2022-11-02 05:10:20', '2022-11-01 21:10:21', 1);
INSERT INTO `menus` VALUES (8, '产品管理', '', 2, 7, '2022-11-02 05:10:31', '2022-11-01 21:10:32', 1);
INSERT INTO `menus` VALUES (9, '客户管理', '', 2, 7, '2022-11-02 05:10:41', '2022-11-01 21:10:42', 1);
INSERT INTO `menus` VALUES (10, '供应商管理', '', 2, 7, '2022-11-02 05:10:53', '2022-11-01 21:10:54', 1);
INSERT INTO `menus` VALUES (11, '承运商管理', '', 2, 7, '2022-11-02 05:11:07', '2022-11-01 21:11:08', 1);
INSERT INTO `menus` VALUES (12, '仓库管理', '', 1, 0, '2022-11-02 05:11:33', '2022-11-01 21:11:34', 1);
INSERT INTO `menus` VALUES (13, '仓库管理', '', 2, 12, '2022-11-02 05:11:46', '2022-11-01 21:11:48', 1);
INSERT INTO `menus` VALUES (14, '货物入库', '', 2, 12, '2022-11-02 05:11:58', '2022-11-01 21:11:59', 1);
INSERT INTO `menus` VALUES (15, '货物出库', '', 2, 12, '2022-11-02 05:12:10', '2022-11-01 21:12:10', 1);
INSERT INTO `menus` VALUES (16, '库存查询', '', 2, 12, '2022-11-02 05:12:26', '2022-11-01 21:12:28', 1);
INSERT INTO `menus` VALUES (17, '字典管理', '', 1, 0, '2022-11-02 05:12:40', '2022-11-01 21:12:41', 1);
INSERT INTO `menus` VALUES (18, '产品类目', '', 2, 17, '2022-11-02 05:12:54', '2022-11-01 21:12:55', 1);
INSERT INTO `menus` VALUES (19, '客户级别', '', 2, 17, '2022-11-02 05:13:06', '2022-11-01 21:13:07', 1);
INSERT INTO `menus` VALUES (20, '客户来源', '', 2, 17, '2022-11-02 05:13:16', '2022-11-01 21:13:16', 1);
INSERT INTO `menus` VALUES (21, '日志管理', '', 1, 0, '2022-11-02 05:13:28', '2022-11-01 21:13:29', 1);
INSERT INTO `menus` VALUES (22, '系统日志', '', 2, 21, '2022-11-01 08:00:00', '2022-11-01 21:13:40', 1);
INSERT INTO `menus` VALUES (23, '登录日志', '', 2, 21, '2022-11-02 05:13:49', '2022-11-01 21:13:49', 1);
INSERT INTO `menus` VALUES (24, '商业智能', '', 2, 1, '2022-11-06 04:55:47', '2022-11-05 20:55:48', 1);
INSERT INTO `menus` VALUES (25, '曾经的你', '', 1, 0, '2023-06-03 00:00:00', '2023-06-06 10:59:48', 0);
INSERT INTO `menus` VALUES (26, '像风一样自由', '', 1, 0, '2023-06-01 00:00:00', '2023-06-06 11:09:07', 0);

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product`  (
  `PRODUCT_ID` int NOT NULL AUTO_INCREMENT COMMENT '产品ID,主键自增',
  `PRODUCT_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '产品名称',
  `CATEGORY_ID` int NOT NULL COMMENT '产品类目ID,关联类目表主键',
  `PRODUCT_SIZE` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '产品尺寸(长乘宽),单位 毫米(mm)',
  `PRODUCT_PRICE` double(16, 3) NULL DEFAULT NULL COMMENT '产品价格',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`PRODUCT_ID`) USING BTREE,
  INDEX `CATEGORY_ID`(`CATEGORY_ID`) USING BTREE,
  CONSTRAINT `product_ibfk_1` FOREIGN KEY (`CATEGORY_ID`) REFERENCES `category` (`CATEGORY_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '产品信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES (1, '衣服', 3, '200*200', 12000.000, '2022-11-17 00:00:00', '2023-06-07 08:50:25', 1);
INSERT INTO `product` VALUES (2, '裙子', 8, '1*100', 10000.000, '2023-06-06 00:00:00', '2023-06-08 15:59:06', 1);
INSERT INTO `product` VALUES (3, '坦克', 14, '1000*1000', 1222222222.000, '2023-06-02 00:00:00', '2023-06-09 08:20:02', 1);
INSERT INTO `product` VALUES (4, '鱼鹰', 14, '20000*20000', 20000000.000, '2023-06-06 00:00:00', '2023-06-09 08:20:04', 1);
INSERT INTO `product` VALUES (5, '车', 21, '188', 898989.000, '2023-06-06 00:00:00', '2023-06-08 17:57:12', 1);

-- ----------------------------
-- Table structure for record_in
-- ----------------------------
DROP TABLE IF EXISTS `record_in`;
CREATE TABLE `record_in`  (
  `RECORD_IN_ID` int NOT NULL AUTO_INCREMENT COMMENT '入库ID,主键自增',
  `SUPPLIER_ID` int NOT NULL COMMENT '供应商ID,关联供应商表主键',
  `PRODUCT_ID` int NOT NULL COMMENT '产品ID,关联产品表主键',
  `RECORD_IN_NUMBER` int NULL DEFAULT 0 COMMENT '入库数量',
  `RECORD_IN_TIME` datetime(0) NULL DEFAULT NULL COMMENT '入库时间',
  `USER_ID` int NOT NULL COMMENT '入库负责人ID,关联用户表主键',
  `REPO_ID` int NOT NULL COMMENT '仓库ID,关联仓库表主键',
  `REMARKS` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '备注',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`RECORD_IN_ID`) USING BTREE,
  INDEX `SUPPLIER_ID`(`SUPPLIER_ID`) USING BTREE,
  INDEX `PRODUCT_ID`(`PRODUCT_ID`) USING BTREE,
  INDEX `USER_ID`(`USER_ID`) USING BTREE,
  CONSTRAINT `record_in_ibfk_1` FOREIGN KEY (`SUPPLIER_ID`) REFERENCES `supplier` (`SUPPLIER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `record_in_ibfk_2` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `product` (`PRODUCT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `record_in_ibfk_3` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 34 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '入库记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of record_in
-- ----------------------------
INSERT INTO `record_in` VALUES (1, 2, 1, 0, '2022-12-11 22:14:22', 1, 1, NULL, '2022-12-11 22:14:22', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (2, 2, 1, 0, '2022-12-11 22:28:59', 1, 2, NULL, '2022-12-11 22:28:59', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (4, 2, 1, 0, '2023-01-08 10:15:18', 1, 1, NULL, '2023-01-08 10:15:18', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (5, 1, 1, 0, '2023-06-08 11:24:27', 10, 1, '', '2023-05-10 17:15:23', '2023-06-09 17:15:31', NULL);
INSERT INTO `record_in` VALUES (6, 3, 4, NULL, '2023-06-08 14:08:09', 10, 4, '', '2023-06-08 14:08:09', '2023-06-09 11:16:06', 1);
INSERT INTO `record_in` VALUES (7, 3, 4, 0, '2023-06-08 14:11:28', 10, 4, '', '2023-06-08 14:11:28', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (8, 1, 3, 0, '2023-06-08 15:48:20', 10, 4, '', '2023-06-08 15:48:20', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (9, 1, 3, 0, '2023-06-08 15:49:49', 10, 4, '', '2023-06-08 15:49:49', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (10, 1, 4, 0, '2023-06-08 16:32:23', 13, 4, '', '2023-06-08 16:32:23', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (11, 1, 5, 0, '2023-06-08 21:35:14', 10, 3, '', '2023-06-08 21:35:14', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (12, 2, 2, 0, '2023-06-08 21:36:09', 10, 3, '', '2023-06-08 21:36:09', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (13, 2, 2, 0, '2023-06-09 08:04:17', 10, 4, '', '2023-06-09 08:04:17', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (14, 2, 4, 0, '2023-06-09 08:34:13', 13, 1, '', '2023-06-09 08:34:13', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (15, 3, 5, 0, '2023-06-09 08:48:51', 13, 2, '', '2023-06-09 08:48:51', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (16, 1, 3, 0, '2023-06-09 10:15:03', 13, 3, '', '2023-06-09 10:15:03', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (17, 2, 3, 0, '2023-06-09 10:24:48', 13, 1, '', '2023-06-09 10:24:48', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (18, 3, 1, 0, '2023-06-09 10:35:19', 13, 2, '', '2023-06-09 10:35:19', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (19, 1, 2, 0, '2023-06-09 10:36:41', 13, 2, '', '2023-06-09 10:36:41', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (20, 2, 4, 0, '2023-06-09 10:38:00', 13, 3, '', '2023-06-09 10:38:00', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (21, 1, 5, 0, '2023-06-09 10:41:13', 13, 3, '', '2023-06-09 10:41:13', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (22, 2, 1, 0, '2023-06-09 10:41:38', 13, 3, '', '2023-06-09 10:41:38', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (23, 1, 2, 0, '2023-06-09 10:42:05', 13, 3, '', '2023-06-09 10:42:05', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (24, 1, 1, 0, '2023-06-09 10:46:20', 13, 2, '', '2023-06-09 10:46:20', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (25, 2, 2, 0, '2023-06-09 10:53:11', 13, 1, '', '2023-06-09 10:53:11', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (26, 2, 2, 0, '2023-06-09 11:09:55', 13, 1, '', '2023-06-09 11:09:55', '2023-06-09 11:16:00', 1);
INSERT INTO `record_in` VALUES (27, 1, 1, 100, '2023-06-09 11:17:00', 13, 1, '', '2023-06-09 11:17:00', '2023-06-09 11:17:00', 1);
INSERT INTO `record_in` VALUES (28, 2, 5, 100, '2023-06-09 11:30:12', 13, 2, '', '2023-06-09 11:30:12', '2023-06-09 11:30:12', 1);
INSERT INTO `record_in` VALUES (29, 3, 1, 50, '2023-06-09 11:50:33', 13, 3, '', '2023-06-09 11:50:33', '2023-06-09 11:50:33', 1);
INSERT INTO `record_in` VALUES (30, 4, 1, 80, '2023-06-09 11:51:20', 13, 4, '', '2023-06-09 11:51:20', '2023-06-09 11:51:20', 1);
INSERT INTO `record_in` VALUES (31, 4, 3, 200, '2023-06-09 11:51:58', 13, 2, '', '2023-06-09 11:51:58', '2023-06-09 11:51:58', 1);
INSERT INTO `record_in` VALUES (32, 2, 1, 6, '2023-06-09 11:57:18', 13, 1, '', '2023-06-09 11:57:18', '2023-06-09 11:57:18', 1);
INSERT INTO `record_in` VALUES (33, 1, 1, 1, '2023-06-09 13:52:29', 13, 1, '', '2023-06-09 13:52:29', '2023-06-09 13:52:29', 1);

-- ----------------------------
-- Table structure for record_out
-- ----------------------------
DROP TABLE IF EXISTS `record_out`;
CREATE TABLE `record_out`  (
  `RECORD_OUT_ID` int NOT NULL AUTO_INCREMENT COMMENT '出库ID,主键自增',
  `CUSTOMER_ID` int NOT NULL COMMENT '客户ID,关联客户表主键',
  `PRODUCT_ID` int NOT NULL COMMENT '产品ID,关联产品表主键',
  `RECORD_OUT_NUMBER` int NULL DEFAULT 0 COMMENT '出库数量',
  `RECORD_OUT_TIME` datetime(0) NULL DEFAULT NULL COMMENT '出库时间',
  `USER_ID` int NOT NULL COMMENT '出库负责人ID,关联用户表主键',
  `REPO_ID` int NOT NULL COMMENT '仓库ID,关联仓库表主键',
  `REMARKS` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '备注',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`RECORD_OUT_ID`) USING BTREE,
  INDEX `CUSTOMER_ID`(`CUSTOMER_ID`) USING BTREE,
  INDEX `PRODUCT_ID`(`PRODUCT_ID`) USING BTREE,
  INDEX `USER_ID`(`USER_ID`) USING BTREE,
  CONSTRAINT `record_out_ibfk_1` FOREIGN KEY (`CUSTOMER_ID`) REFERENCES `customer` (`CUSTOMER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `record_out_ibfk_2` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `product` (`PRODUCT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `record_out_ibfk_3` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '出库记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of record_out
-- ----------------------------
INSERT INTO `record_out` VALUES (1, 1, 1, 0, '2022-12-10 23:56:03', 1, 1, NULL, '2022-12-10 23:56:03', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (2, 1, 1, 0, '2022-12-10 23:56:29', 1, 1, NULL, '2022-12-10 23:56:29', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (3, 1, 1, 0, '2022-12-11 22:15:27', 1, 1, NULL, '2022-12-11 22:15:27', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (4, 1, 1, 0, '2022-12-11 22:15:37', 1, 1, NULL, '2022-12-11 22:15:37', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (5, 2, 1, 0, '2023-01-08 10:15:40', 1, 1, NULL, '2023-01-08 10:15:40', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (6, 1, 1, 0, '2023-06-08 12:33:33', 10, 1, '', '2023-06-08 12:33:33', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (7, 1, 1, 0, '2023-06-08 12:33:48', 10, 1, '', '2023-06-08 12:33:48', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (8, 1, 1, 0, '2023-06-08 12:35:18', 10, 1, '', '2023-06-08 12:35:18', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (9, 2, 4, 0, '2023-06-08 14:11:48', 10, 4, '', '2023-06-08 14:11:48', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (10, 3, 3, 0, '2023-06-08 15:50:06', 10, 4, '', '2023-06-08 15:50:06', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (11, 4, 1, 0, '2023-06-08 21:32:47', 10, 2, '', '2023-06-08 21:32:47', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (12, 2, 1, 0, '2023-06-08 21:33:06', 10, 2, '', '2023-06-08 21:33:06', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (13, 2, 2, 0, '2023-06-08 21:36:27', 10, 3, '', '2023-06-08 21:36:27', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (14, 4, 2, 0, '2023-06-08 21:40:42', 13, 3, '', '2023-06-08 21:40:42', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (15, 2, 2, 0, '2023-06-09 08:03:12', 10, 3, '', '2023-06-09 08:03:12', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (16, 2, 2, 0, '2023-06-09 10:11:59', 13, 4, '', '2023-06-09 10:11:59', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (17, 4, 2, 0, '2023-06-09 10:14:04', 13, 4, '', '2023-06-09 10:14:04', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (18, 2, 4, 0, '2023-06-09 10:22:22', 13, 1, '', '2023-06-09 10:22:22', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (19, 2, 5, 0, '2023-06-09 10:24:03', 13, 2, '', '2023-06-09 10:24:03', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (20, 2, 3, 0, '2023-06-09 10:27:17', 13, 1, '', '2023-06-09 10:27:17', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (21, 2, 5, 0, '2023-06-09 10:29:05', 13, 2, '', '2023-06-09 10:29:05', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (22, 2, 1, 0, '2023-06-09 10:36:10', 13, 2, '', '2023-06-09 10:36:10', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (23, 1, 1, 0, '2023-06-09 10:36:27', 13, 2, '', '2023-06-09 10:36:27', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (24, 2, 3, 0, '2023-06-09 10:38:27', 13, 1, '', '2023-06-09 10:38:27', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (25, 2, 1, 0, '2023-06-09 10:41:53', 13, 3, '', '2023-06-09 10:41:53', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (26, 2, 2, 0, '2023-06-09 10:42:33', 13, 2, '', '2023-06-09 10:42:33', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (27, 2, 3, 0, '2023-06-09 10:50:38', 13, 1, '', '2023-06-09 10:50:38', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (28, 4, 2, 0, '2023-06-09 10:52:10', 13, 3, '', '2023-06-09 10:52:10', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (29, 1, 2, 0, '2023-06-09 10:53:27', 13, 1, '', '2023-06-09 10:53:27', '2023-06-09 11:16:27', 1);
INSERT INTO `record_out` VALUES (30, 1, 1, 100, '2023-06-09 11:18:43', 13, 1, '', '2023-06-09 11:18:43', '2023-06-09 11:18:43', 1);
INSERT INTO `record_out` VALUES (31, 1, 1, 50, '2023-06-09 11:50:00', 13, 2, '', '2023-06-09 11:50:00', '2023-06-09 11:50:00', 1);
INSERT INTO `record_out` VALUES (32, 3, 1, 30, '2023-06-09 11:51:33', 13, 4, '', '2023-06-09 11:51:33', '2023-06-09 11:51:33', 1);
INSERT INTO `record_out` VALUES (33, 2, 2, 30, '2023-06-09 11:52:18', 13, 3, '', '2023-06-09 11:52:18', '2023-06-09 11:52:18', 1);
INSERT INTO `record_out` VALUES (34, 4, 3, 100, '2023-06-09 11:56:36', 13, 4, '', '2023-06-09 11:56:36', '2023-06-09 11:56:36', 1);
INSERT INTO `record_out` VALUES (35, 2, 1, 90, '2023-06-09 11:56:54', 13, 2, '', '2023-06-09 11:56:54', '2023-06-09 11:56:54', 1);
INSERT INTO `record_out` VALUES (36, 2, 1, 3, '2023-06-09 11:57:08', 13, 1, '', '2023-06-09 11:57:08', '2023-06-09 11:57:08', 1);
INSERT INTO `record_out` VALUES (37, 3, 3, 100, '2023-06-09 16:48:33', 10, 3, '', '2023-06-09 16:48:33', '2023-06-09 16:48:33', 1);

-- ----------------------------
-- Table structure for record_stock
-- ----------------------------
DROP TABLE IF EXISTS `record_stock`;
CREATE TABLE `record_stock`  (
  `PRODUCT_ID` int NOT NULL COMMENT '产品ID,关联产品表主键',
  `REPO_ID` int NOT NULL COMMENT '仓库ID,关联仓库表主键',
  `PRODUCT_STOCK` int NULL DEFAULT 0 COMMENT '库存数量',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`PRODUCT_ID`, `REPO_ID`) USING BTREE,
  INDEX `REPO_ID`(`REPO_ID`) USING BTREE,
  CONSTRAINT `record_stock_ibfk_1` FOREIGN KEY (`PRODUCT_ID`) REFERENCES `product` (`PRODUCT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `record_stock_ibfk_2` FOREIGN KEY (`REPO_ID`) REFERENCES `repository` (`REPO_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '库存记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of record_stock
-- ----------------------------
INSERT INTO `record_stock` VALUES (1, 1, 13, '2022-12-09 22:14:37', '2023-06-09 13:52:29', 1);
INSERT INTO `record_stock` VALUES (1, 2, 67, '2022-12-11 22:28:59', '2023-06-09 11:56:54', 1);
INSERT INTO `record_stock` VALUES (1, 3, 50, '2023-06-09 10:41:38', '2023-06-09 11:50:33', 1);
INSERT INTO `record_stock` VALUES (1, 4, 50, '2023-06-09 11:51:20', '2023-06-09 11:51:33', 1);
INSERT INTO `record_stock` VALUES (2, 1, 200, '2023-06-09 10:53:11', '2023-06-09 11:09:55', 1);
INSERT INTO `record_stock` VALUES (2, 2, 0, '2023-06-09 10:36:41', '2023-06-09 10:42:33', 1);
INSERT INTO `record_stock` VALUES (2, 3, 70, '2023-06-08 21:36:09', '2023-06-09 11:52:18', 1);
INSERT INTO `record_stock` VALUES (2, 4, 50, '2023-06-09 08:04:17', '2023-06-09 10:14:04', 1);
INSERT INTO `record_stock` VALUES (3, 1, 0, '2023-06-09 10:24:48', '2023-06-09 10:50:38', 1);
INSERT INTO `record_stock` VALUES (3, 2, 200, '2023-06-09 11:51:58', '2023-06-09 11:51:58', 1);
INSERT INTO `record_stock` VALUES (3, 3, 0, '2023-06-09 10:15:03', '2023-06-09 16:48:33', 1);
INSERT INTO `record_stock` VALUES (3, 4, 0, '2023-06-08 15:48:20', '2023-06-09 11:56:36', 1);
INSERT INTO `record_stock` VALUES (4, 1, 50, '2023-06-09 08:34:13', '2023-06-09 10:22:22', 1);
INSERT INTO `record_stock` VALUES (4, 3, 100, '2023-06-09 10:38:00', '2023-06-09 10:38:00', 1);
INSERT INTO `record_stock` VALUES (4, 4, 25, '2023-06-08 14:11:28', '2023-06-08 16:32:23', 1);
INSERT INTO `record_stock` VALUES (5, 2, 100, '2023-06-09 08:48:51', '2023-06-09 11:30:12', 1);
INSERT INTO `record_stock` VALUES (5, 3, 102, '2023-06-08 21:35:14', '2023-06-09 10:41:13', 1);

-- ----------------------------
-- Table structure for repository
-- ----------------------------
DROP TABLE IF EXISTS `repository`;
CREATE TABLE `repository`  (
  `REPO_ID` int NOT NULL AUTO_INCREMENT COMMENT '仓库ID,主键自增',
  `REPO_ADDRESS` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '仓库地址',
  `REPO_AREA` varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '仓库面积,单位:平方米',
  `REPO_DESC` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '仓库描述(备注)',
  `REPO_STATUS` tinyint NULL DEFAULT 1 COMMENT '仓库状态 0:故障 1:正常 2:已满 3:废弃',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  `REPO_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '仓库名称',
  PRIMARY KEY (`REPO_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '仓库信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of repository
-- ----------------------------
INSERT INTO `repository` VALUES (1, '南京市建邺区1', '100011平米', '大仓库12', 1, '2022-12-27 00:00:00', '2023-06-09 08:06:29', 1, '南京市建邺区仓库1');
INSERT INTO `repository` VALUES (2, '南京市江宁区1', '100', '小仓库', 1, '2022-11-18 07:07:05', '2023-06-08 08:41:07', 1, '南京市江宁区仓库1');
INSERT INTO `repository` VALUES (3, '北京市昌平区北七家', '200000', '混合仓库', 1, '2023-01-08 10:16:54', '2023-06-08 08:41:09', 1, '北京昌平仓库');
INSERT INTO `repository` VALUES (4, '6', '6', '6', 1, '2023-06-02 00:00:00', '2023-06-08 19:45:49', 1, '6');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `ROLE_ID` int NOT NULL AUTO_INCREMENT COMMENT '角色ID,主键自增',
  `ROLE_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '角色名称',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`ROLE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '角色表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, '平台管理员', '2022-11-03 00:00:00', '2023-06-09 15:36:50', 1);
INSERT INTO `role` VALUES (2, '仓库管理员', '2022-11-03 00:00:00', '2023-06-08 15:58:25', 1);
INSERT INTO `role` VALUES (3, '客户管理员', '2023-06-05 00:00:00', '2023-06-08 15:58:27', 1);
INSERT INTO `role` VALUES (4, '供应商管理员', '2023-06-02 00:00:00', '2023-06-08 15:58:29', 1);
INSERT INTO `role` VALUES (5, '客户管理员', '2023-06-01 00:00:00', '2023-06-09 16:23:50', 0);

-- ----------------------------
-- Table structure for role_menus
-- ----------------------------
DROP TABLE IF EXISTS `role_menus`;
CREATE TABLE `role_menus`  (
  `ROLE_ID` int NOT NULL COMMENT '角色ID,关联角色表主键',
  `MENU_ID` int NOT NULL COMMENT '菜单ID,关联菜单表主键',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`ROLE_ID`, `MENU_ID`) USING BTREE,
  INDEX `MENU_ID`(`MENU_ID`) USING BTREE,
  CONSTRAINT `role_menus_ibfk_1` FOREIGN KEY (`ROLE_ID`) REFERENCES `role` (`ROLE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `role_menus_ibfk_2` FOREIGN KEY (`MENU_ID`) REFERENCES `menus` (`MENU_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '角色菜单关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_menus
-- ----------------------------

-- ----------------------------
-- Table structure for source
-- ----------------------------
DROP TABLE IF EXISTS `source`;
CREATE TABLE `source`  (
  `SOURCE_ID` int NOT NULL AUTO_INCREMENT COMMENT '客户来源ID,主键自增',
  `SOURCE_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '客户来源名称',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`SOURCE_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '客户来源表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of source
-- ----------------------------
INSERT INTO `source` VALUES (1, '百度', '2021-12-13 00:00:00', '2023-06-06 09:26:44', 1);
INSERT INTO `source` VALUES (2, '转介绍', '2022-11-21 00:00:00', '2023-06-05 17:27:48', 0);
INSERT INTO `source` VALUES (3, '官网', '2022-11-08 00:00:00', '2023-06-05 17:28:27', 1);
INSERT INTO `source` VALUES (4, '客户推荐', '2022-11-08 00:00:00', '2023-06-05 17:28:29', 1);
INSERT INTO `source` VALUES (5, '电话', '2022-11-09 00:00:00', '2023-06-05 17:25:20', 0);
INSERT INTO `source` VALUES (6, '自谈', '2022-11-09 06:28:41', '2023-06-05 17:11:28', 0);
INSERT INTO `source` VALUES (7, '小红书', '2023-06-06 00:00:00', '2023-06-05 17:28:10', 1);
INSERT INTO `source` VALUES (8, '知乎', '2023-06-01 00:00:00', '2023-06-05 17:28:57', 0);

-- ----------------------------
-- Table structure for supplier
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier`  (
  `SUPPLIER_ID` int NOT NULL AUTO_INCREMENT COMMENT '供应商ID,主键自增',
  `SUPPLIER_NAME` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '供应商信息,如果为个人(非公司),那么当前字段和SUPPLIER_LEADER信息相同,如果为公司,那么是公司名称',
  `SUPPLIER_LEADER` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '负责人,如果为个人(非公司),那么当前字段和SUPPLIER_NAME信息相同',
  `SUPPLIER_TEL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '联系电话',
  `SUPPLIER_EMAIL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '邮箱',
  `SUPPLIER_ADDRESS` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '地址',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`SUPPLIER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '供应商信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES (1, '河北防爆', '大萝卜', '129999999', 'hbfb@163.com', '北京市昌平区', '2022-12-12 00:00:00', '2023-06-08 21:34:53', 1);
INSERT INTO `supplier` VALUES (2, '供应商名字011', '供应商联系人022', '12345678901', 'gys@163.com', '南京市建邺区南苑街道', '2022-11-10 00:00:00', '2023-06-08 21:34:56', 1);
INSERT INTO `supplier` VALUES (3, '2', '2', '2', '2', '2', '2023-06-01 00:00:00', '2023-06-08 21:34:59', 1);
INSERT INTO `supplier` VALUES (4, '000', '000', '00', '00', '000', '2023-06-02 00:00:00', '2023-06-09 10:48:39', 1);

-- ----------------------------
-- Table structure for sys_log
-- ----------------------------
DROP TABLE IF EXISTS `sys_log`;
CREATE TABLE `sys_log`  (
  `log_id` bigint NOT NULL AUTO_INCREMENT COMMENT '日志ID',
  `type` int NULL DEFAULT 1 COMMENT '日志类型 1:登陆日志; 0:其他日志',
  `ip_addr` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '请求地址',
  `method_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '请求方法名称',
  `method` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '请求方式',
  `nick_name` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '昵称',
  `create_time` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  PRIMARY KEY (`log_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6463 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '日志记录表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_log
-- ----------------------------
INSERT INTO `sys_log` VALUES (6409, 0, '0:0:0:0:0:0:0:1', 'sysLogList', 'GET', '测试名称', '2023-06-09 16:48:02');
INSERT INTO `sys_log` VALUES (6410, 0, '0:0:0:0:0:0:0:1', 'stockData', 'GET', '测试名称', '2023-06-09 16:48:06');
INSERT INTO `sys_log` VALUES (6411, 0, '0:0:0:0:0:0:0:1', 'everyStock', 'GET', '测试名称', '2023-06-09 16:48:06');
INSERT INTO `sys_log` VALUES (6412, 0, '0:0:0:0:0:0:0:1', 'todayStock', 'GET', '测试名称', '2023-06-09 16:48:06');
INSERT INTO `sys_log` VALUES (6413, 0, '0:0:0:0:0:0:0:1', 'todayOut', 'GET', '测试名称', '2023-06-09 16:48:06');
INSERT INTO `sys_log` VALUES (6414, 0, '0:0:0:0:0:0:0:1', 'todayIn', 'GET', '测试名称', '2023-06-09 16:48:06');
INSERT INTO `sys_log` VALUES (6415, 0, '0:0:0:0:0:0:0:1', 'repoAll', 'GET', '测试名称', '2023-06-09 16:48:14');
INSERT INTO `sys_log` VALUES (6416, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:14');
INSERT INTO `sys_log` VALUES (6417, 0, '0:0:0:0:0:0:0:1', 'productUpdate', 'GET', '测试名称', '2023-06-09 16:48:14');
INSERT INTO `sys_log` VALUES (6418, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:19');
INSERT INTO `sys_log` VALUES (6419, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:19');
INSERT INTO `sys_log` VALUES (6420, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:21');
INSERT INTO `sys_log` VALUES (6421, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:21');
INSERT INTO `sys_log` VALUES (6422, 0, '0:0:0:0:0:0:0:1', 'productSingle', 'GET', '测试名称', '2023-06-09 16:48:22');
INSERT INTO `sys_log` VALUES (6423, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:22');
INSERT INTO `sys_log` VALUES (6424, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:22');
INSERT INTO `sys_log` VALUES (6425, 0, '0:0:0:0:0:0:0:1', 'productSingle', 'GET', '测试名称', '2023-06-09 16:48:24');
INSERT INTO `sys_log` VALUES (6426, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:24');
INSERT INTO `sys_log` VALUES (6427, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:24');
INSERT INTO `sys_log` VALUES (6428, 0, '0:0:0:0:0:0:0:1', 'productSingle', 'GET', '测试名称', '2023-06-09 16:48:25');
INSERT INTO `sys_log` VALUES (6429, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:25');
INSERT INTO `sys_log` VALUES (6430, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:25');
INSERT INTO `sys_log` VALUES (6431, 0, '0:0:0:0:0:0:0:1', 'productSingle', 'GET', '测试名称', '2023-06-09 16:48:27');
INSERT INTO `sys_log` VALUES (6432, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:27');
INSERT INTO `sys_log` VALUES (6433, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:27');
INSERT INTO `sys_log` VALUES (6434, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:28');
INSERT INTO `sys_log` VALUES (6435, 0, '0:0:0:0:0:0:0:1', 'productSingle', 'GET', '测试名称', '2023-06-09 16:48:28');
INSERT INTO `sys_log` VALUES (6436, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:28');
INSERT INTO `sys_log` VALUES (6437, 0, '0:0:0:0:0:0:0:1', 'productSingle', 'GET', '测试名称', '2023-06-09 16:48:30');
INSERT INTO `sys_log` VALUES (6438, 0, '0:0:0:0:0:0:0:1', 'customerAll', 'GET', '测试名称', '2023-06-09 16:48:30');
INSERT INTO `sys_log` VALUES (6439, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:30');
INSERT INTO `sys_log` VALUES (6440, 0, '0:0:0:0:0:0:0:1', 'recordOut', 'POST', '测试名称', '2023-06-09 16:48:33');
INSERT INTO `sys_log` VALUES (6441, 0, '0:0:0:0:0:0:0:1', 'resNum', 'GET', '测试名称', '2023-06-09 16:48:33');
INSERT INTO `sys_log` VALUES (6442, 0, '0:0:0:0:0:0:0:1', 'stockData', 'GET', '测试名称', '2023-06-09 16:48:35');
INSERT INTO `sys_log` VALUES (6443, 0, '0:0:0:0:0:0:0:1', 'everyStock', 'GET', '测试名称', '2023-06-09 16:48:35');
INSERT INTO `sys_log` VALUES (6444, 0, '0:0:0:0:0:0:0:1', 'todayStock', 'GET', '测试名称', '2023-06-09 16:48:35');
INSERT INTO `sys_log` VALUES (6445, 0, '0:0:0:0:0:0:0:1', 'todayIn', 'GET', '测试名称', '2023-06-09 16:48:35');
INSERT INTO `sys_log` VALUES (6446, 0, '0:0:0:0:0:0:0:1', 'todayOut', 'GET', '测试名称', '2023-06-09 16:48:35');
INSERT INTO `sys_log` VALUES (6447, 0, '0:0:0:0:0:0:0:1', 'userList', 'GET', '测试名称', '2023-06-09 16:49:07');
INSERT INTO `sys_log` VALUES (6448, 0, '0:0:0:0:0:0:0:1', 'roleAll', 'GET', '测试名称', '2023-06-09 16:49:07');
INSERT INTO `sys_log` VALUES (6449, 0, '0:0:0:0:0:0:0:1', 'deptAll', 'GET', '测试名称', '2023-06-09 16:49:07');
INSERT INTO `sys_log` VALUES (6450, 0, '0:0:0:0:0:0:0:1', 'logout', 'GET', '测试名称', '2023-06-09 16:49:13');
INSERT INTO `sys_log` VALUES (6451, 1, '0:0:0:0:0:0:0:1', 'token', 'GET', '测试名称', '2023-06-09 16:49:22');
INSERT INTO `sys_log` VALUES (6452, 1, '0:0:0:0:0:0:0:1', 'login', 'GET', '测试名称', '2023-06-09 16:49:22');
INSERT INTO `sys_log` VALUES (6453, 0, '0:0:0:0:0:0:0:1', 'userList', 'GET', '测试名称', '2023-06-09 16:49:22');
INSERT INTO `sys_log` VALUES (6454, 0, '0:0:0:0:0:0:0:1', 'roleAll', 'GET', '测试名称', '2023-06-09 16:49:22');
INSERT INTO `sys_log` VALUES (6455, 0, '0:0:0:0:0:0:0:1', 'deptAll', 'GET', '测试名称', '2023-06-09 16:49:22');
INSERT INTO `sys_log` VALUES (6456, 1, '0:0:0:0:0:0:0:1', 'token', 'GET', '测试名称', '2023-06-10 10:53:47');
INSERT INTO `sys_log` VALUES (6457, 1, '0:0:0:0:0:0:0:1', 'login', 'GET', '测试名称', '2023-06-10 10:53:48');
INSERT INTO `sys_log` VALUES (6458, 0, '0:0:0:0:0:0:0:1', 'todayStock', 'GET', '测试名称', '2023-06-10 10:53:48');
INSERT INTO `sys_log` VALUES (6459, 0, '0:0:0:0:0:0:0:1', 'everyStock', 'GET', '测试名称', '2023-06-10 10:53:48');
INSERT INTO `sys_log` VALUES (6460, 0, '0:0:0:0:0:0:0:1', 'stockData', 'GET', '测试名称', '2023-06-10 10:53:48');
INSERT INTO `sys_log` VALUES (6461, 0, '0:0:0:0:0:0:0:1', 'todayOut', 'GET', '测试名称', '2023-06-10 10:53:48');
INSERT INTO `sys_log` VALUES (6462, 0, '0:0:0:0:0:0:0:1', 'todayIn', 'GET', '测试名称', '2023-06-10 10:53:48');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `USER_ID` int NOT NULL AUTO_INCREMENT COMMENT '用户ID,主键自增',
  `USER_NAME` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '用户名',
  `USER_TEL` varchar(20) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '联系电话',
  `USER_EMAIL` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '邮箱',
  `USER_NICK` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT 'WMS' COMMENT '用户昵称',
  `PASSWORD` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NOT NULL COMMENT '密码',
  `SALT` varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '盐值',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  `AVATAR` varchar(255) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT '/img/avatar.jpeg' COMMENT '头像',
  PRIMARY KEY (`USER_ID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, '张三', '18288888888', 'z3@163.com', '大萝卜张三', 'a38b872c85e9096dd2d97b5dbe482861', 'a38b872c85e9096dd2d97b5dbe482861', '2022-11-04 00:00:00', '2023-06-06 20:12:42', 1, '666');
INSERT INTO `user` VALUES (2, '李四', '18333333321', 'q@q.com', '大萝卜123', '074a99bbd19a11ca921a7b12afffc8bc', '074a99bbd19a11ca921a7b12afffc8bc', '2022-11-05 00:00:00', '2023-06-06 20:12:45', 1, '666');
INSERT INTO `user` VALUES (3, '李雷', '13313676789', 'll@163.com', '雷子', '51b4f11a197f52d062d4825a47486cd4', '51b4f11a197f52d062d4825a47486cd4', '2022-11-21 00:00:00', '2023-06-06 20:12:51', 1, '666');
INSERT INTO `user` VALUES (10, '龙', '780273', '1@com', '小龙人', '1', '1', '2023-06-06 00:00:00', '2023-06-06 20:12:58', 1, '666');
INSERT INTO `user` VALUES (11, '泡泡', '7382930', '2@com', '心如铁', '789', '789', '2023-06-02 00:00:00', '2023-06-06 20:13:08', 1, '666');
INSERT INTO `user` VALUES (12, '1000x', '12383294', '6@com', 'tellme', '23794', '23794', '2023-06-05 00:00:00', '2023-06-07 15:00:29', 1, '666');
INSERT INTO `user` VALUES (13, '不知道', '2', '2', '2', '2', '2', '2023-06-01 00:00:00', '2023-06-09 15:41:39', 1, '666');
INSERT INTO `user` VALUES (14, '3', '3', '3', '3', '3', '3', '2023-06-06 00:00:00', '2023-06-09 16:19:02', 1, '666');
INSERT INTO `user` VALUES (15, '4', '4', '4', '4', '4', '4', '2023-06-02 00:00:00', '2023-06-09 16:21:21', 1, '666');

-- ----------------------------
-- Table structure for user_department
-- ----------------------------
DROP TABLE IF EXISTS `user_department`;
CREATE TABLE `user_department`  (
  `DEPT_ID` int NOT NULL COMMENT '部门ID',
  `USER_ID` int NOT NULL COMMENT '用户ID',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`USER_ID`, `DEPT_ID`) USING BTREE,
  INDEX `DEPT_ID`(`DEPT_ID`) USING BTREE,
  CONSTRAINT `user_department_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_department_ibfk_2` FOREIGN KEY (`DEPT_ID`) REFERENCES `department` (`DEPT_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户部门关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_department
-- ----------------------------
INSERT INTO `user_department` VALUES (3, 1, '2022-11-04 05:40:53', '2023-06-06 20:12:42', 1);
INSERT INTO `user_department` VALUES (5, 1, '2022-11-04 05:40:53', '2023-06-06 20:12:42', 1);
INSERT INTO `user_department` VALUES (6, 1, '2022-11-04 05:40:53', '2023-06-06 20:12:42', 1);
INSERT INTO `user_department` VALUES (7, 1, '2022-11-04 05:40:53', '2023-06-06 20:12:42', 1);
INSERT INTO `user_department` VALUES (5, 2, '2022-11-05 05:33:54', '2023-06-06 20:12:45', 1);
INSERT INTO `user_department` VALUES (7, 2, '2022-11-05 05:33:54', '2023-06-06 20:12:45', 1);
INSERT INTO `user_department` VALUES (6, 3, '2022-11-21 02:11:17', '2023-06-06 20:12:51', 1);
INSERT INTO `user_department` VALUES (1, 10, '2023-06-06 19:18:00', '2023-06-06 20:12:58', 1);
INSERT INTO `user_department` VALUES (3, 10, '2023-06-06 19:18:00', '2023-06-06 20:12:58', 1);
INSERT INTO `user_department` VALUES (7, 11, '2023-06-02 00:00:00', '2023-06-06 20:13:08', 1);
INSERT INTO `user_department` VALUES (8, 11, '2023-06-02 00:00:00', '2023-06-06 20:13:08', 1);
INSERT INTO `user_department` VALUES (9, 12, '2023-06-05 00:00:00', '2023-06-07 15:00:29', 1);
INSERT INTO `user_department` VALUES (9, 13, '2023-06-01 00:00:00', '2023-06-09 15:41:39', 1);
INSERT INTO `user_department` VALUES (8, 14, '2023-06-06 00:00:00', '2023-06-09 16:19:03', 1);
INSERT INTO `user_department` VALUES (9, 15, '2023-06-02 00:00:00', '2023-06-09 16:21:21', 1);

-- ----------------------------
-- Table structure for user_repository
-- ----------------------------
DROP TABLE IF EXISTS `user_repository`;
CREATE TABLE `user_repository`  (
  `REPO_ID` int NOT NULL COMMENT '仓库ID',
  `USER_ID` int NOT NULL COMMENT '用户ID',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`REPO_ID`, `USER_ID`) USING BTREE,
  INDEX `USER_ID`(`USER_ID`) USING BTREE,
  CONSTRAINT `user_repository_ibfk_1` FOREIGN KEY (`REPO_ID`) REFERENCES `repository` (`REPO_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_repository_ibfk_2` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户仓库关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_repository
-- ----------------------------
INSERT INTO `user_repository` VALUES (4, 10, '2023-06-02 00:00:00', '2023-06-08 08:52:15', 1);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `USER_ID` int NOT NULL COMMENT '用户ID,关联用户表主键',
  `ROLE_ID` int NOT NULL COMMENT '角色ID,关联角色表主键',
  `CREATE_TIME` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `UPDATE_TIME` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '设置当前时间，并且自动更更新时间',
  `IS_DELETE` int NULL DEFAULT 1 COMMENT '是否删除 0:删除 1:未删除',
  PRIMARY KEY (`USER_ID`, `ROLE_ID`) USING BTREE,
  INDEX `ROLE_ID`(`ROLE_ID`) USING BTREE,
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`USER_ID`) REFERENCES `user` (`USER_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`ROLE_ID`) REFERENCES `role` (`ROLE_ID`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci COMMENT = '用户角色关联表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1, '2022-11-04 05:40:53', '2023-06-06 20:12:42', 1);
INSERT INTO `user_role` VALUES (1, 2, '2022-11-04 05:40:53', '2023-06-06 20:12:42', 1);
INSERT INTO `user_role` VALUES (2, 1, '2022-11-05 05:33:54', '2023-06-06 20:12:45', 1);
INSERT INTO `user_role` VALUES (3, 1, '2022-11-21 02:11:17', '2023-06-06 20:12:51', 1);
INSERT INTO `user_role` VALUES (10, 1, '2023-06-06 19:18:00', '2023-06-06 20:12:58', 1);
INSERT INTO `user_role` VALUES (10, 2, '2023-06-06 19:18:00', '2023-06-06 20:12:58', 1);
INSERT INTO `user_role` VALUES (11, 2, '2023-06-02 00:00:00', '2023-06-06 20:13:08', 1);
INSERT INTO `user_role` VALUES (11, 3, '2023-06-02 00:00:00', '2023-06-06 20:13:08', 1);
INSERT INTO `user_role` VALUES (12, 1, '2023-06-05 00:00:00', '2023-06-07 15:00:29', 1);
INSERT INTO `user_role` VALUES (13, 3, '2023-06-01 00:00:00', '2023-06-09 15:41:39', 1);
INSERT INTO `user_role` VALUES (14, 2, '2023-06-06 00:00:00', '2023-06-09 16:19:03', 1);
INSERT INTO `user_role` VALUES (15, 4, '2023-06-02 00:00:00', '2023-06-09 16:21:21', 1);

SET FOREIGN_KEY_CHECKS = 1;
