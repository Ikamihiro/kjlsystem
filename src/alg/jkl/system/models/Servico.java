package alg.jkl.system.models;

public class Servico {  
    private int id_servico;
    private String categoria_servico;
    private String descricao_servico;
    
    public int getid_servico() {
        return id_servico;
    }
    
    public void setid_servico(int id_servico){
        this.id_servico = id_servico;
    }
    
    public String getcategoria_servico(){
        return categoria_servico;
    }
    
    public void setcategoria_servico(String categoria_servico){
        this.categoria_servico = categoria_servico;
    }
        
    
    public String getdescricao_servico(){
        return descricao_servico;
    }
    
    public void setdescricao_servico(String descricao_servico){
        this.descricao_servico = descricao_servico;
    }
    
}