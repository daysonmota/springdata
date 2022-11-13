insert into cargos(descricao) values('RH');
insert into cargos(descricao) values('GERENTE');
insert into cargos(descricao) values('TECNOLOGIA');
insert into cargos(descricao) values('FINANCEIRO');



insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('025.560.813-31','2020-10-09','Pessoa A',200,1);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('064.560.813-31','2019-10-09','Pessoa B',300,1);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('034.560.813-31','2010-10-09','Pessoa C',500,1);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('324.560.813-31','2015-10-09','Pessoa D',540,4);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('321.560.813-31','2022-10-09','Pessoa E',100,2);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('101.560.813-31','2000-10-09','Pessoa F',200,3);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('352.560.813-31','2016-10-09','Pessoa G',4530,4);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('876.560.813-31','1999-10-09','Pessoa H',8000,3);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('986.560.813-31','2021-10-09','Pessoa I',650,3);
insert into funcionarios(cpf,data_contratacao,nome,salario,cargo_id) values ('024.560.813-31','1997-10-09','Pessoa J',2300,1);


insert into unidade_trabalho(descricao,endereco) values ('Unidade A', 'Rua A');
insert into unidade_trabalho(descricao,endereco) values ('Unidade B', 'Rua B');
insert into unidade_trabalho(descricao,endereco) values ('Unidade C', 'Rua C');
insert into unidade_trabalho(descricao,endereco) values ('Unidade D', 'Rua D');
insert into unidade_trabalho(descricao,endereco) values ('Unidade E', 'Rua F');
insert into unidade_trabalho(descricao,endereco) values ('Unidade F', 'Rua G');
insert into unidade_trabalho(descricao,endereco) values ('Unidade G', 'Rua H');
insert into unidade_trabalho(descricao,endereco) values ('Unidade H', 'Rua I');

insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (1,3);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (2,1);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (3,1);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (4,1);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (1,2);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (3,3);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (2,2);
insert into funcionarios_unidades(fk_funcionario,fk_unidade) values (2,4);