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


public class ProfissionalDAO implements DAO {
    
    //Método de listagem na página Servicos
    @Override
    public ArrayList listar() {
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
                        profissional.setCpf(rs.getString("cpf"));
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
    
    
    //Método de cadastro
    @Override
    public boolean cadastrar (Object object) {
        Connection conexao = BDconfig.conectar();
        Profissional novoProfissional = (Profissional) object;
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("INSERT INTO tb_profissionais (cpf, nome, funcao) VALUES (?,?,?);");
                
                
                pStm.setString(1,novoProfissional.getCpf());
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
    
    
    //Método de remoção de item
    @Override
    public boolean remover(int codigoExcluir){
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
    
    // *    *    *    *    *   *   *    *    *    *    *
    
      //Método de alteração (parte 1)
    //Primeiro ele precisa retornar os dados de acordo com o código que foi selecionado
    @Override
    public ArrayList retornaDados (int codigo) {
        ArrayList<Profissional> listaAlteraProfissional = null;
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                System.out.println("CódigoD: "+codigo);
                String sqlSelect = "SELECT * FROM tb_profissionais WHERE id_profissional = "+codigo;
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                    listaAlteraProfissional = new ArrayList();
                    Profissional profissional;
                        while (rs.next()){
                        profissional = new Profissional();
                        profissional.setId_profissional(rs.getInt("id_profissional"));
                        profissional.setCpf(rs.getString("cpf"));
                        profissional.setNome(rs.getString("nome"));
                        profissional.setFuncao(rs.getString("funcao"));
                        listaAlteraProfissional.add(profissional); 
                    }  
                }
                
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaAlteraProfissional;
        
    }
    
    @Override
    public boolean alterar(Object object, int id) {
        Connection conexao = BDconfig.conectar();
        Profissional novoProfissional = (Profissional) object;
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("UPDATE tb_profissionais SET cpf=?, nome=?, funcao=? WHERE id_profissional = "+id);
           
                pStm.setString(1,novoProfissional.getCpf());
                pStm.setString(2,novoProfissional.getNome());
                pStm.setString(3,novoProfissional.getFuncao());
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao altetar dados do profissional: "+ex.getMessage());
            }
        } 
        return false;
    }

    //Metodo de pesquisa 
    @Override
    public ArrayList pesquisar(String nomeProfissional) {
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
                        profissional.setCpf(rs.getString("cpf"));
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

}
