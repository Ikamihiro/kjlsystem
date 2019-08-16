package alg.jkl.system.models.dao;

import alg.jkl.system.models.Usuario;
import alg.jkl.system.util.BDconfig;
import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UsuárioDAO {    
    public Usuario verificar(String nome, String senha) {
        Connection conexao = BDconfig.conectar();
        if(conexao != null) {
            try {
                Statement stm = conexao.createStatement();
                String sql = "select count(*) as quant, id_usuario, nome, senha, nivel_usuario from tb_usuario"
                        + " where nome = '"+ nome +"' and senha = '"+ senha + "' group by id_usuario";
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next() == true) {
                    if(rs.getString("nome").equals(nome) && rs.getString("senha").equals(senha)) {
                        Usuario usuario = new Usuario();
                        usuario.setId(rs.getInt("id_usuario"));
                        usuario.setNome(nome);
                        usuario.setSenha(senha);
                        usuario.setNivel(rs.getInt("nivel_usuario"));
                        return usuario;
                    }
                }
            }
            catch (SQLException e) {
                System.out.println("Erro ao pesquisar usuário: " + e.getMessage());
            }
            //if(en)
        }
        return null;
    }
}