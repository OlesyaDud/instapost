select * from insta."comment" c ;
select * from insta.post p ;
select * from insta."user" u ;

insert into insta."user" (u_id , u_name ) values(2, 'userTwo');
insert into insta."user" (u_id , u_name ) values(3, 'user3');
insert into insta."user" (u_id , u_name ) values(4, 'user4');
insert into insta."user" (u_id , u_name ) values(5, 'user5');
insert into insta."user" (u_id , u_name ) values(6, 'user6');
insert into insta."user" (u_id , u_name ) values(7, 'user7');



insert into insta.post (p_id, image_url, u_id ) values(4, 'https://www.pexels.com/photo/elephant-cub-kenya-savanna-66898/', 1);

--select * from insta."user" u 
--join insta.post 
--on u.u_id = post.u_id;

insert into insta."comment" (comment_id , p_id , "text" , u_id )
values (1, 4, 'some comment one', 2);

insert into insta."comment" (comment_id , p_id , "text" , u_id )
values (2, 4, 'some comment two', 3);

insert into insta."comment" (comment_id , p_id , "text" , u_id )
values (3, 4, 'some comment three', 4);

insert into insta."comment" (comment_id , p_id , "text" , u_id )
values (4, 4, 'some comment four', 5);

insert into insta."comment" (comment_id , p_id , "text" , u_id )
values (5, 4, 'some comment fine', 6);

insert into insta."comment" (comment_id , p_id , "text" , u_id )
values (6, 4, 'some comment six', 7);






