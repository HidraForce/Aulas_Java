package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class novaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
            System.out.print("Digite o nome da pessoa: ");
            String nome = entrada.nextLine();
            String sql = "INSERT INTO pessoas(nome) value(?)";
            Connection conexao = FabricaConexao.getConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.execute();
            System.out.println("Pessoa cadastrada com sucesso!!!");
        entrada.close();
    }
}
