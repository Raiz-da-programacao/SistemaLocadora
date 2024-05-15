package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection() throws SQLException {
        Connection conexao = DriverManager.getConnection("jdbc:postegresql://localhost:127.0.0.1/nome", "postegres" , "postegres");
        return conexao;
    }
}
