package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

    public static Connection getConexao() {
        try {
            final String url = "jdbc:mysql://localhost:3306/java_curso?verifyServerCertificate=false&useSSL=true";
            final String user = "root";
            final String password = "";
            return DriverManager.getConnection(url, user, password);
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
