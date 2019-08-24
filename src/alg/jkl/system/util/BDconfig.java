package alg.jkl.system.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class BDconfig {
    private static String BDhost;
    private static String BDname;
    private static String BDuser;
    private static String BDpass;
    
    private static Properties carregarProp() {
        Properties props = new Properties();
        try {
            FileInputStream file = new FileInputStream("./nbproject/bd.properties");
            props.load(file);
            return props;
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    
    public static Connection conectar() {
        Connection conexao = null;
        Properties props = carregarProp();
        BDhost = props.getProperty("db.host");
        BDname = props.getProperty("db.name");
        BDuser = props.getProperty("db.user");
        BDpass = props.getProperty("db.pass");
        String urlCon = "jdbc:mysql://" + BDhost + ":3306/" + BDname;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection(urlCon, BDuser, BDpass); 
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