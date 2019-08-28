
create table tb_usuario (
    id_usuario int not null primary key AUTO_INCREMENT,
    nome varchar(30) not null,
    senha varchar(30) not null
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


CREATE TABLE tb_profissionais (
    id_profissional int primary key auto_increment,
    cpf varchar(12) not null,
    nome varchar(50) not null,
    funcao varchar(50) not null
);

INSERT INTO tb_profissionais (cpf, nome, funcao) values
("3019", "Joaquim", "dev-front"),
("3007", "Paulo", "dev-back"),
("3012", "Claudia", "dev-front"),
("3015", "Rui", "analista"),
("3013", "Otavio", "tecnico-hardware"),
("3002", "Joana", "analista");


CREATE TABLE tb_cliente (
    id_cliente int PRIMARY KEY AUTO_INCREMENT,
    cpf varchar(12) not null,
    nome varchar(50) not null,
    telefone varchar(14) not null
);

INSERT INTO tb_cliente ( cpf, nome, telefone) values 
		( "32343322", "Ramon", "3211-3545"),
        ( "32776543", "Antonio", "3222-3333"),
        ( "32220897", "Rebeca", "3233-3444"),
        ( "32559998", "Julia", "3221-5555");