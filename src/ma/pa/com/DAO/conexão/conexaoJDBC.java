package ma.pa.com.DAO.conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexaoJDBC {
    
    private static final String URL = "jdbc:mysql://localhost:3306/mapa";
    private static final String USER = "root";
    private static final String PASSWORD = "Vitor.Vitinho";
    
public static Connection conn;

public static Connection getConexao(){

    try{
        if(conn == null ){
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            return conn;
        }else{
           return conn;
        }
    }catch(java.sql.SQLException e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,"houve um erro ao tentar conectar no banco de dados");
        return null;
    }
}
}


