
create table tb_usuario (
    id_usuario int not null primary key AUTO_INCREMENT,
    nome varchar(30) not null,
    senha varchar(30) not null,
    nivel_usuario int not null
);

 
insert into tb_usuario (nome, senha, nivel_usuario) values ("user", "secret", 1);


CREATE TABLE tb_servicos (
id_servico int PRIMARY KEY auto_increment,
 descricao_servico text not null,
 categoria_servico varchar(15) not null
);

INSERT INTO tb_servicos (descricao_servico, categoria_servico) VALUES
 ("pagina web", "sofware"),
 ("limpeza", "hardware"),
 ("troca peça", "hardware"),
 ("app", "sofware");