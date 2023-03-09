package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaPessoa1 {
    public static void main(String[] args) throws SQLException {
        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";
        Statement stmt = conexao.createStatement();        
        ResultSet resultado  = stmt.executeQuery(sql);
        while(resultado.next()){
            System.out.println(
                    "Codigo: "+
                    resultado.getInt(1)+
                    ", Nome: "+
                    resultado.getString(2)
            );
        }
    }
}








