package alg.jkl.system.models;

public abstract class Entidade {
    private int id;
    private String nome;
    
    /*public Entidade(String nome) {
        setNome(nome);  // estou pensando na viabilidade de implementar construtores
    }*/
    
    public abstract boolean verificarDados();
    public abstract void alterarDados(String nome);

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}