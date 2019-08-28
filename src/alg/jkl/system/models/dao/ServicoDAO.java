package alg.jkl.system.models.dao;

import alg.jkl.system.models.Servico;
import alg.jkl.system.util.BDconfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ServicoDAO implements DAO{
    
    //Método de listagem na página Servicos
    @Override
    public ArrayList listar() {
        ArrayList<Servico> listaServicos = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_servicos ORDER BY id_servico";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                    listaServicos = new ArrayList();
                    Servico servico;
                    while (rs.next()){
                        servico = new Servico();
                        servico.setid_servico(rs.getInt("id_servico"));
                        servico.setcategoria_servico(rs.getString("categoria_servico"));
                        servico.setdescricao_servico(rs.getString("descricao_servico"));
                        listaServicos.add(servico);
                    }    
                }
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaServicos;
    } 
    
    //Método de remoção de item
    @Override
    public boolean remover(int codigoExcluir){
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm 
                = conexao.prepareStatement("DELETE FROM tb_servicos WHERE id_servico = "+codigoExcluir);

                int linhas = pStm.executeUpdate();
                
                return true;
                
            } catch (SQLException ex) {
                System.out.println("Erro cadastrando aluno: "+ex.getMessage());
            }
        }
        return false;
        
    }
    
    //Método de cadastro
    @Override
    public boolean cadastrar(Object objeto) {
        Connection conexao = BDconfig.conectar();
        Servico novoServico = (Servico) objeto;
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("INSERT INTO tb_servicos (categoria_servico, descricao_servico) VALUES (?,?);");
                
                pStm.setString(1,novoServico.getcategoria_servico());
                pStm.setString(2,novoServico.getdescricao_servico());
                
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar novo serviço: "+ex.getMessage());
            }
        }
        
        return false;
    }
    
    //Método de alteração (parte 1)
    //Primeiro ele precisa retornar os dados de acordo com o código que foi selecionado
    @Override
    public ArrayList retornaDados (int codigo) {
        ArrayList<Servico> listaAlteraServico = null;
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                System.out.println("CódigoD: "+codigo);
                String sqlSelect = "SELECT * FROM tb_servicos WHERE id_servico = "+codigo;
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                    listaAlteraServico = new ArrayList();
                    Servico servico;
                        while (rs.next()){
                        servico = new Servico();
                        servico.setid_servico(rs.getInt("id_servico"));
                        servico.setcategoria_servico(rs.getString("categoria_servico"));
                        servico.setdescricao_servico(rs.getString("descricao_servico"));
                        listaAlteraServico.add(servico);
                    }  
                }
                
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaAlteraServico;
        
    }
    //Aqui ele altera de fato no banco de dados
    @Override
    public boolean alterar (Object object, int codigo) {
        Connection conexao = BDconfig.conectar();
        Servico novoServico = (Servico) object;
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("UPDATE tb_servicos SET categoria_servico = ?, descricao_servico = ? WHERE id_servico = ?");
                
                System.out.println("Codigo aqui é "+codigo);
                pStm.setString(1,novoServico.getcategoria_servico());
                pStm.setString(2,novoServico.getdescricao_servico());
                pStm.setString(3,Integer.toString(codigo));
                
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao ALTERAR novo serviço: "+ex.getMessage());
            }
        }
        
        return false;
    }
    
    @Override
    public ArrayList pesquisar(String descricao_servico) {
        ArrayList<Servico> pesquisaServicos = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_servicos WHERE descricao_servico = '"+descricao_servico+"'";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                   pesquisaServicos = new ArrayList();
                   Servico servico;
                    while (rs.next()){
                        servico = new Servico();
                        servico.setid_servico(rs.getInt("id_servico"));
                        servico.setcategoria_servico(rs.getString("categoria_servico"));
                        servico.setdescricao_servico(rs.getString("descricao_servico"));
                        pesquisaServicos.add(servico);
                    }    
                }
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return pesquisaServicos;
    }
}