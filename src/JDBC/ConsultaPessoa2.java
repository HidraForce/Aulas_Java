package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConsultaPessoa2 {

    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
            Connection conexao = FabricaConexao.getConexao();
            String sql = "SELECT * FROM pessoas WHERE nome LIKE ?";
            System.out.print("Digite um valor para pesquisa: ");
            String valor = entrada.nextLine();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%"+valor+"%");                                          
            ResultSet resultado  = stmt.executeQuery();
            while(resultado.next()){
                System.out.println(
                    "Codigo: "+
                    resultado.getInt(1)+
                    ", Nome: "+
                    resultado.getString(2)
                );
            }
            resultado.close();;
            stmt.close();
        entrada.close ();
    }    
}
