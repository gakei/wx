create table article
(
	id int auto_increment,
	title varchar(60) not null comment '文章标题',
	content text not null comment '文章内容',
	comment_num int default 0 null comment '文章评论数，默认为0',
	like_num int default 0 null comment '点赞数，默认为0',
	tag varchar(40) not null comment '标签名，不能为空',
	is_deleted int default 0 null comment '删除标志，1为删除，0为未删除',
	constraint article_pk
		primary key (id)
);

