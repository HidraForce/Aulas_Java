package JDBC;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class criarBanco1 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");
        System.out.println("Banco criado com sucesso!!!");
        conexao.close();        
    }
}
