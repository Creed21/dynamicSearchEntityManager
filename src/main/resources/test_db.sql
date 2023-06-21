CREATE TABLE grupa (
  id int NOT NULL,
  naziv text DEFAULT NULL,
  dtpoc date DEFAULT NULL,
  usc text DEFAULT NULL,
  dtc date ,
  usm text DEFAULT NULL,
  dtm date
) ;

INSERT INTO grupa (id, naziv, dtpoc, usc, dtc, usm, dtm)
		values (1, 'B -  sep 21', '2021-10-01', 'aca', '2021-09-04', 'aca', '2021-09-04');

INSERT INTO grupa (id, naziv, dtpoc, usc, dtc, usm, dtm)
		values (1, 'A -  jan 21', '2021-10-01', 'aca', '2021-09-04', 'aca', '2021-09-04');

INSERT INTO grupa (id, naziv, dtpoc, usc, dtc, usm, dtm)
		values (1, 'C -  feb 21', '2021-10-01', 'aca', '2021-09-04', 'aca', '2021-09-04');

INSERT INTO grupa (id, naziv, dtpoc, usc, dtc, usm, dtm)
		values (1, 'D -  mar 21', '2021-10-01', 'aca', '2021-09-04', 'aca', '2021-09-04');


select * from grupa g ;

SELECT g.* FROM Grupa as g WHERE LOWER( g.naziv) LIKE LOWER(CONCAT('%', :naziv,'%'))

select generatedAlias0 from Grupa as generatedAlias0 where generatedAlias0.naziv='A -  jan 21'



CREATE SEQUENCE simple_data_sequ START 0 minvalue 0;

create table simple_data(
	id int DEFAULT nextval('simple_data_sequ') primary key,
	value text
);

insert into simple_data(value) values('testing_data');
insert into simple_data(value) values('testing_data');
insert into simple_data(value) values('testing_data');

select * from simple_data sd ;

create table test_tbl (
	id1 int primary key,
	id2 int,
	id3 int,
	id4 int,
	id5 int,
	id6 int,
	id7 int,
	note1 text,
	note2 text,
	note3 text,
	note4 text,
	note5 text,
	note6 text,
	note7 text,
	dt1 date,
	dt2 date,
	dt3 date,
	dt4 date,
	dt5 date,
	dt6 date,
	dt7 date
);


insert into test_tbl(id1,id2,id3,id4,id5,id6,id7,
					note1,note2,note3,note4,note5,note6,note7,
					dt1,dt2,dt3,dt4,dt5,dt6,dt7)
			values(1,2,null,null,null,null,null,
					'note1 id1','note2 id1','note3 id1','note4 id1','note5 id1',null,null,
					'2023-06-20','2023-06-20','2023-06-20','2023-06-20',null,null,null);

insert into test_tbl(id1,id2,id3,id4,id5,id6,id7,
					note1,note2,note3,note4,note5,note6,note7,
					dt1,dt2,dt3,dt4,dt5,dt6,dt7)
			values(2,2,2,null,2,null,null,
					'note1 id2','note2 id2','note3 id2','note4 id2','note5 id2',null,'some random value',
					'2023-06-20','2023-06-20','2023-06-20','2023-06-20',null,null,null);

insert into test_tbl(id1,id2,id3,id4,id5,id6,id7,
					note1,note2,note3,note4,note5,note6,note7,
					dt1,dt2,dt3,dt4,dt5,dt6,dt7)
			values(3,3,3332,3,2,null,3,
					'note1 id3','note12313 id3','note3','note4 id2','note5 id2',null,'some random value',
					'2023-06-20','2023-06-23','2023-06-23',null,null,'2023-06-22','2000-01-01');

insert into test_tbl(id1,id2,id3,id4,id5,id6,id7,
					note1,note2,note3,note4,note5,note6,note7,
					dt1,dt2,dt3,dt4,dt5,dt6,dt7)
			values(4,1231211,-234234,-3,0,0,7,
					'note1 id4','1231 id4','asdasdfds','#!@/..,09123','note5 id2',null,'some random value',
					'2000-01-01','2023-06-23','2023-06-23',null,null,'2023-06-22','2000-01-01');


select * from test_tbl;


-- testing json for dynamic search
{
	"id1" : 3,
	"id2" : null,
	"id3" : null,
	"id4" : null,
	"id5" : null,
	"id6" : null,
	"id7" : null,
	"note1" : null,
	"note2" : "note12313 id3",
	"note3" : null,
	"note4" : null,
	"note5" : null,
	"note6" : null,
	"note7" : null,
	"dt1" : "2023-06-20",
	"dt2" : null,
	"dt3" : null,
	"dt4" : null,
	"dt5" : null,
	"dt6" : null,
	"dt7" : null
}


select *
from simple_data sd
where ;


