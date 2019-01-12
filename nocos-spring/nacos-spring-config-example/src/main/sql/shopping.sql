CREATE TABLE `user_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `cid` char(36) DEFAULT NULL,
  `phone` varchar(16) DEFAULT NULL,
  `nick_name` varchar(40) DEFAULT NULL,
  `gender` tinyint(4) DEFAULT NULL COMMENT '性别',
  `img_url` varchar(30) DEFAULT NULL,
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `email` varchar(50) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `status` int(11) DEFAULT NULL COMMENT '状态，0正常，1代表异常，可能有扩展',
  `last_name` varchar(20) DEFAULT NULL,
  `first_name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `index_phone` (`phone`) USING BTREE,
  KEY `index_name` (`nick_name`) USING BTREE,
  KEY `index_create_time` (`create_time`) USING BTREE,
  KEY `index_status` (`status`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8
