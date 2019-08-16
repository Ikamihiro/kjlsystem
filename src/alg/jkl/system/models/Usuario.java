package alg.jkl.system.models;

public class Usuario extends Entidade{
    private int id, nivel;
    private String senha;
    
    @Override
    public boolean verificarDados() {
        return !(id < 1 || this.getNome().equals("") || senha.equals(""));
    }
    
    @Override
    public void alterarDados(String nome) {
        if(!nome.equals("")) {
            this.setNome(nome);
        }
    }
    
    public void alterarDados(String nome, String senha) {
        if(!nome.equals("") && !senha.equals("")){
            this.setNome(nome);
            this.setSenha(senha);
        }
    }
    
    public void alterarSenha(String senha) {
        if(!senha.equals("")) {
            this.setSenha(senha);
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}