INSERT INTO LPU_MOVIE_USER(USER_ID,PASSWORD) VALUES (101,'Sai Durga');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1001,'bahubali','telugu','ssr','action');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1002,'war','hindi','karan','action');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1003,'kgf','kannada','prashanth','action');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1004,'wfl','telugu','vd','Romantic');
insert into LPU_MOVIE_MOVIE(movie_Id,movie_Name,language,director,genre) values(1005,'hit','telugu','sudheer','thriller');

select * from LPU_MOVIE_MOVIE;
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(1, 'a','jalandhar','ram',9875,1001);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(2, 'b','jalandhar','sam',7896,1001);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(3, 'c','phagwara','shyam',7568,1002);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(4, 'd','phagwara','singh',8974,1003);
Insert into LPU_MOVIE_THEATER(theater_Id,theater_Name,theater_city,manager_Name,manager_Contact,movie_Id) values(5, 'e','amritsar','harpal',6548,1003);

select * from LPU_MOVIE_THEATER;

insert into LPU_MOVIE_SHOW(show_Id,show_Name,seats,screen_name,show_Start_Time,show_End_Time) values(1001,'morningshow',100,'dolby',TO_DATE('2020/05/03 09:30:00', 'yyyy/mm/dd hh24:mi:ss'),TO_DATE('2020/05/03 12:30:00', 'yyyy/mm/dd hh24:mi:ss'));

insert into LPU_MOVIE_SHOW(show_id,show_Name,seats,screen_name,show_Start_Time,show_End_Time) values(1002,'morningshow',100,'dolby',TO_DATE('2020/05/03 09:30:00', 'yyyy/mm/dd hh24:mi:ss'),TO_DATE('2020/05/03 12:30:00', 'yyyy/mm/dd hh24:mi:ss'));

INSERT INTO LPU_MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1025,200,'Available',1001);
INSERT INTO LPU_MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1024,200,'Available',1001);
INSERT INTO LPU_MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1021,250,'Available',1001);
INSERT INTO LPU_MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1022,260,'Available',1002);
INSERT INTO LPU_MOVIE_SEAT(SEAT_ID,SEAT_PRICE,SEAT_STATUS,SHOW_ID) VALUES (1023,270,'Available',1002);
