package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainCRUD {

    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "";

        try (Connection conexao = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conectado :)");
             conexao.close();
        }
       
    }
}
