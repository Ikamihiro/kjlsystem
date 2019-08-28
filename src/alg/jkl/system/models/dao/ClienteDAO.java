/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alg.jkl.system.models.dao;

import alg.jkl.system.models.Cliente;
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
public class ClienteDAO {
    //Método de listagem na página Servicos
    public ArrayList<Cliente> listar() {
        ArrayList<Cliente> listaClientes = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_cliente ORDER BY id_cliente";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                   listaClientes = new ArrayList();
                   Cliente cliente;
                    while (rs.next()){
                        cliente = new Cliente();
                        cliente.setId_cliente(rs.getInt("id_cliente"));
                        cliente.setCpf(rs.getString("cpf"));
                        cliente.setNome(rs.getString("nome"));
                        cliente.setTelefone(rs.getString("telefone"));
                         listaClientes.add(cliente);
                    }    
                }
                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaClientes;
    }
    
    
    //Método de cadastro
    public boolean cadastrar (Cliente novoCliente) {
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("INSERT INTO tb_cliente (cpf, nome, telefone) VALUES (?,?,?);");
                
                
                pStm.setString(1,novoCliente.getCpf());
                pStm.setString(2,novoCliente.getNome());
                pStm.setString(3,novoCliente.getTelefone());
                
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar novo cliente: "+ex.getMessage());
            }
        } 
        return false;
    }
    
    
    //Método de remoção de item
    public boolean remover (int codigoExcluir){
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm 
                = conexao.prepareStatement("DELETE FROM tb_cliente WHERE id_cliente = "+codigoExcluir);

                int linhas = pStm.executeUpdate();
                
                return true;
                
            } catch (SQLException ex) {
                System.out.println("Erro removendo cliente: "+ex.getMessage());
            }
        }
        return false;     
    }
    
    // *    *    *    *    *   *   *    *    *    *    *
    
      //Método de alteração (parte 1)
    //Primeiro ele precisa retornar os dados de acordo com o código que foi selecionado
    public ArrayList retornaDados (int codigo) {
        ArrayList<Cliente> listaAlteraCliente = null;
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                System.out.println("CódigoD: "+codigo);
                String sqlSelect = "SELECT * FROM tb_cliente WHERE id_cliente = "+codigo;
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                    listaAlteraCliente = new ArrayList();
                    Cliente cliente;
                        while (rs.next()){
                        cliente = new Cliente();
                        cliente.setId_cliente(rs.getInt("id_cliente"));
                        cliente.setCpf(rs.getString("cpf"));
                        cliente.setNome(rs.getString("nome"));
                        cliente.setTelefone(rs.getString("telefone"));
                        listaAlteraCliente.add(cliente); 
                    }  
                }
                
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaAlteraCliente;
        
    }
    //Aqui ele altera de fato no banco de dados
    
    public boolean alterar (Cliente novoCliente, int id) {
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("UPDATE tb_cliente SET cpf=?, nome=?, telefone=? WHERE id_cliente = "+id);
           
                pStm.setString(1,novoCliente.getCpf());
                pStm.setString(2,novoCliente.getNome());
                pStm.setString(3,novoCliente.getTelefone());
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao altetar dados do cliente: "+ex.getMessage());
            }
        } 
        return false;
    }
    
    
    //Metodo de pesquisa 
    public ArrayList<Cliente> pesquisar(String nomeCliente) {
        ArrayList<Cliente> pesquisaClientes = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_cliente WHERE nome = '"+nomeCliente+"'";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                   pesquisaClientes = new ArrayList();
                   Cliente cliente;
                    while (rs.next()){
                        cliente = new Cliente();
                        cliente.setId_cliente(rs.getInt("id_cliente"));
                        cliente.setCpf(rs.getString("cpf"));
                        cliente.setNome(rs.getString("nome"));
                        cliente.setTelefone(rs.getString("Telefone"));
                        pesquisaClientes.add(cliente);
                    }    
                }
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return pesquisaClientes;
    }
}
