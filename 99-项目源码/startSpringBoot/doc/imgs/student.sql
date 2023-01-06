DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `realname` varchar(50) DEFAULT '' COMMENT '登录用户名',
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT '真实姓名',
  `money` int(11) DEFAULT '0',
  `password` varchar(100) NOT NULL DEFAULT '' COMMENT '密码',
  `gender` tinyint(1) DEFAULT '1' COMMENT '性别',
  `header` varchar(512) DEFAULT '' COMMENT '头像',
  `mobile` varchar(15) DEFAULT '' COMMENT '手机号码',
  `status` tinyint(1) NOT NULL DEFAULT '2' COMMENT '状态：待审核（0），有效（1），无效（3）',
  `birthday` date DEFAULT '1900-01-01',
  `education` varchar(50) DEFAULT '' COMMENT '学历：大专、本科、硕士、博士、博士后',
  `createAt` datetime DEFAULT NULL,
  `updateAt` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `T_AUTH_USER_USERNAME_UNIQUE` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '王阳明', 'wangyangming', '1000', '96E79218965EB72C92A549DD5A330112', '0', null, '18001584130', '1', '1900-01-01', '博士后', null, '2021-04-13 19:55:42');
INSERT INTO `student` VALUES ('2', '李四', 'lisi', '2000', '96E79218965EB72C92A549DD5A330112', '1', 'newHeader.png', '18001584131', '0', '1900-01-01', '本科', null, '2017-03-27 22:28:21');
INSERT INTO `student` VALUES ('3', '赵六', 'zhaoliu', '3000', '96E79218965EB72C92A549DD5A330112', '1', null, '18001584132', '2', '1900-01-01', '本科', null, '2017-03-27 22:28:21');
INSERT INTO `student` VALUES ('4', '张三', 'zhangsan', '8000', 'facaaf91b6a5e81a21099d6a8b5a0fdf1ec224e7b7caa82aceee442d4bea9c9d', '1', null, '', '1', '1900-01-01', '', null, '2021-04-16 12:17:37');
INSERT INTO `student` VALUES ('5', '祁聪', 'admin', '0', 'fc07872c52586b8454c91318618728407b9edecc23329552aba61ba644334ebd', '1', 'myHeader.png', '18001584138', '2', '1900-01-01', '本科', null, '2021-04-16 00:00:00');
INSERT INTO `student` VALUES ('6', '王五', 'wangwu', '100', '73976582557d382a57ab0c97a721fb6f5913b99e0c9064990a07ecc77e013f64', '1', null, '', '2', '1900-01-01', '', null, '2021-04-17 20:33:12');
