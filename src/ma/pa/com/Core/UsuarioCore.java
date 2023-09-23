/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ma.pa.com.Core;

import ma.pa.com.DAO.conexão.UsuarioDAO;
import ma.pa.com.entity.Usuario;

/**
 *
 * @author Vykroz
 */
public class UsuarioCore {
    
    UsuarioDAO userDao = new UsuarioDAO();
    
    public void chamarInserirUsuario(Usuario usuario){
        userDao.inserir(usuario);
    }
    public boolean chamarPesquisaUsuario(Usuario usuario){
        return userDao.pesquisar(usuario);
    }
}
