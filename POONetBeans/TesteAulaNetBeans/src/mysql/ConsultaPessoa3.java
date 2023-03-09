package mysql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ConsultaPessoa3 {
    public static void main(String[] args) throws SQLException {
        //abrir conexao
        Connection conexao = FabricaConexao.getConexao();
        //sql line
        String sql = "SELECT * FROM pessoas WHERE ativo= 's'" ;
        //executar comando sql
        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql);
        //output
        while (resultado.next()) {
            System.out.println(resultado.getInt("codigo") + " ==>" + resultado.getString("nome"));

        }
        stmt.close();
        conexao.close();
    }
}
