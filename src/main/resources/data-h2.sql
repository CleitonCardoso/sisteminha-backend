
INSERT INTO incubator (id,name) values
(1, 'Inovaparq');

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(1, 'sisteminha avaliação de incubadoras', 'Cleiton Cardoso' ,'PROJECT', 5, 1);

INSERT INTO user (id, username, password, role, active, tenant_id, incubator_id) values
(1, 'incubadora', 'pass', 'INCUBATOR',  true, 1, 1);

INSERT INTO user (id, username, password, role, active, tenant_id, incubator_id) values
(2, 'cleiton', 'pass', 'TENANT',  true, 1, 1);


INSERT INTO evaluation (id, status, starting_date, ending_date, incubator_id) values
(1, 'OPEN', '2018-01-01', '2018-04-30', 1);

INSERT INTO evaluation (id, title, status, starting_date, ending_date, incubator_id) values
(2, 'Ciclo avaliativo fase 1','CLOSED', '2017-12-01', '2018-01-01', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(1, 'Quest�o 1', 'O Quanto voc� estuda?', 2, 'MARKET', 1);