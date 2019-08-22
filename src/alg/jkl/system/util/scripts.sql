
create table tb_usuario (
    id_usuario int not null primary key AUTO_INCREMENT,
    nome varchar(30) not null,
    senha varchar(30) not null,
    nivel_usuario int not null
);

 
insert into tb_usuario (nome, senha, nivel_usuario) values ("user", "secret", 1);
