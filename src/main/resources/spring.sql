CREATE DATABASE IF NOT EXISTS spring DEFAULT CHARSET utf8 COLLATE utf8_general_ci;
USE spring;
create table users(
              user_id   int           not null auto_increment,
              user_name VARCHAR(30)   not null  unique ,
              user_pw   VARCHAR(30)   not null  ,
              PRIMARY KEY (user_id)
            )ENGINE=InnoDB;