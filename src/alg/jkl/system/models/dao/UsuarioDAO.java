package alg.jkl.system.models.dao;

import alg.jkl.system.models.Pessoa;
import alg.jkl.system.models.Usuario;
import alg.jkl.system.util.BDconfig;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {    
    public boolean cadastrar(Usuario usuario) {
        Connection conexao = BDconfig.conectar();
        if (conexao != null) {
            try {
                PreparedStatement pStm = conexao.prepareStatement("INSERT INTO tb_usuario (nome, senha) VALUES (?,?);");
                pStm.setString(1, usuario.getNome());
                pStm.setString(2, usuario.getSenha());
                pStm.executeUpdate();
                return true;
            }
            catch (SQLException ex) {
                System.out.println("Erro ao cadastrar novo profissional: "+ex.getMessage());
            }
        }
        return false;
    }

    public ArrayList<Usuario> listar() {
        ArrayList<Usuario> listaUsuario = null;
        Connection conexao = BDconfig.conectar();
        if (conexao != null) {
            try {
                Statement stm = conexao.createStatement();
                String sqlSelect = "SELECT * FROM tb_usuario";
                ResultSet rs = stm.executeQuery(sqlSelect);
                if (rs.isBeforeFirst()) {
                    listaUsuario = new ArrayList<>();
                    Usuario usuario;
                    while (rs.next()){
                        usuario = new Usuario();
                        usuario.setId(rs.getInt("id_usuario"));
                        usuario.setNome(rs.getString("nome"));
                        usuario.setSenha(rs.getString("senha"));
                        listaUsuario.add(usuario);
                    }
                }
            }
            catch (SQLException ex) {
                System.out.println("Erro: "+ex.getMessage());
            }
        }
        return listaUsuario;
    }
    
    public Usuario verificar(String nome, String senha) {
        Connection conexao = BDconfig.conectar();
        if(conexao != null) {
            try {
                Statement stm = conexao.createStatement();
                String sql = "select count(*) as quant, id_usuario, nome, senha from tb_usuario"
                        + " where nome = '"+ nome +"' and senha = '"+ senha + "' group by id_usuario";
                ResultSet rs = stm.executeQuery(sql);
                while(rs.next() == true) {
                    if(rs.getString("nome").equals(nome) && rs.getString("senha").equals(senha)) {
                        Usuario usuario = new Usuario();
                        usuario.setId(rs.getInt("id_usuario"));
                        usuario.setNome(nome);
                        usuario.setSenha(senha);
                        return usuario;
                    }
                }
            }
            catch (SQLException e) {
                System.out.println("Erro ao pesquisar usuário: " + e.getMessage());
            }
        }
        return null;
    }
}