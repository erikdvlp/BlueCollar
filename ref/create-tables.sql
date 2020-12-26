drop table if exists User;
create table User(
	user_id int auto_increment primary key,
	worker boolean,
	first_name varchar(30),
	last_name varchar(30),
	email varchar(50),
	rating int,
	active boolean,
	city varchar(50),
	province varchar(3),
	country varchar(3),
	username varchar(20) not null,
	pass_hash varchar(100) not null
);

drop table if exists Job;
create table Job(
	job_id int auto_increment primary key,
	client_id int,
	worker_id int,
	jobcategory_id int,
	text varchar(200),
	status int
);

drop table if exists JobCategory;
create table JobCategory(
	jobcategory_id int auto_increment primary key,
	name varchar(30)
);

drop table if exists Review;
create table Review(
	review_id int auto_increment primary key,
	client_id int,
	worker_id int,
	rating int,
	text varchar(200)
);

drop table if exists LoginAnalytics;
create table LoginAnalytics(
	user_id int auto_increment primary key,
	timestamp date,
	ip varchar(50)
);

drop table if exists SearchAnalytics;
create table SearchAnalytics(
	user_id int auto_increment primary key,
	timestamp date,
	ip varchar(50),
	text varchar(200)
);