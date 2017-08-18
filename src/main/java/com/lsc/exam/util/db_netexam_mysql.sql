/*
CREATE DATABASE db_netexam;
USE db_netexam;
*/

DROP TABLE IF EXISTS `tb_lesson`;
DROP TABLE IF EXISTS `tb_chapter`;
DROP TABLE IF EXISTS `tb_user`;
DROP TABLE IF EXISTS `tb_questions`;
DROP TABLE IF EXISTS `tb_taoti`;
DROP TABLE IF EXISTS `tb_exam`;
DROP TABLE IF EXISTS `tb_exam_result`; 
DROP TABLE IF EXISTS `tb_exam_student`;
DROP TABLE IF EXISTS `tb_rule`;



CREATE TABLE `tb_lesson` ( 	-- -1--
  `ID` 		BIGINT(10) UNSIGNED NOT NULL AUTO_INCREMENT , 
  `Name` 	VARCHAR(200) ,
  `joinTime` 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ,
  `Status` 	INT DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE `tb_chapter` ( 	-- -2--
  `ID` 		INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `lessonId` 	INT ,
  `chapterName` VARCHAR(200) DEFAULT '',
  `joinTime` 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` 	INT DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE `tb_user` ( 	-- -3--
  `ID` 		VARCHAR(10) NOT NULL  , 
  `name` 	VARCHAR(200) ,
  `pwd` 	VARCHAR(200) ,
  `sex` 	VARCHAR(200) DEFAULT '女',
  `joinTime` 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `question` 	VARCHAR(200) DEFAULT '',
  `answer` 	VARCHAR(200) DEFAULT '',
  `profession` 	VARCHAR(200) DEFAULT '1', 	-- 职位 1管理员 2教师 3学生
  `cardNo` 	INT ,				-- salt
  `status` 	INT DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `tb_user`(`ID`,`name`,`pwd`,`cardNo`) VALUES ('1', 'admin', '123',0);

CREATE TABLE `tb_questions` ( 	-- -4--
  `id` 		BIGINT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `type` 	INT ,
  `difficulty` 	DOUBLE ,
  `pointId` 	VARCHAR(200) ,
  `choice1` 	VARCHAR(200) ,
  `choice2` 	VARCHAR(200) ,
  `choice3` 	VARCHAR(200) ,
  `choice4` 	VARCHAR(200) ,
  `answer` 	VARCHAR(200) ,
  `userId` 	VARCHAR(200) ,
  `createTime` 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `userName` 	VARCHAR(200) ,
  `knowledgeName` VARCHAR(200) ,
  `score` 	INT ,
  `status` 	INT DEFAULT '0',
  `lessonid` 	INT(10) ,
  `stem` 	TEXT ,
  PRIMARY KEY (`iD`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE `tb_taoti` ( 	-- -5--
  `ID` 		BIGINT(10) NOT NULL  , 
  `Name` 	VARCHAR(200) ,
  `LessonID` 	BIGINT(10) ,
  `joinTime` 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Status` 	INT DEFAULT '0',
  PRIMARY KEY (`ID`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE `tb_exam` ( 	-- -6--
  `id` 		INT(10) NOT NULL  , 
  `questionId` 	INT(10) ,
  `taotiId` 	INT(200) ,
  `status` 	INT DEFAULT '0',
  `joinTime` 	TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;



CREATE TABLE `tb_exam_result` (		-- -7--
  `id` 		INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `questionId` 	INT(10) ,	-- bigint
  `answer` 	VARCHAR(200) ,
  `score` 	INT ,
  `studentId` 	VARCHAR(200) ,
  `studentName` VARCHAR(200) ,
  `teachId` 	VARCHAR(200) ,
  `teachName` 	VARCHAR(200) ,
  `taotiId` 	INT(10) ,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_exam_student` (	-- -8--
  `id` 		INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `taotiId` 	INT(10) ,
  `taotiName` 	VARCHAR(200) ,
  `studentId` 	VARCHAR(200) , 
  `studentName` VARCHAR(200) ,
  `status` 	INT ,
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

CREATE TABLE `tb_rule` (		-- -9--
  `id` 			INT(10) UNSIGNED NOT NULL AUTO_INCREMENT ,
  `lessonid` 		INT(10) ,
  `totalMark` 		INT ,  
  `difficulty` 		DOUBLE ,
  `singleNum` 		INT ,
  `singleScore` 	INT ,
  `multipleScore` 	INT ,
  `multipleNum` 	INT ,
  `completeNum` 	INT ,
  `completeScore` 	INT ,
  `CalculationNum` 	INT ,
  `CalculationScore` 	INT ,
  `subjectiveNum` 	INT ,
  `subjectiveScore` 	INT ,
  `createTime` 		TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `status` 		INT DEFAULT '0',
  `ruleName` 		VARCHAR(200) , 
  `pointIds` 		TEXT , 
  PRIMARY KEY (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;












INSERT INTO `tb_lesson`(`ID`,`Name` ) VALUES ('1', 'tb_lesson_1');
INSERT INTO `tb_chapter`(`ID`,`lessonId` ) VALUES ('1', '1');
INSERT INTO `tb_user`(`ID`,`name`,`pwd`) VALUES ('1', 'admin', '123');

INSERT INTO `tb_questions`(`ID`,`lessonId`,`Name` ) VALUES ('1', '1', 'chapterName_1');
INSERT INTO `tb_taoti`(`id`,`lessonId`,`Name` ) VALUES ('1', '1', 'chapterName_1');
INSERT INTO `tb_exam`(`id`,`lessonId`,`Name` ) VALUES ('1', '1', 'chapterName_1');

INSERT INTO `tb_exam_result`(`ID`,`lessonId`,`Name` ) VALUES ('1', '1', 'chapterName_1');
INSERT INTO `tb_exam_student`(`id`,`lessonId`,`Name` ) VALUES ('1', '1', 'chapterName_1');
INSERT INTO `tb_questions`(`ID`,`lessonId`,`Name` ) VALUES ('1', '1', 'chapterName_1');