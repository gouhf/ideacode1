create sequence jsp_student_seq; 
create table jsp_student(
    id number(7) primary key,
    name varchar2(30) not null,
    email varchar2(60) not null,
    birthday date
);
select * from jsp_student
insert into jsp_student values(
jsp_student_seq.nextval,
'hgou',
'388888',
sysdate



)