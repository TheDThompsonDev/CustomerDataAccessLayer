create database customerdb

use customerdb

create table customertab(
id INT PRIMARY KEY AUTO_INCREMENT,
cname varchar(28),
cemail varchar(38) 
)

select * from customertab

drop table customertab