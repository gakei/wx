alter table article modify comment_num int default 0 not null comment '文章评论数，默认为0';

alter table article modify like_num int default 0 not null comment '点赞数，默认为0';