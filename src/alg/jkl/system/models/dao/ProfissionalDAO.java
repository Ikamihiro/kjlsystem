/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg.jkl.system.models.dao;

import alg.jkl.system.models.Profissional;
import alg.jkl.system.util.BDconfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author leiciane
 */
public class ProfissionalDAO {
    
    //Método de cadastro
    public boolean cadastrar (Profissional novoProfissional) {
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("INSERT INTO tb_profissionais (id_profissional, nome, funcao) VALUES (?,?,?);");
                
                pStm.setInt(1,novoProfissional.getId_profissional());
                pStm.setString(2,novoProfissional.getNome());
                pStm.setString(3,novoProfissional.getFuncao());
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar novo profissional: "+ex.getMessage());
            }
        } 
        return false;
    }
    
    //Método de listagem na página Servicos
    public ArrayList<Profissional> listar() {
        ArrayList<Profissional> listaProfissionais = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_profissionais ORDER BY id_profissional";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                   listaProfissionais = new ArrayList();
                   Profissional profissional;
                    while (rs.next()){
                        profissional = new Profissional();
                        profissional.setId_profissional(rs.getInt("id_profissional"));
                        profissional.setNome(rs.getString("nome"));
                        profissional.setFuncao(rs.getString("funcao"));
                         listaProfissionais.add(profissional);
                    }    
                }
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaProfissionais;
    }
    
    
    //Método de remoção de item
    public boolean remover (int codigoExcluir){
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm 
                = conexao.prepareStatement("DELETE FROM tb_profissionais WHERE id_profissional = "+codigoExcluir);

                int linhas = pStm.executeUpdate();
                
                return true;
                
            } catch (SQLException ex) {
                System.out.println("Erro cadastrando profissional: "+ex.getMessage());
            }
        }
        return false;     
    }
    
    
    public ArrayList<Profissional> pesquisar(String nomeProfissional) {
        ArrayList<Profissional> pesquisaProfissionais = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_profissionais WHERE nome = '"+nomeProfissional+"'";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                   pesquisaProfissionais = new ArrayList();
                   Profissional profissional;
                    while (rs.next()){
                        profissional = new Profissional();
                        profissional.setId_profissional(rs.getInt("id_profissional"));
                        profissional.setNome(rs.getString("nome"));
                        profissional.setFuncao(rs.getString("funcao"));
                        pesquisaProfissionais.add(profissional);
                    }    
                }
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return pesquisaProfissionais;
    }
    
    public boolean alterar (int id, String alterarFuncao) {
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("UPDATE tb_profissionais SET funcao=? WHERE id_profissional = "+id);
           
                pStm.setString(1,alterarFuncao);
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao altetar dados do profissional: "+ex.getMessage());
            }
        } 
        return false;
    }   

}
