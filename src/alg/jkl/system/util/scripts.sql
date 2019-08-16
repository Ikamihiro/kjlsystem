-- query para a criação da tabela usuário
create table tb_usuario (
    id_usuario int not null primary key AUTO_INCREMENT,
    nome varchar(30) not null,
    senha varchar(30) not null,
    nivel_usuario int not null
);

-- query para busca de usuario no login
select nome, senha, nivel_usuario from tb_usuario where nome = 'joao' and senha = '12345';