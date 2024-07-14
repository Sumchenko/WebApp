create schema if not exists catalogue;

create  table catalogue.t_product
(
    id serial primary key,
    c_tittle varchar(50) not null check (lenhth(trim(c_tittle)) >= 3),
    c_details varchar(1000)
);