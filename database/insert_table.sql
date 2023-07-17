
insert into role(code,name) values('ADMIN','ADMIN');
insert into role(code,name) values('USER','USER');

insert into users(username,password,fullname,status, roleid) values('admin','123456','admin',1,1);
insert into users(username,password,fullname,status, roleid) values('nguyenvana','123456','nguyen van a',1,2);
insert into users(username,password,fullname,status, roleid) values('nguyenvanb','123456','nguyen van b',1,2);

insert into category(code,name) values('ADMIN','ADMIN');
insert into category(code,name) values('USER','USER');


insert into news(title,thumbnail,shortDescription,content,categoryId) values('admin','123456','admin','content',1);
insert into news(title,thumbnail,shortDescription,content,categoryId) values('bài viết 1','baiviet.png','hành động','content',1);
insert into news(title,thumbnail,shortDescription,content,categoryId) values('baiviet2','baiviet2','admin','content',2);
insert into news(title,thumbnail,shortDescription,content,categoryId) values('bài viết 3','baiviet3.png','hành động 4','content',2);
