create table if not exists public.category (
	id serial primary key,
	name varchar(250) NOT NULL,
	createAt timestamp,
	comment1 varchar(2250), 
	comment2 varchar(2250)
);

create table if not exists public.businesstype (
	id serial primary key,
	categoryId int4,
	name varchar(250) NOT NULL,
	createAt timestamp,
	comment1 varchar(2250), 
	comment2 varchar(2250),
	constraint categoryId_fk foreign key (categoryId) references public.category(id)
);

create table if not exists public.business (
	id serial primary key,
	businesstypeId int4,
	name varchar(250) NOT NULL,
	address varchar(250) NOT NULL,
	numberphone varchar(250) NOT NULL,
	createAt timestamp,
	image varchar(250),
	comment1 varchar(2250), 
	comment2 varchar(2250),
	constraint businesstypeId_fk foreign key (businesstypeId) references public.businesstype(id)
);
