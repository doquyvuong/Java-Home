
CHINH SUA
 UPDATE `accounts`
 SET `role` = 'user'
 WHERE `role` = 'admin';


THAY DOI
 ALTER TABLE `accounts`
 MODIFY COLUMN `role` varchar(20) DEFAULT 'user';