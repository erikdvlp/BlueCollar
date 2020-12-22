drop table if exists User;
create table User(
	user_id integer primary key autoincrement,
	worker boolean,
	first_name varchar(30),
	last_name varchar(30),
	email varchar(50),
	rating integer,
	active boolean,
	city varchar(50),
	province varchar(3),
	country varhcar(3),
	username varchar(20) not null,
	pass_hash varchar(100) not null
);

drop table if exists Job;
create table Job(
	job_id integer primary key autoincrement,
	client_id integer,
	worker_id integer,
	jobcategory_id integer,
	text varchar(200),
	status integer
);

drop table if exists JobCategory;
create table JobCategory(
	jobcategory_id integer primary key autoincrement,
	name varchar(30)
);

drop table if exists Review;
create table Review(
	review_id integer primary key autoincrement,
	client_id integer,
	worker_id integer,
	rating integer,
	text varchar(200)
);

drop table if exists LoginAnalytics;
create table LoginAnalytics(
	user_id integer not null,
	timestamp date,
	ip varchar(50)
);

drop table if exists SearchAnalytics;
create table SearchAnalytics(
	user_id integer not null,
	timestamp date,
	ip varchar(50),
	text varchar(200)
);