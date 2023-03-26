/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:13306
 Source Schema         : gccmap

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 26/03/2023 23:13:52
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for canteen
-- ----------------------------
DROP TABLE IF EXISTS `canteen`;
CREATE TABLE `canteen`  (
  `canteen_id` int NOT NULL,
  `canteen_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `left` int NOT NULL,
  `top` int NOT NULL,
  PRIMARY KEY (`canteen_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of canteen
-- ----------------------------
INSERT INTO `canteen` VALUES (1, '教师食堂', 50, 44);
INSERT INTO `canteen` VALUES (2, '同乐圆', 70, 57);
INSERT INTO `canteen` VALUES (3, '同德园', 51, 62);
INSERT INTO `canteen` VALUES (4, '同享园', 56, 49);
INSERT INTO `canteen` VALUES (5, '幸福食堂', 49, 54);
INSERT INTO `canteen` VALUES (6, '感恩食堂', 35, 51);
INSERT INTO `canteen` VALUES (7, '同心园', 20, 47);

-- ----------------------------
-- Table structure for classroom
-- ----------------------------
DROP TABLE IF EXISTS `classroom`;
CREATE TABLE `classroom`  (
  `class_id` int NOT NULL AUTO_INCREMENT COMMENT '教室id',
  `teaching_building_id` int NULL DEFAULT NULL COMMENT '教学楼id',
  `class_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '教室名（示例：311 - 鸿蒙研究院）',
  `class_floor` int NULL DEFAULT NULL COMMENT '所在楼层',
  `class_floorid` int NULL DEFAULT NULL COMMENT '教室号',
  PRIMARY KEY (`class_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of classroom
-- ----------------------------
INSERT INTO `classroom` VALUES (1, 1, '广州商学院学生健身中心', 1, 102);
INSERT INTO `classroom` VALUES (2, 1, '菜鸟驿站2（已停）', 1, 103);
INSERT INTO `classroom` VALUES (3, 1, '多媒体课室', 1, 104);
INSERT INTO `classroom` VALUES (4, 1, NULL, 1, 105);
INSERT INTO `classroom` VALUES (5, 1, '三维模拟导游酒店实训室', 1, 106);
INSERT INTO `classroom` VALUES (6, 1, NULL, 1, 107);
INSERT INTO `classroom` VALUES (7, 1, '多媒体课室', 1, 108);
INSERT INTO `classroom` VALUES (8, 1, NULL, 1, 109);
INSERT INTO `classroom` VALUES (9, 1, '课程思政研究与实践中心', 1, 110);
INSERT INTO `classroom` VALUES (10, 1, '“四史”教育体验馆', 1, 111);
INSERT INTO `classroom` VALUES (11, 1, '教室休息室', 2, 201);
INSERT INTO `classroom` VALUES (12, 1, NULL, 2, 202);
INSERT INTO `classroom` VALUES (13, 1, '会计综合模拟实验室', 2, 203);
INSERT INTO `classroom` VALUES (14, 1, NULL, 2, 204);
INSERT INTO `classroom` VALUES (15, 1, NULL, 2, 205);
INSERT INTO `classroom` VALUES (16, 1, '多媒体课室', 2, 206);
INSERT INTO `classroom` VALUES (17, 1, '会计信息化实验室（一）', 2, 207);
INSERT INTO `classroom` VALUES (18, 1, NULL, 2, 208);
INSERT INTO `classroom` VALUES (19, 1, '模拟法庭', 2, 209);
INSERT INTO `classroom` VALUES (20, 1, NULL, 2, 210);
INSERT INTO `classroom` VALUES (21, 1, '会计信息化实验室（二）', 2, 211);
INSERT INTO `classroom` VALUES (22, 1, '财务分析实验室', 2, 212);
INSERT INTO `classroom` VALUES (23, 1, NULL, 2, 213);
INSERT INTO `classroom` VALUES (24, 1, NULL, 2, 214);
INSERT INTO `classroom` VALUES (25, 1, '教室休息室', 2, 215);
INSERT INTO `classroom` VALUES (26, 1, '模拟银行实训室', 3, 302);
INSERT INTO `classroom` VALUES (27, 1, '商业银行沙盘实验室', 3, 303);
INSERT INTO `classroom` VALUES (28, 1, '报关报检实验室', 3, 304);
INSERT INTO `classroom` VALUES (29, 1, '教师休息室', 3, 305);
INSERT INTO `classroom` VALUES (30, 1, NULL, 3, 306);
INSERT INTO `classroom` VALUES (31, 1, '互联网金融实验室', 3, 307);
INSERT INTO `classroom` VALUES (32, 1, '量化投资实验室', 3, 308);
INSERT INTO `classroom` VALUES (33, 1, '服务贸易实验室', 3, 309);
INSERT INTO `classroom` VALUES (34, 1, NULL, 3, 310);
INSERT INTO `classroom` VALUES (35, 1, NULL, 3, 311);
INSERT INTO `classroom` VALUES (36, 1, NULL, 3, 312);
INSERT INTO `classroom` VALUES (37, 1, '金融科技实验室', 3, 313);
INSERT INTO `classroom` VALUES (38, 1, '金融综合实验室', 3, 314);
INSERT INTO `classroom` VALUES (39, 1, NULL, 3, 315);
INSERT INTO `classroom` VALUES (40, 1, '国贸实务实验室', 3, 316);
INSERT INTO `classroom` VALUES (41, 1, '国贸综合实验室', 3, 317);
INSERT INTO `classroom` VALUES (42, 1, NULL, 3, 318);
INSERT INTO `classroom` VALUES (43, 1, '投资综合实验室', 3, 319);
INSERT INTO `classroom` VALUES (44, 1, '投资案例分析室', 3, 320);
INSERT INTO `classroom` VALUES (45, 1, '新媒体营销实验室', 4, 403);
INSERT INTO `classroom` VALUES (46, 1, 'ERP软件实验室', 4, 404);
INSERT INTO `classroom` VALUES (47, 1, '物流综合实验室', 4, 405);
INSERT INTO `classroom` VALUES (48, 1, '电子商务基础实验室', 4, 406);
INSERT INTO `classroom` VALUES (49, 1, '语言情景模拟实验室', 4, 407);
INSERT INTO `classroom` VALUES (50, 1, '大数据金融实验室', 4, 408);
INSERT INTO `classroom` VALUES (51, 1, '电子商务运营实验室', 4, 409);
INSERT INTO `classroom` VALUES (52, 1, NULL, 4, 410);
INSERT INTO `classroom` VALUES (53, 1, NULL, 4, 411);
INSERT INTO `classroom` VALUES (54, 1, '电子商务运营实验室', 4, 412);
INSERT INTO `classroom` VALUES (55, 1, '移动商务实验室', 4, 413);
INSERT INTO `classroom` VALUES (56, 1, NULL, 4, 414);
INSERT INTO `classroom` VALUES (57, 1, '网络营销实验室', 4, 415);
INSERT INTO `classroom` VALUES (58, 1, '电子商务综合实验室', 4, 416);
INSERT INTO `classroom` VALUES (59, 1, '市场营销综合实验室', 4, 417);
INSERT INTO `classroom` VALUES (60, 1, NULL, 4, 418);
INSERT INTO `classroom` VALUES (61, 1, NULL, 4, 419);
INSERT INTO `classroom` VALUES (62, 1, '跨境电扇实验室', 4, 420);
INSERT INTO `classroom` VALUES (63, 1, '管理会计实验室', 5, 502);
INSERT INTO `classroom` VALUES (64, 1, '审计信息化实验室', 5, 503);
INSERT INTO `classroom` VALUES (65, 1, '财务管理实验室', 5, 504);
INSERT INTO `classroom` VALUES (66, 1, '纳税实务实验室（一）', 5, 505);
INSERT INTO `classroom` VALUES (67, 1, '纳税实务实验室（二）', 5, 506);
INSERT INTO `classroom` VALUES (68, 1, NULL, 5, 507);
INSERT INTO `classroom` VALUES (69, 1, NULL, 5, 508);
INSERT INTO `classroom` VALUES (70, 1, NULL, 5, 509);
INSERT INTO `classroom` VALUES (71, 1, 'ERP沙盘实验室', 5, 510);
INSERT INTO `classroom` VALUES (72, 1, NULL, 5, 511);
INSERT INTO `classroom` VALUES (73, 1, '会计仿真工作室', 5, 512);
INSERT INTO `classroom` VALUES (74, 1, '资产评估实验室', 5, 513);
INSERT INTO `classroom` VALUES (75, 2, '消防钢瓶间', 1, 101);
INSERT INTO `classroom` VALUES (76, 2, 'UPS电房', 1, 102);
INSERT INTO `classroom` VALUES (77, 2, '网络与数据中心机房', 1, 103);
INSERT INTO `classroom` VALUES (78, 2, '多媒体课室', 1, 104);
INSERT INTO `classroom` VALUES (79, 2, '多媒体课室', 1, 105);
INSERT INTO `classroom` VALUES (80, 2, NULL, 1, 106);
INSERT INTO `classroom` VALUES (81, 2, NULL, 1, 107);
INSERT INTO `classroom` VALUES (82, 2, '多媒体课室', 1, 108);
INSERT INTO `classroom` VALUES (83, 2, '普通课室', 1, 109);
INSERT INTO `classroom` VALUES (84, 2, '多媒体课室', 1, 110);
INSERT INTO `classroom` VALUES (85, 2, '德语文化情景室', 2, 201);
INSERT INTO `classroom` VALUES (86, 2, '普通课室', 2, 202);
INSERT INTO `classroom` VALUES (87, 2, '日语文化田野室', 2, 203);
INSERT INTO `classroom` VALUES (88, 2, '多媒体课室', 2, 204);
INSERT INTO `classroom` VALUES (89, 2, '多媒体课室', 2, 205);
INSERT INTO `classroom` VALUES (90, 2, '多媒体课室', 2, 206);
INSERT INTO `classroom` VALUES (91, 2, '普通课室', 2, 207);
INSERT INTO `classroom` VALUES (92, 2, '多媒体课室', 2, 208);
INSERT INTO `classroom` VALUES (93, 2, '微格教学实训室', 3, 301);
INSERT INTO `classroom` VALUES (94, 2, '多媒体课室', 3, 302);
INSERT INTO `classroom` VALUES (95, 2, '多功能录播室', 3, 303);
INSERT INTO `classroom` VALUES (96, 2, '多媒体课室', 3, 304);
INSERT INTO `classroom` VALUES (97, 2, '多媒体课室', 3, 305);
INSERT INTO `classroom` VALUES (98, 2, '多媒体课室', 3, 306);
INSERT INTO `classroom` VALUES (99, 2, '普通教室', 3, 307);
INSERT INTO `classroom` VALUES (100, 2, '多媒体课室', 3, 308);
INSERT INTO `classroom` VALUES (101, 2, '语言实验1室', 4, 401);
INSERT INTO `classroom` VALUES (102, 2, '多媒体课室', 4, 402);
INSERT INTO `classroom` VALUES (103, 2, '语言实验2室', 4, 403);
INSERT INTO `classroom` VALUES (104, 2, '多媒体课室', 4, 404);
INSERT INTO `classroom` VALUES (105, 2, '多媒体课室', 4, 405);
INSERT INTO `classroom` VALUES (106, 2, '语言实验6室', 4, 406);
INSERT INTO `classroom` VALUES (107, 2, '多媒体课室', 4, 407);
INSERT INTO `classroom` VALUES (108, 2, '语言实验7室', 4, 408);
INSERT INTO `classroom` VALUES (109, 2, '语言实验3室', 5, 501);
INSERT INTO `classroom` VALUES (110, 2, '语言实验4室', 5, 502);
INSERT INTO `classroom` VALUES (111, 2, '多媒体课室', 5, 503);
INSERT INTO `classroom` VALUES (112, 2, '多媒体课室', 5, 504);
INSERT INTO `classroom` VALUES (113, 2, '语言实验7室', 5, 505);
INSERT INTO `classroom` VALUES (114, 2, '语言实验8室', 5, 506);
INSERT INTO `classroom` VALUES (115, 2, '多媒体课室', 6, 601);
INSERT INTO `classroom` VALUES (116, 2, '多媒体课室', 6, 602);
INSERT INTO `classroom` VALUES (117, 2, '多媒体课室', 6, 603);
INSERT INTO `classroom` VALUES (118, 2, '多媒体课室', 6, 604);
INSERT INTO `classroom` VALUES (119, 2, '多媒体课室', 6, 605);
INSERT INTO `classroom` VALUES (120, 2, '多媒体课室', 6, 606);
INSERT INTO `classroom` VALUES (121, 2, '多媒体课室', 6, 607);
INSERT INTO `classroom` VALUES (122, 2, '多媒体课室', 6, 608);
INSERT INTO `classroom` VALUES (123, 3, '普通课室', 0, 0);
INSERT INTO `classroom` VALUES (124, 3, '多媒体课室', 0, 0);
INSERT INTO `classroom` VALUES (125, 3, '多媒体课室', 0, 0);
INSERT INTO `classroom` VALUES (126, 3, '多媒体课室', 0, 0);
INSERT INTO `classroom` VALUES (127, 3, '多媒体课室', 0, 0);
INSERT INTO `classroom` VALUES (128, 3, '多媒体课室', 1, 101);
INSERT INTO `classroom` VALUES (129, 3, '普通课室', 1, 102);
INSERT INTO `classroom` VALUES (130, 3, '多媒体课室', 1, 103);
INSERT INTO `classroom` VALUES (131, 3, '多媒体课室', 1, 104);
INSERT INTO `classroom` VALUES (132, 3, '多媒体课室', 1, 105);
INSERT INTO `classroom` VALUES (133, 3, '多媒体课室', 1, 106);
INSERT INTO `classroom` VALUES (134, 3, '普通话培训测试站', 1, 107);
INSERT INTO `classroom` VALUES (135, 3, '多媒体课室', 1, 108);
INSERT INTO `classroom` VALUES (136, 3, '多媒体课室', 2, 201);
INSERT INTO `classroom` VALUES (137, 3, '普通课室', 2, 202);
INSERT INTO `classroom` VALUES (138, 3, '多媒体课室', 2, 203);
INSERT INTO `classroom` VALUES (139, 3, '多媒体课室', 2, 204);
INSERT INTO `classroom` VALUES (140, 3, '多媒体课室', 2, 205);
INSERT INTO `classroom` VALUES (141, 3, '多媒体课室', 2, 206);
INSERT INTO `classroom` VALUES (142, 3, '普通课室', 2, 207);
INSERT INTO `classroom` VALUES (143, 3, '多媒体课室', 2, 208);
INSERT INTO `classroom` VALUES (144, 3, '多媒体课室', 3, 301);
INSERT INTO `classroom` VALUES (145, 3, '国家统一法律职业资格考试培训专用教室', 3, 302);
INSERT INTO `classroom` VALUES (146, 3, '多媒体课室', 3, 303);
INSERT INTO `classroom` VALUES (147, 3, '多媒体课室', 3, 304);
INSERT INTO `classroom` VALUES (148, 3, '多媒体课室', 3, 305);
INSERT INTO `classroom` VALUES (149, 3, '多媒体课室', 3, 306);
INSERT INTO `classroom` VALUES (150, 3, '国家统一法律职业资格考试培训专用教室', 3, 307);
INSERT INTO `classroom` VALUES (151, 3, '多媒体课室', 3, 308);
INSERT INTO `classroom` VALUES (152, 3, '多媒体课室', 4, 401);
INSERT INTO `classroom` VALUES (153, 3, '普通课室', 4, 402);
INSERT INTO `classroom` VALUES (154, 3, '多媒体课室', 4, 403);
INSERT INTO `classroom` VALUES (155, 3, '多媒体课室', 4, 404);
INSERT INTO `classroom` VALUES (156, 3, '多媒体课室', 4, 405);
INSERT INTO `classroom` VALUES (157, 3, '多媒体课室', 4, 406);
INSERT INTO `classroom` VALUES (158, 3, '普通课室', 4, 407);
INSERT INTO `classroom` VALUES (159, 3, '多媒体课室', 4, 408);
INSERT INTO `classroom` VALUES (160, 3, '多媒体课室', 5, 501);
INSERT INTO `classroom` VALUES (161, 3, '多媒体课室', 5, 502);
INSERT INTO `classroom` VALUES (162, 3, '多媒体课室', 5, 503);
INSERT INTO `classroom` VALUES (163, 3, '多媒体课室', 5, 504);
INSERT INTO `classroom` VALUES (164, 3, '多媒体课室', 5, 505);
INSERT INTO `classroom` VALUES (165, 3, '多媒体课室', 5, 506);
INSERT INTO `classroom` VALUES (166, 3, '多媒体课室', 5, 507);
INSERT INTO `classroom` VALUES (167, 3, '多媒体课室', 5, 508);
INSERT INTO `classroom` VALUES (168, 6, '老师办公室', 1, 101);
INSERT INTO `classroom` VALUES (169, 6, '普通多媒体教室', 1, 102);
INSERT INTO `classroom` VALUES (170, 6, '普通多媒体教室', 1, 103);
INSERT INTO `classroom` VALUES (171, 6, '普通多媒体教室', 1, 104);
INSERT INTO `classroom` VALUES (172, 6, '普通多媒体教室', 1, 105);
INSERT INTO `classroom` VALUES (173, 6, '普通多媒体教室', 1, 106);
INSERT INTO `classroom` VALUES (174, 6, '普通多媒体教室', 1, 107);
INSERT INTO `classroom` VALUES (175, 6, '自习室', 1, 108);
INSERT INTO `classroom` VALUES (176, 6, '普通多媒体教室', 1, 109);
INSERT INTO `classroom` VALUES (177, 6, '普通多媒体教室', 1, 110);
INSERT INTO `classroom` VALUES (178, 6, '普通多媒体教室', 1, 111);
INSERT INTO `classroom` VALUES (179, 6, '普通多媒体教室', 2, 201);
INSERT INTO `classroom` VALUES (180, 6, '教师发展中心', 2, 202);
INSERT INTO `classroom` VALUES (181, 6, '普通多媒体教室', 2, 203);
INSERT INTO `classroom` VALUES (182, 6, '普通多媒体教室', 2, 204);
INSERT INTO `classroom` VALUES (183, 6, '普通多媒体教室', 2, 205);
INSERT INTO `classroom` VALUES (184, 6, '普通多媒体教室', 2, 206);
INSERT INTO `classroom` VALUES (185, 6, '普通多媒体教室', 2, 207);
INSERT INTO `classroom` VALUES (186, 6, '数字法庭', 2, 208);
INSERT INTO `classroom` VALUES (187, 6, '普通多媒体教室', 2, 209);
INSERT INTO `classroom` VALUES (188, 6, '第二报告厅', 2, 210);
INSERT INTO `classroom` VALUES (189, 6, '云服务实训室', 2, 211);
INSERT INTO `classroom` VALUES (190, 6, 'VUE - 考试中心', 2, 212);
INSERT INTO `classroom` VALUES (191, 6, '大数据鲲鹏实训室', 2, 213);
INSERT INTO `classroom` VALUES (192, 6, '人工智能实训室', 2, 214);
INSERT INTO `classroom` VALUES (193, 6, '课室管理员办公室', 3, 301);
INSERT INTO `classroom` VALUES (194, 6, '普通多媒体教室', 3, 302);
INSERT INTO `classroom` VALUES (195, 6, '普通多媒体教室', 3, 303);
INSERT INTO `classroom` VALUES (196, 6, '普通多媒体教室', 3, 304);
INSERT INTO `classroom` VALUES (197, 6, '普通多媒体教室', 3, 305);
INSERT INTO `classroom` VALUES (198, 6, '普通多媒体教室', 3, 306);
INSERT INTO `classroom` VALUES (199, 6, '普通多媒体教室', 3, 307);
INSERT INTO `classroom` VALUES (200, 6, '普通多媒体教室', 3, 308);
INSERT INTO `classroom` VALUES (201, 6, '普通多媒体教室', 3, 309);
INSERT INTO `classroom` VALUES (202, 6, '普通多媒体教室', 3, 310);
INSERT INTO `classroom` VALUES (203, 6, '实训室', 3, 311);
INSERT INTO `classroom` VALUES (204, 6, '实训室', 3, 312);
INSERT INTO `classroom` VALUES (205, 6, '维修室', 4, 401);
INSERT INTO `classroom` VALUES (206, 6, '多媒体教室', 4, 402);
INSERT INTO `classroom` VALUES (207, 6, '多媒体教室', 4, 403);
INSERT INTO `classroom` VALUES (208, 6, '多媒体教室', 4, 404);
INSERT INTO `classroom` VALUES (209, 6, '多媒体教室', 4, 405);
INSERT INTO `classroom` VALUES (210, 6, '多媒体教室', 4, 406);
INSERT INTO `classroom` VALUES (211, 6, '多媒体教室', 4, 407);
INSERT INTO `classroom` VALUES (212, 6, '多媒体教室', 4, 408);
INSERT INTO `classroom` VALUES (213, 6, '多媒体教室', 4, 409);
INSERT INTO `classroom` VALUES (214, 6, '多媒体教室', 4, 410);
INSERT INTO `classroom` VALUES (215, 6, '多媒体教室', 4, 411);
INSERT INTO `classroom` VALUES (216, 6, '多媒体教室', 4, 412);
INSERT INTO `classroom` VALUES (217, 6, '多媒体教室', 4, 413);
INSERT INTO `classroom` VALUES (218, 6, '多媒体教室', 4, 414);
INSERT INTO `classroom` VALUES (219, 6, '多媒体教室', 4, 415);
INSERT INTO `classroom` VALUES (220, 6, '课室管理员办公室', 4, 416);
INSERT INTO `classroom` VALUES (221, 6, '康大教育培训中心', 5, 501);
INSERT INTO `classroom` VALUES (222, 6, '计算机网络综合布线实训室', 5, 502);
INSERT INTO `classroom` VALUES (223, 6, '公共机房1室', 5, 503);
INSERT INTO `classroom` VALUES (224, 6, '公共机房2室', 5, 504);
INSERT INTO `classroom` VALUES (225, 6, '公共机房3室', 5, 505);
INSERT INTO `classroom` VALUES (226, 6, '多媒体课室', 5, 506);
INSERT INTO `classroom` VALUES (227, 6, '公共机房4室', 5, 507);
INSERT INTO `classroom` VALUES (228, 6, '多媒体教室', 5, 508);
INSERT INTO `classroom` VALUES (229, 6, NULL, 5, 509);
INSERT INTO `classroom` VALUES (230, 6, '公共机房5室', 5, 510);
INSERT INTO `classroom` VALUES (231, 6, '公共机房6室', 5, 511);
INSERT INTO `classroom` VALUES (232, 6, '公共机房7室', 5, 512);
INSERT INTO `classroom` VALUES (233, 6, NULL, 6, 601);
INSERT INTO `classroom` VALUES (234, 6, '计算机辅助工程制图实验室', 6, 602);
INSERT INTO `classroom` VALUES (235, 6, '计算机辅助空间设计实验室', 6, 603);
INSERT INTO `classroom` VALUES (236, 6, '计算机辅助产品设计实验室1', 6, 604);
INSERT INTO `classroom` VALUES (237, 6, '计算机辅助产品设计实验室2', 6, 605);
INSERT INTO `classroom` VALUES (238, 6, '计算机辅助平面设计实验室1', 6, 606);
INSERT INTO `classroom` VALUES (239, 6, '旅游营销实验室、导游技能实训室', 6, 607);
INSERT INTO `classroom` VALUES (240, 6, '旅游营销实验室、导游技能实训室', 6, 608);
INSERT INTO `classroom` VALUES (241, 6, '酒店运营管理仿真实训室', 6, 609);
INSERT INTO `classroom` VALUES (242, 6, '市场营销模拟实训室', 6, 610);
INSERT INTO `classroom` VALUES (243, 6, '礼仪工作室、旅游电商实训室', 6, 611);
INSERT INTO `classroom` VALUES (244, 6, '礼仪工作室、旅游电商实训室', 6, 612);
INSERT INTO `classroom` VALUES (245, 6, '建筑模型制作实验室1', 6, 613);
INSERT INTO `classroom` VALUES (246, 6, '漏填', 6, 614);
INSERT INTO `classroom` VALUES (247, 6, '漏填', 6, 615);
INSERT INTO `classroom` VALUES (248, 7, '仅运动队进行锻炼使用', 1, 0);
INSERT INTO `classroom` VALUES (249, 7, NULL, 1, 0);
INSERT INTO `classroom` VALUES (250, 7, NULL, 1, 0);
INSERT INTO `classroom` VALUES (251, 7, '多媒体课室', 2, 202);
INSERT INTO `classroom` VALUES (252, 7, '多媒体课室', 2, 203);
INSERT INTO `classroom` VALUES (253, 7, '多媒体课室', 2, 204);
INSERT INTO `classroom` VALUES (254, 7, '多媒体课室', 2, 205);
INSERT INTO `classroom` VALUES (255, 7, '设计绘图7室', 3, 302);
INSERT INTO `classroom` VALUES (256, 7, '多媒体课室', 3, 303);
INSERT INTO `classroom` VALUES (257, 7, '设计绘图8室', 3, 304);
INSERT INTO `classroom` VALUES (258, 7, '多媒体课室', 3, 305);
INSERT INTO `classroom` VALUES (259, 7, '多媒体课室', 4, 402);
INSERT INTO `classroom` VALUES (260, 7, '多媒体课室', 4, 403);
INSERT INTO `classroom` VALUES (261, 7, '多媒体课室', 4, 404);
INSERT INTO `classroom` VALUES (262, 7, '多媒体课室', 4, 405);
INSERT INTO `classroom` VALUES (263, 8, '会议室', 1, 101);
INSERT INTO `classroom` VALUES (264, 8, '教师办公室', 1, 102);
INSERT INTO `classroom` VALUES (265, 8, '办公室', 1, 103);
INSERT INTO `classroom` VALUES (266, 8, '试卷档案室', 1, 104);
INSERT INTO `classroom` VALUES (267, 8, '学生工作办公室', 1, 105);
INSERT INTO `classroom` VALUES (268, 8, '学生活动室', 1, 106);
INSERT INTO `classroom` VALUES (269, 8, '软件工程教研室', 1, 107);
INSERT INTO `classroom` VALUES (270, NULL, '计算机科学与技术教研室', NULL, 108);
INSERT INTO `classroom` VALUES (271, 8, NULL, NULL, NULL);
INSERT INTO `classroom` VALUES (272, 8, '档案资料室', 2, 201);
INSERT INTO `classroom` VALUES (273, 8, '评估工作室', 2, 202);
INSERT INTO `classroom` VALUES (274, 8, '主任办公室', 2, 203);
INSERT INTO `classroom` VALUES (275, 8, '主任助理办公室', 2, 204);
INSERT INTO `classroom` VALUES (276, 8, '会议室、党员活动室', 2, 205);
INSERT INTO `classroom` VALUES (277, 8, '专业负责人办公室', 2, 206);
INSERT INTO `classroom` VALUES (278, 8, '电子信息与科学技术教研室', 2, 207);
INSERT INTO `classroom` VALUES (279, 8, '华为ICT学院办公室', 2, 208);
INSERT INTO `classroom` VALUES (280, 8, '副院长办公室(信院)', 2, 209);
INSERT INTO `classroom` VALUES (281, 8, '院长办公室（信院）', 2, 210);
INSERT INTO `classroom` VALUES (282, 8, '信息管理与信息系统教研室', 2, 211);
INSERT INTO `classroom` VALUES (283, 8, '智能科学与技术教研室', 2, 212);
INSERT INTO `classroom` VALUES (284, 8, '学院办公室（信院）', 2, 213);
INSERT INTO `classroom` VALUES (285, 8, '评估工作办公室', 2, 214);
INSERT INTO `classroom` VALUES (286, 8, '专业负责人办公室', 2, 215);
INSERT INTO `classroom` VALUES (287, 8, '党总书记办公室', 2, 216);
INSERT INTO `classroom` VALUES (288, 8, '专业负责人办公室', 2, 217);
INSERT INTO `classroom` VALUES (289, 8, '数学教研室', 2, 218);
INSERT INTO `classroom` VALUES (290, 8, '物联网工程教研室', 2, 219);
INSERT INTO `classroom` VALUES (291, 8, '数据科学与大数据教研室', 2, 220);
INSERT INTO `classroom` VALUES (292, 8, '资料室', 2, 221);
INSERT INTO `classroom` VALUES (293, 8, '多媒体课室', 3, 302);
INSERT INTO `classroom` VALUES (294, 8, '多媒体课室', 3, 303);
INSERT INTO `classroom` VALUES (295, 8, '多媒体课室', 3, 304);
INSERT INTO `classroom` VALUES (296, 8, '多媒体课室', 3, 305);
INSERT INTO `classroom` VALUES (297, 8, '多媒体课室', 3, 306);
INSERT INTO `classroom` VALUES (298, 8, '多媒体课室', 3, 307);
INSERT INTO `classroom` VALUES (299, 8, '综合办公室', 3, 0);
INSERT INTO `classroom` VALUES (300, 8, '副院长办公室', 3, 0);
INSERT INTO `classroom` VALUES (301, 8, '会议室', 3, 0);
INSERT INTO `classroom` VALUES (302, 8, '会议室', 3, 0);
INSERT INTO `classroom` VALUES (303, 8, '多媒体课室', 4, 402);
INSERT INTO `classroom` VALUES (304, 8, '多媒体课室', 4, 403);
INSERT INTO `classroom` VALUES (305, 8, '多媒体课室', 4, 404);
INSERT INTO `classroom` VALUES (306, 8, '多媒体课室', 4, 405);
INSERT INTO `classroom` VALUES (307, 8, '多媒体课室', 4, 406);
INSERT INTO `classroom` VALUES (308, 8, '多媒体课室', 4, 407);
INSERT INTO `classroom` VALUES (309, 8, '多媒体课室', 4, 408);
INSERT INTO `classroom` VALUES (310, 8, '多媒体课室', NULL, 409);
INSERT INTO `classroom` VALUES (311, 8, '基础绘画实训1室', 5, 502);
INSERT INTO `classroom` VALUES (312, 8, '基础绘画实训2室', 5, 503);
INSERT INTO `classroom` VALUES (313, 8, '设计绘画1室', 5, 504);
INSERT INTO `classroom` VALUES (314, 8, '设计绘画2室', 5, 505);
INSERT INTO `classroom` VALUES (315, 8, '设计绘画3室', 5, 506);
INSERT INTO `classroom` VALUES (316, 8, '设计绘画4室', 5, 507);
INSERT INTO `classroom` VALUES (317, 8, '设计绘画5室', 5, 508);
INSERT INTO `classroom` VALUES (318, 8, '设计绘画6室', 5, 509);
INSERT INTO `classroom` VALUES (319, 8, '艺术道具4室', NULL, 510);
INSERT INTO `classroom` VALUES (320, 8, '造型艺术实验室', 6, 601);
INSERT INTO `classroom` VALUES (321, 8, '基础绘画实训3室', 6, 602);
INSERT INTO `classroom` VALUES (322, 8, '基础绘画实训4室', 6, 603);
INSERT INTO `classroom` VALUES (323, 8, '基础绘画实训5室', 6, 604);
INSERT INTO `classroom` VALUES (324, 8, '基础绘画实训6室', 6, 605);
INSERT INTO `classroom` VALUES (325, 8, '基础绘画实训7室', 6, 606);
INSERT INTO `classroom` VALUES (326, 8, '基础绘画实训8室', 6, 607);
INSERT INTO `classroom` VALUES (327, 8, '书画艺术工作室', 6, 608);
INSERT INTO `classroom` VALUES (328, 8, '油画艺术工作室', 6, 609);
INSERT INTO `classroom` VALUES (329, 8, '艺术道具3室', 6, 610);
INSERT INTO `classroom` VALUES (330, 9, '多媒体课室', 1, 101);
INSERT INTO `classroom` VALUES (331, 9, '多媒体课室', 1, 102);
INSERT INTO `classroom` VALUES (332, 9, '多媒体课室', 1, 103);
INSERT INTO `classroom` VALUES (333, 9, '多媒体课室', 1, 104);
INSERT INTO `classroom` VALUES (334, 9, NULL, 1, 105);
INSERT INTO `classroom` VALUES (335, 9, '刑事法教研室', 1, 106);
INSERT INTO `classroom` VALUES (336, 9, '理论法学教研室', 1, 107);
INSERT INTO `classroom` VALUES (337, 9, '多媒体课室', 2, 201);
INSERT INTO `classroom` VALUES (338, 9, '多媒体课室', 2, 202);
INSERT INTO `classroom` VALUES (339, 9, '多媒体课室', 2, 203);
INSERT INTO `classroom` VALUES (340, 9, '多媒体课室', 2, 204);
INSERT INTO `classroom` VALUES (341, 9, '法学院学生工作办公室', 2, 205);
INSERT INTO `classroom` VALUES (342, 9, '会议室', 2, 206);
INSERT INTO `classroom` VALUES (343, 9, '法学院学院办公室', 2, 207);
INSERT INTO `classroom` VALUES (344, 9, '法学院教务管理办公室', 2, 208);
INSERT INTO `classroom` VALUES (345, 9, '多媒体课室', 3, 301);
INSERT INTO `classroom` VALUES (346, 9, '多媒体课室', 3, 302);
INSERT INTO `classroom` VALUES (347, 9, '多媒体课室', 3, 303);
INSERT INTO `classroom` VALUES (348, 9, '多媒体课室', 3, 304);
INSERT INTO `classroom` VALUES (349, 9, '多媒体课室', 3, 305);
INSERT INTO `classroom` VALUES (350, 9, '多媒体课室', 3, 306);
INSERT INTO `classroom` VALUES (351, 9, '法学院副院长办公室', 3, 307);
INSERT INTO `classroom` VALUES (352, 9, '多媒体课室', 4, 401);
INSERT INTO `classroom` VALUES (353, 9, '多媒体课室', 4, 402);
INSERT INTO `classroom` VALUES (354, 9, '多媒体课室', 4, 403);
INSERT INTO `classroom` VALUES (355, 9, '多媒体课室', 4, 404);
INSERT INTO `classroom` VALUES (356, 9, '多媒体课室', 4, 405);
INSERT INTO `classroom` VALUES (357, 9, '多媒体课室', 4, 406);
INSERT INTO `classroom` VALUES (358, 9, '法学院党总支书记办公室', 4, 407);
INSERT INTO `classroom` VALUES (359, 9, '经济法、商法教研室', 4, 408);
INSERT INTO `classroom` VALUES (360, 9, '多媒体课室', 5, 501);
INSERT INTO `classroom` VALUES (361, 9, '多媒体课室', 5, 502);
INSERT INTO `classroom` VALUES (362, 9, '多媒体课室', 5, 503);
INSERT INTO `classroom` VALUES (363, 9, '多媒体课室', 5, 504);
INSERT INTO `classroom` VALUES (364, 9, '多媒体课室', 5, 505);
INSERT INTO `classroom` VALUES (365, 9, '多媒体课室', 5, 506);
INSERT INTO `classroom` VALUES (366, 9, '民事法教研室', 5, 507);
INSERT INTO `classroom` VALUES (367, 9, '电子商务及法律教研室', 5, 508);
INSERT INTO `classroom` VALUES (368, 9, '多媒体课室', 6, 601);
INSERT INTO `classroom` VALUES (369, 9, '多媒体课室', 6, 602);
INSERT INTO `classroom` VALUES (370, 9, '多媒体课室', 6, 603);
INSERT INTO `classroom` VALUES (371, 9, '多媒体课室', 6, 604);
INSERT INTO `classroom` VALUES (372, 9, '多媒体课室', 6, 605);
INSERT INTO `classroom` VALUES (373, 9, '多媒体课室', 6, 606);
INSERT INTO `classroom` VALUES (374, 9, '国际法教研室', 6, 607);
INSERT INTO `classroom` VALUES (375, 9, '档案室', 6, 608);
INSERT INTO `classroom` VALUES (376, 10, '进行学生相关的服务，具体看指南', 1, 103);
INSERT INTO `classroom` VALUES (377, 10, NULL, 1, 104);
INSERT INTO `classroom` VALUES (378, 10, '公共机房8室', 1, 105);
INSERT INTO `classroom` VALUES (379, 10, '部长办公室', 1, 106);
INSERT INTO `classroom` VALUES (380, 10, '“快乐职场”辅导员办公室', 1, 107);
INSERT INTO `classroom` VALUES (381, 10, '副部长办公室', 1, 108);
INSERT INTO `classroom` VALUES (382, 10, '征兵办公室', 1, 109);
INSERT INTO `classroom` VALUES (383, 10, '心理健康教育与咨询中心', 1, 0);
INSERT INTO `classroom` VALUES (384, 10, '学生工作部、学生资助中心', 1, 0);
INSERT INTO `classroom` VALUES (385, 10, '团委办公室、学生会办公室', 1, 111);
INSERT INTO `classroom` VALUES (386, 10, NULL, 1, 112);
INSERT INTO `classroom` VALUES (387, 10, '普通实训室', 1, 113);
INSERT INTO `classroom` VALUES (388, 10, NULL, 1, 114);
INSERT INTO `classroom` VALUES (389, 10, NULL, 1, 115);
INSERT INTO `classroom` VALUES (390, 10, NULL, 1, 116);
INSERT INTO `classroom` VALUES (391, 10, NULL, 1, 117);
INSERT INTO `classroom` VALUES (392, 10, NULL, 1, 118);
INSERT INTO `classroom` VALUES (393, 10, NULL, 1, 119);
INSERT INTO `classroom` VALUES (394, 10, NULL, 1, 120);
INSERT INTO `classroom` VALUES (395, 10, NULL, 1, 121);
INSERT INTO `classroom` VALUES (396, 10, '移动软件设计实验室', 2, 202);
INSERT INTO `classroom` VALUES (397, 10, '大数据应用实验室', 2, 203);
INSERT INTO `classroom` VALUES (398, 10, '网络安全实验室', 2, 204);
INSERT INTO `classroom` VALUES (399, 10, NULL, 2, 205);
INSERT INTO `classroom` VALUES (400, 10, '物联网工程实验室', 2, 206);
INSERT INTO `classroom` VALUES (401, 10, '无线传感网实验室', 2, 207);
INSERT INTO `classroom` VALUES (402, 10, '图像处理与机器视觉实验室', 2, 208);
INSERT INTO `classroom` VALUES (403, 10, '多媒体实训室', 2, 209);
INSERT INTO `classroom` VALUES (404, 10, NULL, 3, 301);
INSERT INTO `classroom` VALUES (405, 10, '电子商务及法律综合实训室', 3, 302);
INSERT INTO `classroom` VALUES (406, 10, '公共机房10室', 3, 303);
INSERT INTO `classroom` VALUES (407, 10, '公共机房11室', 3, 304);
INSERT INTO `classroom` VALUES (408, 10, '数据分析与处理实验室', 3, 305);
INSERT INTO `classroom` VALUES (409, 10, '信息系统开发实验室', 3, 306);
INSERT INTO `classroom` VALUES (410, 10, '软件工程实验室Ⅰ', 3, 307);
INSERT INTO `classroom` VALUES (411, 10, '企业信息管理实验室', 3, 308);
INSERT INTO `classroom` VALUES (412, 10, '软件工程实验室Ⅱ', 3, 309);
INSERT INTO `classroom` VALUES (413, 10, '软件工程实验室Ⅲ', 3, 310);
INSERT INTO `classroom` VALUES (414, 10, '软件测试实验室', 3, 311);
INSERT INTO `classroom` VALUES (415, 10, '传感器原理实验室', 4, 401);
INSERT INTO `classroom` VALUES (416, 10, '计算机组成原理实验室', 4, 402);
INSERT INTO `classroom` VALUES (417, 10, '嵌入式系统应用实验室', 4, 403);
INSERT INTO `classroom` VALUES (418, 10, '单片机设计实验室', 4, 404);
INSERT INTO `classroom` VALUES (419, 10, NULL, 4, 405);
INSERT INTO `classroom` VALUES (420, 10, '网络工程实验室', 4, 406);
INSERT INTO `classroom` VALUES (421, 10, NULL, 4, 407);
INSERT INTO `classroom` VALUES (422, 10, '创新实践室', 4, 408);
INSERT INTO `classroom` VALUES (423, 10, '软件工程基础实验室', 5, 501);
INSERT INTO `classroom` VALUES (424, 10, '计算机科学与技术基础实验室', 5, 502);
INSERT INTO `classroom` VALUES (425, 10, '物联网工程基础实验室', 5, 503);
INSERT INTO `classroom` VALUES (426, 5, '储物室', 1, 102);
INSERT INTO `classroom` VALUES (427, 5, '团学干部之家', 1, 103);
INSERT INTO `classroom` VALUES (428, 5, '红色文化教育成果展览室', 1, 104);
INSERT INTO `classroom` VALUES (429, 5, '党员活动室', 1, 105);
INSERT INTO `classroom` VALUES (430, 5, '设备储物室', 1, 106);
INSERT INTO `classroom` VALUES (431, 5, '团学活动室', 1, 107);
INSERT INTO `classroom` VALUES (432, 5, '创新工作室', 1, 108);
INSERT INTO `classroom` VALUES (433, 5, '书籍装帧制作实验室', 1, 109);
INSERT INTO `classroom` VALUES (434, 5, '多功能会议室', 2, 201);
INSERT INTO `classroom` VALUES (435, 5, '院长办公室（艺术学院）', 2, 202);
INSERT INTO `classroom` VALUES (436, 5, '评估办公室', 2, 203);
INSERT INTO `classroom` VALUES (437, 5, '副院长办公室（艺术学院）', 2, 204);
INSERT INTO `classroom` VALUES (438, 5, '学院办公室（艺术学院）', 2, 205);
INSERT INTO `classroom` VALUES (439, 5, '学科带头人办公室', 2, 206);
INSERT INTO `classroom` VALUES (440, 5, '党总支书记办公室（艺术学院）', 2, 207);
INSERT INTO `classroom` VALUES (441, 5, '学生工作办公室', 2, 208);
INSERT INTO `classroom` VALUES (442, 5, '交互设计工作室', 2, 209);
INSERT INTO `classroom` VALUES (443, 5, '数据媒体工作室', 2, 210);
INSERT INTO `classroom` VALUES (444, 5, '视觉传达设计工作室', 2, 211);
INSERT INTO `classroom` VALUES (445, 5, '饰品设计工作室', 3, 301);
INSERT INTO `classroom` VALUES (446, 5, '产品设计研发工作室', 3, 302);
INSERT INTO `classroom` VALUES (447, 5, '品牌设计工作室', 3, 303);
INSERT INTO `classroom` VALUES (448, 5, '数动方舟数字媒体工作室', 3, 304);
INSERT INTO `classroom` VALUES (449, 5, NULL, 3, 305);
INSERT INTO `classroom` VALUES (450, 5, '多媒体艺术设计实训室', 3, 306);
INSERT INTO `classroom` VALUES (451, 5, '书画艺术创作工作室', 3, 307);
INSERT INTO `classroom` VALUES (452, 5, '家具设计工作室', 3, 308);
INSERT INTO `classroom` VALUES (453, 4, '多媒体课室', 1, 101);
INSERT INTO `classroom` VALUES (454, 4, '多媒体课室', 1, 102);
INSERT INTO `classroom` VALUES (455, 4, '多媒体课室', 1, 103);
INSERT INTO `classroom` VALUES (456, 4, '多媒体课室', 1, 104);
INSERT INTO `classroom` VALUES (457, 4, '多媒体课室', 1, 105);
INSERT INTO `classroom` VALUES (458, 4, '多媒体课室', 1, 106);
INSERT INTO `classroom` VALUES (459, 4, '多媒体课室', 1, 107);
INSERT INTO `classroom` VALUES (460, 4, '多媒体课室', 1, 108);
INSERT INTO `classroom` VALUES (461, 4, '多媒体课室', 1, 109);
INSERT INTO `classroom` VALUES (462, 4, NULL, 1, 110);
INSERT INTO `classroom` VALUES (463, 4, '国际化职业人才升本创新班办公室', 1, 111);
INSERT INTO `classroom` VALUES (464, 4, '学生活动室', 1, 112);
INSERT INTO `classroom` VALUES (465, 4, '储物室', 1, 113);
INSERT INTO `classroom` VALUES (466, 4, '多媒体课室', 2, 201);
INSERT INTO `classroom` VALUES (467, 4, '会议室', 2, 202);
INSERT INTO `classroom` VALUES (468, 4, '休息室', 2, 203);
INSERT INTO `classroom` VALUES (469, 4, '多媒体课室', 2, 204);
INSERT INTO `classroom` VALUES (470, 4, '多媒体课室', 2, 205);
INSERT INTO `classroom` VALUES (471, 4, '多媒体课室', 2, 206);
INSERT INTO `classroom` VALUES (472, 4, '多媒体课室', 2, 207);
INSERT INTO `classroom` VALUES (473, 4, '多媒体课室', 2, 208);
INSERT INTO `classroom` VALUES (474, 4, '多媒体课室', 2, 209);
INSERT INTO `classroom` VALUES (475, 4, '多媒体课室', 2, 210);
INSERT INTO `classroom` VALUES (476, 4, '咨询师', 2, 211);
INSERT INTO `classroom` VALUES (477, 4, '老师办公室', 2, 212);
INSERT INTO `classroom` VALUES (478, 4, '广州商学院二级心理辅导站', 2, 213);
INSERT INTO `classroom` VALUES (479, 4, '辅导员办公室', 2, 214);
INSERT INTO `classroom` VALUES (480, 4, '辅导员办公室', 2, 215);
INSERT INTO `classroom` VALUES (481, 4, '辅导员办公室', 2, 216);
INSERT INTO `classroom` VALUES (482, 4, '教务办公室', 3, 301);
INSERT INTO `classroom` VALUES (483, 4, '院长办公室（国院）', 3, 302);
INSERT INTO `classroom` VALUES (484, 4, '党总支书记办公室', 3, 303);
INSERT INTO `classroom` VALUES (485, 4, '副院长办公室（国院）', 3, 304);
INSERT INTO `classroom` VALUES (486, 4, '多媒体课室', 3, 305);
INSERT INTO `classroom` VALUES (487, 4, '多媒体课室', 3, 306);
INSERT INTO `classroom` VALUES (488, 4, '多媒体课室', 3, 307);
INSERT INTO `classroom` VALUES (489, 4, '多媒体课室', 3, 308);
INSERT INTO `classroom` VALUES (490, 4, '多媒体课室', 3, 309);
INSERT INTO `classroom` VALUES (491, 4, '多媒体课室', 3, 310);
INSERT INTO `classroom` VALUES (492, 4, '国际商务综合实训室', 3, 311);
INSERT INTO `classroom` VALUES (493, 4, '综合办公室', 3, 312);
INSERT INTO `classroom` VALUES (494, 4, '办公室', 3, 313);
INSERT INTO `classroom` VALUES (495, 4, '教室办公室', 3, 314);
INSERT INTO `classroom` VALUES (496, 4, '国际交流和合作处', 3, 315);
INSERT INTO `classroom` VALUES (497, 4, '国际学院留学服务中心', 4, 401);
INSERT INTO `classroom` VALUES (498, 4, '国际学院留学服务中心', 4, 402);
INSERT INTO `classroom` VALUES (499, 4, '多媒体课室', 4, 403);
INSERT INTO `classroom` VALUES (500, 4, '多媒体课室', 4, 404);
INSERT INTO `classroom` VALUES (501, 4, '商务外语沟通情景室', 4, 405);
INSERT INTO `classroom` VALUES (502, 4, '口译实训室、笔译实训室', 4, 406);
INSERT INTO `classroom` VALUES (503, 4, '国际学院多媒体课室', 4, 407);
INSERT INTO `classroom` VALUES (504, 4, '会计与金融教研室', 5, 501);
INSERT INTO `classroom` VALUES (505, 4, '物流管理与国际商务教研室', 5, 502);
INSERT INTO `classroom` VALUES (506, 4, '多媒体课室', 5, 503);
INSERT INTO `classroom` VALUES (507, 4, '多媒体课室', 5, 504);
INSERT INTO `classroom` VALUES (508, 4, '多媒体课室', 5, 505);
INSERT INTO `classroom` VALUES (509, 4, '多媒体课室', 5, 506);
INSERT INTO `classroom` VALUES (510, 4, '多媒体课室', 5, 507);
INSERT INTO `classroom` VALUES (511, 4, '多媒体课室', 5, 508);
INSERT INTO `classroom` VALUES (512, 4, '多媒体课室', 5, 509);
INSERT INTO `classroom` VALUES (513, 4, '多媒体课室', 5, 510);
INSERT INTO `classroom` VALUES (514, 4, '教师办公室', 5, 511);
INSERT INTO `classroom` VALUES (515, 4, '教研室主任办公室', 5, 512);
INSERT INTO `classroom` VALUES (516, 4, '教研室主任办公室', 5, 513);
INSERT INTO `classroom` VALUES (517, 4, '评估资料室', 5, 514);
INSERT INTO `classroom` VALUES (518, 4, '教师办公室', 5, 515);
INSERT INTO `classroom` VALUES (519, 4, '无', 5, 516);
INSERT INTO `classroom` VALUES (520, 4, '多媒体课室', 6, 601);
INSERT INTO `classroom` VALUES (521, 4, '多媒体课室', 6, 602);
INSERT INTO `classroom` VALUES (522, 4, '多媒体课室', 6, 603);
INSERT INTO `classroom` VALUES (523, 4, '多媒体课室', 6, 604);
INSERT INTO `classroom` VALUES (524, 4, '多媒体课室', 6, 605);
INSERT INTO `classroom` VALUES (525, 4, '多媒体课室', 6, 606);
INSERT INTO `classroom` VALUES (526, 4, '多媒体课室', 6, 607);
INSERT INTO `classroom` VALUES (527, 4, '多媒体课室', 6, 608);
INSERT INTO `classroom` VALUES (528, 4, '多媒体课室', 6, 609);
INSERT INTO `classroom` VALUES (529, NULL, '抢救室', NULL, 101);
INSERT INTO `classroom` VALUES (530, 11, '院外急救实训室', 1, 102);
INSERT INTO `classroom` VALUES (531, 11, '留观室', 1, 103);
INSERT INTO `classroom` VALUES (532, 11, '重症监护室', 1, 104);
INSERT INTO `classroom` VALUES (533, 11, '更衣室', 2, 201);
INSERT INTO `classroom` VALUES (534, 11, '基础护理准备室', 2, 202);
INSERT INTO `classroom` VALUES (535, 11, '基础护理实训室', 2, 203);
INSERT INTO `classroom` VALUES (536, 11, '妇科护理检查室', 3, 301);
INSERT INTO `classroom` VALUES (537, 11, '新生儿室', 3, 302);
INSERT INTO `classroom` VALUES (538, 11, NULL, 3, 303);
INSERT INTO `classroom` VALUES (539, 11, NULL, 3, 304);
INSERT INTO `classroom` VALUES (540, 11, '基础护理实训室', 3, 305);
INSERT INTO `classroom` VALUES (541, 11, '五官护理实训室', 4, 402);
INSERT INTO `classroom` VALUES (542, 11, '健康评估1', 4, 403);
INSERT INTO `classroom` VALUES (543, 11, NULL, 4, 404);
INSERT INTO `classroom` VALUES (544, 11, '中医康复护理实训室', 4, 405);
INSERT INTO `classroom` VALUES (545, 11, '更衣室2', 5, 501);
INSERT INTO `classroom` VALUES (546, 11, '麻醉苏醒室、刷手间', 5, 502);
INSERT INTO `classroom` VALUES (547, 11, NULL, 5, 503);
INSERT INTO `classroom` VALUES (548, 11, NULL, 5, 504);
INSERT INTO `classroom` VALUES (549, 11, '老年护理实训室', 5, 505);
INSERT INTO `classroom` VALUES (550, 11, '社区护理实训室', 5, 506);
INSERT INTO `classroom` VALUES (551, 12, '解剖标本陈列室', 1, 101);
INSERT INTO `classroom` VALUES (552, 12, '解剖实验室1', 1, 102);
INSERT INTO `classroom` VALUES (553, 12, '解剖实验室2', 1, 103);
INSERT INTO `classroom` VALUES (554, 12, '解剖实验室3', 1, 104);
INSERT INTO `classroom` VALUES (555, 12, '机能实验准备室', 2, 201);
INSERT INTO `classroom` VALUES (556, 12, '微生物与免疫实验更衣室', 3, 301);
INSERT INTO `classroom` VALUES (557, 12, '标本处理室', 3, 302);
INSERT INTO `classroom` VALUES (558, 12, '生化实验准备室', 4, 401);
INSERT INTO `classroom` VALUES (559, 12, NULL, 4, 402);
INSERT INTO `classroom` VALUES (560, 12, NULL, 4, 403);
INSERT INTO `classroom` VALUES (561, 12, NULL, 4, 404);
INSERT INTO `classroom` VALUES (562, 12, '病理标本陈列室', 4, 405);
INSERT INTO `classroom` VALUES (563, 12, '更衣室3', 5, 503);
INSERT INTO `classroom` VALUES (564, 12, NULL, 5, 504);
INSERT INTO `classroom` VALUES (565, 12, '产房', 5, 505);

-- ----------------------------
-- Table structure for dormitory
-- ----------------------------
DROP TABLE IF EXISTS `dormitory`;
CREATE TABLE `dormitory`  (
  `dormitory_id` int NOT NULL COMMENT '宿舍id',
  `dormitory_building_id` int NOT NULL COMMENT '宿舍楼id',
  `dormitory_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '宿舍名（号）',
  PRIMARY KEY (`dormitory_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dormitory
-- ----------------------------

-- ----------------------------
-- Table structure for dormitory_building
-- ----------------------------
DROP TABLE IF EXISTS `dormitory_building`;
CREATE TABLE `dormitory_building`  (
  `dormitory_building_id` int NOT NULL,
  `dormitory_building_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `dormitory_building_height` int NULL DEFAULT NULL,
  `dormitory_building_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `left` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `top` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dormitory_building_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of dormitory_building
-- ----------------------------
INSERT INTO `dormitory_building` VALUES (1, '1号公寓', 3, '女', '72', '68');
INSERT INTO `dormitory_building` VALUES (2, '2号公寓', 6, '女', '71', '59');
INSERT INTO `dormitory_building` VALUES (3, '3号公寓', NULL, NULL, '60', '60');
INSERT INTO `dormitory_building` VALUES (4, '4号公寓', 6, '女', '59', '53');
INSERT INTO `dormitory_building` VALUES (5, '5号公寓', 6, '女', '57', '55');
INSERT INTO `dormitory_building` VALUES (6, '6号公寓', 6, '女', '57', '52');
INSERT INTO `dormitory_building` VALUES (7, '7号公寓', NULL, NULL, '56', '59');
INSERT INTO `dormitory_building` VALUES (8, '8号公寓', 6, '女', '57', '62');
INSERT INTO `dormitory_building` VALUES (9, '9号公寓', NULL, '女', '57', '66');
INSERT INTO `dormitory_building` VALUES (10, '10号公寓', NULL, '女', '56', '68');
INSERT INTO `dormitory_building` VALUES (11, '11号公寓', NULL, '女', '55', '66');
INSERT INTO `dormitory_building` VALUES (12, '12号公寓', NULL, '女', '54', '68');
INSERT INTO `dormitory_building` VALUES (13, '13号公寓', NULL, '女', '52', '65');
INSERT INTO `dormitory_building` VALUES (14, '14号公寓', NULL, NULL, '51', '65');
INSERT INTO `dormitory_building` VALUES (15, '15号公寓', NULL, NULL, '51', '68');
INSERT INTO `dormitory_building` VALUES (16, '16号公寓', NULL, NULL, '51', '60');
INSERT INTO `dormitory_building` VALUES (17, '17号公寓', NULL, '女', NULL, NULL);
INSERT INTO `dormitory_building` VALUES (18, '18号公寓', NULL, NULL, '48', '59');
INSERT INTO `dormitory_building` VALUES (19, '19号公寓', 5, '女', '47', '58');
INSERT INTO `dormitory_building` VALUES (20, '20号公寓', 6, 'a栋为男生宿舍，其他栋为女生宿舍', '45', '60');
INSERT INTO `dormitory_building` VALUES (21, '21号公寓', 6, '男', NULL, NULL);
INSERT INTO `dormitory_building` VALUES (22, '22号公寓', 6, '男', '36', '49');
INSERT INTO `dormitory_building` VALUES (23, '23号公寓', 6, '男', '21', '54');
INSERT INTO `dormitory_building` VALUES (24, '24号公寓', NULL, NULL, '19', '56');
INSERT INTO `dormitory_building` VALUES (25, '25号公寓', NULL, NULL, '19', '53');
INSERT INTO `dormitory_building` VALUES (26, '26号公寓', NULL, NULL, '17', '54');
INSERT INTO `dormitory_building` VALUES (27, '27号公寓', NULL, NULL, '15', '45');
INSERT INTO `dormitory_building` VALUES (28, '28号公寓', NULL, NULL, '14', '47');
INSERT INTO `dormitory_building` VALUES (29, '29号公寓', NULL, NULL, '20', '40');
INSERT INTO `dormitory_building` VALUES (30, '30号公寓', NULL, NULL, '18', '41');
INSERT INTO `dormitory_building` VALUES (31, '31号公寓', 6, NULL, '17', '39');
INSERT INTO `dormitory_building` VALUES (32, '32号公寓', NULL, NULL, '15', '40');
INSERT INTO `dormitory_building` VALUES (33, '33号公寓', NULL, NULL, NULL, NULL);
INSERT INTO `dormitory_building` VALUES (34, '34号公寓', NULL, NULL, NULL, NULL);
INSERT INTO `dormitory_building` VALUES (35, '35号公寓', NULL, NULL, NULL, NULL);
INSERT INTO `dormitory_building` VALUES (36, '36号公寓', NULL, NULL, NULL, NULL);
INSERT INTO `dormitory_building` VALUES (37, '37号公寓', NULL, NULL, NULL, NULL);
INSERT INTO `dormitory_building` VALUES (38, '38号公寓', NULL, NULL, '30', '60');
INSERT INTO `dormitory_building` VALUES (39, '康大宿舍', NULL, NULL, '16', '50');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission`  (
  `permission_id` int NOT NULL AUTO_INCREMENT,
  `permission_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`permission_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES (1, 'insert');
INSERT INTO `permission` VALUES (2, 'delete');
INSERT INTO `permission` VALUES (3, 'update');
INSERT INTO `permission` VALUES (4, 'query');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role`  (
  `role_id` int NOT NULL,
  `role_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES (1, 'manager');
INSERT INTO `role` VALUES (2, 'user');

-- ----------------------------
-- Table structure for role_permission
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission`  (
  `r_id` int NOT NULL,
  `p_id` int NOT NULL,
  PRIMARY KEY (`r_id`, `p_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES (1, 1);
INSERT INTO `role_permission` VALUES (1, 2);
INSERT INTO `role_permission` VALUES (1, 3);
INSERT INTO `role_permission` VALUES (1, 4);
INSERT INTO `role_permission` VALUES (2, 4);

-- ----------------------------
-- Table structure for shop
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop`  (
  `shop_id` int NOT NULL,
  `canteen_id` int NOT NULL,
  `shop_name` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `left` int NULL DEFAULT NULL,
  `top` int NULL DEFAULT NULL,
  PRIMARY KEY (`shop_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of shop
-- ----------------------------
INSERT INTO `shop` VALUES (1, 3, '蜜雪冰城', NULL, NULL);
INSERT INTO `shop` VALUES (2, 3, '老粉作坊', NULL, NULL);
INSERT INTO `shop` VALUES (3, 3, '阿爽拉肠饺子', NULL, NULL);
INSERT INTO `shop` VALUES (4, 3, '粤港风味烧腊饭', NULL, NULL);
INSERT INTO `shop` VALUES (5, 3, '潘朵儿石锅饭', NULL, NULL);
INSERT INTO `shop` VALUES (6, 3, '自由煮义', NULL, NULL);
INSERT INTO `shop` VALUES (7, 3, '广式云吞面', NULL, NULL);
INSERT INTO `shop` VALUES (8, 3, '一本道芝士焗饭', NULL, NULL);
INSERT INTO `shop` VALUES (9, 3, '土耳其烤肉饭', NULL, NULL);
INSERT INTO `shop` VALUES (10, 5, '幸福水果捞', NULL, NULL);
INSERT INTO `shop` VALUES (11, 5, '幸福麻辣烫幸福鸡公煲', NULL, NULL);
INSERT INTO `shop` VALUES (12, 6, '鲜果缘水果捞', NULL, NULL);
INSERT INTO `shop` VALUES (13, 6, '家家味焗饭', NULL, NULL);
INSERT INTO `shop` VALUES (14, 6, '柳州螺蛳粉', NULL, NULL);
INSERT INTO `shop` VALUES (15, 6, '客家风味小炒', NULL, NULL);
INSERT INTO `shop` VALUES (16, 6, 'SITTER茶空间', NULL, NULL);
INSERT INTO `shop` VALUES (17, 6, '新一鸡排.汉堡.小串', NULL, NULL);
INSERT INTO `shop` VALUES (18, 6, '阿妈靓食原味汤粉', NULL, NULL);
INSERT INTO `shop` VALUES (19, 6, '一炖天香', NULL, NULL);
INSERT INTO `shop` VALUES (20, 6, '星辰潮记风味', NULL, NULL);
INSERT INTO `shop` VALUES (21, 6, '眷村阿嬷粢饭團', NULL, NULL);
INSERT INTO `shop` VALUES (22, 6, '肠粉猪杂汤饭', NULL, NULL);
INSERT INTO `shop` VALUES (23, 6, '粤肠玖肠粉', NULL, NULL);
INSERT INTO `shop` VALUES (24, 6, '张率麻辣烫麻辣香锅', NULL, NULL);
INSERT INTO `shop` VALUES (25, 7, '北海道·芝士焗饭', NULL, NULL);
INSERT INTO `shop` VALUES (26, 7, '麻辣烫', NULL, NULL);
INSERT INTO `shop` VALUES (27, 7, '精品小碗菜', NULL, NULL);
INSERT INTO `shop` VALUES (28, 7, '益禾堂', NULL, NULL);
INSERT INTO `shop` VALUES (29, 7, '弁当就酱·千层饭·咖喱饭', NULL, NULL);
INSERT INTO `shop` VALUES (30, 7, '味品轩鸡煲王', NULL, NULL);
INSERT INTO `shop` VALUES (31, 7, '北京麻辣香锅', NULL, NULL);
INSERT INTO `shop` VALUES (32, 7, '港式烧腊', NULL, NULL);
INSERT INTO `shop` VALUES (33, 7, '原味蒸笼饭', NULL, NULL);
INSERT INTO `shop` VALUES (34, 7, '潮品王潮味汤粉王', NULL, NULL);
INSERT INTO `shop` VALUES (35, 7, '经典美味好吃到爆牛油拌饭', NULL, NULL);
INSERT INTO `shop` VALUES (36, 7, '鱼拿酸菜鱼', NULL, NULL);
INSERT INTO `shop` VALUES (37, 7, '番茄酥肉米线', NULL, NULL);
INSERT INTO `shop` VALUES (38, 7, '譚记关东煮', NULL, NULL);
INSERT INTO `shop` VALUES (39, 7, '金常来特色盖浇饭炒饭', NULL, NULL);
INSERT INTO `shop` VALUES (40, 7, '福建沙县小吃', NULL, NULL);
INSERT INTO `shop` VALUES (41, 7, '同心水饺', NULL, NULL);
INSERT INTO `shop` VALUES (42, 7, '黄焖鸡', NULL, NULL);
INSERT INTO `shop` VALUES (43, 7, '兰州拉面', NULL, NULL);
INSERT INTO `shop` VALUES (44, 7, '芝士焗饭', NULL, NULL);
INSERT INTO `shop` VALUES (45, 7, '水果捞', NULL, NULL);
INSERT INTO `shop` VALUES (46, 7, '鲜享食呈', NULL, NULL);
INSERT INTO `shop` VALUES (47, 7, 'Q堡堡', NULL, NULL);
INSERT INTO `shop` VALUES (48, 7, '桃園三章', NULL, NULL);
INSERT INTO `shop` VALUES (49, 7, '川渝重庆小面', NULL, NULL);
INSERT INTO `shop` VALUES (50, 7, '喜小鱼无骨杂粮鱼粉', NULL, NULL);
INSERT INTO `shop` VALUES (51, 7, '麻辣烫麻辣香锅', NULL, NULL);
INSERT INTO `shop` VALUES (52, 7, '陳记关东煮串串香', NULL, NULL);
INSERT INTO `shop` VALUES (53, 7, '阿布到家拌饭', NULL, NULL);
INSERT INTO `shop` VALUES (54, 7, '沫言茶语', NULL, NULL);
INSERT INTO `shop` VALUES (55, 7, '金牌烧鹅饭', NULL, NULL);
INSERT INTO `shop` VALUES (56, 7, '大可鱼酸菜鱼', NULL, NULL);
INSERT INTO `shop` VALUES (57, 7, '农家砂锅菜', NULL, NULL);
INSERT INTO `shop` VALUES (58, 7, '订食PRE-MENU', NULL, NULL);
INSERT INTO `shop` VALUES (59, 7, '正新鸡排', NULL, NULL);
INSERT INTO `shop` VALUES (60, 7, '屿禾家', NULL, NULL);
INSERT INTO `shop` VALUES (61, 7, '佐敦道ZODODO', NULL, NULL);
INSERT INTO `shop` VALUES (62, 7, '潮汕鲜鱼粥', NULL, NULL);
INSERT INTO `shop` VALUES (63, 7, '喜三德糖水', NULL, NULL);
INSERT INTO `shop` VALUES (64, 2, '瑞幸咖啡', NULL, NULL);
INSERT INTO `shop` VALUES (65, 2, '一樂芝士焗饭', NULL, NULL);
INSERT INTO `shop` VALUES (66, 2, '烧腊饭', NULL, NULL);
INSERT INTO `shop` VALUES (67, 2, '面生源·重庆小面·牛肉面', NULL, NULL);
INSERT INTO `shop` VALUES (68, 2, '超润甜品', NULL, NULL);
INSERT INTO `shop` VALUES (69, 2, '炼记肠粉', NULL, NULL);
INSERT INTO `shop` VALUES (70, 2, '大可鱼无骨酸菜鱼', NULL, NULL);
INSERT INTO `shop` VALUES (71, 2, '五谷鱼粉', NULL, NULL);
INSERT INTO `shop` VALUES (72, 2, '关东煮', NULL, NULL);
INSERT INTO `shop` VALUES (73, 2, '麻辣烫', NULL, NULL);
INSERT INTO `shop` VALUES (74, 2, '桃園三章', NULL, NULL);
INSERT INTO `shop` VALUES (75, 2, '螺蛳粉', NULL, NULL);
INSERT INTO `shop` VALUES (76, 2, '千椒百味麻辣香锅', NULL, NULL);
INSERT INTO `shop` VALUES (77, 2, '犀米家', NULL, NULL);
INSERT INTO `shop` VALUES (78, 2, '大众菜区', NULL, NULL);
INSERT INTO `shop` VALUES (79, 2, '卤大师猪脚饭', NULL, NULL);
INSERT INTO `shop` VALUES (80, 2, '大盘菜', NULL, NULL);
INSERT INTO `shop` VALUES (81, 2, '老司机plus', NULL, NULL);
INSERT INTO `shop` VALUES (82, 2, '蒙自源米线', NULL, NULL);
INSERT INTO `shop` VALUES (83, 2, '仟味美肠粉王', NULL, NULL);
INSERT INTO `shop` VALUES (84, 2, '金大嫂自选水饺', NULL, NULL);
INSERT INTO `shop` VALUES (85, 2, '不抖勺烤肉饭', NULL, NULL);
INSERT INTO `shop` VALUES (86, 2, '台湾风味粥粉面', NULL, NULL);
INSERT INTO `shop` VALUES (87, 2, '佳乐堡', NULL, NULL);
INSERT INTO `shop` VALUES (88, 2, '呱果屋', NULL, NULL);
INSERT INTO `shop` VALUES (89, 5, '芋柠鲜茶', NULL, NULL);
INSERT INTO `shop` VALUES (90, 4, '早点到饺子', NULL, NULL);
INSERT INTO `shop` VALUES (91, 4, ' 湛江鸡饭', NULL, NULL);
INSERT INTO `shop` VALUES (92, 4, '潮汕原味', NULL, NULL);
INSERT INTO `shop` VALUES (93, 4, '食尚扒饭', NULL, NULL);
INSERT INTO `shop` VALUES (94, 4, '湖边小厨', NULL, NULL);
INSERT INTO `shop` VALUES (95, 4, '串串香关东煮', NULL, NULL);
INSERT INTO `shop` VALUES (96, 4, '广式包点', NULL, NULL);
INSERT INTO `shop` VALUES (97, 4, '大众菜区', NULL, NULL);

-- ----------------------------
-- Table structure for sports_field
-- ----------------------------
DROP TABLE IF EXISTS `sports_field`;
CREATE TABLE `sports_field`  (
  `sports_field_id` int NOT NULL COMMENT '体育场id',
  `sports_field_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '体育场名字',
  `sports_field_floor` int NULL DEFAULT NULL COMMENT '所在楼层',
  `sports_field_usertype` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '使用者类型',
  `left` int NULL DEFAULT NULL COMMENT 'left坐标',
  `top` int NULL DEFAULT NULL COMMENT 'top坐标',
  PRIMARY KEY (`sports_field_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of sports_field
-- ----------------------------
INSERT INTO `sports_field` VALUES (1, '广商足球场', 1, '学生+老师', 67, 46);
INSERT INTO `sports_field` VALUES (2, '游泳场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (3, '康达篮球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (4, '第二行政区篮球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (5, '五教旁篮球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (6, '康大足球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (7, '一教健身房', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (8, '五教健身房', 2, '体育学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (9, '康大健身房', 1, '体育学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (10, '图书馆羽毛球场', 1, '学生+老师', 66, 77);
INSERT INTO `sports_field` VALUES (11, '20栋羽毛球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (12, '健身房下的羽毛球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (13, '康大下的羽毛球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (14, '第三行政楼的网球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (15, '健身房下的网球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (16, '广商排球场', 1, '学生+老师', NULL, NULL);
INSERT INTO `sports_field` VALUES (17, '体育馆下的健身房', 1, '学生+老师', NULL, NULL);

-- ----------------------------
-- Table structure for teaching_building
-- ----------------------------
DROP TABLE IF EXISTS `teaching_building`;
CREATE TABLE `teaching_building`  (
  `teaching_building_id` int NOT NULL COMMENT '教学楼id',
  `teaching_building_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '教学楼名',
  `teaching_building_height` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '楼层数',
  `left` int NULL DEFAULT NULL COMMENT 'left坐标',
  `top` int NULL DEFAULT NULL COMMENT 'top坐标',
  PRIMARY KEY (`teaching_building_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of teaching_building
-- ----------------------------
INSERT INTO `teaching_building` VALUES (1, '第一教学楼', '6', 66, 55);
INSERT INTO `teaching_building` VALUES (2, '第二教学楼', '6', 68, 57);
INSERT INTO `teaching_building` VALUES (3, '第三教学楼', NULL, 64, 52);
INSERT INTO `teaching_building` VALUES (4, '国际楼', NULL, 71, 52);
INSERT INTO `teaching_building` VALUES (5, '艺术楼', NULL, 46, 62);
INSERT INTO `teaching_building` VALUES (6, '第四教学楼', '6', 40, 60);
INSERT INTO `teaching_building` VALUES (7, '第五教学楼', '6', 39, 57);
INSERT INTO `teaching_building` VALUES (8, '第六教学楼', NULL, 38, 54);
INSERT INTO `teaching_building` VALUES (9, '第七教学楼', NULL, 39, 46);
INSERT INTO `teaching_building` VALUES (10, '实训楼', NULL, 42, 52);
INSERT INTO `teaching_building` VALUES (11, '康大实训楼A栋', NULL, 22, 57);
INSERT INTO `teaching_building` VALUES (12, '康大教学楼B栋', NULL, 24, 60);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `user_name` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '密码',
  `phone_num` char(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '手机号',
  `Email` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '电子邮箱',
  `profile_photo_path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '' COMMENT '头像路径',
  `Last_offline_time` datetime NULL DEFAULT NULL COMMENT '最后一次离线时间',
  `user_group` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户组',
  `state_code` tinyint(1) NOT NULL DEFAULT 1 COMMENT '状态码',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'jake', 'lhK4oeZRLz2l2STFXrYAOA==', '120', 'tuanziatclannad@qq.com', '/', '2022-04-21 19:56:29', '1', 1);
INSERT INTO `user` VALUES (2, 'mike', 'lhK4oeZRLz2l2STFXrYAOA==', '13302361327', '1151214239@qq.com', '', NULL, NULL, 1);
INSERT INTO `user` VALUES (12, '', 'mXv7RDnV3uDMr0pmeBPM2Q==', NULL, '3575195417@qq.com', '', NULL, NULL, 1);
INSERT INTO `user` VALUES (13, '', 'jHkW2ffsGGewLKTeaK3tLw==', NULL, '3075385315@qq.com', '', NULL, NULL, 1);

-- ----------------------------
-- Table structure for user_identity
-- ----------------------------
DROP TABLE IF EXISTS `user_identity`;
CREATE TABLE `user_identity`  (
  `user_identity_id` int NOT NULL AUTO_INCREMENT COMMENT '用户身份信息id',
  `user_id` int NOT NULL COMMENT '用户id',
  `user_sex` varchar(4) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '性别',
  `user_realname` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '用户真实姓名',
  `user_school` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学校',
  `user_college` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '学院',
  `user_specialty` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '专业',
  `user_student_id` int NULL DEFAULT NULL COMMENT '学号',
  `user_class` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '班级',
  PRIMARY KEY (`user_identity_id`) USING BTREE,
  INDEX `user_id`(`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of user_identity
-- ----------------------------
INSERT INTO `user_identity` VALUES (1, 2, 'man', '高健杰', '广州商学院', 'computer', 'software', 8, '软件工程2102');
INSERT INTO `user_identity` VALUES (2, 1, 'man', '高简介', 'gcc', 'gcc', 'gcc', 123, 'gcc');
INSERT INTO `user_identity` VALUES (6, 13, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role`  (
  `u_id` int NOT NULL,
  `role_id` int NOT NULL,
  PRIMARY KEY (`u_id`, `role_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES (1, 1);
INSERT INTO `user_role` VALUES (2, 2);
INSERT INTO `user_role` VALUES (12, 2);
INSERT INTO `user_role` VALUES (13, 2);

SET FOREIGN_KEY_CHECKS = 1;
