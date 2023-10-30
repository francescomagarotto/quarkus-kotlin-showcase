create if not exists table pet
(
    name varchar primary key ,
    age  int
);

insert into pet (name, age)
values ('Pluto', 4),
       ('Nemo', 2);