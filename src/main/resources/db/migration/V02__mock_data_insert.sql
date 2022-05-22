
INSERT INTO MATCHESMALONE.Artist(id, name, role) VALUES (1, 'Bill Finger', 'Writer');
INSERT INTO MATCHESMALONE.Artist(id, name, role) VALUES (2, 'Bob Kane', 'Inker');

INSERT INTO MATCHESMALONE.Volume(id, name) VALUES (1, 'Detective Comics V. 1');
INSERT INTO MATCHESMALONE.Volume(id, name) VALUES (2, 'Batman V. 1');
INSERT INTO MATCHESMALONE.Volume(id, name) VALUES (3, 'Worlds Finest V. 1');

INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (1, 27, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (2, 28, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (3, 29, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (4, 30, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (5, 31, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (6, 32, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (7, 33, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (8, 34, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (9, 35, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (10, 36, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (11, 37, 1, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (12, 1, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (13, 2, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (14, 3, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (15, 4, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (16, 5, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (17, 6, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (18, 7, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (19, 8, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (20, 9, 2, '');
INSERT INTO MATCHESMALONE.Issue(id, number, volume_id, url_cover) VALUES (21, 10, 2, '');

INSERT INTO MATCHESMALONE.Book_Chrono(id, date_publish, description, name, order_number, url_cover) VALUES (1, '1939-05-01', 'Primeira aparição', 'Detective Comics - Era de Ouro', 1, '');
INSERT INTO MATCHESMALONE.Book_Chrono(id, date_publish, description, name, order_number, url_cover) VALUES (2, '1940-04-01', 'Surgimento do Robin', 'Batman - Era de Ouro', 2, '');

INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 1);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 2);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 3);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 4);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 5);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 6);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 7);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 8);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 9);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (1, 10);

INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 11);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 12);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 13);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 14);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 15);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 16);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 17);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 18);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 19);
INSERT INTO MATCHESMALONE.BOOKCHRONO_ISSUES(bookchrono_id, issue_id) VALUES (2, 20);