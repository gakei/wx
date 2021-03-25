create table user
(
	id int auto_increment,
	nick_name varchar(50) not null,
	gender varchar(10) null,
	language varchar(20) null,
	city varchar(20) null,
	provinces varchar(20) null,
	country varchar(20) null,
	avatar_url varchar(200) not null,
	constraint table_name_pk
		primary key (id)
);