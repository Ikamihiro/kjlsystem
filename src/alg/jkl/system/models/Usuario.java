package alg.jkl.system.models;

public class Usuario extends Pessoa{
    private int id;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}