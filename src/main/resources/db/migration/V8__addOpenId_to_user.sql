alter table user
	add open_id varchar(100) not null;

create unique index user_open_id_uindex
	on user (open_id);