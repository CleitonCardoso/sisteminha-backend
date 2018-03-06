
INSERT INTO incubator (id,name) values
(1, 'Inovaparq');

INSERT INTO tenant (id, company_Name, company_Owner, maturity_Level, score, incubator_id) values
(1, 'sisteminha avaliação de incubadoras', 'Cleiton Cardoso' ,'PROJECT', 5, 1);

INSERT INTO user (id, username, password, role, active, tenant_id, incubator_id) values
(1, 'incubadora', 'pass', 'INCUBATOR',  true, 1, 1);

INSERT INTO user (id, username, password, role, active, tenant_id, incubator_id) values
(2, 'cleiton', 'pass', 'TENANT',  true, 1, 1);


