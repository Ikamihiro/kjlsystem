package alg.jkl.system.models.dao;

import java.util.ArrayList;

public interface DAO {
    
    public boolean cadastrar(Object object);
    public ArrayList listar();
    public boolean remover(int argc);
    public ArrayList retornaDados(int argc);
    public boolean alterar(Object object, int arc);
    public ArrayList pesquisar(String argc);
    
}