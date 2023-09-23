/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.pa.com.DAO.conexão;

import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import ma.pa.com.entity.Usuario;


/**
 *
 * @author Vykroz
 */
public class UsuarioDAO {
    
    public void inserir (Usuario usuario) {      
        String sql = "INSERT INTO USUARIOS (NOME, LOGIN, SENHA, EMAIL) VALUES (?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conexaoJDBC.getConexao(). prepareStatement(sql);
            ps.setString(1, usuario.getNome ());
            ps.setString(2, usuario.getLogin ());
            ps.setString(3, usuario.getSenha ());
            ps.setString(4, usuario.getEmail ());
            ps.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
}

    public boolean pesquisar(Usuario usuario) {
        String sql = "SELECT * FROM USUARIOS WHERE LOGIN = ? AND SENHA = ?";
        PreparedStatement ps;
        ResultSet rs;
        boolean verdadeiroOuFalso = false;
        
        try {
              ps = conexaoJDBC.getConexao().prepareStatement(sql);              
              ps.setString(1, usuario.getLogin());
              ps.setString(2, usuario.getSenha());
              
              rs = ps.executeQuery();
              
              if(rs.next()){
                verdadeiroOuFalso = true;  
              }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return verdadeiroOuFalso;
    }
}
