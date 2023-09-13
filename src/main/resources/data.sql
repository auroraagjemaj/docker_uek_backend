--USERS
insert into users (id, email,first_name,last_name, password)
values ('ba804cb9-fa14-42a5-afaf-be488742fc54', 'admin@example.com', 'James','Bond', '$2a$10$TM3PAYG3b.H98cbRrHqWa.BM7YyCqV92e/kUTBfj85AjayxGZU7d6' ), -- Password: 1234
('0d8fa44c-54fd-4cd0-ace9-2a7da57992de', 'user@example.com', 'Tyler','Durden', '$2a$10$TM3PAYG3b.H98cbRrHqWa.BM7YyCqV92e/kUTBfj85AjayxGZU7d6') -- Password: 1234
 ON CONFLICT DO NOTHING;


--ROLES
INSERT INTO role(id, name)
VALUES ('d29e709c-0ff1-4f4c-a7ef-09f656c390f1', 'DEFAULT'),
('ab505c92-7280-49fd-a7de-258e618df074', 'ADMIN'),
('c6aee32d-8c35-4481-8b3e-a876a39b0c02', 'USER')
ON CONFLICT DO NOTHING;

--AUTHORITIES
INSERT INTO authority(id, name)
VALUES ('2ebf301e-6c61-4076-98e3-2a38b31daf86', 'DEFAULT'),
('76d2cbf6-5845-470e-ad5f-2edb9e09a868', 'USER_MODIFY'),
('21c942db-a275-43f8-bdd6-d048c21bf5ab', 'USER_DELETE'),
('2bc788a3-b9d0-4049-9321-6608d75c8a08', 'POST_CREATE'),
('5e805afa-25c3-44f4-9a54-d57605ccb533', 'POST_DELETE'),
('7df50cab-efac-4c50-8615-be7e3a469b28', 'POST_UPDATE')
ON CONFLICT DO NOTHING;

--assign roles to users
insert into users_role (users_id, role_id)
values ('ba804cb9-fa14-42a5-afaf-be488742fc54', 'd29e709c-0ff1-4f4c-a7ef-09f656c390f1'),
       ('0d8fa44c-54fd-4cd0-ace9-2a7da57992de', 'c6aee32d-8c35-4481-8b3e-a876a39b0c02'),
       ('ba804cb9-fa14-42a5-afaf-be488742fc54', 'ab505c92-7280-49fd-a7de-258e618df074'),
       ('ba804cb9-fa14-42a5-afaf-be488742fc54', 'c6aee32d-8c35-4481-8b3e-a876a39b0c02')
 ON CONFLICT DO NOTHING;

--assign authorities to roles
INSERT INTO role_authority(role_id, authority_id)
VALUES ('ab505c92-7280-49fd-a7de-258e618df074', '76d2cbf6-5845-470e-ad5f-2edb9e09a868'),
('ab505c92-7280-49fd-a7de-258e618df074', '21c942db-a275-43f8-bdd6-d048c21bf5ab'),
('ab505c92-7280-49fd-a7de-258e618df074', '2bc788a3-b9d0-4049-9321-6608d75c8a08'),
('ab505c92-7280-49fd-a7de-258e618df074', '5e805afa-25c3-44f4-9a54-d57605ccb533'),
('ab505c92-7280-49fd-a7de-258e618df074', '7df50cab-efac-4c50-8615-be7e3a469b28'),
('c6aee32d-8c35-4481-8b3e-a876a39b0c02', '2bc788a3-b9d0-4049-9321-6608d75c8a08'),
('c6aee32d-8c35-4481-8b3e-a876a39b0c02', '5e805afa-25c3-44f4-9a54-d57605ccb533'),
('c6aee32d-8c35-4481-8b3e-a876a39b0c02', '7df50cab-efac-4c50-8615-be7e3a469b28')
 ON CONFLICT DO NOTHING;

 insert into image_post(id, image, description, likes, author_id)
 values ('e519b3f1-56fe-4ff6-bcc2-4cb095a69c67', 'https://upload.wikimedia.org/wikipedia/commons/thumb/1/1f/Flag_of_Kosovo.svg/1200px-Flag_of_Kosovo.svg.png', 'blahblabhalbhahblahba asdfasfsa dfsdfsdfs df sdfasdfasdf asdfas dfsdfa sdfasd fasdfasdfasdf asdfasdfasdfs dfsadfdsfsadfsdfsdaf', '0', 'ba804cb9-fa14-42a5-afaf-be488742fc54'),
 ('d4fcfa1c-40d4-4407-ad31-97a650602270', 'https://i.ytimg.com/vi/YFFlZjazHLg/maxresdefault.jpg', 'In the vast and treacherous world of One Piece, there exists a figure whose strength surpasses all others, a character who stands as the uncontested pinnacle of power - Buggy the Clown. While it may seem surprising at first glance, delving deeper into Buggys true potential reveals a force to be reckoned with.', '0', '0d8fa44c-54fd-4cd0-ace9-2a7da57992de')