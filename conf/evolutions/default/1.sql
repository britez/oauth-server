# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table application (
  id                        bigint not null,
  name                      varchar(255),
  description               varchar(255),
  constraint pk_application primary key (id))
;

create sequence application_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists application;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists application_seq;

