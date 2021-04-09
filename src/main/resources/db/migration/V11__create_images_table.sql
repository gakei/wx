create table article_images
(
    id int not null,
    url varchar(100) null comment '图片的url',
    belong_to int null comment '关联文章的id',
    constraint article_images_pk
        primary key (id)
);