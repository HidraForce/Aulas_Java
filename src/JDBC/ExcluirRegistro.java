package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirRegistro {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
            System.out.print("Informe o código: ");
            int valor = entrada.nextInt();
            Connection conexao = FabricaConexao.getConexao();
                String delete = "DELETE FROM pessoas WHERE codigo = ?";
                PreparedStatement stmt = conexao.prepareStatement(delete);
                stmt.setInt(1, valor);
                if(stmt.executeUpdate() > 0){
                    System.out.println("Registro removido com sucesso!!!");
                }else{
                    System.out.println("Registro não encontrado!!!");
                }
            conexao.close();            
        entrada.close();
    }
}
