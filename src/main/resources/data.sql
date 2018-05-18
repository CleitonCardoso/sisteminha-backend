
INSERT INTO incubator (id,name, director_name, phone) values
(1, 'Inovaparq', 'Romão', '3422-2588');

-- INCUBADAS

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(1, 'Sisteminha Avaliação de Incubadoras', 'Cleiton Cardoso' ,'PROJECT', 5, 1);

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(2, 'Vigilânte APP', 'Jorge gonçalvez' ,'GRADUATION', 1, 1);

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(3, 'Cosmética Digital', 'Emílio Giordano' ,'GROWING', 1, 1);

-- USERS

INSERT INTO user_entity (id, username, password, role, active, tenant_id, incubator_id) values
(1, 'incubadora', '1', 'INCUBATOR',  true, 1, 1);

INSERT INTO user_entity (id, username, password, role, active, tenant_id, incubator_id) values
(2, 'cleiton', '1', 'TENANT',  true, 1, 1);

-- AVALIACOES

INSERT INTO evaluation (id, title, status, starting_date, ending_date, incubator_id) values
(1, 'Ciclo avaliativo fase 1','CLOSED', '2018-01-01', '2018-04-30', 1);

INSERT INTO evaluation (id, title, status, starting_date, ending_date, incubator_id) values
(2, 'Ciclo avaliativo fase 2','OPEN', '2018-01-01', '2018-08-01', 1);

-- QUESTOES

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(1, 'Questão 1', 'Como você se atualiza?', 2, 'ENTREPRENEUR', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(2, 'Questão 2', 'Onde você passa mais tempo?', 2, 'ENTREPRENEUR', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(3, 'Questão 3', 'Como sua empresa contribui para o avanço tecnológico?', 2, 'TECHNOLOGY', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(4, 'Questão 4', 'Sua empresa participa de eventos locais de tecnologia?', 2, 'TECHNOLOGY', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(5, 'Questão 5', 'Como você vende seu produto?', 2, 'MARKET', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(6, 'Questão 6', 'Sua empresa possui estudo de mercado?', 2, 'MARKET', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(7, 'Questão 7', 'Necessita de capital de giro?', 2, 'CAPITAL', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(8, 'Questão 8', 'O lucro da sua empresa é sazonal?', 2, 'CAPITAL', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(9, 'Questão 9', 'Sua empresa possui um plano de contratação?', 2, 'MANAGEMENT', 1);

INSERT INTO question (id, title, content, evaluation_id, axis, incubator_id) values
(10, 'Questão 10', 'Sua empresa possui um quadro de indicadores?', 2, 'MANAGEMENT', 1);

-- ALTERNATIVAS

INSERT INTO alternative (id, content, right_answer, question_id, incubator_id) values
(1, 'Revistas', true, 1, 1);

INSERT INTO alternative (id, content, right_answer, question_id, incubator_id) values
(2, 'Blogs', false, 1, 1);

INSERT INTO alternative (id, content, right_answer, question_id, incubator_id) values
(3, 'Palestras e eventos', false, 1, 1);

INSERT INTO alternative (id, content, right_answer, question_id, incubator_id) values
(4, 'Televisão', true, 2, 1);

INSERT INTO alternative (id, content, right_answer, question_id, incubator_id) values
(5, 'Internet', false, 2, 1);

INSERT INTO alternative (id, content, right_answer, question_id, incubator_id) values
(6, 'Dormindo', false, 2, 1);

-- RESPOSTAS

INSERT INTO evaluation_response (id, evaluation_id, tenant_id, incubator_id, finished) values
(1, 1, 1, 1, false);



