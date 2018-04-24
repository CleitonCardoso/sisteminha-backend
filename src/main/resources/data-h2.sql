
INSERT INTO incubator (id,name, director_name, phone) values
(1, 'Inovaparq', 'Romão', '3422-2588');

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(1, 'sisteminha avaliação de incubadoras', 'Cleiton Cardoso' ,'PROJECT', 5, 1);

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(2, 'Vigilânte APP', 'Jorge gonçalvez' ,'GRADUATION', 1, 1);

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(3, 'Cosmética Digital', 'Emílio Giordano' ,'GROWING', 1, 1);

INSERT INTO user (id, username, password, role, active, tenant_id, incubator_id) values
(1, 'incubadora', 'pass', 'INCUBATOR',  true, 1, 1);

INSERT INTO user (id, username, password, role, active, tenant_id, incubator_id) values
(2, 'cleiton', 'pass', 'TENANT',  true, 1, 1);


INSERT INTO evaluation (id, status, starting_date, ending_date, incubator_id) values
(1, 'OPEN', '2018-01-01', '2018-04-30', 1);

INSERT INTO evaluation (id, title, status, starting_date, ending_date, incubator_id) values
(2, 'Ciclo avaliativo fase 1','CLOSED', '2017-12-01', '2018-01-01', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(1, 'Questão 1', 'O que você estuda atualmente?', 2, 'ENTREPRENEUR', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(2, 'Questão 2', 'Como você se atualiza?', 2, 'ENTREPRENEUR', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(3, 'Questão 1', 'Como sua empresa contribui para o avanço tecnológico?', 2, 'TECHNOLOGY', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(4, 'Questão 2', 'Sua empresa participa de eventos locais de tecnologia?', 2, 'TECHNOLOGY', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(5, 'Questão 1', 'Como você vende seu produto?', 2, 'MARKET', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(6, 'Questão 2', 'Sua empresa possui estudo de mercado?', 2, 'MARKET', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(7, 'Questão 1', 'Necessita de capital de giro?', 2, 'CAPITAL', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(8, 'Questão 2', 'O lucro da sua empresa é sazonal?', 2, 'CAPITAL', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(9, 'Questão 1', 'Sua empresa possui um plano de contratação?', 2, 'MANAGEMENT', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(10, 'Questão 2', 'Sua empresa possui um quadro de indicadores?', 2, 'MANAGEMENT', 1);


