package mysql;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class criarBanco {

    public static void main(String[] args) throws SQLException {
        
        //informações para fazer a conexão
        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "";
        
        //faz a conexão
        Connection conexao = DriverManager.getConnection(url, user, password);
        
        //cria o banco de dados
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS Java_curso ");
        System.out.println("Banco criado com sucesso :)");
        
        //encerra a conexão
        conexao.close();
    }
}
