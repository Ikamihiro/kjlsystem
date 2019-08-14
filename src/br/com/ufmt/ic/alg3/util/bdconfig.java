package br.com.ufmt.ic.alg3.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class bdconfig {
    private static final String _BDhost = "localhost";
    private static final String _BDname = "jkl";
    private static final String _BDuser = "root";
    private static final String _BDpass = "030726";
    
    public static Connection conectar() {
        Connection conexao = null;
        String urlCon = "jdbc:mysql://" + _BDhost + ":3306/" + _BDname;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(urlCon, _BDuser, _BDpass); 
        } 
        catch(SQLException e) {
            System.out.println("Erro conectando ao banco: " + e.getMessage());
        } 
        catch(ClassNotFoundException e) {
            System.out.println("Classe não encontrada: " + e.getMessage());            
        }
        return conexao;
    }
}