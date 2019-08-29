package alg.jkl.system.models;

public class Contrato {   
    private int id_contrato;
    private int id_servico;
    private int id_profissional;
    private int id_cliente;
    private String nome_cliente;
    private String descricao_servico;
    private String nome_profissional;
    private float valor_contrato;

    public int getid_contrato(){
        return id_contrato;
    }
    
    public void setid_contrato(int id_contrato){
        this.id_contrato = id_contrato;
    }
    
    public int getid_servico() {
        return id_servico;
    }
    
    public void setid_servico(int id_servico){
        this.id_servico = id_servico;
    }
    
    public int getid_profissional() {
        return id_profissional;
    }
    
    public void setid_profissional(int id_profissional) {
        this.id_profissional = id_profissional;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }


    
    
    public String getdescricao_servico(){
        return descricao_servico;
    }
    
    public void setdescricao_servico(String descricao_servico){
        this.descricao_servico = descricao_servico;
    }
    
     public String getnome_cliente(){
        return nome_cliente;
    }
    
    public void setnome_cliente(String nome_cliente){
        this.nome_cliente = nome_cliente;
    
    }
    
    public String getnome_profissional(){
        return nome_profissional;
    }
    
    public void setnome_profissional(String nome_profissional){
        this.nome_profissional = nome_profissional;
    
    }
    
    public float getvalor_contrato(){
        return valor_contrato;
    }
    
    public void setvalor_contrato(float valor_contrato){
        this.valor_contrato = valor_contrato;
    }
    
}