drop table if exists address
drop table if exists address_user
drop table if exists bank_account
drop table if exists basket
drop table if exists book
drop table if exists hibernate_sequence
drop table if exists lending
drop table if exists order
drop table if exists price
drop table if exists stock
drop table if exists user
create table address (id bigint not null, city varchar(255), number integer, streetName varchar(255), zipCode varchar(255), primary key (id)) type=MyISAM
create table address_user (Address_id bigint not null, users_id bigint not null, primary key (Address_id, users_id)) type=MyISAM
create table bank_account (id bigint not null, account_number varchar(255), agency_code smallint, bank_code smallint, bic varchar(255), country_code varchar(255), key smallint, user_id bigint, primary key (id)) type=MyISAM
create table basket (id bigint not null, book_id tinyblob, price_id tinyblob, quantity integer, user_id tinyblob, primary key (id)) type=MyISAM
create table book (id bigint not null, author_id tinyblob, barcode varchar(255), genre varchar(255), summary varchar(255), title varchar(255), yearPublication date, book_id bigint, primary key (id)) type=MyISAM
create table hibernate_sequence (next_val bigint) type=MyISAM
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table lending (id bigint not null, dueDate date, idBook bigint not null, lendingDate date, userId bigint, primary key (id)) type=MyISAM
create table order (id bigint not null, book_id tinyblob, orderDate date, user_id tinyblob, primary key (id)) type=MyISAM
create table price (id bigint not null, excludingTaxPrice double precision not null, priceValue double precision not null, taxRate integer not null, primary key (id)) type=MyISAM
create table stock (id bigint not null, creationDate date, stockName varchar(255), primary key (id)) type=MyISAM
create table user (id bigint not null, adresse tinyblob, birthday date, email varchar(255), firstname varchar(255), lastname varchar(255), phone varchar(255), address_id bigint, primary key (id)) type=MyISAM
alter table address_user add constraint UK_5l9iob5pqhahbnmd9v3qg2mcs unique (users_id)
alter table address_user add constraint FK8wptovuq4oj4jdc0bixp9r1q5 foreign key (users_id) references user (id)
alter table address_user add constraint FK1xygj9hw5wvmpvcylm1fwoxsa foreign key (Address_id) references address (id)
alter table bank_account add constraint FK92iik4jwhk7q385jubl2bc2mm foreign key (user_id) references user (id)
alter table book add constraint FK569v5yp7g4t8akovhw5mormbk foreign key (book_id) references stock (id)
alter table user add constraint FKddefmvbrws3hvl5t0hnnsv8ox foreign key (address_id) references address (id)
