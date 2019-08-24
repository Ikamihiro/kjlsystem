/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg.jkl.system.models.dao;

import alg.jkl.system.models.Profissional;
import alg.jkl.system.models.Servico;
import alg.jkl.system.util.BDconfig;
import alg.jkl.system.view.ListaProfissionais;
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
    
    
    //Método de remoção de item
    /*public boolean remover (int codigoExcluir){
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
        
    } */
    
    //Método de cadastro
    public boolean cadastrar (Profissional novoProfissional) {
        Connection conexao = BDconfig.conectar();
        
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
}
