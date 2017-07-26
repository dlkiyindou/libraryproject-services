drop table if exists address
drop table if exists bank_account
drop table if exists hibernate_sequence
drop table if exists user
create table address (id bigint not null, date_creation date, date_update date, city varchar(255), number integer, street_name varchar(255), zip_code varchar(255), primary key (id)) type=MyISAM
create table bank_account (id bigint not null, date_creation date, date_update date, account_number varchar(255), agency_code smallint, bank_code smallint, bic varchar(255), country_code varchar(255), key smallint, user_id bigint, primary key (id)) type=MyISAM
create table hibernate_sequence (next_val bigint) type=MyISAM
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table user (id bigint not null, date_creation date, date_update date, birthday date, email varchar(255), firstname varchar(255), lastname varchar(255), phone varchar(255), address_id bigint, primary key (id)) type=MyISAM
alter table bank_account add constraint FK92iik4jwhk7q385jubl2bc2mm foreign key (user_id) references user (id)
alter table user add constraint FKddefmvbrws3hvl5t0hnnsv8ox foreign key (address_id) references address (id)
drop table if exists address
drop table if exists bank_account
drop table if exists hibernate_sequence
drop table if exists user
create table address (id bigint not null, date_creation datetime, date_update datetime, city varchar(255), number integer, street_name varchar(255), zip_code varchar(255), primary key (id)) type=MyISAM
create table bank_account (id bigint not null, date_creation datetime, date_update datetime, account_number varchar(255), agency_code smallint, bank_code smallint, bic varchar(255), country_code varchar(255), key smallint, user_id bigint, primary key (id)) type=MyISAM
create table hibernate_sequence (next_val bigint) type=MyISAM
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
insert into hibernate_sequence values ( 1 )
create table user (id bigint not null, date_creation datetime, date_update datetime, birthday date, email varchar(255), firstname varchar(255), lastname varchar(255), phone varchar(255), address_id bigint, primary key (id)) type=MyISAM
alter table bank_account add constraint FK92iik4jwhk7q385jubl2bc2mm foreign key (user_id) references user (id)
alter table user add constraint FKddefmvbrws3hvl5t0hnnsv8ox foreign key (address_id) references address (id)
