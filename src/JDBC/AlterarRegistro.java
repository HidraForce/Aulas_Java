package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarRegistro {
    public static void main(String[] args) throws SQLException {        
        Scanner entrada = new Scanner(System.in);
            System.out.print("Qual o código da pessoa: ");
            int codigo = entrada.nextInt();
            
            String select = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
            String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
            
            Connection conexao = FabricaConexao.getConexao();
                PreparedStatement stmt = conexao.prepareStatement(select);
                stmt.setInt(1, codigo);
                ResultSet r = stmt.executeQuery();
                if(r.next()){
                    System.out.println("O nome atual é: "+r.getString("nome"));
                    entrada.nextLine(); //apenas para dar um lonha em branco
                    
                    System.out.print("Qual o novo nome da pessoa: ");
                    String novoNome = entrada.nextLine();
                    stmt.close(); //fechar o comando SELECT
                    stmt = conexao.prepareStatement(update);                                        
                    stmt.setInt(2, codigo);
                    stmt.setString(1, novoNome);
                    stmt.execute();
                    System.out.println("Pessoa alterada com sucesso !!!");
                }else{
                    System.out.println("Pessoa não encontrada !!!");
                }
                System.out.println(stmt.toString());
            conexao.close();
        entrada.close();
    }
}









