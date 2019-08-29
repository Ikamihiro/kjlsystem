package alg.jkl.system.models.dao;

import alg.jkl.system.models.Contrato;
import alg.jkl.system.util.BDconfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContratoDAO {
    
    public ArrayList listar(){
        ArrayList<Contrato> listaContratos = null;
        
        Connection conexao = BDconfig.conectar();
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_contrato ORDER BY id_contrato";
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                    listaContratos = new ArrayList();
                    Contrato contrato;
                    while (rs.next()){
                        contrato = new Contrato();
                        contrato.setid_contrato(rs.getInt("id_contrato"));
                        contrato.setid_servico(rs.getInt("id_servico"));
                        contrato.setId_cliente(rs.getInt("id_cliente"));
                        contrato.setid_profissional(rs.getInt("id_profissional"));
                        contrato.setvalor_contrato(rs.getFloat("valor"));
                        listaContratos.add(contrato);
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(" +ex.getMessage() );
            }
        }
        return listaContratos;
    } 
    
    //Método de remoção de item
    public boolean remover(int codigoExcluir){
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null) {
            try {
                PreparedStatement pStm 
                = conexao.prepareStatement("DELETE FROM tb_contrato WHERE id_contrato = "+codigoExcluir);

                int linhas = pStm.executeUpdate();
                
                return true;
                
            } catch (SQLException ex) {
                System.out.println("Erro cadastrando aluno: "+ex.getMessage());
            }
        }
        return false;
        
    }
    
    //Método de cadastro
    public boolean cadastrar(Object objeto) {
        Connection conexao = BDconfig.conectar();
        Contrato novoContrato = (Contrato) objeto;
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("INSERT INTO tb_contrato ( id_servico, id_cliente, id_profissional, valor) VALUES ( ?, ?, ?, ?);");
                
                pStm.setInt(1,novoContrato.getid_servico());
                pStm.setInt(2,novoContrato.getId_cliente());
                pStm.setInt(3, novoContrato.getid_profissional());
                pStm.setFloat(4, novoContrato.getvalor_contrato());
                
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao cadastrar novo contrato no Banco de Dados: "+ex.getMessage());
            }
        }
        
        return false;
    }
    
    //Método de alteração (parte 1)
    //Primeiro ele precisa retornar os dados de acordo com o código que foi selecionado
    public ArrayList retornaDados (int codigo) {
        ArrayList<Contrato> listaAlteraContrato = null;
        Connection conexao = BDconfig.conectar();
        
        if (conexao != null){
            try {
                Statement stm = conexao.createStatement();
                System.out.println("CódigoD: "+codigo);
                String sqlSelect = "SELECT * FROM tb_contrato WHERE id_contrato = "+codigo;
                
                ResultSet rs = stm.executeQuery(sqlSelect);
                
                if (rs.isBeforeFirst()){
                    listaAlteraContrato = new ArrayList();
                    Contrato contrato;
                    while (rs.next()){
                        contrato = new Contrato();
                        contrato.setid_contrato(rs.getInt("id_contrato"));
                        contrato.setdescricao_servico("descricao_servico");
                        contrato.setnome_profissional("nome_profissional");
                        contrato.setnome_cliente("nome_cliente");
                        listaAlteraContrato.add(contrato);
                    }  
                }
                
                                
            } catch (SQLException ex) {
                System.out.println("Erro de leitura :(");
            }
        }
        return listaAlteraContrato;
        
    }
    //Aqui ele altera de fato no banco de dados
    public boolean alterar (Object object, int codigo) {
        Connection conexao = BDconfig.conectar();
        Contrato novoContrato = (Contrato) object;
        if (conexao != null) {
            try {
                PreparedStatement pStm
                = conexao.prepareStatement("UPDATE tb_contrato SET id_servico = ?, id_cliente = ?, id_profissional = ?, valor = ? WHERE id_contrato = ?");             
                pStm.setInt(1,novoContrato.getid_servico());
                pStm.setInt(2,novoContrato.getId_cliente());
                pStm.setInt(3, novoContrato.getid_profissional());
                pStm.setFloat(4, novoContrato.getvalor_contrato());
                pStm.setString(5,Integer.toString(codigo));
                
                int linhas = pStm.executeUpdate();
                
                return true;                
                
            } catch (Exception ex) {
                System.out.println("Erro ao ALTERAR novo serviço: "+ex.getMessage());
            }
        }
        
        return false;
    }
  
}