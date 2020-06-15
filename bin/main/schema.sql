DROP TABLE IF EXISTS `account`;
create table `account` (
    user_id INT AUTO_INCREMENT,
    user_name VARCHAR(255),
    password VARCHAR(255),
    PRIMARY KEY(user_id)
)ENGINE=InnoDB;