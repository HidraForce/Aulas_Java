package mysql;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConsultaPessoa1 {

    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        while (resultado.next()) {
            System.out.println(resultado.getInt("codigo") + " ==>" + resultado.getString("nome"));

        }
        stmt.close();
        conexao.close();
    }
}
